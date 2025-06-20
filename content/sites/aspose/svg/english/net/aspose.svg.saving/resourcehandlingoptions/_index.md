---
title: ResourceHandlingOptions Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Saving.ResourceHandlingOptions class. Represents resource handling options
type: docs
weight: 5750
url: /net/aspose.svg.saving/resourcehandlingoptions/
---
## ResourceHandlingOptions class

Represents resource handling options.

```csharp
public class ResourceHandlingOptions
```

## Properties

| Name | Description |
| --- | --- |
| [Default](../../aspose.svg.saving/resourcehandlingoptions/default/) { get; set; } | Gets or sets enum which represents default way of resources handling. Currently Save, Ignore and Embed values are supported. Default value is Save. |
| [JavaScript](../../aspose.svg.saving/resourcehandlingoptions/javascript/) { get; set; } | Gets or sets enum which represents the way scripts are handled. Currently Save, Ignore, Discard and Embed values are supported. Default value is Save. |
| [MaxHandlingDepth](../../aspose.svg.saving/resourcehandlingoptions/maxhandlingdepth/) { get; set; } | Gets or sets maximum depth of pages which will be handled. Depth of 1 means that only pages directly referenced from the saved document will be handled. Setting this property to -1 will lead to handling of all pages. Default value is 0. |
| [PageUrlRestriction](../../aspose.svg.saving/resourcehandlingoptions/pageurlrestriction/) { get; set; } | Gets or sets restriction applied to URLs of handled pages. Default value is RootAndSubFolders. |
| [ResourceUrlRestriction](../../aspose.svg.saving/resourcehandlingoptions/resourceurlrestriction/) { get; set; } | Gets or sets restriction applied to URLs of handled resources such as css, js, images etc. Default value is SameHost. |

### See Also

* namespace [Aspose.Svg.Saving](../../aspose.svg.saving/)
* assembly [Aspose.SVG](../../)
