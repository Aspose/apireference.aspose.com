---
title: DeviceTGraphicContextTRenderingOptions
second_title: Aspose.SVG för .NET API Referens
description: Representerar basklass för implementering av särskilda renderingsenheter.
type: docs
weight: 2700
url: /sv/net/aspose.svg.rendering/device-2/
---
## Device&lt;TGraphicContext,TRenderingOptions&gt; class

Representerar basklass för implementering av särskilda renderingsenheter.

```csharp
public abstract class Device<TGraphicContext, TRenderingOptions> : IDevice
    where TGraphicContext : GraphicContext, new()
    where TRenderingOptions : RenderingOptions
```

| Parameter | Beskrivning |
| --- | --- |
| TGraphicContext | Grafisk kontext som innehåller aktuella grafikkontrollparametrar |
| TRenderingOptions | Återgivningsalternativ |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } | Hämtar det grafiska sammanhanget |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } | Får renderingsalternativ. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| abstract [AddRect](../../aspose.svg.rendering/device`2/addrect)(RectangleF) | Lägger till en rektangel till den aktuella sökvägen som en komplett undersökväg. |
| virtual [BeginDocument](../../aspose.svg.rendering/device`2/begindocument)(Document) | Börjar renderingen av dokumentet. |
| abstract [BeginElement](../../aspose.svg.rendering/device`2/beginelement)(Element, RectangleF) | Börjar rendering av noden. |
| virtual [BeginPage](../../aspose.svg.rendering/device`2/beginpage)(SizeF) | Börjar renderingen av den nya sidan. |
| abstract [Clip](../../aspose.svg.rendering/device`2/clip)(FillMode) | Modifierar den aktuella urklippsbanan genom att skära den med den aktuella sökvägen, med hjälp av FillMode-regeln för att bestämma regionen som ska fyllas. Den här metoden avslutar aktuell väg. |
| abstract [ClosePath](../../aspose.svg.rendering/device`2/closepath)() | Stänger den aktuella delvägen genom att lägga till ett rakt linjesegment från den aktuella punkten till startpunkten för delvägen. Om den aktuella undersökvägen redan är stängd, gör "ClosePath" ingenting. Denna operatör avslutar den aktuella undersökvägen. Genom att lägga till ett annat segment till den aktuella sökvägen börjar en ny undersökväg, även om det nya segmentet börjar vid den slutpunkt som nås med "ClosePath"-metoden. |
| abstract [CubicBezierTo](../../aspose.svg.rendering/device`2/cubicbezierto)(PointF, PointF, PointF) | Lägger till en kubisk Bézier-kurva till den aktuella sökvägen. Kurvan sträcker sig från den aktuella punkten till punkten pt2, med pt1 och pt2 som Bézier-kontrollpunkter. Den nya aktuella punkten är pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() | Utför programdefinierade uppgifter associerade med att frigöra, frigöra eller återställa ohanterade resurser. |
| abstract [DrawImage](../../aspose.svg.rendering/device`2/drawimage)(byte[], ImageType, RectangleF) | Ritar den angivna bilden. |
| virtual [EndDocument](../../aspose.svg.rendering/device`2/enddocument)() | Avslutar renderingen av dokumentet. |
| abstract [EndElement](../../aspose.svg.rendering/device`2/endelement)(Element) | Avslutar renderingen av noden. |
| virtual [EndPage](../../aspose.svg.rendering/device`2/endpage)() | Avslutar renderingen av den aktuella sidan. |
| abstract [Fill](../../aspose.svg.rendering/device`2/fill)(FillMode) | Fyller hela området som omges av den aktuella sökvägen. Om sökvägen består av flera frånkopplade undersökvägar, fyller den insidan av alla undersökvägar, betraktat tillsammans. Den här metoden avslutar aktuell väg. |
| abstract [FillText](../../aspose.svg.rendering/device`2/filltext)(string, PointF) | Fyller den angivna textsträngen på den angivna platsen. |
| virtual [Flush](../../aspose.svg.rendering/device`2/flush)() | Rensar all data till utdataström. |
| abstract [LineTo](../../aspose.svg.rendering/device`2/lineto)(PointF) | Lägger till ett rakt linjesegment från den aktuella punkten till punkten (pt). Den nya nuvarande punkten är pt. |
| abstract [MoveTo](../../aspose.svg.rendering/device`2/moveto)(PointF) | Börjar en ny undersökväg genom att flytta den aktuella punkten till koordinaterna för parametern pt, och utelämnar alla anslutande linjesegment. Om den tidigare vägkonstruktionsmetoden i den aktuella sökvägen också var "MoveTo", åsidosätter den nya "MoveTo" den; ingen rest av den tidigare "MoveTo"-operationen finns kvar i sökvägen. |
| virtual [RestoreGraphicContext](../../aspose.svg.rendering/device`2/restoregraphiccontext)() | Återställer hela grafikkontexten till dess tidigare värde genom att poppa den från stacken. |
| virtual [SaveGraphicContext](../../aspose.svg.rendering/device`2/savegraphiccontext)() | Skickar en kopia av hela grafikkontexten till stacken. |
| abstract [Stroke](../../aspose.svg.rendering/device`2/stroke)() | Stryker en linje längs den aktuella banan. Den streckade linjen följer varje rakt eller krökt segment i banan, centrerat på segmentet med sidor parallella med det. Var och en av sökvägens undervägar behandlas separat. Den här metoden avslutar aktuell väg. |
| abstract [StrokeAndFill](../../aspose.svg.rendering/device`2/strokeandfill)(FillMode) | Stryker och fyller strömvägen. Denna metod avslutar strömvägen. |
| abstract [StrokeText](../../aspose.svg.rendering/device`2/stroketext)(string, PointF) | Stryker den angivna textsträngen på den angivna platsen. |

## Andra medlemmar

| namn | Beskrivning |
| --- | --- |
| class [DeviceConfiguration&lt;TGraphicContext,TRenderingOptions&gt;](device-2.deviceconfiguration-2) | Representerar konfigurationsobjekt för enheter. |
| enum [PageWritingStrategy&lt;TGraphicContext,TRenderingOptions&gt;](device-2.pagewritingstrategy-2) | Anger typer av strategier för att skriva sidor i utdataström\strömmar. |

### Se även

* interface [IDevice](../idevice)
* class [GraphicContext](../graphiccontext)
* class [RenderingOptions](../renderingoptions)
* namnutrymme [Aspose.Svg.Rendering](../../aspose.svg.rendering)
* hopsättning [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
