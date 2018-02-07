package com.fernandocejas.cognitive.chatbot.chat

import com.fernandocejas.cognitive.chatbot.UnitTest
import com.fernandocejas.cognitive.chatbot.chat.MessageViewModel.Type.SENT
import com.fernandocejas.cognitive.chatbot.framework.UseCase.None
import com.fernandocejas.cognitive.chatbot.util.DateTime
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.eq
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import org.mockito.Mock

class ChatPresenterTest : UnitTest() {

    private lateinit var chatPresenter: ChatPresenter

    @Mock private lateinit var chatView: ChatView

    @Before fun setUp() {
        chatPresenter = ChatPresenter()
        chatPresenter.chatView = chatView
    }

    @Test fun `should execute StartConversation use case and render response message`() {
    }

    @Test fun `should render sent message`() {
        val message = MessageViewModel("Test", DateTime.now(), SENT)
        chatPresenter.sendMessage(message)

        verify(chatView).renderMessage(message)
    }

    @Test fun `should execute SendMessage use case and render response message`() {
    }
}