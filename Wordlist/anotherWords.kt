val cities = listOf("Jeddah", "Bengaluru", "Shenzhen", "Abu Dhabi", "Mountain View", "Tripoli", "Bengaluru", "Lima", "Mandalay", "Tripoli")
val oneWordCities = cities.toSet().toList().filter { !it.contains(" ")}.sorted()