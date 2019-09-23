package jp.techacademy.suda.yukihide.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age, hobby) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。歳は" + this.age + "歳です。」")
    }

    // Thinkableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "「私は" + this.hobby + "について考える。」")
    }
}