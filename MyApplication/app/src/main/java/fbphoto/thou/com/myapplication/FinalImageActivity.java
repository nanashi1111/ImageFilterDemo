package fbphoto.thou.com.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.io.File;

import butterknife.Bind;
import butterknife.OnClick;
import fbphoto.thou.com.utils.Constant;
import fbphoto.thou.com.utils.DeviceUtils;

/**
 * Created by Computer on 2/8/2018.
 */

public class FinalImageActivity extends BaseActivity {

    @Bind(R.id.iv_picture)
    ImageView ivPicture;
    @Bind(R.id.et_caption)
    EditText etCaption;
    String imagePath;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getData();
        if (imagePath != null && !imagePath.isEmpty()) {
            Glide.with(this).load(new File(imagePath)).diskCacheStrategy(DiskCacheStrategy.ALL).into(ivPicture);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_final_image;
    }

    @Override
    protected void createView() {
        int screenWidth = DeviceUtils.getScreenWidth(this);
        ivPicture.getLayoutParams().height = screenWidth;
    }

    @OnClick(R.id.bt_close)
    public void closeCamera() {
        finish();
    }

    private void getData() {
        Bundle bundle = getIntent().getBundleExtra(Constant.KEY_EXTRA);
        if (bundle != null) {
            imagePath = bundle.getString(Constant.KEY_IMAGE_PATH);
        }
    }

    @OnClick(R.id.bt_post)
    public void post() {
        //share
        showToast("Fake share thoi :))");
    }
}
