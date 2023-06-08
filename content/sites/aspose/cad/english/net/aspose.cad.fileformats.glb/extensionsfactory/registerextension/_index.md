---
title: ExtensionsFactory.RegisterExtension
second_title: Aspose.CAD for .NET API Reference
description: ExtensionsFactory method. Registers a new extensions to be used globally
type: docs
weight: 20
url: /net/aspose.cad.fileformats.glb/extensionsfactory/registerextension/
---
## ExtensionsFactory.RegisterExtension&lt;TParent,TExtension&gt; method

Registers a new extensions to be used globally.

```csharp
public static void RegisterExtension<TParent, TExtension>(string persistentName)
    where TParent : JsonSerializable
    where TExtension : JsonSerializable
```

| Parameter | Description |
| --- | --- |
| TParent | The parent type to which this extension is attached. |
| TExtension | The extension type. |
| persistentName | The extension name. |

## Remarks

The *persistentName* is the value used for serialization

### See Also

* class [JsonSerializable](../../../aspose.cad.fileformats.glb.io/jsonserializable/)
* class [ExtensionsFactory](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../extensionsfactory/)
* assembly [Aspose.CAD](../../../)


