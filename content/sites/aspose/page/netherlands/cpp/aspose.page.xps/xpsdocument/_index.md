---
title: "Aspose::Page::XPS::XpsDocument klasse"
linktitle: "XpsDocument"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsDocument klasse. Klasse die de hoofd‑entiteit van een XPS‑document omvat en manipulatiemethoden biedt voor elk XPS‑element in C++."
type: docs
weight: 400
url: /nl/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Klasse die de hoofd‑entiteit van een [XPS](../) document omvat en manipulatiemethoden biedt voor elk [XPS](../) element.

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(T) | Voegt een inhoudselement toe (Canvas, Path of Glyphs). |
| [AddCanvas](./addcanvas/)() | Voegt een nieuw canvas toe aan de actieve pagina. |
| [AddDocument](./adddocument/)(bool) | Voegt een leeg document toe met de standaard paginagrootte. |
| [AddDocument](./adddocument/)(float, float, bool) | Voegt een leeg document toe met de afmetingen van de eerste pagina *width* en *height*. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Voegt nieuwe glyphs toe aan de actieve pagina. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Voegt nieuwe glyphs toe aan de actieve pagina. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Voegt een outline-item toe aan het document. |
| [AddPage](./addpage/)(bool) | Voegt een lege pagina toe aan het document met de standaard paginagrootte. |
| [AddPage](./addpage/)(float, float, bool) | Voegt een lege pagina toe aan het document met de opgegeven *width* en *height*. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Voegt een pagina toe aan het document. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Voegt een nieuw pad toe aan de actieve pagina. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Maakt een nieuw elliptisch boogsegment. |
| [CreateCanvas](./createcanvas/)() | Maakt een nieuw canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Maakt een nieuwe kleur. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Maakt een nieuwe kleur in de sRGB-kleurruimte. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Maakt een nieuwe kleur in de sRGB-kleurruimte. |
| [CreateColor](./createcolor/)(float, float, float, float) | Maakt een nieuwe kleur in de scRGB-kleurruimte. |
| [CreateColor](./createcolor/)(float, float, float) | Maakt een nieuwe kleur in de scRGB-kleurruimte. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Maakt een nieuwe kleur in een ICC-gebaseerde kleurruimte. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Maakt een nieuwe kleur in een ICC-gebaseerde kleurruimte. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Maakt een nieuw **TrueType** lettertype-resource aan. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Maakt een nieuw **TrueType** lettertype-resource aan vanuit een stream. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Maakt nieuwe glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Maakt nieuwe glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Maakt een nieuwe gradientstop. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Maakt een nieuwe gradientstop. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Maakt een nieuw ICC-profielresource aan vanuit een ICC-profielbestand op *iccProfilePath*. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Maakt een nieuw ICC-profielresource aan vanuit *stream*. |
| [CreateImage](./createimage/)(System::String) | Maakt een nieuw afbeeldingsresource aan vanuit een afbeeldingsbestand op *imagePath*. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Maakt een nieuw afbeeldingsresource aan vanuit *stream*. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Maakt een nieuwe afbeeldingspenseel. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Maakt een nieuwe afbeeldingspenseel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Maakt een nieuwe lineaire gradientpenseel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Maakt een nieuwe lineaire gradientpenseel. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Maakt een nieuwe affine transformatie-matrix. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Maakt een nieuw pad. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Maakt een nieuwe padfiguur. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Maakt een nieuwe padfiguur. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Maakt een nieuwe padgeometrie gespecificeerd met verkorte vorm. |
| [CreatePathGeometry](./createpathgeometry/)() | Maakt een nieuwe padgeometrie. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Maakt een nieuwe padgeometrie met een gespecificeerde lijst van padfiguren. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Maakt een nieuwe set kubieke Bézier-curves. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Maakt een nieuwe polygonale tekening die een willekeurig aantal individuele hoekpunten bevat. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Maakt een nieuwe set kwadratische Bézier-curves van het vorige punt in de padfiguur via een reeks hoekpunten, met gebruik van gespecificeerde controlepunten. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Maakt een nieuwe radiale gradientpenseel. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Maakt een nieuwe radiale gradientpenseel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Maakt een nieuwe effen kleurpenseel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Maakt een nieuwe effen kleurpenseel. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Maakt een nieuwe visuele penseel. |
| [Dispose](./dispose/)() override | Disposeert de instantie. |
| [get_ActiveDocument](./get_activedocument/)() | Haalt het nummer van het actieve document op. |
| [get_ActivePage](./get_activepage/)() | Haalt het paginanummer op binnen het actieve document. |
| [get_DocumentCount](./get_documentcount/)() | Retourneert het aantal documenten binnen het [XPS](../) pakket. |
| [get_JobPrintTicket](./get_jobprintticket/)() | Retourneert/zet het afdrukticket van de taak van het document. |
| [get_Page](./get_page/)() | Retourneert een [XpsPage](../) instantie voor de actieve pagina. |
| [get_PageCount](./get_pagecount/)() | Geeft het aantal pagina's in het actieve document terug. |
| [get_TotalPageCount](./get_totalpagecount/)() | Retourneert het totale aantal pagina's in alle documenten binnen het [XPS](../) document. |
| [get_Utils](./get_utils/)() const | Haalt het object op dat hulpmiddelen biedt buiten de formele [XPS](../) manipulatie-API. |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Retourneert het afdrukticket van het document geïndexeerd door *documentIndex*. |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Retourneert het afdrukticket van de pagina geïndexeerd door *pageIndex* in het document geïndexeerd door *documentIndex*. |
| [Insert](./insert/)(int32_t, T) | Voegt een element (Canvas, Path of Glyphs) toe aan de actieve pagina op positie *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Voegt een nieuw canvas toe aan de actieve pagina op positie *index*. |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Voegt een leeg document met standaard paginagrootte toe op positie *index*. |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Voegt een leeg document toe met de afmetingen van de eerste pagina *width* en *height* op positie *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Voegt nieuwe glyphs toe aan de actieve pagina op positie *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Voegt nieuwe glyphs toe aan de actieve pagina op positie *index*. |
| [InsertPage](./insertpage/)(int32_t, bool) | Voegt een lege pagina toe aan het document met standaard paginagrootte op positie *index*. |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Voegt een lege pagina toe aan het document met opgegeven *width* en *height* op positie *index*. |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Voegt een pagina toe aan het document op positie *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Voegt een nieuw pad toe aan de actieve pagina op positie *index*. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Meerdere [XPS](../) bestanden samenvoegen tot één [XPS](../) document. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Meerdere [XPS](../) bestanden samenvoegen tot één [XPS](../) document. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Samenvoegen van [XPS](../) documenten naar PDF met behulp van de [Device](../) instantie. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Samenvoegen van [XPS](../) documenten naar PDF met behulp van de [Device](../) instantie. |
| [Remove](./remove/)(T) | Verwijdert een element van de actieve pagina. |
| [RemoveAt](./removeat/)(int32_t) | Verwijdert een element op positie *index* van de actieve pagina. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Verwijdert een document op positie *index*. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Verwijdert een pagina uit het document. |
| [RemovePageAt](./removepageat/)(int32_t) | Verwijdert een pagina uit het document op positie *index*. |
| [Save](./save/)(System::String) | Slaat het [XPS](../) document op naar een [XPS](../) bestand op de locatie *path*. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Slaat het [XPS](../) document op naar een stream. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Opslaat het document naar een afbeeldingsbestand.De uitvoermap en bestandsnaam zullen hetzelfde zijn als van het invoer [XPS](../) bestand. De bestandsextensie komt overeen met het afbeeldingsformaat in de "options" parameter. Als het document is geïnitialiseerd met een stream die geen FileStream is, wordt het afbeeldingsbestand opgeslagen in de huidige map met een standaard bestandsnaamsjabloon. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Slaat het document op als afbeeldingsbestand in de opgegeven map met de opgegeven bestandsnaam. De bestandsextensie komt overeen met het afbeeldingsformaat in de parameter "options". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Slaat het document op in een bitmap-afbeeldingsformaat als byte-arrays. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Slaat het document op in PDF-formaat. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Slaat het document op in PDF-formaat. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Slaat het document op in PS-formaat. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Slaat het document op in PS-formaat. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Selecteert een actief document voor bewerking. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Selecteert een actieve documentpagina voor bewerking. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Retourneert/zet het afdrukticket van de taak van het document. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Linkt de *printTicket* aan het document geïndexeerd door *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Linkt de *printTicket* aan de pagina geïndexeerd door *pageIndex* in het document geïndexeerd door *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | Maakt een leeg [XPS](../) document met standaard paginagrootte. |
| [XpsDocument](./xpsdocument/)(System::String) | Opent een bestaand [XPS](../) document op de locatie *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Opent een bestaand document op de locatie *path* als [XPS](../) document. |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Laadt een bestaand document opgeslagen in de *stream* als [XPS](../) document. |
## Zie ook

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
