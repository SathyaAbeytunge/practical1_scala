object bookCost{
    def totalCost(NoOfcopies: Int): Double={
        val coverPrice= 24.95 
        val discount= 0.4
        val discountedPrice= coverPrice * (1-discount)
        val totalBookCost= NoOfcopies * discountedPrice

        val shippingCost= 3.0
        val additionalCost= 0.75

        

        val totalShippingCost=if(NoOfcopies<=50)
            {
                shippingCost
            }
        else
            {
                shippingCost + ((NoOfcopies-50)*additionalCost)
            }
        
        totalBookCost + totalShippingCost
        
    }

    def main(args: Array[String]): Unit={
        val NoOfcopies=60
        val totCost = totalCost(NoOfcopies)
        println(s"The wholesale cost for $NoOfcopies copies is $totCost")
    }
}