package de.madcyph3r.example.example.headerTypes;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.amulyakhare.textdrawable.TextDrawable;

import de.madcyph3r.example.R;
import de.madcyph3r.example.example.FragmentDummy;
import de.madcyph3r.example.example.FragmentInstruction;
import de.madcyph3r.materialnavigationdrawer.MaterialNavigationDrawer;
import de.madcyph3r.materialnavigationdrawer.head.MaterialHeadItem;
import de.madcyph3r.materialnavigationdrawer.menu.MaterialMenu;
import de.madcyph3r.materialnavigationdrawer.menu.item.MaterialSection;
import de.madcyph3r.materialnavigationdrawer.tools.RoundedCornersDrawable;

/**
 * Created by marc on 23.02.2015.
 */
public class HeadItemFiveActivity extends MaterialNavigationDrawer {

    MaterialNavigationDrawer drawer = null;

    @Override
    public int headerType() {
        // set type. you get the available constant from MaterialNavigationDrawer class
        return MaterialNavigationDrawer.DRAWERHEADER_HEADITEMS;
    }

    @Override
    public void init(Bundle savedInstanceState) {

        drawer = this;

        // add head Item (menu will be loaded automatically)
        this.addHeadItem(getHeadItem1());
        this.addHeadItem(getHeadItem2());
        this.addHeadItem(getHeadItem3());
        this.addHeadItem(getHeadItem4());
        this.addHeadItem(getHeadItem5());
    }

    private MaterialHeadItem getHeadItem1() {
        MaterialMenu menu = new MaterialMenu();

        Bundle bundle = new Bundle();
        bundle.putString("instruction", "This example shows the head item style with five items. " +
                "The first three head items ar shown with a picture. To get the other head items, " +
                "press the down arrow button in the header. " +
                "See the method headerType in the source code.");

        //create instruction fragment
        Fragment fragmentInstruction = new FragmentInstruction();
        fragmentInstruction.setArguments(bundle);

        // first section is loaded
        MaterialSection instruction = this.newSection("Instruction", fragmentInstruction , false, menu);
        instruction.setFragmentTitle("Head Item Style (Five Items)");
        this.newDevisor(menu);
        this.newLabel("Label", false, menu);
        this.newSection("Section", new FragmentDummy(), false, menu);

        // use bitmap and make a circle photo
        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.app_drawer_icon);
        final RoundedCornersDrawable drawableAppIcon = new RoundedCornersDrawable(getResources(), bitmap);

        // create Head Item
        MaterialHeadItem headItem = new MaterialHeadItem(this, "A HeadItem", "A Subtitle", drawableAppIcon, R.drawable.mat5, menu);
        return headItem;
    }

    private MaterialHeadItem getHeadItem2() {
        MaterialMenu menu = new MaterialMenu();

        // create section
        this.newSection("Section 1 (Head 2)", new FragmentDummy(), false, menu);
        this.newSection("Section 2", new FragmentDummy(), false, menu);

        // create icon
        TextDrawable headPhoto = TextDrawable.builder()
                .buildRound("B", Color.BLUE);

        // create Head Item
        MaterialHeadItem headItem = new MaterialHeadItem(this, "B HeadItem", "B Subtitle", headPhoto, R.drawable.mat6, menu);
        return headItem;
    }

    private MaterialHeadItem getHeadItem3() {
        MaterialMenu menu = new MaterialMenu();

        // create section
        this.newSection("Section 1 (Head 3)", new FragmentDummy(), false, menu);
        this.newSection("Section 2", new FragmentDummy(), false, menu);

        // create icon
        TextDrawable headPhoto = TextDrawable.builder()
                .buildRound("C", Color.GRAY);

        // create Head Item
        MaterialHeadItem headItem = new MaterialHeadItem(this, "C HeadItem", "C Subtitle", headPhoto, R.drawable.mat6, menu);
        return headItem;
    }

    private MaterialHeadItem getHeadItem4() {
        MaterialMenu menu = new MaterialMenu();

        // create section
        this.newSection("Section 1 (Head 4)", new FragmentDummy(), false, menu);
        this.newSection("Section 2", new FragmentDummy(), false, menu);

        // create icon
        TextDrawable headPhoto = TextDrawable.builder()
                .buildRound("D", Color.GRAY);

        // create Head Item
        MaterialHeadItem headItem = new MaterialHeadItem(this, "D HeadItem", "D Subtitle", headPhoto, R.drawable.mat6, menu);
        return headItem;
    }

    private MaterialHeadItem getHeadItem5() {
        MaterialMenu menu = new MaterialMenu();

        // create section
        this.newSection("Section 1 (Head 5)", new FragmentDummy(), false, menu);
        this.newSection("Section 2", new FragmentDummy(), false, menu);

        // create icon
        TextDrawable headPhoto = TextDrawable.builder()
                .buildRound("E", Color.GRAY);

        // create Head Item
        MaterialHeadItem headItem = new MaterialHeadItem(this, "E HeadItem", "E Subtitle", headPhoto, R.drawable.mat6, menu);
        return headItem;
    }
}
