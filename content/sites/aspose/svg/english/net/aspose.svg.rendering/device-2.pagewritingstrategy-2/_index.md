---
title: DeviceTGraphicContextTRenderingOptions.PageWritingStrategyTGraphicContextTRenderingOptions Enum
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Rendering.Device2PageWritingStrategyTGraphicContextTRenderingOptions enum. Specifies types of strategies for writing pages into output streamstreams
type: docs
weight: 4830
url: /net/aspose.svg.rendering/device-2.pagewritingstrategy-2/
---
## Device<TGraphicContext,TRenderingOptions>.PageWritingStrategy<TGraphicContext,TRenderingOptions> enumeration

Specifies types of strategies for writing pages into output stream\streams.

```csharp
public enum PageWritingStrategy<TGraphicContext, TRenderingOptions>
    where TGraphicContext : GraphicContext, new()
    where TRenderingOptions : RenderingOptions
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| SingleStream | `0` | Writes all pages into one output stream. |
| MultipleStreams | `1` | Writes every page into its own stream. |

### See Also

* class [GraphicContext](../graphiccontext/)
* class [RenderingOptions](../renderingoptions/)
* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../device-2/)
* namespace [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* assembly [Aspose.SVG](../../)
