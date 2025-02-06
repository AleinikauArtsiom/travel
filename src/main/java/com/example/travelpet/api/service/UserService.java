package com.example.travelpet.api.service;

import com.example.travelpet.api.dto.update.UserDtoUpdate;
import com.example.travelpet.model.entity.User;
import com.example.travelpet.model.entity.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.getReferenceById(id);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public boolean updateSelf(UserDtoUpdate userDU) {
        // Authentication authentication = SecurityContextHolder.getContext.getAuthentication();
        // Long currentUserEmail = Long.parseLong(authentication.getEmail);
        // if(!currentUserEmsail.equals(userSecurity.getEmail())){
        // throw new RuntimeException("You can only update your own account")
        // }
        User userFromDB = userRepository.getReferenceById(userDU.getUserId());
        boolean updated = false;
        if (userDU.getGivenName() != null) {
            userFromDB.setGivenName(userDU.getGivenName());
            updated = true;
        }

        if (userDU.getFamilyName() != null) {
            userFromDB.setFamilyName(userDU.getFamilyName());
            updated = true;
        }

        if (updated) {
            userRepository.saveAndFlush(userFromDB);
        }

        return updated;
    }
}

