---
title: AsposeLLMApi.SendMessageAsync
second_title: Aspose.LLM for .NET API Reference
description: AsposeLLMApi method. Sends a user message to the current chat session creating one first if CurrentChatSessionId is empty
type: docs
weight: 100
url: /net/aspose.llm/asposellmapi/sendmessageasync/
---
## AsposeLLMApi.SendMessageAsync method

Sends a user message to the current chat session, creating one first if CurrentChatSessionId is empty.

When a session already exists, the *preset* argument is NOT re-applied to the existing session — the session keeps the parameters it was started with. To change parameters mid-conversation, start a new session via [`StartNewChatAsync`](../startnewchatasync/) with the desired preset and then send through [`SendMessageToSessionAsync`](../sendmessagetosessionasync/).

```csharp
public Task<string> SendMessageAsync(string message, IEnumerable<byte[]>? media = null, 
    PresetCoreBase? preset = null, CancellationToken cancellationToken = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| message | String | The message text to send. |
| media | IEnumerable`1 | Optional media payloads for multimodal sessions. |
| preset | PresetCoreBase | Preset that supplies chat / context / sampler parameters when a fresh session is created by this call. Null → [`DefaultPreset`](../defaultpreset/). |
| cancellationToken | CancellationToken | Cancellation token. |

### Return Value

Assistant response text.

### Exceptions

| exception | condition |
| --- | --- |
| ObjectDisposedException | Thrown when the API has been disposed. |
| Exception | Thrown when no license is set. |

### See Also

* class [AsposeLLMApi](../)
* namespace [Aspose.LLM](../../asposellmapi/)
* assembly [Aspose.LLM](../../../)


