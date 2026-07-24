---
title: "Aspose::Page::XPS::XpsDocument klass"
linktitle: "XpsDocument"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsDocument-klass. Klass som kapslar in huvudobjektet för ett XPS-dokument och som tillhandahåller manipuleringsmetoder för alla XPS-element i C++."
type: docs
weight: 400
url: /sv/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Klass som kapslar in huvudobjektet för ett [XPS](../) dokument och som tillhandahåller manipuleringsmetoder för alla [XPS](../) element.

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(T) | Lägger till ett innehållselement (Canvas, Path eller Glyphs). |
| [AddCanvas](./addcanvas/)() | Lägger till en ny duk på den aktiva sidan. |
| [AddDocument](./adddocument/)(bool) | Lägger till ett tomt dokument med standard sidstorlek. |
| [AddDocument](./adddocument/)(float, float, bool) | Lägger till ett tomt dokument med den första sidans dimensioner *width* och *height*. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Lägger till nya glyfer på den aktiva sidan. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Lägger till nya glyfer på den aktiva sidan. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Lägger till ett konturpost i dokumentet. |
| [AddPage](./addpage/)(bool) | Lägger till en tom sida i dokumentet med standard sidstorlek. |
| [AddPage](./addpage/)(float, float, bool) | Lägger till en tom sida i dokumentet med angivna *width* och *height*. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Lägger till en sida i dokumentet. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Lägger till en ny bana på den aktiva sidan. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Skapar ett nytt elliptiskt bågsegment. |
| [CreateCanvas](./createcanvas/)() | Skapar en ny canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Skapar en ny färg. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Skapar en ny färg i sRGB-färgrymden. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Skapar en ny färg i sRGB-färgrymden. |
| [CreateColor](./createcolor/)(float, float, float, float) | Skapar en ny färg i scRGB-färgrymden. |
| [CreateColor](./createcolor/)(float, float, float) | Skapar en ny färg i scRGB-färgrymden. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Skapar en ny färg i ICC-baserad färgrymd. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Skapar en ny färg i ICC-baserad färgrymd. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Skapar en ny **TrueType**-teckensnittresurs. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Skapar en ny **TrueType**-teckensnittresurs från stream. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Skapar nya glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Skapar nya glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Skapar ett nytt gradientstopp. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Skapar ett nytt gradientstopp. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Skapar en ny ICC-profilresurs från ICC-profilfilen som finns på *iccProfilePath*. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Skapar en ny ICC-profilresurs från *stream*. |
| [CreateImage](./createimage/)(System::String) | Skapar en ny bildresurs från bildfilen som finns på *imagePath*. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Skapar en ny bildresurs från *stream*. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Skapar en ny bildpensel. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Skapar en ny bildpensel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Skapar en ny linjär gradientpensel. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Skapar en ny linjär gradientpensel. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Skapar en ny affin transformationsmatris. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Skapar en ny sökväg. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Skapar en ny sökvägsfigur. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Skapar en ny sökvägsfigur. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Skapar en ny sökvägsgeometri specificerad med förkortad form. |
| [CreatePathGeometry](./createpathgeometry/)() | Skapar en ny sökvägsgeometri. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Skapar en ny sökvägsgeometri med specificerad lista av sökvägsfigurer. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Skapar en ny uppsättning av kubiska Bézier-kurvor. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Skapar en ny polygonritning som innehåller ett godtyckligt antal enskilda hörn. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Skapar en ny uppsättning av kvadratiska Bézier-kurvor från föregående punkt i sökvägsfiguren genom en mängd hörn, med användning av specificerade kontrollpunkter. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Skapar en ny radiell gradientpensel. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Skapar en ny radiell gradientpensel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Skapar en ny solid färgpensel. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Skapar en ny solid färgpensel. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Skapar en ny visuell pensel. |
| [Dispose](./dispose/)() override | Avslutar instansen. |
| [get_ActiveDocument](./get_activedocument/)() | Hämtar det aktiva dokumentets nummer. |
| [get_ActivePage](./get_activepage/)() | Hämtar det aktiva sidnumret i det aktiva dokumentet. |
| [get_DocumentCount](./get_documentcount/)() | Returnerar antalet dokument i [XPS](../)-paketet. |
| [get_JobPrintTicket](./get_jobprintticket/)() | Returnerar/ställer in dokumentets utskriftsjobb‑ticket. |
| [get_Page](./get_page/)() | Returnerar en [XpsPage](../)-instans för den aktiva sidan. |
| [get_PageCount](./get_pagecount/)() | Returnerar antalet sidor i det aktiva dokumentet. |
| [get_TotalPageCount](./get_totalpagecount/)() | Returnerar det totala antalet sidor i alla dokument i [XPS](../)-dokumentet. |
| [get_Utils](./get_utils/)() const | Hämtar objektet som tillhandahåller verktyg utöver det formella [XPS](../)-manipulerings‑API:t. |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Returnerar utskriftbiljetten för dokumentet indexerat med *documentIndex* . |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Returnerar utskriftbiljetten för sidan som indexeras med *pageIndex* i dokumentet som indexeras med *documentIndex* . |
| [Insert](./insert/)(int32_t, T) | Infogar ett element (Canvas, Path eller Glyphs) på den aktiva sidan på *index*  position. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Infogar en ny canvas på den aktiva sidan på *index*  position. |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Infogar ett tomt dokument med standard sidstorlek på *index*  position. |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Infogar ett tomt dokument med den första sidans dimensioner *width*  och *height*  på *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Infogar nya glyphs på den aktiva sidan på *index*  position. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Infogar nya glyphs på den aktiva sidan på *index*  position. |
| [InsertPage](./insertpage/)(int32_t, bool) | Infogar en tom sida till dokumentet med standard sidstorlek på *index*  position. |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Infogar en tom sida till dokumentet med angivna *width*  och *height*  på *index*  position. |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Infogar en sida till dokumentet på *index*  position. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Infogar en ny path till den aktiva sidan på *index*  position. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Sammanfogar flera [XPS](../)-filer till ett [XPS](../)-dokument. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Sammanfogar flera [XPS](../)-filer till ett [XPS](../)-dokument. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Sammanfogar [XPS](../)-dokument till PDF med hjälp av [Device](../)-instansen. |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Sammanfogar [XPS](../)-dokument till PDF med hjälp av [Device](../)-instansen. |
| [Remove](./remove/)(T) | Tar bort ett element från den aktiva sidan. |
| [RemoveAt](./removeat/)(int32_t) | Tar bort ett element på *index*  position från den aktiva sidan. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Tar bort ett dokument på *index*  position. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Tar bort en sida från dokumentet. |
| [RemovePageAt](./removepageat/)(int32_t) | Tar bort en sida från dokumentet på *index*  position. |
| [Save](./save/)(System::String) | Sparar [XPS](../)-dokument till [XPS](../)-filen som ligger på *path* . |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Sparar [XPS](../)-dokument till en ström. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Sparar dokumentet till en bildfil. Utdata‑katalogen och filnamnet kommer att vara samma som från inmatnings‑[XPS](../)-filen. Filändelsen kommer att motsvara bildformatet i parametern \"options\". Om dokumentet initierades med en ström som inte är FileStream, sparas bildfilen i den aktuella mappen med standardfilnamnsmall. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Sparar dokumentet till en bildfil i den angivna katalogen med det angivna filnamnet. Filändelsen kommer att motsvara bildformatet i parametern \"options\". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Sparar dokumentet i bitmap‑bildformat som byte‑arrayer. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Sparar dokumentet i PDF-format. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Sparar dokumentet i PDF-format. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Sparar dokumentet i PS-format. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Sparar dokumentet i PS-format. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Väljer ett aktivt dokument för redigering. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Väljer en aktiv dokumentsida för redigering. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Returnerar/ställer in dokumentets utskriftsjobb‑ticket. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Länkar *printTicket* till dokumentet indexerat med *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Länkar *printTicket* till sidan indexerad med *pageIndex* i dokumentet indexerat med *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | Skapar ett tomt [XPS](../) dokument med standard sidstorlek. |
| [XpsDocument](./xpsdocument/)(System::String) | Öppnar ett befintligt [XPS](../) dokument som finns på *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Öppnar ett befintligt dokument som finns på *path* som [XPS](../) dokument. |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Laddar ett befintligt dokument lagrat i *stream* som [XPS](../) dokument. |
## Se även

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
