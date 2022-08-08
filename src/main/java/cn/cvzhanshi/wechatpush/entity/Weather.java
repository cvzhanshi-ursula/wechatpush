package cn.cvzhanshi.wechatpush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author cVzhanshi
 * @create 2022-08-04 2215
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    String wd_night;
    String date;
    String high;
    String week;
    String text_night;
    String wd_day;
    String low;
    String wc_night;
    String text_day;
    String wc_day;
    // 当前天气
    String text_now;
    // 当前温度
    String temp;
    // 风级大小
    String wind_class;
    // 风向
    String wind_dir;
}
