---
title: AsposeLLMApi.GetDefaultPreset
second_title: Aspose.LLM for .NET API Reference
description: AsposeLLMApi method. Returns a preconfigured Qwen25Preset instance suitable as a starting point when the caller has not prepared their own preset. The returned instance is freshly constructed not shared with DefaultPreset  callers may mutate it safely
type: docs
weight: 70
url: /net/aspose.llm/asposellmapi/getdefaultpreset/
---
## AsposeLLMApi.GetDefaultPreset method

Returns a pre-configured Qwen25Preset instance suitable as a starting point when the caller has not prepared their own preset. The returned instance is freshly constructed (not shared with [`DefaultPreset`](../defaultpreset/)) — callers may mutate it safely.

```csharp
public PresetCoreBase GetDefaultPreset()
```

### Return Value

A newly-constructed Qwen25Preset.

## Remarks

Historical name "engine default" is preserved but slightly misleading: the engine itself doesn't own this preset; it is simply the SDK's recommended starting preset for general text workloads.

### See Also

* class [AsposeLLMApi](../)
* namespace [Aspose.LLM](../../asposellmapi/)
* assembly [Aspose.LLM](../../../)


