package AllFiles.Controlers;

import AllFiles.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleControler {



    private final PersonDao personDao;

    @Autowired
    private PeopleControler(PersonDao personDao) {
        this.personDao = personDao;
    }

    @GetMapping()// get all people
    public String all(Model model) {
        model.addAttribute("person",personDao.all());
        return "/people/all";
    }
    @GetMapping("/{id}")//get 1 man from dao
    public String user(@PathVariable("id") int id, Model model){
        model.addAttribute("person",personDao.user(id));
        return "/people/user";
    }
}
