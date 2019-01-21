package problems01_10


fun main(vararg args: String) {
    val string="91 1296 597 382 624 504 835 1268 235 244 895 606 125 874 774 323 892 494 344 1041 727 1246 1153 226 485 287 587 779 609 413 931 690"
    var sumTotal=0

    val stringNumbers=string.split(" ").forEach {
        val s=it.trim()
        if (s.isEmpty())
        {
            return
        }
        sumTotal+=s.toInt()
    }

    println(sumTotal)

}
