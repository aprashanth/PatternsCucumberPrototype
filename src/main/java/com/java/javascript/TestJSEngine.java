package com.java.javascript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by PXV8340 on 10/14/2015.
 */
public class TestJSEngine {
    public static void main(String args[]) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");

        System.out.println(engine.getClass().getName());
        System.out.println("Engine Eval " + engine.eval("function f() {return 1;}; f() + 1;"));

    }
}
