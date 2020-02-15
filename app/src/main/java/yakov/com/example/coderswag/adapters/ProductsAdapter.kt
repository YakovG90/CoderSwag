package yakov.com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import yakov.com.example.coderswag.R
import yakov.com.example.coderswag.model.Product

class ProductsAdapter(
    private val context: Context,
    private val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.product_list_item, parent, false)

        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productImage = itemView.findViewById<ImageView>(R.id.productImageView)
        private val productTitle = itemView.findViewById<TextView>(R.id.productTitleView)
        private val productPrice = itemView.findViewById<TextView>(R.id.productPriceView)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(
                product.image,
                "drawable",
                context.packageName
            )
            productImage.setImageResource(resourceId)
            productTitle.text = product.title
            productPrice.text = product.price

            // Set this later
//            itemView.setOnClickListener {  }
        }
    }
}