---
title: AsposeLLMApi.Create
second_title: Aspose.LLM for .NET API Reference
description: AsposeLLMApi method. Creates a new AsposeLLMApi instance using the provided preset. Equivalent to new AsposeLLMApipreset logger preserved for fluent / factorystyle call sites
type: docs
weight: 20
url: /net/aspose.llm/asposellmapi/create/
---
## AsposeLLMApi.Create method

Creates a new AsposeLLMApi instance using the provided preset. Equivalent to `new AsposeLLMApi(preset, logger)`; preserved for fluent / factory-style call sites.

```csharp
public static AsposeLLMApi Create(PresetCoreBase preset, ILogger? logger = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| preset | PresetCoreBase | Preset instance that provides default parameters. |
| logger | ILogger | Optional logger instance. |

### Return Value

New [`AsposeLLMApi`](../) instance.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | Thrown when another [`AsposeLLMApi`](../) instance is already live in the process. |

### See Also

* class [AsposeLLMApi](../)
* namespace [Aspose.LLM](../../asposellmapi/)
* assembly [Aspose.LLM](../../../)


