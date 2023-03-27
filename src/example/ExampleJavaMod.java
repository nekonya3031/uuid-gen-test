package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            for(int i=0;i<100000;i++)
                Log.info(getUUID());
        });
    }

    public String getUUID(){
        String uuid = "";
            byte[] result = new byte[8];
            new Rand().nextBytes(result);
            uuid = new String(Base64Coder.encode(result));
            return uuid;
    }
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
    }

}
