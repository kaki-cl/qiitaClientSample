package sample.qiitaclient.view

import android.content.Context
import android.graphics.Color
import android.media.Image
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import sample.qiitaclient.R
import sample.qiitaclient.bindView
import sample.qiitaclient.model.Article

/**
 * Created by kakehi on 2018/02/17.
 */
class ArticleView : FrameLayout {

    /**
     * todo 覚えること
     *
     * セカンダリコンストラクタ8章
     * インフレ―と。AndroidのAPIを用いて行うらしい。
     * Nullableなプロパティ12章
     * 委譲プロパティ13章
     * ラムダ式
     *
     * todo 指針
     * プロパティはvalかつNotNullにしたい
     *
     *
     * todo できなかったこと
     * kolin REPLでmodelをimportで参照できなかった
     *
     */

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

//    var profileImageView: ImageView? = null
//    var titleTextView: TextView? = null
//    var userNameTextView: TextView? = null
//    init {
//        LayoutInflater.from(context).inflate(R.layout.view_article, this)
//        profileImageView = findViewById(R.id.profile_image_view) as ImageView
//        titleTextView = findViewById(R.id.title_text_view) as TextView
//        userNameTextView = findViewById(R.id.user_name_text_view) as TextView
//    }

//    val profileImageView: ImageView by lazy {
//        findViewById(R.id.profile_image_view) as ImageView
//    }
//
//    val titleTextView: TextView by lazy {
//        findViewById(R.id.title_text_view) as TextView
//    }
//
//    val userNameTextView: TextView by lazy {
//        findViewById(R.id.user_name_text_view) as TextView
//    }

    val profileImageView: ImageView by bindView(R.id.profile_image_view)
    val titleTextView: TextView by bindView(R.id.title_text_view)
    val userNameTextView: TextView by bindView(R.id.user_name_text_view)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
    }

    fun setArticle(article: Article) {
        titleTextView.text = article.title
        userNameTextView.text = article.user.name

        // todo プロフィール画像をセットする
        profileImageView.setBackgroundColor(Color.RED)
    }

}
