package com.example.rohal.singletonclass
    public class Singleton private constructor() {
        init {
            println("This ($this) is a singleton")
        }

        private object Holder {
            val INSTANCE = Singleton()
        }

        companion object {
            val instance: Singleton by lazy { Holder.INSTANCE }
        }

        var b: String? = null
    }