package com.unfbx.chatgptsteamoutput.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 描述：
 *
 * @author grt
 * @date 2023-04-10
 */
@Data
public class ChatResponse {
    /**
     * 问题消耗tokens
     */
    @JsonProperty("question_tokens")
    private long questionTokens = 0;
}
