---
title: Class XpsCanvas
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsModel.XpsCanvas klas. Klasse die kenmerken van Canvaselementen omvat. Dit element groepeert elementen samen. Glyphs en Pathelementen kunnen bijvoorbeeld worden gegroepeerd in een canvas om te worden geïdentificeerd als een eenheid als een hyperlinkbestemming of om een samengestelde eigenschapswaarde toe te passen op elk onderliggend en voorliggend element.
type: docs
weight: 2980
url: /nl/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Klasse die kenmerken van Canvas-elementen omvat. Dit element groepeert elementen samen. Glyphs en Path-elementen kunnen bijvoorbeeld worden gegroepeerd in een canvas om te worden geïdentificeerd als een eenheid (als een hyperlinkbestemming) of om een samengestelde eigenschapswaarde toe te passen op elk onderliggend en voorliggend element.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Retourneert/stelt de padgeometrie-instantie in die het gerenderde gebied van het element beperkt. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Retourneert het aantal onderliggende elementen. |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | Retourneert/stelt de waarde in die bepaalt hoe randen van paden binnen het canvas worden weergegeven. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Retourneert/zet hyperlinkdoelobject in. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Geeft toegang tot de kinderen van het element per index*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Retourneert/stelt de waarde in die de uniforme transparantie van het element definieert. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Retourneert/stelt het penseel in door een masker van alfawaarden op te geven dat op dezelfde manier op het element wordt toegepast als het kenmerk Dekking, maar waarbij verschillende alfawaarden voor verschillende gebieden van het element worden toegestaan. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Retourneert/stelt de affiene transformatiematrix in die een nieuw coördinatenframe vaststelt voor alle attributen van het element en voor alle onderliggende elementen (indien aanwezig). |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | Voegt een element toe aan de onderliggende lijst van dit canvas. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | Voegt een nieuw canvas toe aan de onderliggende lijst van dit canvas. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | Voegt nieuwe glyphs toe aan de onderliggende lijst van dit canvas. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | Voegt een nieuw pad toe aan de onderliggende lijst van dit canvas. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | Kloont dit canvas. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementatie vanIEnumerable interface. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | Voegt een element in de onderliggende lijst van dit canvas in op*index* positie. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | Voegt een nieuw canvas in de onderliggende lijst van dit canvas in op*index* positie. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | Voegt nieuwe glyphs toe aan de onderliggende lijst van dit canvas op*index* positie. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | Voegt een nieuw pad in naar de onderliggende lijst van dit canvas op*index* positie. |

### Zie ook

* class [XpsContentElement](../xpscontentelement/)
* naamruimte [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* montage [Aspose.Page](../../)


