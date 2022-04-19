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
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fileId;

    private String filename;

    private String userId;

    private LocalDateTime gmtCreated;


}
