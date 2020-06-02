import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nguvu.R
import kotlinx.android.synthetic.main.slider1.view.*

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)





class ViewPagerAdapter : RecyclerView.Adapter<PagerVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
            PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.slider1, parent, false))

    //get the size of color array
    override fun getItemCount(): Int = 3

    //binding the screen with view
    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        if (position == 0) {
            tvAbout.text = "Alma Lee"
            info.text = "Irure quis pariatur anim aliqua sunt nostrud. Commodo velit eiusmod exercitation eiusmod duis fugiat eiusmod est dolore."
            ivImage.setImageResource(R.drawable.slider1)
        }

        if (position == 1) {
            tvAbout.text = "Sydney Collington"
            info.text = "Irure quis pariatur anim aliqua sunt nostrud.Commodo velit eiusmod exercitation eiusmod duis fugiat eiusmod est dolore."
            ivImage.setImageResource(R.drawable.slider2)
        }
        if (position == 2) {
            tvAbout.text = "Sarah Harvey"
            info.text = "Irure quis pariatur anim aliqua sunt nostrud. Commodo velit eiusmod exercitation eiusmod duis fugiat eiusmod est dolore."
            ivImage.setImageResource(R.drawable.slider3)
        }
    }
}

