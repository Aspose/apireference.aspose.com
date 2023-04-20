---
title: Class PdfDevice
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.Rendering.Pdf.PdfDevice klass. Representerar rendering till ett pdfdokument.
type: docs
weight: 2950
url: /sv/net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

Representerar rendering till ett pdf-dokument.

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(ICreateStreamProvider) | Initierar en ny instans av`PdfDevice` class. |
| [PdfDevice](pdfdevice/#constructor_4)(Stream) | Initierar en ny instans av`PdfDevice` class. |
| [PdfDevice](pdfdevice/#constructor_5)(string) | Initierar en ny instans av`PdfDevice` class. |
| [PdfDevice](pdfdevice/#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | Initierar en ny instans av`PdfDevice` klass genom renderingsalternativ och strömleverantör. |
| [PdfDevice](pdfdevice/#constructor_2)(PdfRenderingOptions, Stream) | Initierar en ny instans av`PdfDevice` klass genom att rendera alternativ och utdataström. |
| [PdfDevice](pdfdevice/#constructor_3)(PdfRenderingOptions, string) | Initierar en ny instans av`PdfDevice` klass genom att rendera alternativ och utdatafilnamn. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } |  |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } |  |

## Metoder

| namn | Beskrivning |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect/)(RectangleF) | Lägger till en rektangel till den aktuella sökvägen som en komplett undersökväg. |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument/)(Document) | Börjar renderingen av dokumentet. |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement/)(Element, RectangleF) | Börjar rendering av elementet. |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage/)(SizeF) | Börjar renderingen av den nya sidan. |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip/)(FillMode) | Modifierar den aktuella urklippsbanan genom att skära den med den aktuella sökvägen, med hjälp av FillMode-regeln för att bestämma regionen som ska fyllas. Den här metoden avslutar aktuell väg. |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath/)() | Stänger den aktuella delvägen genom att lägga till ett rakt linjesegment från den aktuella punkten till startpunkten för delvägen. Om den aktuella undersökvägen redan är stängd, gör "ClosePath" ingenting. Denna operatör avslutar den aktuella undersökvägen. Genom att lägga till ett annat segment till den aktuella sökvägen börjar en ny undersökväg, även om det nya segmentet börjar vid den slutpunkt som nås med "ClosePath"-metoden. |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto/)(PointF, PointF, PointF) | Lägger till en kubisk Bézier-kurva till den aktuella sökvägen. Kurvan sträcker sig från den aktuella punkten till punkten pt2, med pt1 och pt2 som Bézier-kontrollpunkter. Den nya aktuella punkten är pt3. |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage/)(byte[], ImageType, RectangleF) | Ritar den angivna bilden. |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument/)() | Avslutar renderingen av dokumentet. |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement/)(Element) | Avslutar renderingen av elementet. |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage/)() | Avslutar renderingen av den aktuella sidan. |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill/)(FillMode) | Fyller hela området som omges av den aktuella sökvägen. Om sökvägen består av flera frånkopplade undersökvägar, fyller den insidan av alla undersökvägar, betraktat tillsammans. Den här metoden avslutar aktuell väg. |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext/)(string, PointF) | Fyller den angivna textsträngen på den angivna platsen. |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush/)() | Rensar all data till utdataström. |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto/)(PointF) | Lägger till ett rakt linjesegment från den aktuella punkten till punkten (pt). Den nya nuvarande punkten är pt. |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto/)(PointF) | Börjar en ny undersökväg genom att flytta den aktuella punkten till koordinaterna för parametern pt, och utelämnar alla anslutande linjesegment. Om den tidigare vägkonstruktionsmetoden i den aktuella sökvägen också var "MoveTo", åsidosätter den nya "MoveTo" den; ingen rest av den tidigare "MoveTo"-operationen finns kvar i sökvägen. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext/)() | Återställer hela grafikkontexten till dess tidigare värde genom att poppa den från stacken. |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext/)() | Skickar en kopia av hela grafikkontexten till stacken. |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke/)() | Stryker en linje längs den aktuella banan. Den streckade linjen följer varje rakt eller krökt segment i banan, centrerat på segmentet med sidor parallella med det. Var och en av sökvägens undervägar behandlas separat. Den här metoden avslutar aktuell väg. |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill/)(FillMode) | Stryker och fyller strömvägen. Denna metod avslutar strömvägen. |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext/)(string, PointF) | Stryker den angivna textsträngen på den angivna platsen. |

## Andra medlemmar

| namn | Beskrivning |
| --- | --- |
| class [PdfGraphicContext](pdfdevice.pdfgraphiccontext/) | Innehåller aktuella grafikkontrollparametrar för PdfDevice. Dessa parametrar definierar det globala ramverket inom vilket grafikoperatorerna exekverar. |

### Se även

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext/)
* class [PdfRenderingOptions](../pdfrenderingoptions/)
* namnutrymme [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* hopsättning [Aspose.SVG](../../)


