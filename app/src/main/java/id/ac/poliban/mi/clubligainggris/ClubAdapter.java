package id.ac.poliban.mi.clubligainggris;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ClubAdapter extends BaseAdapter {
    private List<Club> data = new ArrayList<>();

    public ClubAdapter(List<Club> data){
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_gambar;
        TextView tvManakanName;
        TextView tvMakananDesc;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_clubligainggris, parent, false);

        //deklarasikan View
        img_gambar = convertView.findViewById(R.id.img_gambar);
        tvManakanName = convertView.findViewById(R.id.tv_clubligainggris_name);
        tvMakananDesc = convertView.findViewById(R.id.tv_clubligainggris_description);

        //isi data
        Glide.with(parent.getContext())
                .load(data.get(position).getGambar())
                .apply(new RequestOptions().override(60, 60))
                .into(img_gambar);
        tvManakanName.setText(data.get(position).getClubName());
        tvMakananDesc.setText(data.get(position).getClubDesc());

        return convertView;
    }
}
