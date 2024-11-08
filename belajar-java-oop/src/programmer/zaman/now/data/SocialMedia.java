package programmer.zaman.now.data;

class SocialMedia {
    String name;
}

// final artinya class tidak dapat diwariskan kembali
final class Facebook extends SocialMedia{}

// ini pasti mengakibatkan error karena class fb tidak bisa diextends
//class FakeFacebook extends Facebook{}
