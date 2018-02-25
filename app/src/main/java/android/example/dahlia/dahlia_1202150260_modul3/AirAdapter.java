package android.example.dahlia.dahlia_1202150260_modul3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by Asus on 25/02/2018.
 */

public class AirAdapter extends RecyclerView.Adapter<AirAdapter.ViewHolder> {
    private ArrayList<Air> mAirData;
    private Context mContext;
    private GradientDrawable mGradient;

    AirAdapter(Context context, ArrayList<Air> airData) {
        this.mAirData = airData;
        this.mContext = context;
        mGradient = new GradientDrawable();
        mGradient.setColor(Color.GRAY);

        Drawable drawable = ContextCompat.getDrawable(mContext, R.drawable.ades);
        if (drawable!=null){
            mGradient.setSize(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override
    public AirAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(AirAdapter.ViewHolder holder, int position) {
    //Get current sport
        Air currentAir = mAirData.get(position);
        //Populate the textviews with data
        holder.bindTo(currentAir);

    }

    @Override
    public int getItemCount() {
        return mAirData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //Member Variables for the TextViews
        private TextView mTitleText;
        private TextView mInfoText;
        private ImageView mSportsImage;
        private  Air mCurrentAir;
        private GradientDrawable mGradientDrawables;

        public ViewHolder(View itemView) {
            super(itemView);
            mTitleText = (TextView) itemView.findViewById(R.id.title);
            mInfoText = (TextView) itemView.findViewById(R.id.subTitle);
            mSportsImage = (ImageView)itemView.findViewById(R.id.sportsImage);
            itemView.setOnClickListener((View.OnClickListener) this);

        }

        public void bindTo(Air currentAir) {
            //Populate the textviews with data
            mTitleText.setText(currentAir.getNamaAir());
            mInfoText.setText(currentAir.getInfo());

            mCurrentAir = currentAir;

            Glide.with(mContext).load(currentAir.getImageResource()).into(mSportsImage);

        }

    }
}