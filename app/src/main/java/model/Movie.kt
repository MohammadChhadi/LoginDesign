package model

class Movie{

    var imageItem: Int? = 0

    var title: String? = ""

    var numRight: Int? = 0

    var numLeft: Int? = 0

    constructor(imageItem: Int?, title: String?,numRight:Int?,numLeft:Int?,) {
        this.imageItem = imageItem
        this.title = title
        this.numRight = numRight
        this.numLeft = numLeft
    }
}


