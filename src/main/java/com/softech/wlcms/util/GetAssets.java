package com.softech.wlcms.util;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * Created by umair.javaid on 3/30/2016.
 */
public class GetAssets {




    public enum AssetTypeEnum {
        IMAGE("image"),
        PDF("pdf"),
        VIDEO("video"),
        PPT("ppt"),
        MP3("mp3"),
        XLS("xls");
        private String statusCode;

        private AssetTypeEnum(String statusCode) {
            this.statusCode = statusCode;
        }

        public String getElement() {
            return statusCode;
        }
    }

    public String getPath(AssetTypeEnum assetType) {
        String path = "";
        switch (assetType) {
            case IMAGE:
                path = getImagePath();
                break;
            case PDF:
                path = getPdfPath();
                break;
            case VIDEO:
                path = getVideoPath();
                break;
            case PPT:
                path = getPptPath();
                break;
            case MP3:
                path = getMp3Path();
            case XLS:
                path = getXlsPath();
        }
        return path;
    }

    private String getImagePath() {
        URL path = getClass().getClassLoader().getResource("assets/uploadtest.jpg");
        String pathImage = path.getPath();
        return pathImage;
    }

    private String getPdfPath() {

        URL path = getClass().getClassLoader().getResource("assets/testpdf.pdf");
        String pathpdf = path.getPath();
        return pathpdf;
    }

    private String getVideoPath() {
        URL path = getClass().getClassLoader().getResource("assets/uploadTestVideo.mp4");
        String pathVideo = path.getPath();
        return pathVideo;
    }

    private String getPptPath() {
        URL path = getClass().getClassLoader().getResource("assets/TestAutomation.pptx");
        String pathPpt = path.getPath();
        return pathPpt;
    }

    private String getMp3Path() {
        URL path = getClass().getClassLoader().getResource("assets/mpthreetest.mp3");
        String pathPpt = path.getPath();
        return pathPpt;
    }
    private String getXlsPath() {
        URL path = getClass().getClassLoader().getResource("assets/xlsDocument.xls");
        String pathPpt = path.getPath();
        return pathPpt;
    }
}
