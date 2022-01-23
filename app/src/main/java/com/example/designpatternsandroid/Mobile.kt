package com.example.designpatternsandroid

class Mobile(
    val ram: Int,
    val display: String,
    val battery: Int,
    val soc: String
) {
    class Builder {
        private var ram: Int = 4
        private var display: String = "Samsung"
        private var battery: Int = 5000
        private var soc: String = "Snapdragon"

        fun ram(maxCapacity: Int) = apply { ram = maxCapacity }

        fun display(manufacturer: String) = apply { display = manufacturer }

        fun battery(maxCapacity: Int) = apply { battery = maxCapacity }

        fun soc(manufacturer: String) = apply { soc = manufacturer }

        fun build() = Mobile(ram, display, battery, soc)
    }
}