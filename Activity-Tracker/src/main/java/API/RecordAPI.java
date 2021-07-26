package API;

import org.springframework.web.bind.annotation.RequestMapping;

public class RecordAPI {


    @RequestMapping("v1/api/allRecords")
    public void allRecords() {
        recordDao.getAllRecords();
    }
}
