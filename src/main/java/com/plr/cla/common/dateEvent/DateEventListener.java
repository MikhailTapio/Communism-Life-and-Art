/*package com.plr.cla.common.dateEvent;

import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Mod.EventBusSubscriber
public class DateEventListener {
    public static final String Lenin = "Сегодня 21 января {0} года, {1}-я годовщина смерти товарища Ленина.";
    public static final Calendar DATE = new GregorianCalendar();
    public static final int[] date = new int[]{DATE.get(Calendar.YEAR), DATE.get(Calendar.MONTH), DATE.get(Calendar.DAY_OF_MONTH)};

    @Nullable
    private static String getBroadcastContentForToday(int[] date){
        switch (date[1] + 1){
            case 1 -> {
                return broadcastJanuary(date[0], date[2]);
            }

        }
        return null;
    }

    private static String broadcastJanuary(int year,int day){
        if(day == 21) return getLenin(year);
        return null;
    }

    private static String getLenin(int year){
        return MessageFormat.format(Lenin, year,year - 1870);
    }
}
*/