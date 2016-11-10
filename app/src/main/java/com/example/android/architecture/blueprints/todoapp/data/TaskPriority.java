package com.example.android.architecture.blueprints.todoapp.data;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by obvyah on 16/11/10.
 */
public class TaskPriority {

    public static final int HIGH = 0;
    public static final int MEDIUM = 1;
    public static final int LOW = 2;

    public final static Map<Integer, String> PRIORITY_TYPES;

    static {
        PRIORITY_TYPES = new LinkedHashMap<>(3);
        PRIORITY_TYPES.put(HIGH, "HIGH");
        PRIORITY_TYPES.put(MEDIUM, "MEDIUM");
        PRIORITY_TYPES.put(LOW, "LOW");
    }
}
