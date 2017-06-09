/**
 * Created by Partizanin on 07.06.2017 15:06:16.
 */
class Parser(val sData: List<String>) {

    fun parse(): ArrayList<Array<String>> {
        val result = ArrayList<Array<String>>()
        var i = 0

        while (i < sData.size - 1) {
            val currentLine = sData[i]

            if (!currentLine.contains("#EXTM3U")) {
                val resultLine = arrayOf(getName(currentLine), sData[i + 1])

                result.add(resultLine)
                i += 2
            } else {
                i++
            }


        }
        return result
    }

    private fun getName(line: String): String {

        var result: String = line.substring(line.indexOf(",") + 1)

        result = result.replace("/", " ")
        return result
    }


}