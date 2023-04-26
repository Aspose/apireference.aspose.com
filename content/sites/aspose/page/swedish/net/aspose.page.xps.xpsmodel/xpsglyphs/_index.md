---
title: Class XpsGlyphs
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsModel.XpsGlyphs klass. Klassinkapslande Glyphs elementfunktioner. Detta element representerar en serie enhetligt formaterad text från ett enda teckensnitt. Det ger information som är nödvändig för korrekt rendering och stöder search och urvalsfunktioner för att titta på konsumenter.
type: docs
weight: 3100
url: /sv/net/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class

Klassinkapslande Glyphs elementfunktioner. Detta element representerar en serie enhetligt formaterad text från ett enda teckensnitt. Det ger information som är nödvändig för korrekt rendering och stöder search och urvalsfunktioner för att titta på konsumenter.

```csharp
public sealed class XpsGlyphs : XpsContentElement
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [BidiLevel](../../aspose.page.xps.xpsmodel/xpsglyphs/bidilevel/) { get; set; } | Returnerar/ställer in värdet som anger Unicode-algoritmens dubbelriktade kapslingsnivå. Jämna värden innebär en layout från vänster till höger, udda värden innebär en layout från höger till vänster. Layouten från höger till vänster placerar körstarten på höger sida av den första glyfen, med positiva framstegsbredder (representerar framsteg till vänster) och placerar efterföljande tecken till vänster om föregående glyf. |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Returnerar/ställer in sökvägsgeometriinstansen som begränsar den renderade delen av elementet. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Returnerar antalet underordnade element. |
| [Fill](../../aspose.page.xps.xpsmodel/xpsglyphs/fill/) { get; set; } | Returnerar/ställer in penseln som används för att fylla formen på de renderade glyferna. |
| [Font](../../aspose.page.xps.xpsmodel/xpsglyphs/font/) { get; } | Returnerar teckensnittsresurs för TrueType-teckensnittet som används för att sätta element i text. |
| [FontRenderingEmSize](../../aspose.page.xps.xpsmodel/xpsglyphs/fontrenderingemsize/) { get; set; } | Returnerar/ställer in teckenstorleken i ritningsytaenheter, uttryckt som en float i enheter av det effektiva koordinatutrymmet. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Returnerar/ställer in hyperlänkmålobjekt. |
| [IsSideways](../../aspose.page.xps.xpsmodel/xpsglyphs/issideways/) { get; set; } | Returnerar/ställer in värdet som indikerar att en glyf är vänd på sidan, med ursprunget definierat som den övre mitten av den ovända glyfen. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Ger tillgång till elementets underordnade genom index*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Returnerar/ställer in värdet som definierar elementets enhetliga transparens. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Returnerar/ställer in penseln som anger en mask av alfavärden som appliceras på elementet på samma sätt som Opacity-attributet, men tillåter olika alfavärden för olika delar av elementet. |
| [OriginX](../../aspose.page.xps.xpsmodel/xpsglyphs/originx/) { get; set; } | Returnerar/ställer in x-koordinaten för den första glyfen i körningen, i enheter av det effektiva koordinatutrymmet. |
| [OriginY](../../aspose.page.xps.xpsmodel/xpsglyphs/originy/) { get; set; } | Returnerar/ställer in y-koordinaten för den första glyfen i körningen, i enheter av det effektiva koordinatutrymmet. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Returnerar/ställer in den affina transformationsmatrisen som upprättar en ny koordinatram för alla attribut för elementet och för alla underordnade element (om några). |
| [StyleSimulations](../../aspose.page.xps.xpsmodel/xpsglyphs/stylesimulations/) { get; set; } | Returnerar/ställer in värdet som anger en stilsimulering. |
| [UnicodeString](../../aspose.page.xps.xpsmodel/xpsglyphs/unicodestring/) { get; set; } | Returnerar/ställer in textsträngen som återges av Glyphs-elementet. Texten anges som Unicode-kodpunkter. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsglyphs/clone/)() | Klona denna glyfer. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementering avIEnumerable gränssnitt. |

### Se även

* class [XpsContentElement](../xpscontentelement/)
* namnutrymme [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* hopsättning [Aspose.Page](../../)


