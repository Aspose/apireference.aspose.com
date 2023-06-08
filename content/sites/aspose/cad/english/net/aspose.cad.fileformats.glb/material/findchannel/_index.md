---
title: Material.FindChannel
second_title: Aspose.CAD for .NET API Reference
description: Material method. Finds an instance of MaterialChannel
type: docs
weight: 70
url: /net/aspose.cad.fileformats.glb/material/findchannel/
---
## Material.FindChannel method

Finds an instance of [`MaterialChannel`](../../materialchannel/)

```csharp
public MaterialChannel? FindChannel(string channelKey)
```

| Parameter | Type | Description |
| --- | --- | --- |
| channelKey | String | The channel key. Currently, these values are used: - "Normal" - "Occlusion" - "Emissive" - When material is MaterialPBRMetallicRoughness: - "BaseColor" - "MetallicRoughness" - When material is MaterialPBRSpecularGlossiness: - "Diffuse" - "SpecularGlossiness" |

### Return Value

A [`MaterialChannel`](../../materialchannel/) structure. or null if it does not exist

### See Also

* struct [MaterialChannel](../../materialchannel/)
* class [Material](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../material/)
* assembly [Aspose.CAD](../../../)


