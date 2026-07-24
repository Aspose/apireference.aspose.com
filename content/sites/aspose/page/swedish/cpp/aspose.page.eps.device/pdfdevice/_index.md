---
title: "Aspose::Page::EPS::Device::PdfDevice-klass"
linktitle: "PdfDevice"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::Device::PdfDevice-klass. Denna klass kapslar in rendering av dokument till PDF i C++."
type: docs
weight: 300
url: /sv/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Denna klass kapslar in rendering av dokument till PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [AUTHOR](./author/)() | \"Author\" egenskapsvärde. |
| static [BACKGROUND](./background/)() | \"Background\" egenskapsnyckel. |
| static [BACKGROUND_COLOR](./background_color/)() | \"Background color\" egenskapsnyckel. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Klipper med given form. Skickar vidare till writeClip(Rectangle), writeClip(RectangleF) eller writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Klipper rektangel. Anropar clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | Utför nödvändig förberedelse av enheten efter att sidan har renderats. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | \"Compress\" egenskapsnyckel. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Skapar en kopia av denna enhet. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Avslutar grafikkontexten. Om restoreOnDispose var true vid skapandet, kommer writeGraphicsRestore() att anropas. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Ritar en bana. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Ritar en bild med tilldelad transformation och bakgrund. |
| [DrawString](./drawstring/)(System::String, double, double) override | Ritar en sträng vid given punkt. |
| static [EMBED_FONTS](./embed_fonts/)() | \"Embed font in document\" egenskapsnyckel. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | \"What font type is used for embedding\" egenskapsnyckel. |
| static [EMIT_ERRORS](./emit_errors/)() | \"Emit errors\" egenskapsvärde. |
| static [EMIT_WARNINGS](./emit_warnings/)() | \"Emit warnings\" egenskapsvärde. |
| [EndDocument](./enddocument/)() override | Utför nödvändig förberedelse av enheten efter att dokumentet har renderats. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Fyller en bana. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | \"Fit content to page\" egenskapsnyckel. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Aktuellt sidnummer. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Ritar ram och banner runt en sträng. Metoden beräknar och returnerar den punkt där textmarkören ska placeras innan strängen ritas. |
| [get_OutputStream](./get_outputstream/)() override | Anger eller returnerar en utström. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Hämtar aktuell transformation. |
| [InitClip](./initclip/)() override | Initierar beskärning av enheten. |
| [InitPageNumbers](./initpagenumbers/)() override | Initierar antal sidor att skriva ut. |
| static [KEYWORDS](./keywords/)() | \"Keywords\" egenskapsvärde. |
| [OpenPage](./openpage/)(System::String) override | Utför nödvändig förberedelse av enheten innan sidrendering. |
| [OpenPage](./openpage/)(float, float) override | Utför nödvändig förberedelse av enheten innan varje sidrendering. |
| static [ORIENTATION](./orientation/)() | \"Orientation\" egenskapsnyckel. |
| static [PAGE_MARGINS](./page_margins/)() | \"Page margins\" egenskapsnyckel. |
| static [PAGE_SIZE_](./page_size_/)() | \"Page size\" egenskapsnyckel. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Initierar ny instans av [PdfDevice](./) med utskriftsström. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Initierar ny instans av [PdfDevice](./) med utskriftsström och specificerad sidstorlek. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Klonskapare. Initierar ny instans av [PdfDevice](./) med befintlig enhet. |
| [ReNew](./renew/)() override | Återställ enheten till ursprungligt tillstånd för hela dokumentet. Används för att återställa utskriftsström. |
| [ReNewForMerge](./renewformerge/)(bool) override | Återställ enheten till ursprungligt tillstånd för hela dokumentet vid sammanslagning av flera dokument. Används för att återställa utskriftsström. |
| [Reset](./reset/)() override | Om sidans enhetsparametrar ska sättas tillåter denna metod att återföra skrivströmmen till början av sidan. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Rotera den aktuella transformationen kring Z-axeln. Anropar writeTransform(Transform). En rotation med en positiv vinkel theta roterar punkter på den positiva x-axeln mot den positiva y-axeln. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Skalar den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Anger aktuellt teckensnitt. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Anger eller returnerar en utström. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Returnerar eller anger aktuell färg. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Returnerar eller anger aktuell linje. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Anger enhetens beskärning. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Anger den aktuella transformationen. Eftersom de flesta utdataformat inte implementerar denna funktionalitet beräknas den inversa transformationen av currentTransform och multipliceras med den transformation som ska sättas. Resultatet vidarebefordras sedan genom ett anrop till writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Skarvar den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | Utför nödvändig förberedelse av enheten innan rendering av dokumentet startas. |
| static [SUBJECT](./subject/)() | \"Subject\" egenskapsvärde. |
| static [TITLE](./title/)() | \"Title\" egenskapsvärde. |
| [ToString](./tostring/)() const override | Returnerar namnet på enhetstypen. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Transformerar den aktuella transformationsmatrisen. Anropar writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | Översätter den aktuella transformationsmatrisen. Anropar writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | "Transparent" egenskapsnyckel. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Uppdaterar sidparametrar från en annan flersidig enhet. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" egenskapsnyckel. |
| [WriteBackground](./writebackground/)() override | Skriver ut aktuell bakgrund. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Skriver ut spetsen på linjen. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Skriver en kommentar. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Skriver ut streckmönstret för linjen. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Skriver katalogen, docinfo, preferenser och (eftersom vi bara använder enkel sidoutput sidträdet. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Skriver ut sammankopplingen för linjen. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Skriver ut senast skriven färg. Det är användbart i fall där en grafisk återställning ("Q") utfördes efter färgskrivning. |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Skriver ut snittgränsen för linjen. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Skriver ut färg som den angivna färgen. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Skriver ut färg som den angivna gradienten. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Skriver ut färg som den angivna texturen. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Skriver ut färg. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Skriver ut sträng med angivet teckensnitt. |
| [WriteTrailer](./writetrailer/)() | Skriver ut trailer för PDF-dokumentet. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Skriv den angivna transformationsmatrisen till filen. |
| [WriteWarning](./writewarning/)(System::String) override | Skriver ut en varning, som standard till System.err. |
| [WriteWidth](./writewidth/)(float) override | Skriver ut bredden på linjen. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| static [VERSION](./version/) | "Version" egenskapsnyckel. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" egenskapsvärde. |

## Deprecated
PdfDevice-klassen är föråldrad från och med 24.3. Använd SaveAsPdf‑metoden i PsDocument‑klassen istället. I 24.6 kommer denna klass att vara helt dold.

## Se även

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
