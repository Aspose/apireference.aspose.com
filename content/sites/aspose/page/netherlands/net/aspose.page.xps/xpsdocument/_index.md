---
title: Class XpsDocument
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsDocument klas. Klasse die de belangrijkste entiteit van het XPSdocument inkapselt die manipulatie methoden biedt voor elk XPSelement.
type: docs
weight: 480
url: /nl/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Klasse die de belangrijkste entiteit van het XPS-document inkapselt die manipulatie -methoden biedt voor elk XPS-element.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Constructeurs

| Naam | Beschrijving |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Creëert een leeg XPS-document met standaard paginaformaat. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | Opent een bestaand XPS-document in het*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | Laadt een bestaand document dat is opgeslagen in het*stream* als XPS-document. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | Opent een bestaand document in het*path* als XPS-document. |

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Haalt het actieve documentnummer op. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Krijgt het actieve paginanummer binnen het actieve document. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | Retourneert het aantal documenten in het XPS-pakket. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Retourneert/zet opdrachtafdrukticket van document |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | Retourneert een[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) instantie voor actieve pagina. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Geeft als resultaat het aantal pagina's in het actieve document. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | Retourneert het totale aantal pagina's in alle documenten in het XPS-document. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Voegt een inhoudselement toe (Canvas, Pad of Glyphs) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Voegt een nieuw canvas toe aan de actieve pagina. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Voegt een leeg document toe met standaard paginaformaat. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | Voegt een leeg document toe met de afmetingen van de eerste pagina *width* En*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Voegt nieuwe glyphs toe aan de actieve pagina. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Voegt nieuwe glyphs toe aan de actieve pagina. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Voegt een overzichtsitem toe aan het document. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Voegt een lege pagina toe aan het document met standaard paginaformaat. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Voegt een pagina toe aan het document. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Voegt een lege pagina toe aan het document met opgegeven *width* En*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Voegt een nieuw pad toe aan de actieve pagina. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Creëert een nieuw elliptisch boogsegment. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Maakt een nieuw canvas aan. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Creëert een nieuwe kleur. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | Creëert een nieuwe kleur in ICC-gebaseerde kleurruimte. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | Creëert een nieuwe kleur in ICC-gebaseerde kleurruimte. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | Creëert een nieuwe kleur in de scRGB-kleurruimte. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | Creëert een nieuwe kleur in de sRGB-kleurruimte. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | Creëert een nieuwe kleur in de scRGB-kleurruimte. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | Creëert een nieuwe kleur in de sRGB-kleurruimte. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Maakt een nieuwe TrueType-lettertyperesource uit de stroom. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Maakt een nieuwe bron voor TrueType-lettertypen. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Creëert nieuwe glyphs. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Creëert nieuwe glyphs. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Creëert een nieuwe gradiëntstop. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Creëert een nieuwe gradiëntstop. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Maakt een nieuwe ICC-profielresource van*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | Creëert een nieuwe ICC-profielresource uit het ICC-profielbestand dat zich bevindt op de *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Maakt een nieuwe afbeeldingsbron van*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | Creëert een nieuwe afbeeldingsbron uit een afbeeldingsbestand dat zich bevindt op de*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Maakt een nieuw afbeeldingspenseel aan. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Maakt een nieuw afbeeldingspenseel aan. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Maakt een nieuw lineair verlooppenseel. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Maakt een nieuw lineair verlooppenseel. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Creëert een nieuwe affiene transformatiematrix. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Creëert een nieuw pad. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Creëert een nieuwe padfiguur. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Creëert een nieuwe padfiguur. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Creëert een nieuwe padgeometrie. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Creëert een nieuwe padgeometrie met gespecificeerde lijst van padcijfers. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Creëert een nieuwe padgeometrie gespecificeerd in verkorte vorm. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Creëert een nieuwe set kubieke Bézier-curven. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | Maakt een nieuwe polygonale tekening met een willekeurig aantal individuele hoekpunten. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Creëert een nieuwe set kwadratische Bézier-curven vanaf het vorige punt in de padfiguur door een set van hoekpunten, met behulp van gespecificeerde controlepunten. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Maakt een nieuw radiaal verlooppenseel. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Maakt een nieuw radiaal verlooppenseel. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Maakt een nieuw effen kleurenpenseel. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Maakt een nieuw effen kleurenpenseel. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Maakt een nieuw visueel penseel aan. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Verwijdert de instantie. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | Retourneert de printbon van het document geïndexeerd door*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | Retourneert het printticket van de pagina geïndexeerd door*pageIndex* in het document geïndexeerd door*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Voegt een element (Canvas, Path of Glyphs) in op de actieve pagina op*index* positie. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | Voegt een nieuw canvas in op de actieve pagina op*index* positie. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Voegt een leeg document met standaard paginagrootte in*index* positie. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | Voegt een leeg document in met de afmetingen van de eerste pagina *width* En*height* bij*index* positie. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Voegt nieuwe glyphs in op de actieve pagina op*index* positie. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Voegt nieuwe glyphs in op de actieve pagina op*index* positie. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Voegt een lege pagina in het document in met standaard paginagrootte op*index* positie. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | Voegt een pagina in het document in op*index* positie. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Voegt een lege pagina in het document in met opgegeven *width* En*height* bij*index* positie. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | Voegt een nieuw pad in naar de actieve pagina op*index* positie. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Meerdere XPS-bestanden samenvoegen tot één XPS-document. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | XPS-documenten samenvoegen naar PDF met behulp van de[`Device`](../../aspose.page/device/) instantie. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Verwijdert een element van de actieve pagina. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Verwijdert een element op*index* positie vanaf de actieve pagina. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Verwijdert een document op*index* positie. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Verwijdert een pagina uit het document. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | Verwijdert een pagina uit het document op*index* positie. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | Slaat XPS-document op om te streamen. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | Slaat het XPS-document op in het XPS-bestand dat zich in het*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | Slaat het document op met behulp van de[`Device`](../../aspose.page/device/) instantie. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Selecteert een actief document om te bewerken. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Selecteert een actieve documentpagina om te bewerken. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Koppelt de*printTicket* naar het document geïndexeerd door*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Koppelt de*printTicket* naar de pagina geïndexeerd door*pageIndex* in het document geïndexeerd door*documentIndex* . |

### Zie ook

* class [Document](../../aspose.page/document/)
* naamruimte [Aspose.Page.XPS](../../aspose.page.xps/)
* montage [Aspose.Page](../../)


