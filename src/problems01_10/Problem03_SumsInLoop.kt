package problems01_10


fun main(vararg args: String) {
    val array1 = arrayOf(381815, 123986, 205751, 871901, 479271, 752522, 782871,497222,91787,828185,608108,971797)
    val array2 = arrayOf(691223, 481929, 253625, 782898, 552767, 989482, 201612,908325,694725,726916,549422,523557)

    for (i in 0 until array1.size) {
        print(array1[i] + array2[i])
        print(" ")
    }

}
