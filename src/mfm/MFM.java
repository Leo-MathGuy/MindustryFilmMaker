package mfm;

import arc.Events;
import arc.util.Log;
import mfm.data.MakerSettings;
import mindustry.Vars;
import mindustry.game.EventType;
import mindustry.mod.Mod;

public class MFM extends Mod {

    public MFM() {
        Log.info("Initializing MFM");

        Events.on(EventType.ClientLoadEvent.class, event -> {
            if (MakerSettings.getStartMessageEnabled()) {
                Vars.ui.showInfoText("Mindustry Film Maker enabled",
                        "In case you forgor. You can turn this off in the settings");
            }
            MakerSettings.init();
        });
    }

    @Override
    public void loadContent() {
    }
}
