---
title: Class XpsPath
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsModel.XpsPath klass. Klassinkapslande vägelementfunktioner. Detta element är det enda sättet att lägga till vektorgrafik och bilder på en fast sida. Det definierar en enda vektorgrafik som ska renderas på en sida.
type: docs
weight: 3260
url: /sv/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Klassinkapslande vägelementfunktioner. Detta element är det enda sättet att lägga till vektorgrafik och bilder på en fast sida. Det definierar en enda vektorgrafik som ska renderas på en sida.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Returnerar/ställer in sökvägsgeometriinstansen som begränsar den renderade delen av elementet. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Returnerar antalet underordnade element. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | Returnerar/ställer in geometrin för banan. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | Returnerar/ställer in penseln som används för att måla geometrin specificerad av egenskapen Data för sökvägen. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Returnerar/ställer in hyperlänkmålobjekt. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Ger tillgång till elementets underordnade genom index*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Returnerar/ställer in värdet som definierar elementets enhetliga transparens. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Returnerar/ställer in penseln som anger en mask av alfavärden som appliceras på elementet på samma sätt som Opacity-attributet, men tillåter olika alfavärden för olika delar av elementet. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Returnerar/ställer in den affina transformationsmatrisen som upprättar en ny koordinatram för alla attribut för elementet och för alla underordnade element (om några). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | Returnerar/ställer in penseln som användes för att rita linjen. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | Returnerar/ställer in arrayen som anger längden på streck och mellanrum i konturlinjen. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | Returnerar/ställer in värdet som anger hur ändarna på varje bindestreck ritas. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | Returnerar/ställer in startpunkten för upprepning av streckmatrismönstret. Om detta värde utelämnas, justeras streckmatrisen med streckets ursprung. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | Returnerar/ställer in värdet som definierar formen på slutet av det sista bindestrecket i ett streck. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | Returnerar/ställer in värdet som definierar formen på början av det första bindestrecket i ett streck. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | Returnerar/ställer in förhållandet mellan den maximala geringslängden och halva slagtjockleken. Detta värde är endast signifikant om`StrokeLineJoin` attribut anger`Mitra` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | Returnerar/ställer in värdet som definierar formen på början av det första bindestrecket i ett streck. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | Returnerar/ställer in tjockleken på ett streck, i enheter av det effektiva koordinatutrymmet (inkluderar banans renderingstransform). Sträcket ritas ovanpå gränsen för geometrin specificerad av Path-elementets Data-egenskap. Hälften av StrokeThickness sträcker sig utanför geometrin som specificeras av dataegenskapen och den andra halvan sträcker sig inuti geometrin. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | Klonar den här sökvägen. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementering avIEnumerable gränssnitt. |

### Se även

* class [XpsContentElement](../xpscontentelement/)
* namnutrymme [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* hopsättning [Aspose.Page](../../)


