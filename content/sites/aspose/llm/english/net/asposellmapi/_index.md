---
title: Class AsposeLLMApi
second_title: Aspose.LLM for .NET API Reference
description: Aspose.LLM.AsposeLLMApi class. Provides a convenient API for working with LLM functionality
type: docs
weight: 10
url: /net/asposellmapi/
---
## AsposeLLMApi class

Provides a convenient API for working with LLM functionality

```csharp
public class AsposeLLMApi : IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [AsposeLLMApi](asposellmapi/)(PresetCoreBase, ILogger?) | Initializes a new instance of the AsposeLLMApi class using the supplied preset. |

## Properties

| Name | Description |
| --- | --- |
| [DefaultPreset](../../aspose.llm/asposellmapi/defaultpreset/) { get; } | Gets the preset that provides default parameters for this API instance. |

## Methods

| Name | Description |
| --- | --- |
| static [Create](../../aspose.llm/asposellmapi/create/)(PresetCoreBase, ILogger?) | Creates a new AsposeLLMApi instance using the provided preset. |
| [Dispose](../../aspose.llm/asposellmapi/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [ForceCacheCleanup](../../aspose.llm/asposellmapi/forcecachecleanup/)(CacheCleanupStrategy) | Forces cleanup of the current chat session cache using the specified strategy. |
| [GetDefaultParametersAsync](../../aspose.llm/asposellmapi/getdefaultparametersasync/)() | Gets the default parameter sets returned by the engine. |
| [GetDefaultPreset](../../aspose.llm/asposellmapi/getdefaultpreset/)() | Creates a preset populated with engine default parameters. |
| [LoadChatSession](../../aspose.llm/asposellmapi/loadchatsession/)(string) | Loads a chat session from a file |
| [SaveChatSession](../../aspose.llm/asposellmapi/savechatsession/)(string, string?) | Saves a chat session to a file |
| [SendMessageAsync](../../aspose.llm/asposellmapi/sendmessageasync/)(string, IEnumerable&lt;byte[]&gt;?, PresetCoreBase?, CancellationToken) | Sends a message using parameters from the provided preset, creating a session if necessary. |
| [SendMessageToSessionAsync](../../aspose.llm/asposellmapi/sendmessagetosessionasync/)(string, string, IEnumerable&lt;byte[]&gt;?, CancellationToken) | Sends a message to a specific chat session and gets a response |
| [StartNewChatAsync](../../aspose.llm/asposellmapi/startnewchatasync/)(PresetCoreBase, string) | Starts a new chat session using the supplied preset. |

### See Also

* namespace [Aspose.LLM](../../aspose.llm/)
* assembly [Aspose.LLM](../../)


