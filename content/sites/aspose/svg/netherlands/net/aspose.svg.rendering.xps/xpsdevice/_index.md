---
title: Class XpsDevice
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.Rendering.Xps.XpsDevice klas. Vertegenwoordigt rendering naar een xpsdocument.
type: docs
weight: 3050
url: /nl/net/aspose.svg.rendering.xps/xpsdevice/
---
## XpsDevice class

Vertegenwoordigt rendering naar een xps-document.

```csharp
public class XpsDevice : Device<XpsGraphicContext, XpsRenderingOptions>
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [XpsDevice](xpsdevice/#constructor)(ICreateStreamProvider) | Initialiseert een nieuw exemplaar van het`XpsDevice` klasse. |
| [XpsDevice](xpsdevice/#constructor_4)(Stream) | Initialiseert een nieuw exemplaar van het`XpsDevice` klasse. |
| [XpsDevice](xpsdevice/#constructor_5)(string) | Initialiseert een nieuw exemplaar van het`XpsDevice` klasse. |
| [XpsDevice](xpsdevice/#constructor_1)(XpsRenderingOptions, ICreateStreamProvider) | Initialiseert een nieuw exemplaar van het`XpsDevice` klasse door weergaveopties en streamprovider. |
| [XpsDevice](xpsdevice/#constructor_2)(XpsRenderingOptions, Stream) | Initialiseert een nieuw exemplaar van het`XpsDevice` klasse door opties en uitvoerstroom weer te geven. |
| [XpsDevice](xpsdevice/#constructor_3)(XpsRenderingOptions, string) | Initialiseert een nieuw exemplaar van het`XpsDevice` klasse door weergaveopties en uitvoerbestandsnaam. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } |  |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } |  |

## methoden

| Naam | Beschrijving |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.xps/xpsdevice/addrect/)(RectangleF) | Voegt een rechthoek toe aan het huidige pad als een volledig subpad. |
| override [BeginDocument](../../aspose.svg.rendering.xps/xpsdevice/begindocument/)(Document) | Begint met het renderen van het document. |
| override [BeginElement](../../aspose.svg.rendering.xps/xpsdevice/beginelement/)(Element, RectangleF) | Begint met renderen van het element. |
| override [BeginPage](../../aspose.svg.rendering.xps/xpsdevice/beginpage/)(SizeF) | Begint met renderen van de nieuwe pagina. |
| override [Clip](../../aspose.svg.rendering.xps/xpsdevice/clip/)(FillMode) | Wijzigt het huidige uitknippad door het te kruisen met het huidige pad, waarbij de FillMode-regel wordt gebruikt om het te vullen gebied te bepalen. Deze methode beëindigt het huidige pad. |
| override [ClosePath](../../aspose.svg.rendering.xps/xpsdevice/closepath/)() | Sluit het huidige subpad door een recht lijnstuk toe te voegen vanaf het huidige punt naar het beginpunt van het subpad. Als het huidige subpad al gesloten is, doet "ClosePath" niets. Deze operator beëindigt het huidige subpad. Door nog een segment aan het huidige pad toe te voegen, begint een nieuw subpad, , zelfs als het nieuwe segment begint bij het eindpunt dat wordt bereikt door de "ClosePath"-methode. |
| override [CubicBezierTo](../../aspose.svg.rendering.xps/xpsdevice/cubicbezierto/)(PointF, PointF, PointF) | Voegt een kubieke Bézier-curve toe aan het huidige pad. De curve loopt van het huidige punt naar het punt pt2, met pt1 en pt2 als de Bézier-controlepunten. Het nieuwe huidige punt is pt3. |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.xps/xpsdevice/drawimage/)(byte[], ImageType, RectangleF) | Tekent de opgegeven afbeelding. |
| virtual [EndDocument](../../aspose.svg.rendering/device-2/enddocument/)() |  |
| override [EndElement](../../aspose.svg.rendering.xps/xpsdevice/endelement/)(Element) | Beëindigt het renderen van het element. |
| override [EndPage](../../aspose.svg.rendering.xps/xpsdevice/endpage/)() | Beëindigt het renderen van de huidige pagina. |
| override [Fill](../../aspose.svg.rendering.xps/xpsdevice/fill/)(FillMode) | Vult het hele gebied dat wordt ingesloten door het huidige pad. Als het pad uit meerdere niet-verbonden subpaden bestaat, vult het de binnenkant van alle subpaden, samen beschouwd. Deze methode beëindigt het huidige pad. |
| override [FillText](../../aspose.svg.rendering.xps/xpsdevice/filltext/)(string, PointF) | Vult de opgegeven tekenreeks op de opgegeven locatie. |
| override [Flush](../../aspose.svg.rendering.xps/xpsdevice/flush/)() | Spoelt alle gegevens naar uitvoerstroom. |
| override [LineTo](../../aspose.svg.rendering.xps/xpsdevice/lineto/)(PointF) | Voegt een recht lijnstuk toe vanaf het huidige punt aan het punt (pt). Het nieuwe huidige punt is pt. |
| override [MoveTo](../../aspose.svg.rendering.xps/xpsdevice/moveto/)(PointF) | Begint een nieuw subpad door het huidige punt te verplaatsen naar de coördinaten van de parameter pt, waarbij elk verbindingslijnsegment wordt weggelaten. Als de vorige padconstructiemethode in het huidige pad ook "MoveTo" was, overschrijft de nieuwe "MoveTo" deze; geen overblijfsel van de vorige "MoveTo"-bewerking blijft in het pad. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.xps/xpsdevice/restoregraphiccontext/)() | Herstelt de volledige grafische context naar de vorige waarde door deze uit de stapel te halen. |
| virtual [SaveGraphicContext](../../aspose.svg.rendering/device-2/savegraphiccontext/)() |  |
| override [Stroke](../../aspose.svg.rendering.xps/xpsdevice/stroke/)() | Trekt een lijn langs het huidige pad. De gestreepte lijn volgt elk recht of gebogen segment in het pad, gecentreerd op het segment met evenwijdige zijden. Elk van de subpaden van het pad wordt afzonderlijk behandeld. Deze methode beëindigt het huidige pad. |
| override [StrokeAndFill](../../aspose.svg.rendering.xps/xpsdevice/strokeandfill/)(FillMode) | Lijnt en vult het huidige pad. Deze methode beëindigt het huidige pad. |
| override [StrokeText](../../aspose.svg.rendering.xps/xpsdevice/stroketext/)(string, PointF) | Lijnt de gespecificeerde tekstreeks uit op de gespecificeerde locatie. |

## Andere leden

| Naam | Beschrijving |
| --- | --- |
| class [XpsGraphicContext](xpsdevice.xpsgraphiccontext/) | Bevat huidige grafische besturingsparameters voor de XpsDevice. Deze parameters bepalen het globale raamwerk waarbinnen de grafische operators uitvoeren. |

### Zie ook

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [XpsGraphicContext](../xpsdevice.xpsgraphiccontext/)
* class [XpsRenderingOptions](../xpsrenderingoptions/)
* naamruimte [Aspose.Svg.Rendering.Xps](../../aspose.svg.rendering.xps/)
* montage [Aspose.SVG](../../)


