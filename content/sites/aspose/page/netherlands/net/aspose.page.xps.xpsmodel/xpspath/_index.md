---
title: Class XpsPath
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsModel.XpsPath klas. Klasse die Pathelementfuncties inkapselt. Dit element is de enige manier om vectorafbeeldingen en afbeeldingen aan een vaste pagina toe te voegen. Het definieert een enkele vectorafbeelding die op een pagina moet worden weergegeven.
type: docs
weight: 3260
url: /nl/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Klasse die Path-elementfuncties inkapselt. Dit element is de enige manier om vectorafbeeldingen en afbeeldingen aan een vaste pagina toe te voegen. Het definieert een enkele vectorafbeelding die op een pagina moet worden weergegeven.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Retourneert/stelt de padgeometrie-instantie in die het gerenderde gebied van het element beperkt. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Retourneert het aantal onderliggende elementen. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | Retourneert/stelt de geometrie van het pad in. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | Retourneert/stelt het penseel in dat is gebruikt om de geometrie te schilderen die is opgegeven door de eigenschap Data van het pad. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Retourneert/zet hyperlinkdoelobject in. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Geeft toegang tot de kinderen van het element per index*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Retourneert/stelt de waarde in die de uniforme transparantie van het element definieert. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Retourneert/stelt het penseel in door een masker van alfawaarden op te geven dat op dezelfde manier op het element wordt toegepast als het kenmerk Dekking, maar waarbij verschillende alfawaarden voor verschillende gebieden van het element worden toegestaan. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Retourneert/stelt de affiene transformatiematrix in die een nieuw coördinatenframe vaststelt voor alle attributen van het element en voor alle onderliggende elementen (indien aanwezig). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | Retourneert/stelt het penseel in dat is gebruikt om de streek te tekenen. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | Retourneert/stelt de array in die de lengte van streepjes en openingen van de omtreklijn specificeert. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | Retourneert/stelt de waarde in die specificeert hoe de uiteinden van elk streepje worden getekend. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | Retourneert/stelt het startpunt in voor het herhalen van het streepjesreekspatroon. Als deze waarde wordt weggelaten, wordt de streepjesreeks uitgelijnd met de oorsprong van de lijn. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | Retourneert/stelt de waarde in die de vorm definieert van het einde van het laatste streepje in een streek. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | Retourneert/stelt de waarde in die de vorm definieert van het begin van het eerste streepje in een streek. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | Retourneert/stelt de verhouding in tussen de maximale versteklengte en de helft van de lijndikte. Deze waarde is alleen significant als de`StrokeLineJoin` attribuut specificeert`mijter` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | Retourneert/stelt de waarde in die de vorm definieert van het begin van het eerste streepje in een streek. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | Retourneert/stelt de dikte van een lijn in, in eenheden van de effectieve coördinatenruimte (inclusief de rendertransformatie van het pad). De lijn wordt getekend bovenop de grens van de geometrie gespecificeerd door de eigenschap Data van het Path-element. De helft van de StrokeThickness strekt zich uit buiten de geometrie gespecificeerd door de eigenschap Data en de andere helft strekt zich uit binnen de geometrie. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | Kloont dit pad. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementatie vanIEnumerable interface. |

### Zie ook

* class [XpsContentElement](../xpscontentelement/)
* naamruimte [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* montage [Aspose.Page](../../)


