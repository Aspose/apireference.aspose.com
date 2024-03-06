---
title: Resource Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Saving.Resource class. This class describes a resource and provides methods for processing it
type: docs
weight: 2740
url: /net/aspose.svg.saving/resource/
---
## Resource class

This class describes a resource and provides methods for processing it.

```csharp
public class Resource
```

## Properties

| Name | Description |
| --- | --- |
| [MimeType](../../aspose.svg.saving/resource/mimetype/) { get; } | Returns the !:Html.MimeType of this resource. Can be `null` if the resource was not found. |
| [OriginalReference](../../aspose.svg.saving/resource/originalreference/) { get; } | Returns a string containing the original reference to this resource. |
| [OriginalUrl](../../aspose.svg.saving/resource/originalurl/) { get; } | Returns a URL indicating where this resource was located. |
| [OutputUrl](../../aspose.svg.saving/resource/outputurl/) { get; set; } | Gets or sets the URL indicating where the resource will be located after processing. |
| [Status](../../aspose.svg.saving/resource/status/) { get; } | Returns the current status of the resource. |

## Methods

| Name | Description |
| --- | --- |
| [Embed](../../aspose.svg.saving/resource/embed/)(ResourceHandlingContext) | Embeds this resource within its parent by encoding it as Base64. The encoding result will be written to [`OutputUrl`](./outputurl/). |
| [Save](../../aspose.svg.saving/resource/save/)(Stream, ResourceHandlingContext) | Saves the resource to the provided stream. |
| [WithOutputUrl](../../aspose.svg.saving/resource/withoutputurl/)(Url) | Specifies the new URL indicating where the resource will be located after processing. |

### See Also

* namespace [Aspose.Svg.Saving](../../aspose.svg.saving/)
* assembly [Aspose.SVG](../../)
