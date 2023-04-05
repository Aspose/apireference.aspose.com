---
title: Class XpsDocument
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsDocument klass. Klass som inkapslar huvudenheten i XPSdokumentet som tillhandahåller manipulation metoder för alla XPSelement.
type: docs
weight: 470
url: /sv/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Klass som inkapslar huvudenheten i XPS-dokumentet som tillhandahåller manipulation metoder för alla XPS-element.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Skapar tomt XPS-dokument med standard sidstorlek. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | Öppnar ett befintligt XPS-dokument som finns på*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | Laddar ett befintligt dokument lagrat i*stream* som XPS-dokument. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | Öppnar ett befintligt dokument som finns på*path* som XPS-dokument. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Hämtar det aktiva dokumentnumret. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Hämtar det aktiva sidnumret i det aktiva dokumentet. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | Returnerar antalet dokument i XPS-paketet. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Returnerar/ställer in dokumentets utskriftsbiljett |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | Returnerar en[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) instans för aktiv sida. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Returnerar antalet sidor i det aktiva dokumentet. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | Returnerar totalt antal sidor i alla dokument i XPS-dokument. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Lägger till ett innehållselement (Canvas, Path eller Glyphs) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Lägger till en ny arbetsyta på den aktiva sidan. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Lägger till ett tomt dokument med standard sidstorlek. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | Lägger till ett tomt dokument med första sidans dimensioner *width* och*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Lägger till nya glyfer på den aktiva sidan. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Lägger till nya glyfer på den aktiva sidan. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Lägger till en konturpost i dokumentet. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Lägger till en tom sida i dokumentet med standard sidstorlek. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Lägger till en sida i dokumentet. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Lägger till en tom sida i dokumentet med specificerad *width* och*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Lägger till en ny sökväg till den aktiva sidan. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Skapar ett nytt elliptiskt bågsegment. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Skapar en ny duk. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Skapar en ny färg. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | Skapar en ny färg i ICC-baserad färgrymd. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | Skapar en ny färg i ICC-baserad färgrymd. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | Skapar en ny färg i scRGB-färgrymden. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | Skapar en ny färg i sRGB-färgrymden. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | Skapar en ny färg i scRGB-färgrymden. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | Skapar en ny färg i sRGB-färgrymden. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Skapar en ny TrueType-typsnittsresurs out of stream. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Skapar en ny TrueType-typsnittsresurs. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Skapar nya glyfer. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Skapar nya glyfer. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Skapar ett nytt gradientstopp. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Skapar ett nytt gradientstopp. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Skapar en ny ICC-profilresurs av*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | Skapar en ny ICC-profilresurs från ICC-profilfilen som finns på the *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Skapar en ny bildresurs av*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | Skapar en ny bildresurs av bildfilen som finns på*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Skapar en ny bildpensel. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Skapar en ny bildpensel. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Skapar en ny linjär övertoningspensel. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Skapar en ny linjär övertoningspensel. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Skapar en ny affin transformationsmatris. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Skapar en ny sökväg. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Skapar en ny sökvägsfigur. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Skapar en ny sökvägsfigur. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Skapar en ny bangeometri. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Skapar en ny bangeometri med en specificerad lista med sökvägsfigurer. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Skapar en ny bangeometri specificerad med förkortad form. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Skapar en ny uppsättning kubiska Bézier-kurvor. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | Skapar en ny polygonal ritning som innehåller ett godtyckligt antal individuella hörn. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Skapar en ny uppsättning kvadratiska Bézier-kurvor från föregående punkt i vägfiguren genom en uppsättning av hörn, med hjälp av specificerade kontrollpunkter. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Skapar en ny radiell gradientborste. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Skapar en ny radiell gradientborste. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Skapar en ny enfärgad pensel. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Skapar en ny enfärgad pensel. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Skapar en ny visuell pensel. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Tar bort instansen. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | Returnerar utskriftsbiljetten för dokumentet indexerat av*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | Returnerar utskriftsbiljetten för sidan indexerad av*pageIndex* i dokumentet indexerat av*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Infogar ett element (Canvas, Path eller Glyphs) på den aktiva sidan vid*index* position. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | Infogar en ny arbetsyta på den aktiva sidan på*index* position. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Infogar ett tomt dokument med standard sidstorlek vid*index* position. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | Infogar ett tomt dokument med första sidans dimensioner *width* och*height* på*index* position. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Infogar nya glyfer på den aktiva sidan på*index* position. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Infogar nya glyfer på den aktiva sidan på*index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Infogar en tom sida i dokumentet med standard sidstorlek kl.*index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | Infogar en sida i dokumentet på*index* position. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Infogar en tom sida i dokumentet med specificerad *width* och*height* på*index* position. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | Infogar en ny sökväg till den aktiva sidan på*index* position. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Sammanfoga flera XPS-filer till ett XPS-dokument. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | Sammanfoga XPS-dokument till PDF med hjälp av[`Device`](../../aspose.page/device/) instans. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Tar bort ett element från den aktiva sidan. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Tar bort ett element vid*index* position från den aktiva sidan. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Tar bort ett dokument på*index* position. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Tar bort en sida från dokumentet. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | Tar bort en sida från dokumentet på*index* position. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | Sparar XPS-dokument för att streama. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | Sparar XPS-dokument till XPS-fil som finns på*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | Sparar dokumentet med hjälp av[`Device`](../../aspose.page/device/) instans. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Väljer ett aktivt dokument för redigering. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Väljer en aktiv dokumentsida för redigering. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Länkar till*printTicket* till dokumentet indexerat av*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Länkar till*printTicket* till sidan indexerad av*pageIndex* i dokumentet indexerat av*documentIndex* . |

### Se även

* class [Document](../../aspose.page/document/)
* namnutrymme [Aspose.Page.XPS](../../aspose.page.xps/)
* hopsättning [Aspose.Page](../../)


