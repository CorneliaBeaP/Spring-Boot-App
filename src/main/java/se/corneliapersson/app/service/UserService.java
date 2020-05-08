package se.corneliapersson.app.service;

import se.corneliapersson.app.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
}
