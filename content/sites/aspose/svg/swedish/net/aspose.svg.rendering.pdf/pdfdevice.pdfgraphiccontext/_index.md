---
title: Class PdfDevice.PdfGraphicContext
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.Rendering.Pdf.PdfDevicePdfGraphicContext klass. Innehåller aktuella grafikkontrollparametrar för PdfDevice. Dessa parametrar definierar det globala ramverket inom vilket grafikoperatorerna exekverar.
type: docs
weight: 2960
url: /sv/net/aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

Innehåller aktuella grafikkontrollparametrar för PdfDevice. Dessa parametrar definierar det globala ramverket inom vilket grafikoperatorerna exekverar.

```csharp
public class PdfGraphicContext : GraphicContext
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PdfGraphicContext](pdfgraphiccontext/)() | Default_Constructor |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Ställer in eller får teckenavstånd. |
| override [FillBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/fillbrush/) { get; set; } | Ställer in eller hämtar penselobjektet som används för att fylla banornas inre. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Ställer in eller hämtar True Type-teckensnittsobjektet som används för att rendera text. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Ställer in eller hämtar teckenstorlek för text. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Ställer in eller hämtar texttypsnittsstil. |
| override [LineCap](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linecap/) { get; set; } | Ställer in eller hämtar koden som anger formen på ändpunkterna för en öppen bana som ströks. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Ställer in eller hämtar fasförskjutningen av det aktuella linjestreckmönstret. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Ställer in eller hämtar beskrivningen av streckmönstret som ska användas när banor ströks. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Uppsättningar av får stilen för streckade linjer i en streckad bana. |
| override [LineJoin](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linejoin/) { get; set; } | Ställer in eller hämtar koden som anger formen på fogar mellan anslutna segment av en streckad bana. |
| override [LineWidth](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linewidth/) { get; set; } | Ställer in eller hämtar tjockleken på banorna som ska sträckas. |
| override [MiterLimit](../../aspose.svg.rendering.pdf/pdfgraphiccontext/miterlimit/) { get; set; } | Ställer in eller hämtar den maximala längden på geringslinjer för streckade banor. Den här parametern begränsar längden på "spikar" som produceras när linjesegment förenas i skarpa vinklar. |
| override [StrokeBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/strokebrush/) { get; set; } | Ställer in eller hämtar penselobjektet som används för streckade banor. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Får en[`TextInfo`](../../aspose.svg.rendering/textinfo/) objekt som innehåller information om renderad text. |
| override [TransformationMatrix](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transformationmatrix/) { get; set; } | Ställer in eller hämtar transformationsmatris. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.pdf/pdfgraphiccontext/clone/)() | Skapar en ny instans av en klass med samma egenskapsvärden som en befintlig instans. |
| override [Transform](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transform/)(Matrix) | Ändra den aktuella transformationsmatrisen genom att multiplicera den angivna matrisen. |

### Se även

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* namnutrymme [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* hopsättning [Aspose.SVG](../../)


