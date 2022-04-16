package com.izzaz.willow.model

class FriendlyMessage {
    var text: String? = null
    var name: String? = null
    var photoUrl: String? = null
    var imageUrl: String? = null
    var uid: String? = null

    // Empty constructor needed for Firestore serialization
    constructor()

    constructor(uid: String?, text: String?, name: String?, photoUrl: String?, imageUrl: String?) {
        this.uid = uid
        this.text = text
        this.name = name
        this.photoUrl = photoUrl
        this.imageUrl = imageUrl
    }
}
