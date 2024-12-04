import crps.crps_lantern_wall_object;
import crps.crps_streetlight_single_object;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.ObjectRegistry;
import necesse.engine.registries.RecipeTechRegistry;
import necesse.engine.registries.TileRegistry;
import necesse.inventory.item.toolItem.ToolType;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.level.gameObject.TorchObject;
import necesse.level.gameObject.WallObject;
import necesse.level.gameObject.furniture.*;
import necesse.level.gameTile.SimpleFloorTile;

import java.awt.*;



@ModEntry
public class crps_loadmod {
    public void init() {
        System.out.println("Carpenter's Salvation Loaded!");
		System.out.println("Why don't you register some maidens!?");

        //willow the wisp. Furniture items that took forever to sprite!
        Color dungeonMapColor = new Color(59, 51, 38);

        ObjectRegistry.registerObject("willowchest", new StorageBoxInventoryObject("willowchest", 40, dungeonMapColor), 10.0F, true);
        DinnerTableObject.registerDinnerTable("willowdinnertable", "willowdinnertable", dungeonMapColor, 20.0F);
        ObjectRegistry.registerObject("willowdesk", new DeskObject("willowdesk", dungeonMapColor), 10.0F, true);
        ObjectRegistry.registerObject("willowmodulartable", new ModularTableObject("willowmodulartable", dungeonMapColor), 10.0F, true);
        ObjectRegistry.registerObject("willowchair", new ChairObject("willowchair", dungeonMapColor), 5.0F, true);
        BenchObject.registerBench("willowbench", "willowbench", dungeonMapColor, 10.0F);
        ObjectRegistry.registerObject("willowbookshelf", new BookshelfObject("willowbookshelf", dungeonMapColor), 10.0F, true);
        ObjectRegistry.registerObject("willowcabinet", new CabinetObject("willowcabinet", dungeonMapColor), 10.0F, true);
        BedObject.registerBed("willowbed", "willowbed", dungeonMapColor, 100.0F);
        ObjectRegistry.registerObject("willowdresser", new DresserObject("willowdresser", dungeonMapColor), 10.0F, true);
        ObjectRegistry.registerObject("willowclock", new ClockObject("willowclock", dungeonMapColor), 10.0F, true);
        ObjectRegistry.registerObject("willowcandelabra", new CandelabraObject("willowcandelabra", dungeonMapColor, 50.0F, 0.1F), 10.0F, true);
        ObjectRegistry.registerObject("willowdisplay", new DisplayStandObject("willowdisplay", dungeonMapColor, 20), 10.0F, true);
        BathtubObject.registerBathtub("willowbathtub", "willowbathtub", dungeonMapColor, 10.0F);
        ObjectRegistry.registerObject("willowtoilet", new ToiletObject("willowtoilet", dungeonMapColor), 5.0F, true);



        //The extra, or I guess "no longer missing" walls for oak, willow, spruce.
        //What are the normal "wood" walls made of? Well, any of them!
        WallObject.registerWallObjects("willow","willowwall", 0,new Color(46, 40, 30), ToolType.ALL,2.0f,6.0f);
        TileRegistry.registerTile("willowfloor", new SimpleFloorTile("willowfloor", new Color(46, 40, 30)),2.0f,true);

        WallObject.registerWallObjects("oak","oakwall", 0,new Color(124, 104, 80), ToolType.ALL,2.0f,6.0f);
        TileRegistry.registerTile("oakfloor", new SimpleFloorTile("oakfloor", new Color(124, 104, 80)),2.0f,true);

        WallObject.registerWallObjects("spruce","sprucewall", 0,new Color(105, 72, 47), ToolType.ALL,2.0f,6.0f);
        TileRegistry.registerTile("sprucefloor", new SimpleFloorTile("sprucefloor", new Color(105, 72, 47)),2.0f,true);


        //here we go with adding lanterns and it's derivatives to the game! I am considering adding lanterns made of different metals but that will come later, probably.
        //ObjectRegistry.registerObject("crps_lantern", new crps_lantern_object("crps_lantern", ), 2.0F,true);
        ObjectRegistry.registerObject("crps_lantern", new TorchObject("crps_lantern", ToolType.ALL, new Color(240, 200, 10), 50.0F, 0.2F), 4.0F, true);
        //ObjectRegistry.registerObject("crps_lantern_copper", new crps_lantern_object("crps_lantern_copper"), 10.0F,true);
        ObjectRegistry.registerObject("crps_lantern_wall", new crps_lantern_wall_object("crps_lantern_wall"), 3.0F,true);

        //It's just a candelabra object, for now.
        ObjectRegistry.registerObject("crps_streetlight_single", new crps_streetlight_single_object("crps_streetlight_single", new Color(68, 68, 68), 50.0F, 0.1F), 10.0F, true);
        ObjectRegistry.registerObject("crps_streetlight_double", new crps_streetlight_single_object("crps_streetlight_double", new Color(68, 68, 68), 50.0F, 0.1F), 10.0F, true);
        ObjectRegistry.registerObject("crps_streetlight_quad", new crps_streetlight_single_object("crps_streetlight_quad", new Color(68, 68, 68), 50.0F, 0.1F), 10.0F, true);


        //Content Update 1
        //You notice a lot of these are commented out, that is because Fair swooped in and made an update adding some of the same stuff I did, interesting huh?
        //Honestly that's okay and is pretty logical of him to do, a lot of this mod's features are stuff that should be in Vanilla.

        //Template wall to help me with wall spriting
        //WallObject.registerWallObjects("template", "templatewall", 1, new Color(255, 0, 0), 0.5F, 1.0F);
        //This isn't going to be helpful because Fair fixed the bug that ruined short wall rendering, yay!


        //deep snowstone walls, Columns, Doors, Floors.
        //WallObject.registerWallObjects("deepsnowstone", "deepsnowstonewall", 1, new Color(65, 75, 80), 0.5F, 1.0F);

        //I guess fair forgot to add this though.
        //ObjectRegistry.registerObject("deepsnowstonecolumn", new ColumnObject("deepsnowstonecolumn", new Color(65, 75, 80), ToolType.PICKAXE), 2.0F, true);
        //Nevermind, he did on version 0.21.26.


        //TileRegistry.registerTile("deepsnowstonefloor", new SimpleFloorTile("deepsnowstonefloor", new Color(65, 75, 80)), 2.0F, true);
        //TileRegistry.registerTile("deepsnowstonebrickfloor", new SimpleFloorTile("deepsnowstonebrickfloor", new Color(65, 75, 80)), 2.0F, true);
        TileRegistry.registerTile("deepsnowstonetiledfloor", new SimpleFloorTile("deepsnowstonetiledfloor", new Color(65, 75, 80)), 2.0F, true);

        //deep sandstone Floors
        TileRegistry.registerTile("deepsandstonefloor", new SimpleFloorTile("deepsandstonefloor", new Color(110, 89, 44)), 2.0F, true);
        TileRegistry.registerTile("deepsandstonebrickfloor", new SimpleFloorTile("deepsandstonebrickfloor", new Color(110, 89, 44)), 2.0F, true);
        TileRegistry.registerTile("deepsandstonetiledfloor", new SimpleFloorTile("deepsandstonetiledfloor", new Color(110, 89, 44)), 2.0F, true);

        //Deep Swampstone Colums, and tiles.
        TileRegistry.registerTile("deepswampstonetiledfloor", new SimpleFloorTile("deepswampstonetiledfloor", new Color(33, 71, 33)), 2.0F, true);
        //The columns were added in 0.21.26.
        //ObjectRegistry.registerObject("deepswampstonecolumn", new ColumnObject("deepswampstonecolumn", new Color(38, 80, 38), ToolType.PICKAXE), 2.0F, true);
        //ObjectRegistry.registerObject("deepstonecolumn", new ColumnObject("deepstonecolumn", new Color(55, 60, 62), ToolType.PICKAXE), 2.0F, true);



        //Metal walls
        //Iron objects
        WallObject.registerWallObjects("iron", "ironwall", 0, new Color(185, 185, 185), 0.5F, 1.0F);
        TileRegistry.registerTile("ironfloor", new SimpleFloorTile("ironfloor", new Color(117, 117, 117)), 0.5F, true);
        //Copper objects
        WallObject.registerWallObjects("copper", "copperwall", 0, new Color(185, 91, 75), 0.5F, 1.0F);
        TileRegistry.registerTile("copperfloor", new SimpleFloorTile("copperfloor", new Color(129, 60, 52)), 0.5F, true);
        //Gold objects
        WallObject.registerWallObjects("gold", "goldwall", 0, new Color(218, 175, 25), 0.5F, 1.0F);
        TileRegistry.registerTile("goldfloor", new SimpleFloorTile("goldfloor", new Color(180, 147, 11)), 0.5F, true);

    }

    public void postInit() {

        //I copied and pasted the recipes for the oak equivalents of each item, so it was easier to keep track of what the ingredients should be.
        //Of course, these comments are not actually important.
        //{oakchest, 1, carpenter, INGREDIENTS{{oaklog, 8}}, true}
        Recipes.registerModRecipe(new Recipe("willowchest",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",8)},true));
        //{oakdinnertable, 1, carpenter, INGREDIENTS{{oaklog, 16}}, true}
        Recipes.registerModRecipe(new Recipe("willowdinnertable",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",16)},true));
        //{oakdesk, 1, carpenter, INGREDIENTS{{oaklog, 8}}, true}
        Recipes.registerModRecipe(new Recipe("willowdesk",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",8)},true));
        //{oakmodulartable, 1, carpenter, INGREDIENTS{{oaklog, 8}}, true}
        Recipes.registerModRecipe(new Recipe("willowmodulartable",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",8)},true));
        //{oakchair, 1, carpenter, INGREDIENTS{{oaklog, 4}}, true}
        Recipes.registerModRecipe(new Recipe("willowchair",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",4)},true));
        //{oakbench, 1, carpenter, INGREDIENTS{{oaklog, 10}}, true}
        Recipes.registerModRecipe(new Recipe("willowbench",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",10)},true));
        //{oakbookshelf, 1, carpenter, INGREDIENTS{{oaklog, 10}}, true}
        Recipes.registerModRecipe(new Recipe("willowbookshelf",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",10)},true));
        //{oakcabinet, 1, carpenter, INGREDIENTS{{oaklog, 10}}, true}
        Recipes.registerModRecipe(new Recipe("willowcabinet",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",10)},true));
        //{oakbed, 1, carpenter, INGREDIENTS{{oaklog, 10}, {wool, 10}}, true}
        Recipes.registerModRecipe(new Recipe("willowbed",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",10), new Ingredient("wool",10)},true));
        //{oakdresser, 1, carpenter, INGREDIENTS{{oaklog, 8}}, true}
        Recipes.registerModRecipe(new Recipe("willowdresser",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",8)},true));
        //{oakclock, 1, carpenter, INGREDIENTS{{oaklog, 8}, {ironbar, 2}}, true}
        Recipes.registerModRecipe(new Recipe("willowclock",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",8), new Ingredient("ironbar",2)},true));
        //{oakcandelabra, 1, carpenter, INGREDIENTS{{oaklog, 6}, {torch, 3}}, true}
        Recipes.registerModRecipe(new Recipe("willowcandelabra",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",6),new Ingredient("torch", 3)},true));
        //{oakdisplay, 1, carpenter, INGREDIENTS{{oaklog, 10}}, true}
        Recipes.registerModRecipe(new Recipe("willowdisplay",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",10)},true));
        //{oakbathtub, 1, carpenter, INGREDIENTS{{oaklog, 12}}, true}
        Recipes.registerModRecipe(new Recipe("willowbathtub",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",12)},true));
        //{oaktoilet, 1, carpenter, INGREDIENTS{{oaklog, 6}}, true}
        Recipes.registerModRecipe(new Recipe("willowtoilet",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("willowlog",6)},true));


        //These are the extra wooden doors, walls, and floors.
        Recipes.registerModRecipe(new Recipe("willowwall",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("willowlog",2)},true));
        Recipes.registerModRecipe(new Recipe("willowdoor",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("willowlog",4)},true));
        Recipes.registerModRecipe(new Recipe("willowfloor",1,RecipeTechRegistry.WORKSTATION,new Ingredient[] {new Ingredient("willowlog",1)},true));

        Recipes.registerModRecipe(new Recipe("oakwall",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("oaklog",2)},true));
        Recipes.registerModRecipe(new Recipe("oakdoor",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("oaklog",4)},true));
        Recipes.registerModRecipe(new Recipe("oakfloor",1,RecipeTechRegistry.WORKSTATION,new Ingredient[] {new Ingredient("oaklog",1)},true));


        Recipes.registerModRecipe(new Recipe("sprucewall",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("sprucelog",2)},true));
        Recipes.registerModRecipe(new Recipe("sprucedoor",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("sprucelog",4)},true));
        Recipes.registerModRecipe(new Recipe("sprucefloor",1,RecipeTechRegistry.WORKSTATION,new Ingredient[] {new Ingredient("sprucelog",1)},true));


        //lanterns
        Recipes.registerModRecipe(new Recipe("crps_lantern",1,RecipeTechRegistry.IRON_ANVIL, new Ingredient[] {new Ingredient("ironbar",1)},true));
        Recipes.registerModRecipe(new Recipe("crps_lantern_wall",1,RecipeTechRegistry.IRON_ANVIL, new Ingredient[] {new Ingredient("ironbar",1), new Ingredient("crps_lantern",1)},true));
        //streetlights
        Recipes.registerModRecipe(new Recipe("crps_streetlight_single",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("crps_lantern",1), new Ingredient("anylog",6), new Ingredient("anystone",4)},true));
        Recipes.registerModRecipe(new Recipe("crps_streetlight_double",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("crps_lantern",2), new Ingredient("anylog",6), new Ingredient("anystone",4)},true));
        Recipes.registerModRecipe(new Recipe("crps_streetlight_quad",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("crps_lantern",4), new Ingredient("anylog",6), new Ingredient("anystone",4)},true));

        //CONTENT UPDATE 1

        //Deep Snowstone Walls
        //Recipe.cfg reference
        //{deepstonewall, 1, workstation, INGREDIENTS{{deepstone, 5}}, true}
        //{deepstonedoor, 1, workstation, INGREDIENTS{{deepstone, 15}}, true}
        //{deepstonefloor, 1, workstation, INGREDIENTS{{deepstone, 1}}, true}
        //{deepstonebrickfloor, 1, workstation, INGREDIENTS{{deepstone, 1}}, true}
        //{deepstonetiledfloor, 1, workstation, INGREDIENTS{{deepstone, 1}}, true}

        //Recipes.registerModRecipe(new Recipe("deepsnowstonewall",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("deepsnowstone",5)},true));
        //Recipes.registerModRecipe(new Recipe("deepsnowstonedoor",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("deepsnowstone",15)},true));
        //Recipes.registerModRecipe(new Recipe("deepsnowstonefloor",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("deepsnowstone",1)},true));
        //Recipes.registerModRecipe(new Recipe("deepsnowstonebrickfloor",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("deepsnowstone",1)},true));
        Recipes.registerModRecipe(new Recipe("deepsnowstonetiledfloor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("deepsnowstone",1)},true));

        //{deepsandstonecolumn, 1, carpenter, INGREDIENTS{{deepsandstone, 20}}, true}
        //Recipes.registerModRecipe(new Recipe("deepsnowstonecolumn",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepsnowstone",20)},true));


        Recipes.registerModRecipe(new Recipe("deepswampstonetiledfloor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("deepswampstone",1)},true));
       //Recipes.registerModRecipe(new Recipe("deepstonecolumn",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepstone",20)},true));
       //Recipes.registerModRecipe(new Recipe("deepswampstonecolumn",1,RecipeTechRegistry.CARPENTER, new Ingredient[] {new Ingredient("deepswampstone",20)},true));


        //Deep Sandstone Floors
        Recipes.registerModRecipe(new Recipe("deepsandstonefloor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("deepsandstone",1)},true));
        Recipes.registerModRecipe(new Recipe("deepsandstonebrickfloor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("deepsandstone",1)},true));
        Recipes.registerModRecipe(new Recipe("deepsandstonetiledfloor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("deepsandstone",1)},true));

        //Vanilla Ice Wall Door crafting
        Recipes.registerModRecipe(new Recipe("icewall",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("icetile",2)},true));
        Recipes.registerModRecipe(new Recipe("icedoor",1,RecipeTechRegistry.WORKSTATION, new Ingredient[] {new Ingredient("icetile",4)},true));

        //Metal Object Crafting
        Recipes.registerModRecipe(new Recipe("ironwall",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("ironbar",5)},true));
        Recipes.registerModRecipe(new Recipe("irondoor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("ironbar",15)},true));
        Recipes.registerModRecipe(new Recipe("ironfloor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("ironbar",2)},true));

        Recipes.registerModRecipe(new Recipe("copperwall",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("copperbar",5)},true));
        Recipes.registerModRecipe(new Recipe("copperdoor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("copperbar",15)},true));
        Recipes.registerModRecipe(new Recipe("copperfloor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("copperbar",2)},true));

        Recipes.registerModRecipe(new Recipe("goldwall",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("goldbar",5)},true));
        Recipes.registerModRecipe(new Recipe("golddoor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("goldbar",15)},true));
        Recipes.registerModRecipe(new Recipe("goldfloor",1,RecipeTechRegistry.ADVANCED_WORKSTATION, new Ingredient[] {new Ingredient("goldbar",2)},true));



    }
}