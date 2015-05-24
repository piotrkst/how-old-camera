package kaede.me.howoldrobot.view;

import android.graphics.Bitmap;

import java.util.List;

import kaede.me.howoldrobot.Model.Face;

/**
 * Created by kaede on 2015/5/23.
 */
public interface IPhotoView {
    public void onGetFaces(List<Face> faces);
    public void onGetImage(Bitmap bitmap,String imgPath);
}
