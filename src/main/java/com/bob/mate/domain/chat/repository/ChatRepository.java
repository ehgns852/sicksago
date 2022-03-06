package com.bob.mate.domain.chat.repository;

import com.bob.mate.domain.chat.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}
