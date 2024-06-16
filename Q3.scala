object sphereVolume{
    def findVolume(radius : Double): Double={
        (4.0/3.0) * math.Pi * radius * radius * radius
    }

    def main(args: Array[String]): Unit={
        val radius= 5
        val volume= findVolume(radius)
        println(s"The volume of a sphere with radius $radius is $volume")
    }
}