package kstrinadka.residue_monitoring_system;

import java.util.HashMap;
import java.util.Map;

public final class Constants {

    private Constants() {} // Запрещаем создание объектов этого класса


    public final static Long DEFAULT_OUT_OF_STOCK_VALUE = 0L;
    public final static Long DEFAULT_SOLD_QUANTITY = 0L;


    public final static String CORNICE_CATEGORY_NAME = "карниз";
    public final static Long CORNICE_CATEGORY_ID = 1L;

    /**
     * Хранит начальное количество штук каждого из карнизов по артикулу
     */
    public static final Map<String, Long> CORNICE_INITIAL_QUANTITY_MAP = new HashMap<>() {{
        put("62392310", 12L);
        put("62392311", 6L);
        put("62392312", 26L);
        put("62392313", 13L);
        put("62392314", 3L);
    }};



    public final static String MOLDING_CATEGORY_NAME = "молдинг";
    public final static Long MOLDING_CATEGORY_ID = 2L;

    /**
     * Хранит начальное количество штук каждого из молдингов по артикулу
     */
    public static Map<String, Long> MOLDING_INITIAL_QUANTITY_MAP = new HashMap<>() {{
        put("62392080", 75L);
        put("62392081", 89L);
        put("62392082", 99L);
        put("62392083", 21L);
        put("62392084", 65L);
    }};



    public final static String FLAVORING_CATEGORY_NAME = "ароматизатор";
    public final static Long FLAVORING_CATEGORY_id = 3L;
    public static Map<String, Long> FLAVORING_INITIAL_QUANTITY_MAP = new HashMap<>() {{
        put("62392090", 11L);
        put("62392091", 74L);
        put("62392092", 18L);
        put("62392093", 52L);
        put("62392094", 14L);
    }};



    public final static String TUB_CATEGORY_NAME = "бадья";
    public final static Long TUB_CATEGORY_id = 4L;
    public static Map<String, Long> TUB_INITIAL_QUANTITY_MAP = new HashMap<>() {{
        put("62392100", 7L);
        put("62392101", 14L);
        put("62392102", 7L);
        put("62392103", 3L);
        put("62392104", 26L);
    }};



    public final static String WINDOWSILL_CATEGORY_NAME = "подоконник";
    public final static Long WINDOWSILL_CATEGORY_id = 5L;
    public static Map<String, Long> WINDOWSILL_INITIAL_QUANTITY_MAP = new HashMap<>() {{
        put("62392110", 9L);
        put("62392111", 18L);
        put("62392112", 3L);
        put("62392113", 6L);
        put("62392114", 11L);
    }};


    public final static String HAT_CATEGORY_NAME = "шапка";
    public final static Long HAT_CATEGORY_ID = 6L;
    public static Map<String, Long> HAT_INITIAL_QUANTITY_MAP = new HashMap<>() {{
        put("58321076", 15L);
        put("45698759", 3L);
        put("62392067", 7L);
        put("46329358", 9L);
    }};
}
