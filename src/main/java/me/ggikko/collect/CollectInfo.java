package me.ggikko.collect;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Park Ji Hong, ggikko.
 */
@Entity
@Data
public class CollectInfo {

    @Id @GeneratedValue
    Long id;

    String url;

    String htmlInfo;

}
