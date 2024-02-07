package jira;

import com.jayway.jsonpath.JsonPath;
import okhttp3.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NamPotton {
    public static void main(String[] args) throws IOException {
        nampotton();
    }
public static void nampotton() throws IOException {
    for(int k=0;k<152;k++){
    OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
    MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8");
    RequestBody body = RequestBody.create(mediaType, "system_type=rs&division_id=40&district_id=65&upazila_id=52&mouja_id="+k+"&khatian_no=&owner_name=%E0%A6%86%E0%A6%9C%E0%A6%BF%E0%A6%9C%E0%A7%81%E0%A6%B2&dag_no=");
    Request request = new Request.Builder()
            .url("https://www.eporcha.gov.bd/deep-khatian-search-data")
            .method("POST", body)
            .addHeader("Accept", "*/*")
            .addHeader("Accept-Language", "en-US,en;q=0.9")
            .addHeader("Cache-Control", "no-cache")
            .addHeader("Connection", "keep-alive")
            .addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
            .addHeader("Cookie", "XSRF-TOKEN=eyJpdiI6Iis2bFo1VTEyRDBpNDRcLzZndEE4ajJBPT0iLCJ2YWx1ZSI6IjNmMlFrOVwvXC8wWTFRRUl6XC81czREdlNBZDBsd0t2bE1EWkNaK2IyUGJQNWJaelwvNldyRUJnd0tIWUdDR1c2QzlQIiwibWFjIjoiOThjODY1OGNiNWQyMjBmYmQ1MTY0MWY0M2NlZDViZGNkMjhmZDVmY2E0YjhiYTk0MmU1ZWEwNGU5OTYzZGVjMCJ9; eporcha_session=eyJpdiI6InoyMXhqSWRcL1FWRTBFTHM5TGVidWV3PT0iLCJ2YWx1ZSI6IkRlQkluU1hVYXMrQjdUY3BPVkJjdnpWUlZ4WVwvZkdUTThieWZrcUtua3RiaTZGV3UyK1ltS3lPajFqY1pxNUh5IiwibWFjIjoiNjk4OWI2N2UyYWQ3OWM4ZTU5MDU1YzcxZTZmNTMzODZlY2IxN2YwMDNjMDc5NDIxOTVmOWNjYmJkNzA3ZGVkZCJ9; XSRF-TOKEN=eyJpdiI6IjRsMVQ3bU1mNFlPR2o1cE84dm9NaUE9PSIsInZhbHVlIjoidVFWZEJzcm5rVGVuZkw3bmdPSkJ5YnkzNG1NeEF6Tktpc3doU0lZWmtGdVl3c3JIdFwvU1RUZDVDKzZRWWt2XC9oIiwibWFjIjoiOWY3N2FiMTIxZDZmYjRjYjAxOTA1NjU4OTQ1Y2Q0MjlkNjc5ZDgxMzRjMmIyYzE5YjcxNGYzMzJkNzE4MDI1MyJ9; eporcha_session=eyJpdiI6ImF0QXZab2J2cUNNeWQweVFiUTZBWGc9PSIsInZhbHVlIjoiNDhTM1RoU2NUTW5vTG1wMzdOeFhOQkg3eHNSNTNnK2plenMwSkRkTmtTcTJCOGRWVkdRdGQ5SUZQVmlBcGVCZSIsIm1hYyI6ImIzZDMwMjA3YjkxZWJmMTI2ZWY2YzZiNzhiYzc1ZWE3Njg2NTIzZTExZDZhMzM2OWE1MjM2OTU4MTg1ZjU2ZmQifQ%3D%3D")
            .addHeader("Origin", "https://www.eporcha.gov.bd")
            .addHeader("Pragma", "no-cache")
            .addHeader("Referer", "https://www.eporcha.gov.bd/")
            .addHeader("Sec-Fetch-Dest", "empty")
            .addHeader("Sec-Fetch-Mode", "cors")
            .addHeader("Sec-Fetch-Site", "same-origin")
            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36")
            .addHeader("X-CSRF-TOKEN", "selnGzqfxTpGu8B64Fgfy75ZqyCmJrUstkHJSOlE")
            .addHeader("X-Requested-With", "XMLHttpRequest")
            .addHeader("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Google Chrome\";v=\"121\", \"Chromium\";v=\"121\"")
            .addHeader("sec-ch-ua-mobile", "?0")
            .addHeader("sec-ch-ua-platform", "\"Windows\"")
            .build();
    Response response = client.newCall(request).execute();
    String responseB= response.body().string();

    int TotalNumberOfDevice = JsonPath.read(responseB, "$.itemCount");
    if(!(TotalNumberOfDevice==0)){
        System.out.println(responseB);
    }
    }

}
}
