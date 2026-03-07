---
title: AsposeLLMApi.SendMessageAsync
second_title: Aspose.LLM for .NET API Reference
description: AsposeLLMApi method. Sends a message using parameters from the provided preset creating a session if necessary
type: docs
weight: 100
url: /net/aspose.llm/asposellmapi/sendmessageasync/
---
## AsposeLLMApi.SendMessageAsync method

Sends a message using parameters from the provided preset, creating a session if necessary.

```csharp
public Task<string> SendMessageAsync(string message, IEnumerable<byte[]>? media = null, 
    PresetCoreBase? preset = null, CancellationToken cancellationToken = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| message | String | The message text to send to the chat session. |
| media | IEnumerable`1 | Optional media payload as raw byte arrays. |
| preset | PresetCoreBase | Preset that supplies chat, context, and sampler parameters. |
| cancellationToken | CancellationToken | Cancellation token |

### Return Value

Response text returned by the chat session.

### See Also

* class [AsposeLLMApi](../)
* namespace [Aspose.LLM](../../asposellmapi/)
* assembly [Aspose.LLM](../../../)


