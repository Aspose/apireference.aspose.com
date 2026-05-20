---
title: AsposeLLMApi.StartNewChatAsync
second_title: Aspose.LLM for .NET API Reference
description: AsposeLLMApi method. Starts a new chat session. When preset is null falls back to the preset supplied at construction accessible via DefaultPreset
type: docs
weight: 120
url: /net/aspose.llm/asposellmapi/startnewchatasync/
---
## AsposeLLMApi.StartNewChatAsync method

Starts a new chat session. When *preset* is `null`, falls back to the preset supplied at construction (accessible via [`DefaultPreset`](../defaultpreset/)).

```csharp
public Task<string> StartNewChatAsync(PresetCoreBase? preset = null, string? sessionId = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| preset | PresetCoreBase | Preset that provides chat, context, and sampler parameters. Null → [`DefaultPreset`](../defaultpreset/). |
| sessionId | String | Optional session identifier; a GUID is generated when null. |

### Return Value

Identifier of the newly-created chat session.

### Exceptions

| exception | condition |
| --- | --- |
| ObjectDisposedException | Thrown when the API has been disposed. |
| Exception | Thrown when no license is set (see class remarks). |

### See Also

* class [AsposeLLMApi](../)
* namespace [Aspose.LLM](../../asposellmapi/)
* assembly [Aspose.LLM](../../../)


