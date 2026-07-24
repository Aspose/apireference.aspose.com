---
title: "Aspose::Page::EPS::Device::PdfDevice classe"
linktitle: "PdfDevice"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::Device::PdfDevice classe. Questa classe incapsula il rendering del documento in PDF in C++."
type: docs
weight: 300
url: /it/cpp/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class


Questa classe incapsula il rendering del documento in PDF.

```cpp
class PdfDevice : public Aspose::Page::Device,
                  public Aspose::Page::IMultiPageDevice,
                  public Aspose::Page::IStreamable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [AUTHOR](./author/)() | "Author" valore della proprietà. |
| static [BACKGROUND](./background/)() | "Background" chiave della proprietà. |
| static [BACKGROUND_COLOR](./background_color/)() | "Background color" chiave della proprietà. |
| virtual [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Ritaglia usando la forma fornita. Inoltra a writeClip(Rectangle), writeClip(RectangleF) o writeClip(Shape). |
| virtual [ClipRect](./cliprect/)(float, float, float, float) | Ritaglia rettangolo. Chiama clip(Rectangle2D). |
| [ClosePage](./closepage/)() override | Esegue la preparazione necessaria del dispositivo dopo che la pagina è stata renderizzata. |
| [CloseStream](./closestream/)() |  |
| static [COMPRESS](./compress/)() | "Compress" chiave della proprietà. |
| virtual [Copy](./copy/)() |  |
| [Create](./create/)() override | Crea una copia di questo dispositivo. |
| virtual [Create](./create/)(float, float, float, float) |  |
| [CreatePdfCanvas](./createpdfcanvas/)() |  |
| [Dispose](./dispose/)() override | Rilascia il contesto grafico. Se al momento della creazione restoreOnDispose era true, verrà chiamato writeGraphicsRestore(). |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Disegna un percorso. |
| [DrawBitmapGlyph](./drawbitmapglyph/)(System::SharedPtr\<System::Object\>, System::String, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override |  |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) override | Disegna un'immagine con trasformazione assegnata e sfondo. |
| [DrawString](./drawstring/)(System::String, double, double) override | Disegna una stringa nel punto specificato. |
| static [EMBED_FONTS](./embed_fonts/)() | "Embed font in document" chiave della proprietà. |
| static [EMBED_FONTS_AS](./embed_fonts_as/)() | "What font type is used for embedding" chiave della proprietà. |
| static [EMIT_ERRORS](./emit_errors/)() | "Emit errors" valore della proprietà. |
| static [EMIT_WARNINGS](./emit_warnings/)() | "Emit warnings" valore della proprietà. |
| [EndDocument](./enddocument/)() override | Esegue la preparazione necessaria del dispositivo dopo che il documento è stato renderizzato. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Riempie un percorso. |
| [FillLastClip](./filllastclip/)() |  |
| static [FIT_TO_PAGE](./fit_to_page/)() | "Fit content to page" chiave della proprietà. |
| [get_CurrentPageNumber](./get_currentpagenumber/)() override | Numero di pagina corrente. |
| [get_LastWrittenPaint](./get_lastwrittenpaint/)() const | Disegna una cornice e un banner attorno a una stringa. Il metodo calcola e restituisce il punto al quale il cursore di testo dovrebbe essere posizionato prima di disegnare la stringa. |
| [get_OutputStream](./get_outputstream/)() override | Specifica o restituisce un flusso di output. |
| [get_WarningMessage](./get_warningmessage/)() |  |
| [GetFinalWrittenLength](./getfinalwrittenlength/)() override |  |
| [GetTransform](./gettransform/)() override | Ottiene la trasformazione corrente. |
| [InitClip](./initclip/)() override | Inizializza il ritaglio del dispositivo. |
| [InitPageNumbers](./initpagenumbers/)() override | Inizializza il numero di pagine da emettere. |
| static [KEYWORDS](./keywords/)() | "Keywords" valore della proprietà. |
| [OpenPage](./openpage/)(System::String) override | Esegue la preparazione necessaria del dispositivo prima del rendering della pagina. |
| [OpenPage](./openpage/)(float, float) override | Esegue la preparazione necessaria del dispositivo prima del rendering di ogni pagina. |
| static [ORIENTATION](./orientation/)() | "Orientation" chiave della proprietà. |
| static [PAGE_MARGINS](./page_margins/)() | "Page margins" chiave della proprietà. |
| static [PAGE_SIZE_](./page_size_/)() | "Page size" chiave della proprietà. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>) | Inizializza una nuova istanza di [PdfDevice](./) con lo stream di output. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::Size) | Inizializza una nuova istanza di [PdfDevice](./) con lo stream di output e la dimensione specificata di una pagina. |
| [PdfDevice](./pdfdevice/)(System::SharedPtr\<PdfDevice\>, bool) | Costruttore di clone. Inizializza una nuova istanza di [PdfDevice](./) con un dispositivo esistente. |
| [ReNew](./renew/)() override | Reimposta il dispositivo allo stato iniziale per l'intero documento. Usato per reimpostare lo stream di output. |
| [ReNewForMerge](./renewformerge/)(bool) override | Reimposta il dispositivo allo stato iniziale per l'intero documento durante l'unione di più documenti. Usato per reimpostare lo stream di output. |
| [Reset](./reset/)() override | Se i parametri del dispositivo di pagina verranno impostati, questo metodo consente di riportare lo stream di scrittura all'inizio della pagina. |
| [Reset](./reset/)(bool) override |  |
| virtual [ResetClip](./resetclip/)(System::Drawing::Rectangle) |  |
| [Rotate](./rotate/)(double) override | Ruota la trasformazione corrente attorno all'asse Z. Chiama writeTransform(Transform). Ruotare con un angolo positivo theta ruota i punti sull'asse x positivo verso l'asse y positivo. |
| virtual [SavePageTransform](./savepagetransform/)() |  |
| [Scale](./scale/)(double, double) override | Scala la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| [set_Font](./set_font/)(System::SharedPtr\<BaseTrFont\>) override | Specifica il font corrente. |
| [set_OutputStream](./set_outputstream/)(System::SharedPtr\<System::IO::Stream\>) override | Specifica o restituisce un flusso di output. |
| [set_Paint](./set_paint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Restituisce o specifica il paint corrente. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<System::Drawing::Pen\>) override | Restituisce o specifica lo stroke corrente. |
| [SetClip](./setclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) override | Specifica il ritaglio del dispositivo. |
| virtual [SetFooter](./setfooter/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| virtual [SetHeader](./setheader/)(System::SharedPtr\<Postscript::TrFont\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, System::SharedPtr\<Graphics2d::TagString\>, int32_t) |  |
| [SetSaveFromPatternCreate](./setsavefrompatterncreate/)() |  |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Specifica la trasformazione corrente. Poiché la maggior parte dei formati di output non implementa questa funzionalità, l'inversa della trasformazione currentTransform viene calcolata e moltiplicata per la trasformazione da impostare. Il risultato viene poi inoltrato tramite una chiamata a writeTransform(Transform). |
| [Shear](./shear/)(double, double) override | Inclina la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| [StartDocument](./startdocument/)() override | Esegue la preparazione necessaria del dispositivo prima dell'inizio del rendering del documento. |
| static [SUBJECT](./subject/)() | "Subject" valore della proprietà. |
| static [TITLE](./title/)() | "Title" valore della proprietà. |
| [ToString](./tostring/)() const override | Restituisce il nome del tipo di dispositivo. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) override | Trasforma la matrice di trasformazione corrente. Chiama writeTransform(Transform) |
| [Translate](./translate/)(double, double) override | Trasla la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| static [TRANSPARENT](./transparent/)() | "Transparent" chiave della proprietà. |
| [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) override | Aggiorna i parametri della pagina da un altro dispositivo multi-pagina. |
| static [WRITE_IMAGES_AS](./write_images_as/)() | "Format of images" chiave della proprietà. |
| [WriteBackground](./writebackground/)() override | Scrive lo sfondo corrente. |
| [WriteCap](./writecap/)(System::Drawing::Drawing2D::LineCap) override | Scrive il cap del tratto. |
| virtual [WriteClip](./writeclip/)(System::Drawing::RectangleF) |  |
| virtual [WriteClip](./writeclip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) |  |
| [WriteComment](./writecomment/)(System::String) override | Scrive un commento. |
| [WriteDash](./writedash/)(System::ArrayPtr\<double\>, double, System::Drawing::Drawing2D::DashCap, float) override | Scrive il dash del tratto. |
| virtual [WriteGraphicsRestore](./writegraphicsrestore/)() |  |
| virtual [WriteGraphicsSave](./writegraphicssave/)() |  |
| [WriteHeader](./writeheader/)() | Scrive il catalogo, docinfo, preferenze e (poiché utilizziamo solo output a pagina singola) l'albero delle pagine. |
| [WriteJoin](./writejoin/)(System::Drawing::Drawing2D::LineJoin) override | Scrive la giunzione del tratto. |
| [WriteLastWrittenPaint](./writelastwrittenpaint/)() | Scrive l'ultimo paint scritto. È utile nei casi in cui, dopo aver scritto il paint, è stato eseguito il ripristino della grafica ("Q"). |
| [WriteMiterLimit](./writemiterlimit/)(float) override | Scrive il limite di spigolo del tratto. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::SolidBrush\>) override | Scrive il paint come il colore specificato. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Drawing2D::LinearGradientBrush\>) override | Scrive il paint come il gradiente specificato. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::TextureBrush\>) override | Scrive il paint come la texture specificata. |
| [WritePaint](./writepaint/)(System::SharedPtr\<System::Drawing::Brush\>) override | Scrive il paint. |
| [WriteString](./writestring/)(System::SharedPtr\<BaseTrFont\>, System::String) override | Scrive la stringa con il font specificato. |
| [WriteTrailer](./writetrailer/)() | Scrive il trailer del documento PDF. |
| virtual [WriteTransform](./writetransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Scrivi la matrice di trasformazione fornita nel file. |
| [WriteWarning](./writewarning/)(System::String) override | Scrive un avviso, per impostazione predefinita su System.err. |
| [WriteWidth](./writewidth/)(float) override | Scrive la larghezza del tratto. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [VERSION](./version/) | "Version" chiave della proprietà. |
| static [VERSION5](./version5/) | "Version of Adobe Acrobat Reader" valore della proprietà. |

## Deprecated
La classe PdfDevice è deprecata a partire dalla versione 24.3. Si prega di utilizzare il metodo SaveAsPdf nella classe PsDocument invece. Nella versione 24.6 questa classe sarà completamente nascosta

## Vedi anche

* Class [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* Class [IStreamable](../../aspose.page/istreamable/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
