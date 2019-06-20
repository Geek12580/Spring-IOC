package Spring.mvc.service.serviceImpl;

        import Spring.annotation.hongService;
        import Spring.mvc.service.IDemoService;
@hongService
public class DemoService implements IDemoService {


    @Override
    public String add(String name) {
        return "添加成功from service    "+name;
    }

    @Override
    public String delete(String name) {
        return "删除成功from service    "+name;
    }

    @Override
    public String update(String name) {
        return "更新成功from service   "+name;
    }
}
