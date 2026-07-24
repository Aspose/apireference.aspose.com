---
title: "Aspose::Page::EPS::Device::PdfDevice klasse"
linktitle: "PdfDevice"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::Device::PdfDevice klasse. Deze klasse omvat het renderen van een document naar PDF in C++."
type: docs
weight: 300
url: /nl/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Deze klasse omvat het renderen van een document naar PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" eigenschapwaarde. |
| static [BACKGROUND](./background/)() | "Background" eigenschapssleutel. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" eigenschapssleutel. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Knipt met de gegeven vorm. Verzendt naar writeClip(Rectangle), writeClip(RectangleF) of writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Knipt rechthoek. Roept clip(Rectangle2D) aan. |
| [ClosePage](./closepage/)() override | Voert de noodzakelijke voorbereiding van het apparaat uit nadat de pagina is gerenderd. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" eigenschapssleutel. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Maakt een kopie van dit apparaat. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Beëindigt de grafische context. Als bij creatie restoreOnDispose waar was, wordt writeGraphicsRestore() aangeroepen. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Tekent een pad. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Tekent een afbeelding met toegewezen transformatie en achtergrond. |
| [DrawString](./drawstring/)(System::String, double, double) override | Tekent een tekenreeks op een gegeven punt. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" eigenschapssleutel. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" eigenschapssleutel. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" eigenschapwaarde. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" eigenschapwaarde. |
| [EndDocument](./enddocument/)() override | Voert de noodzakelijke voorbereiding van het apparaat uit nadat het document is gerenderd. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Vult een pad. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" eigenschapssleutel. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Huidig paginanummer. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Tekent een kader en banner rond een tekenreeks. De methode berekent en retourneert het punt waarop de tekstcursor moet worden geplaatst vóór het tekenen van de tekenreeks. |
| [get_OutputStream](./get_outputstream/)() override | Specificeert of retourneert een outputstream. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Haalt de huidige transformatie op. |
| [InitClip](./initclip/)() override | Initialiseert de clip van het apparaat. |
| [InitPageNumbers](./initpagenumbers/)() override | Initialiseert het aantal pagina's voor uitvoer. |
| static [KEYWORDS](./keywords/)() | "Keywords" eigenschapwaarde. |
| [OpenPage](./openpage/)(System::String) override | Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van een pagina. |
| [OpenPage](./openpage/)(float, float) override | Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van elke pagina. |
| static [ORIENTATION](./orientation/)() | "Orientation" eigenschapsleutel. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" eigenschapsleutel. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" eigenschapsleutel. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Initialiseert een nieuwe instantie van [PdfDevice](./) met een outputstream. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Initialiseert een nieuwe instantie van [PdfDevice](./) met een outputstream en een gespecificeerde paginagrootte. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Kloonconstructor. Initialiseert een nieuwe instantie van [PdfDevice](./) met een bestaand apparaat. |
| [ReNew](./renew/)() override | Reset het apparaat naar de initiële staat voor het volledige document. Wordt gebruikt om de outputstream te resetten. |
| [ReNewForMerge](./renewformerge/)(bool) override | Reset het apparaat naar de initiële staat voor het volledige document tijdens het samenvoegen van meerdere documenten. Wordt gebruikt om de outputstream te resetten. |
| [Reset](./reset/)() override | Als paginaparameters van het apparaat worden ingesteld, stelt deze methode je in staat om de schrijfstream terug te brengen naar het begin van de pagina. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Roteer de huidige transformatie over de Z-as. Roept writeTransform(Transform) aan. Roteren met een positieve hoek theta roteert punten op de positieve x-as naar de positieve y-as. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Schaalt de huidige transformatie-matrix. Roept writeTransform(Transform) aan. |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Specificeert het huidige lettertype. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Specificeert of retourneert een outputstream. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Retourneert of specificeert de huidige verf. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Retourneert of specificeert de huidige lijn. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Specificeert de clip van het apparaat. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Specificeert de huidige transformatie. Aangezien de meeste outputformaten deze functionaliteit niet implementeren, wordt de inverse transformatie van currentTransform berekend en vermenigvuldigd met de in te stellen transformatie. Het resultaat wordt vervolgens doorgestuurd via een aanroep van writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Schuift de huidige transformatie-matrix. Roept writeTransform(Transform) aan. |
| [StartDocument](./startdocument/)() override | Voert de noodzakelijke voorbereiding van het apparaat uit vóór het starten van het renderen van het document. |
| static [SUBJECT](./subject/)() | "Subject" eigenschapwaarde. |
| static [TITLE](./title/)() | "Title" eigenschapwaarde. |
| [ToString](./tostring/)() const override | Retourneert de naam van het apparaattype. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Transformeert de huidige transformatie-matrix. Roept writeTransform(Transform) aan. |
| [Translate](./translate/)(double, double) override | Verschuift de huidige transformatie-matrix. Roept writeTransform(Transform) aan. |
| static [TRANSPARENT](./transparent/)() | "Transparent" eigenschapssleutel. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Werk de pagina-parameters bij van een ander meer-pagina-apparaat. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" eigenschapssleutel. |
| [WriteBackground](./writebackground/)() override | Schrijft de huidige achtergrond weg. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Schrijft de cap van de streep weg. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Schrijft een opmerking. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Schrijft de dash van de streep weg. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Schrijft de catalogus, docinfo, voorkeuren, en (aangezien we alleen enkel-pagina-uitvoer gebruiken) de paginaboom. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Schrijft de join van de streep weg. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Schrijft de laatst geschreven verf weg. Het is nuttig in gevallen waarin na het schrijven van verf een grafische herstel ("Q") werd uitgevoerd. |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Schrijft de miter-limiet van de streep weg. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Schrijft verf weg als de opgegeven kleur. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Schrijft verf weg als de opgegeven gradiënt. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Schrijft verf weg als de opgegeven textuur. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Schrijft verf weg. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Schrijft een string weg met het opgegeven lettertype. |
| [WriteTrailer](./writetrailer/)() | Schrijft de trailer van het PDF-document weg. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Schrijf de gegeven transformatie-matrix naar het bestand. |
| [WriteWarning](./writewarning/)(System::String) override | Schrijft een waarschuwing weg, standaard naar System.err. |
| [WriteWidth](./writewidth/)(float) override | Schrijft de breedte van de streep weg. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [VERSION](./version/) | "Version" eigenschapssleutel. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" eigenschapswaarde. |

## Deprecated
PdfDevice class is verouderd vanaf versie 24.3. Gebruik in plaats daarvan de SaveAsPdf-methode in de PsDocument class. In 24.6 zal deze class volledig verborgen zijn.

## Zie ook

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
