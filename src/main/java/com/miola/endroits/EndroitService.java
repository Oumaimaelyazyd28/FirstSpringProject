package com.miola.endroits;

import com.miola.users.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndroitService {

    @Autowired
    private EndroitRepository endroitRepository;

    public List<EndroitModel> getAll() {
        return endroitRepository.findAll();
    }

    public EndroitModel save(EndroitModel endroitModel) {
        return endroitRepository.save(endroitModel);
    }

    /*public List<EndroitModel> search(String query) {
        List<EndroitModel> products = endroitRepository.search(query);
        return products;
    }*/


}
