package RecyclerViewHelpers

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import bryan.miranda.crudbryan1b.R

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val txtNombre: TextView = view.findViewById(R.id.txtNombreCard)

}
