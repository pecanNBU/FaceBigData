package com.gosun.bigdata.service.api.capture.service;

import com.gosun.bigdata.service.api.capture.search.SearchOption;
import com.gosun.bigdata.service.api.capture.search.SearchResult;

import java.util.List;
import java.util.Map;

/**
 * 图片搜索服务
 */
public interface CapturePictureSearchService {
    /**
     * @param option 搜索选项
     * @return 搜索结果 id
     */
    String search(SearchOption option);
    /**
     * @param searchId 搜索的 id
     * @param offset   从第几条开始
     * @param count    条数
     * @return 结果
     */
    SearchResult getSearchResult(String searchId, int offset, int count);

    /**
     * 把一张大图拆分成人脸
     *
     * @param bytes 图片
     * @return 人脸图 id
     */
    //此接口不需要再实现
    List<String> faces(byte[] bytes, int type);

    /**
     * 查看图片有哪些属性
     *
     * @param type 类型
     * @return 过滤参数键值对
     */
    Map<String, String> getSearchFilterParams(int type);

    /**
     * 根据id获取原图
     *
     * @param imageId
     * @param type
     * @return
     */
    byte[] getPicture(String imageId, int type);
}
