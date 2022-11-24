package services

class ImageLoaderFactory {
    fun create(toCreate: String) {
        when (toCreate.substringAfterLast('.')) {
            "bmp" -> BMPImageLoader()
            "jpg" -> JPGImageLoader()
            else -> throw Exception("I don't know how to deal with $toCreate.")
        }
    }
}



///* The concept of the factory -> creates a Product */
//interface FileParserFactory {
//    fun createFromFileName(fileName: String): FileParser
//}
//
///* Our specific Factory */
//class StandardFileParserFactory : FileParserFactory {
//    override fun createFromFileName(fileName: String) =
//        when (fileName.substringAfterLast('.')) {
//            "xml" -> XmlFileParser()
//            "json" -> JsonFileParser()
//            else -> throw Exception("I don't know how to deal with $fileName.")
//        }
//}