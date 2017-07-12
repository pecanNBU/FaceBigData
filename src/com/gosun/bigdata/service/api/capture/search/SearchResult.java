package com.gosun.bigdata.service.api.capture.search;

//import com.google.gson.Gson;

import com.gosun.bigdata.service.api.capture.picture.CapturedPicture;

import java.util.List;

/**
 * 搜索结果
 */
public class SearchResult {
    /**
     * 本次搜索的 id
     */
    private String searchId;
    /**
     * 是否搜索完成
     */
    private boolean finished;
    /**
     * 用于标明是大图还是小图
     */
    private int type;
    /**
     * 搜索图片的 id
     */
    private String imageId;
    /**
     * 搜索结果数
     */
    private int total;
    /**
     * 匹配到的结果列表
     */
    private List<CapturedPicture> pictures;

}
