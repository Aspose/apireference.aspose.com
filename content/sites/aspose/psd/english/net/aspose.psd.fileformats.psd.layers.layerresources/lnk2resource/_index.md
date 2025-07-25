---
title: Class Lnk2Resource
second_title: Aspose.PSD for .NET API Reference
description: Aspose.PSD.FileFormats.Psd.Layers.LayerResources.Lnk2Resource class. Defines the class which contains information about embedded files in the PSD format image. The link resource may contain several LiFdDataSource instances which can be accessed by the indexer
type: docs
weight: 2990
url: /net/aspose.psd.fileformats.psd.layers.layerresources/lnk2resource/
---
{{< psd/tize >}}
## Lnk2Resource class

Defines the class which contains information about embedded files in the PSD format image. The link resource may contain several [`LiFdDataSource`](../lifddatasource/) instances which can be accessed by the indexer.

```csharp
public class Lnk2Resource : LinkResource
```

## Constructors

| Name | Description |
| --- | --- |
| [Lnk2Resource](lnk2resource/)() | Initializes a new instance of the `Lnk2Resource` class. |

## Properties

| Name | Description |
| --- | --- |
| [DataSourceCount](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/datasourcecount/) { get; } | Gets the count of link data sources which can be accessed by the indexer. |
| [IsEmpty](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/isempty/) { get; } | Gets a value indicating whether this link resource instance is empty. |
| [Item](../../aspose.psd.fileformats.psd.layers.layerresources/lnk2resource/item/) { get; } | Gets the [`LiFdDataSource`](../lifddatasource/) at the specified index. (2 indexers) |
| [Key](../../aspose.psd.fileformats.psd.layers/layerresource/key/) { get; } | Gets the layer resource key. |
| override [Length](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/length/) { get; } | Gets the PSD global link resource length in bytes. |
| [PsdVersion](../../aspose.psd.fileformats.psd.layers/layerresource/psdversion/) { get; } | Gets the minimal psd version required for layer resource. 0 indicates no restrictions. |
| virtual [Signature](../../aspose.psd.fileformats.psd.layers/layerresource/signature/) { get; } | Gets the signature. |

## Methods

| Name | Description |
| --- | --- |
| override [Save](../../aspose.psd.fileformats.psd.layers.layerresources/linkresource/save/)(StreamContainer, int) | Saves the resource block data. |
| override [ToString](../../aspose.psd.fileformats.psd.layers/layerresource/tostring/)() | Returns a String that represents this instance. |

## Fields

| Name | Description |
| --- | --- |
| const [TypeToolKey](../../aspose.psd.fileformats.psd.layers.layerresources/lnk2resource/typetoolkey/) | The type tool info key. |

### See Also

* class [LayerResource](../../aspose.psd.fileformats.psd.layers/layerresource/)
* class [LinkResource](../linkresource/)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.LayerResources](../../aspose.psd.fileformats.psd.layers.layerresources/)
* assembly [Aspose.PSD](../../)


