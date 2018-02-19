package sample.qiitaclient

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import sample.qiitaclient.model.Article
import sample.qiitaclient.view.ArticleView
/**
 * Created by kakehi on 2018/02/17.
 */

/**
 * todo
 * エルビス演算子
 * 拡張関数apply
 */
class ArticleListAdapter(private val context: Context) : BaseAdapter() {

    var articles: List<Article> = emptyList()

    override fun getCount(): Int = articles.size

    override fun getItem(position: Int): Any? = articles[position]

    override fun getItemId(position: Int): Long = 0

    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup?): View =
            ((convertView as? ArticleView) ?: ArticleView(context)).apply {
                setArticle(articles[position])
            }
    //ArticleView.apply {setArticle} を行うことでViewを実装したArticleViewオブジェクトを返す。
    //applyを使うことで一時的な変数を導入せずに済む。メンバアクセスを短くできる。
}
