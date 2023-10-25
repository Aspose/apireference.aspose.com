---
title: RendererTDocument Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.Renderer1TDocument class. Represents an abstract class for the all renderers
type: docs
weight: 2410
url: /net/aspose.svg.rendering/renderer-1/
---
## Renderer&lt;TDocument&gt; class

Represents an abstract class for the all renderers.

```csharp
public abstract class Renderer<TDocument> : Renderer
```

| Parameter | Description |
| --- | --- |
| TDocument | The type of the document. |

## Methods

| Name | Description |
| --- | --- |
| [Dispose](../../aspose.svg.rendering/renderer/dispose/)() | Releases unmanaged and - optionally - managed resources. |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_3)(IDevice, TDocument) | Defines method for rendering !:TDocument into specified [`IDevice`](../idevice/). |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_6)(IDevice, params TDocument[]) | Defines method for rendering multiple !:TDocuments into specific [`IDevice`](../idevice/). |
| abstract [Render](../../aspose.svg.rendering/renderer-1/render/#render_1)(IDevice, CancellationToken, params TDocument[]) | Defines a method for rendering multiple !:TDocuments into a specific [`IDevice`](../idevice/), using a cancellation token to request cancellation of the operation. |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render)(IDevice, int, params TDocument[]) | Defines method for rendering multiple !:TDocuments into specific [`IDevice`](../idevice/). |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_4)(IDevice, TDocument, int) | Defines method for rendering !:TDocument into specified [`IDevice`](../idevice/). |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_5)(IDevice, TDocument, TimeSpan) | Defines method for rendering !:TDocument into specified [`IDevice`](../idevice/). |
| abstract [Render](../../aspose.svg.rendering/renderer-1/render/#render_2)(IDevice, TimeSpan, params TDocument[]) | Defines method for rendering multiple !:TDocuments into specific [`IDevice`](../idevice/). |

### See Also

* class [Renderer](../renderer/)
* namespace [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../)
