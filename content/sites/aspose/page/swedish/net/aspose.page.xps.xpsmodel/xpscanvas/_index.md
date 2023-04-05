---
title: Class XpsCanvas
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsModel.XpsCanvas klass. Klassinkapslande Canvas elementfunktioner. Detta element grupperar element tillsammans. Till exempel kan Glyphs and Path elements grupperas i en arbetsyta för att identifieras som en enhet som en hyperlänkdestination eller för att tillämpa ett sammansatt egenskapsvärde på varje underordnat och förfaderelement.
type: docs
weight: 2970
url: /sv/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Klassinkapslande Canvas elementfunktioner. Detta element grupperar element tillsammans. Till exempel kan Glyphs and Path elements grupperas i en arbetsyta för att identifieras som en enhet (som en hyperlänkdestination) eller för att tillämpa ett sammansatt egenskapsvärde på varje underordnat och förfaderelement.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Returnerar/ställer in sökvägsgeometriinstansen som begränsar den renderade delen av elementet. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Returnerar antalet underordnade element. |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | Returnerar/ställer in värdet som styr hur kanter på banor inom arbetsytan renderas. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Returnerar/ställer in hyperlänkmålobjekt. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Ger tillgång till elementets underordnade genom index*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Returnerar/ställer in värdet som definierar elementets enhetliga transparens. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Returnerar/ställer in penseln som anger en mask av alfavärden som appliceras på elementet på samma sätt som Opacity-attributet, men tillåter olika alfavärden för olika delar av elementet. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Returnerar/ställer in den affina transformationsmatrisen som upprättar en ny koordinatram för alla attribut för elementet och för alla underordnade element (om några). |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | Lägger till ett element till den här dukens underordnade lista. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | Lägger till en ny duk till den här dukens underordnade lista. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | Lägger till nya glyfer till den här dukens underordnade lista. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | Lägger till en ny sökväg till den här dukens underordnade lista. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | Klonar den här duken. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementering avIEnumerable gränssnitt. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | Infogar ett element i den här arbetsytans underordnade lista på*index* position. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | Infogar en ny arbetsyta till den här arbetsytans underordnade lista på*index* position. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | Infogar nya glyfer i den här dukens underordnade lista på*index* position. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | Infogar en ny sökväg till den här arbetsytans underordnade lista på*index* position. |

### Se även

* class [XpsContentElement](../xpscontentelement/)
* namnutrymme [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* hopsättning [Aspose.Page](../../)


