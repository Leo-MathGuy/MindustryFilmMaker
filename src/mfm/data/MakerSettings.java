package mfm.data;

import arc.Core;
import arc.util.Log;
import mindustry.Vars;

public class MakerSettings {
    public static void init() {
        Log.info("Initializing MFM settings");

        Vars.ui.settings.addCategory("Mindustry Film Maker", root -> {
            root.checkPref("mfm.enableReminder", true);
        });
    }

    public static boolean getStartMessageEnabled() {
        return Core.settings.getBool("mfm.enableReminder", true);
    }
}
