package cinema.service.impl;

import static org.springframework.security.core.userdetails.User.withUsername;

import cinema.model.User;
import cinema.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        Optional<User> userOptional = userService.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            UserBuilder builder = withUsername(email);
            builder.password(user.getPassword());
            builder.roles(userOptional.get().getRoles().stream()
                    .map(x -> x.getRoleName().name())
                    .toArray(String[]::new));
            return builder.build();
        }
        throw new UsernameNotFoundException("User not found");
    }
}
