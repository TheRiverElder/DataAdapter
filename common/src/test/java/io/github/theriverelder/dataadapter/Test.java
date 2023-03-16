package io.github.theriverelder.dataadapter;

import java.util.Date;

import static io.github.theriverelder.dataadapter.DataAdapterDefaults.*;
import static io.github.theriverelder.dataadapter.util.Maps.entry;

public class Test {
    public static void main(String[] args) {
        
    }

    DataAdapter writeAlarmData() {
        long dailyTime_1 = new Date().getTime();
        int maxDelayMinutes_1 = 5;

        long dailyTime_2 = new Date().getTime();
        int maxDelayMinutes_2 = 6;

        String bell = "toast,ringtone";
        boolean enabled = true;

        return adaptMap(
            entry("bell", adaptString(bell)),
            entry("enabled", adaptBoolean(enabled)),
            entry("controllers", adaptList(
                adaptMap(
                    entry("dailyTime", adaptLong(dailyTime_1)),
                    entry("maxDelayMinutes", adaptInt(maxDelayMinutes_1))
                ),
                adaptMap(
                    entry("dailyTime", adaptLong(dailyTime_2)),
                    entry("maxDelayMinutes", adaptInt(maxDelayMinutes_2))
                )
            ))
        );

    }

    void readAlarmData(DataAdapter data) {
        long dailyTime_1 = -1;
        int maxDelayMinutes_1 = -1;

        String bell = null;
        boolean enabled = false;

        bell = data.asMap().get("bell").asString();
        enabled = data.asMap().get("enabled").asBoolean();
        data.asMap().get("controllers").asList().forEach((DataAdapter c) -> {
            c.asMap().get("dailyTime").toLong();
            c.asMap().get("maxDelayMinutes").toInt();
        });

    }
}
