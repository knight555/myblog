package com.boom.myblog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Vincent
 * @since 2022-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class FileEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fileId;

    private String filename;

    private String userId;

    private Integer fileType; // 1-文本，2-图片，3-其他

    private LocalDateTime gmtCreated;


}
