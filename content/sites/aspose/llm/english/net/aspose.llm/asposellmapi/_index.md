---
title: Class AsposeLLMApi
second_title: Aspose.LLM for .NET API Reference
description: Aspose.LLM.AsposeLLMApi class. Highlevel facade over Engine  the recommended entry point for consumers of the Aspose.LLM NuGet package. Handles binary deployment model loading license checks and session lifecycle from a single PresetCoreBase
type: docs
weight: 10
url: /net/aspose.llm/asposellmapi/
---
## AsposeLLMApi class

High-level facade over Engine — the recommended entry point for consumers of the Aspose.LLM NuGet package. Handles binary deployment, model loading, license checks, and session lifecycle from a single PresetCoreBase.

**Singleton.** Only one instance may exist per process. Constructing a second `AsposeLLMApi` before disposing the first throws InvalidOperationException. This guards against double-loading the native llama.cpp runtime; the underlying libraries are not re-entrant on all platforms.

**License.** All chat-path methods enforce a runtime license check; unlicensed calls raise Exception with a "Not licensed" message.

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
| static [Create](../../aspose.llm/asposellmapi/create/)(PresetCoreBase, ILogger?) | Creates a new AsposeLLMApi instance using the provided preset. Equivalent to `new AsposeLLMApi(preset, logger)`; preserved for fluent / factory-style call sites. |
| [Dispose](../../aspose.llm/asposellmapi/dispose/)() | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [ForceCacheCleanup](../../aspose.llm/asposellmapi/forcecachecleanup/)(CacheCleanupStrategy) | Forces cleanup of the current chat session cache using the specified strategy. |
| [GetDefaultParametersAsync](../../aspose.llm/asposellmapi/getdefaultparametersasync/)() | Gets the default parameter sets returned by the engine. |
| [GetDefaultPreset](../../aspose.llm/asposellmapi/getdefaultpreset/)() | Returns a pre-configured Qwen25Preset instance suitable as a starting point when the caller has not prepared their own preset. The returned instance is freshly constructed (not shared with [`DefaultPreset`](./defaultpreset/)) — callers may mutate it safely. |
| [LoadChatSession](../../aspose.llm/asposellmapi/loadchatsession/)(string) | Loads a chat session from a file |
| [SaveChatSession](../../aspose.llm/asposellmapi/savechatsession/)(string, string?) | Saves a chat session to a file |
| [SendMessageAsync](../../aspose.llm/asposellmapi/sendmessageasync/)(string, IEnumerable&lt;byte[]&gt;?, PresetCoreBase?, CancellationToken) | Sends a user message to the current chat session, creating one first if CurrentChatSessionId is empty. |
| [SendMessageToSessionAsync](../../aspose.llm/asposellmapi/sendmessagetosessionasync/)(string, string, IEnumerable&lt;byte[]&gt;?, CancellationToken) | Sends a message to a specific chat session and gets a response |
| [StartNewChatAsync](../../aspose.llm/asposellmapi/startnewchatasync/)(PresetCoreBase, string) | Starts a new chat session. When *preset* is `null`, falls back to the preset supplied at construction (accessible via [`DefaultPreset`](./defaultpreset/)). |

### See Also

* namespace [Aspose.LLM](../../aspose.llm/)
* assembly [Aspose.LLM](../../)


