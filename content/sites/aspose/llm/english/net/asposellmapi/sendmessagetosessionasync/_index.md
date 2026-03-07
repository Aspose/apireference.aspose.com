---
title: AsposeLLMApi.SendMessageToSessionAsync
second_title: Aspose.LLM for .NET API Reference
description: AsposeLLMApi method. Sends a message to a specific chat session and gets a response
type: docs
weight: 110
url: /net/asposellmapi/sendmessagetosessionasync/
---
## AsposeLLMApi.SendMessageToSessionAsync method

Sends a message to a specific chat session and gets a response

```csharp
public Task<string> SendMessageToSessionAsync(string sessionId, string message, 
    IEnumerable<byte[]>? media = null, CancellationToken cancellationToken = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sessionId | String | Session identifier |
| message | String | Message to send |
| media | IEnumerable`1 | Media to send |
| cancellationToken | CancellationToken | Cancellation token |

### Return Value

Response from the chat session

### See Also

* class [AsposeLLMApi](../)
* namespace [Aspose.LLM](../../asposellmapi/)
* assembly [Aspose.LLM](../../../)


