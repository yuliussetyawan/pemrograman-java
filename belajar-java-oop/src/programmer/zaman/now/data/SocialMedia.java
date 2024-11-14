package programmer.zaman.now.data;

class SocialMedia {
    String name;
}

// final artinya class tidak dapat diwariskan kembali
//final class Facebook extends SocialMedia{}

class Facebook extends SocialMedia{
    final void login(String username, String password){

    }
}

class FakeFacebook extends Facebook{
//    ERROR karena parentnya menggunakan final method
//    void login(String username, String password){}
}


// ini pasti mengakibatkan error karena class fb tidak bisa diextends (jika class menggunakan keywords final)
// class FakeFacebook extends Facebook{}
