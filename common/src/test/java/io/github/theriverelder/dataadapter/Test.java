package io.github.theriverelder.dataadapter;

public class Test {
    public static void main(String[] args) {
        
    }

    DataAdapter writeAlarmData() {
        long dailyTime_1 = Date().getTime();
        int maxDelayMinutes_1 = 5;

        long dailyTime_2 = Date().getTime();
        int maxDelayMinutes_2 = 6;

        String bell = "toast,ringtone";
        boolean enabled = true;

        return DataAdapterDefaults.adaptMap(
            entry("bell", DataAdapterDefaults.adaptString(bell)),
            entry("enabled", DataAdapterDefaults.adaptBoolean(enabled)),
            entry("controllers", DataAdapterDefaults.adaptList(
                DataAdapterDefaults.adaptMap(
                    entry("dailyTime", DataAdapterDefaults.adaptLong(dailyTime_1)),
                    entry("maxDelayMinutes", DataAdapterDefaults.adaptInt(maxDelayMinutes_1))
                ),
                DataAdapterDefaults.adaptMap(
                    entry("dailyTime", DataAdapterDefaults.adaptLong(dailyTime_2)),
                    entry("maxDelayMinutes", DataAdapterDefaults.adaptInt(maxDelayMinutes_2))
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
        data.asMap().get("controllers").asList().map((DataAdapter c) -> {
            c.asMap().get("dailyTime").toLong();
            c.asMap().get("maxDelayMinutes").toInt();
        });

    }
}
