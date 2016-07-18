package co.example.dddroid.alex.dddroid;

/**
 * Created by User1 on 2016.07.18..
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.androidannotations.annotations.EBean;

import java.util.List;

/**
 * Created by User1 on 2016.07.15..
 */

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.MyViewHolder> {
    private List<People> list;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, id;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.txt_peoplenames);
            id = (TextView) view.findViewById(R.id.txt_id);

        }
    }

    public PeopleAdapter(List<People> list) {
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        People people = list.get(position);
        holder.name.setText(people.getName());
        holder.id.setText(people.getId());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}

