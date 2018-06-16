// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ActivityBindingModule.java

package m3c.mobi.dagger_example.dagger.modules;

import m3c.mobi.dagger_example.MainActivity;

public abstract class ActivityBindingModule
{

    public ActivityBindingModule()
    {
    }

    abstract MainActivity contributeYourActivityInjector();
}
