---
title: ResourceHandler Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Saving.ResourceHandlers.ResourceHandler class. This class is responsible for handling resources. It provides methods that allow you to control what will be done with the Resource as well as what reference will be written to the parent Resource
type: docs
weight: 2840
url: /net/aspose.svg.saving.resourcehandlers/resourcehandler/
---
## ResourceHandler class

This class is responsible for handling resources. It provides methods that allow you to control what will be done with the [`Resource`](../../aspose.svg.saving/resource/), as well as what reference will be written to the parent [`Resource`](../../aspose.svg.saving/resource/).

```csharp
public abstract class ResourceHandler
```

## Methods

| Name | Description |
| --- | --- |
| abstract [HandleResource](../../aspose.svg.saving.resourcehandlers/resourcehandler/handleresource/)(Resource, ResourceHandlingContext) | This method is responsible for handling the resource. In it you can save the [`Resource`](../../aspose.svg.saving/resource/) to the stream or embed it into the parent resource. |
| virtual [HandleResourceReference](../../aspose.svg.saving.resourcehandlers/resourcehandler/handleresourcereference/)(Resource, ResourceHandlingContext) | This method is responsible for handling the resource reference. In this method, you can set what the reference to the resource being handled will look like. |

### See Also

* namespace [Aspose.Svg.Saving.ResourceHandlers](../../aspose.svg.saving.resourcehandlers/)
* assembly [Aspose.SVG](../../)
