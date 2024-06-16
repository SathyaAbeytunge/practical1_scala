object runningTime{
    def findRunningTime(): Int={
        val easyPace= 8
        val tempoPace= 7

        val easyPaceDistance= 4
        val tempoPaceDistance= 3
     
        val totalTime= (easyPaceDistance * easyPace) + (tempoPaceDistance * tempoPace)
        totalTime
    }

    def main(args: Array[String]): Unit={
        val totalTime= findRunningTime()
        println(s"Total running time is $totalTime minutes")
    }
}