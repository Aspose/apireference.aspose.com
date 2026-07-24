---
title: "Aspose::Page::XPS::XpsDocument classe"
linktitle: "XpsDocument"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsDocument classe. Classe che incapsula l'entità principale del documento XPS che fornisce metodi di manipolazione per qualsiasi elemento XPS in C++."
type: docs
weight: 400
url: /it/cpp/aspose.page.xps/xpsdocument/
---
## XpsDocument class


Classe che incapsula l'entità principale del documento [XPS](../) che fornisce metodi di manipolazione per qualsiasi elemento [XPS](../).

```cpp
class XpsDocument : public Aspose::Page::Document,
                    public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(T) | Aggiunge un elemento di contenuto (Canvas, Path o Glyphs). |
| [AddCanvas](./addcanvas/)() | Aggiunge una nuova tela alla pagina attiva. |
| [AddDocument](./adddocument/)(bool) | Aggiunge un documento vuoto con dimensione di pagina predefinita. |
| [AddDocument](./adddocument/)(float, float, bool) | Aggiunge un documento vuoto con le dimensioni della prima pagina *width* e *height*. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Aggiunge nuovi glifi alla pagina attiva. |
| [AddGlyphs](./addglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Aggiunge nuovi glifi alla pagina attiva. |
| [AddOutlineEntry](./addoutlineentry/)(System::String, int32_t, System::SharedPtr\<XpsModel::XpsHyperlinkTarget\>) | Aggiunge una voce di outline al documento. |
| [AddPage](./addpage/)(bool) | Aggiunge una pagina vuota al documento con dimensione di pagina predefinita. |
| [AddPage](./addpage/)(float, float, bool) | Aggiunge una pagina vuota al documento con *width* e *height* specificati. |
| [AddPage](./addpage/)(System::SharedPtr\<XpsModel::XpsPage\>, bool) | Aggiunge una pagina al documento. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Aggiunge un nuovo percorso alla pagina attiva. |
| [Assert](./assert/)() |  |
| [CreateArcSegment](./createarcsegment/)(System::Drawing::PointF, System::Drawing::SizeF, float, bool, XpsModel::XpsSweepDirection, bool) | Crea un nuovo segmento di arco ellittico. |
| [CreateCanvas](./createcanvas/)() | Crea una nuova canvas. |
| [CreateColor](./createcolor/)(System::Drawing::Color) | Crea un nuovo colore. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t, int32_t) | Crea un nuovo colore nello spazio colore sRGB. |
| [CreateColor](./createcolor/)(int32_t, int32_t, int32_t) | Crea un nuovo colore nello spazio colore sRGB. |
| [CreateColor](./createcolor/)(float, float, float, float) | Crea un nuovo colore nello spazio colore scRGB. |
| [CreateColor](./createcolor/)(float, float, float) | Crea un nuovo colore nello spazio colore scRGB. |
| [CreateColor](./createcolor/)(System::String, const System::ArrayPtr\<float\>\&) | Crea un nuovo colore in uno spazio colore basato su ICC. |
| [CreateColor](./createcolor/)(System::SharedPtr\<XpsModel::XpsIccProfile\>, const System::ArrayPtr\<float\>\&) | Crea un nuovo colore in uno spazio colore basato su ICC. |
| [CreateFont](./createfont/)(System::String, System::Drawing::FontStyle) | Crea una nuova risorsa di font **TrueType**. |
| [CreateFont](./createfont/)(System::SharedPtr\<System::IO::Stream\>) | Crea una nuova risorsa di font **TrueType** da un flusso. |
| [CreateGlyphs](./createglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Crea nuovi glyphs. |
| [CreateGlyphs](./createglyphs/)(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Crea nuovi glyphs. |
| [CreateGradientStop](./creategradientstop/)(System::SharedPtr\<XpsModel::XpsColor\>, float) | Crea una nuova fermata di gradiente. |
| [CreateGradientStop](./creategradientstop/)(System::Drawing::Color, float) | Crea una nuova fermata di gradiente. |
| [CreateIccProfile](./createiccprofile/)(System::String) | Crea una nuova risorsa di profilo ICC dal file di profilo ICC situato in *iccProfilePath*. |
| [CreateIccProfile](./createiccprofile/)(System::SharedPtr\<System::IO::Stream\>) | Crea una nuova risorsa di profilo ICC da *stream*. |
| [CreateImage](./createimage/)(System::String) | Crea una nuova risorsa immagine dal file immagine situato in *imagePath*. |
| [CreateImage](./createimage/)(System::SharedPtr\<System::IO::Stream\>) | Crea una nuova risorsa immagine da *stream*. |
| [CreateImageBrush](./createimagebrush/)(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea un nuovo pennello immagine. |
| [CreateImageBrush](./createimagebrush/)(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea un nuovo pennello immagine. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF) | Crea un nuovo pennello a gradiente lineare. |
| [CreateLinearGradientBrush](./createlineargradientbrush/)(System::Drawing::PointF, System::Drawing::PointF) | Crea un nuovo pennello a gradiente lineare. |
| [CreateMatrix](./creatematrix/)(float, float, float, float, float, float) | Crea una nuova matrice di trasformazione affine. |
| [CreatePath](./createpath/)(System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Crea un nuovo percorso. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, bool) | Crea una nuova figura di percorso. |
| [CreatePathFigure](./createpathfigure/)(System::Drawing::PointF, System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathSegment\>\>\>, bool) | Crea una nuova figura di percorso. |
| [CreatePathGeometry](./createpathgeometry/)(System::String) | Crea una nuova geometria di percorso specificata in forma abbreviata. |
| [CreatePathGeometry](./createpathgeometry/)() | Crea una nuova geometria di percorso. |
| [CreatePathGeometry](./createpathgeometry/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsPathFigure\>\>\>) | Crea una nuova geometria di percorso con l'elenco specificato di figure di percorso. |
| [CreatePolyBezierSegment](./createpolybeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuovo insieme di curve Bézier cubiche. |
| [CreatePolyLineSegment](./createpolylinesegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuovo disegno poligonale contenente un numero arbitrario di vertici individuali. |
| [CreatePolyQuadraticBezierSegment](./createpolyquadraticbeziersegment/)(System::ArrayPtr\<System::Drawing::PointF\>, bool) | Crea un nuovo insieme di curve Bézier quadratiche dal punto precedente nella figura di percorso attraverso un insieme di vertici, usando i punti di controllo specificati. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) | Crea un nuovo pennello a gradiente radiale. |
| [CreateRadialGradientBrush](./createradialgradientbrush/)(System::Drawing::PointF, System::Drawing::PointF, float, float) | Crea un nuovo pennello a gradiente radiale. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::SharedPtr\<XpsModel::XpsColor\>) | Crea un nuovo pennello a colore solido. |
| [CreateSolidColorBrush](./createsolidcolorbrush/)(System::Drawing::Color) | Crea un nuovo pennello a colore solido. |
| [CreateVisualBrush](./createvisualbrush/)(System::SharedPtr\<XpsModel::XpsContentElement\>, System::Drawing::RectangleF, System::Drawing::RectangleF) | Crea un nuovo pennello visivo. |
| [Dispose](./dispose/)() override | Elimina l'istanza. |
| [get_ActiveDocument](./get_activedocument/)() | Ottiene il numero del documento attivo. |
| [get_ActivePage](./get_activepage/)() | Ottiene il numero della pagina attiva all'interno del documento attivo. |
| [get_DocumentCount](./get_documentcount/)() | Restituisce il numero di documenti all'interno del pacchetto [XPS](../). |
| [get_JobPrintTicket](./get_jobprintticket/)() | Restituisce/imposta il ticket di stampa del lavoro del documento. |
| [get_Page](./get_page/)() | Restituisce un'istanza di [XpsPage](../) per la pagina attiva. |
| [get_PageCount](./get_pagecount/)() | Restituisce il numero di pagine nel documento attivo. |
| [get_TotalPageCount](./get_totalpagecount/)() | Restituisce il numero totale di pagine in tutti i documenti all'interno del documento [XPS](../). |
| [get_Utils](./get_utils/)() const | Ottiene l'oggetto che fornisce utilità oltre la formale API di manipolazione [XPS](../). |
| [GetDocumentPrintTicket](./getdocumentprintticket/)(int32_t) | Restituisce il ticket di stampa del documento indicizzato da *documentIndex*. |
| [GetPagePrintTicket](./getpageprintticket/)(int32_t, int32_t) | Restituisce il ticket di stampa della pagina indicizzata da *pageIndex* nel documento indicizzato da *documentIndex*. |
| [Insert](./insert/)(int32_t, T) | Inserisce un elemento (Canvas, Path o Glyphs) nella pagina attiva alla posizione *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Inserisce una nuova canvas nella pagina attiva alla posizione *index*. |
| [InsertDocument](./insertdocument/)(int32_t, bool) | Inserisce un documento vuoto con dimensione di pagina predefinita alla posizione *index*. |
| [InsertDocument](./insertdocument/)(int32_t, float, float, bool) | Inserisce un documento vuoto con le dimensioni della prima pagina *width* e *height* alla posizione *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Inserisce nuovi glyphs nella pagina attiva alla posizione *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) | Inserisce nuovi glyphs nella pagina attiva alla posizione *index*. |
| [InsertPage](./insertpage/)(int32_t, bool) | Inserisce una pagina vuota nel documento con dimensione di pagina predefinita alla posizione *index*. |
| [InsertPage](./insertpage/)(int32_t, float, float, bool) | Inserisce una pagina vuota nel documento con *width* e *height* specificati alla posizione *index*. |
| [InsertPage](./insertpage/)(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) | Inserisce una pagina nel documento alla posizione *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsModel::XpsPathGeometry\>) | Inserisce un nuovo path nella pagina attiva alla posizione *index*. |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::String) | Unione di diversi file [XPS](../) in un unico documento [XPS](../). |
| [Merge](./merge/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>) | Unione di diversi file [XPS](../) in un unico documento [XPS](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Unione di documenti [XPS](../) in PDF utilizzando l'istanza [Device](../). |
| [MergeToPdf](./mergetopdf/)(System::ArrayPtr\<System::String\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Unione di documenti [XPS](../) in PDF utilizzando l'istanza [Device](../). |
| [Remove](./remove/)(T) | Rimuove un elemento dalla pagina attiva. |
| [RemoveAt](./removeat/)(int32_t) | Rimuove un elemento alla posizione *index* dalla pagina attiva. |
| [RemoveDocumentAt](./removedocumentat/)(int32_t) | Rimuove un documento alla posizione *index*. |
| [RemovePage](./removepage/)(System::SharedPtr\<XpsModel::XpsPage\>) | Rimuove una pagina dal documento. |
| [RemovePageAt](./removepageat/)(int32_t) | Rimuove una pagina dal documento alla posizione *index*. |
| [Save](./save/)(System::String) | Salva il documento [XPS](../) in un file [XPS](../) situato in *path*. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Salva il documento [XPS](../) in uno stream. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Salva il documento in un file immagine. La directory di output e il nome del file saranno gli stessi del file [XPS](../) di input. L'estensione del file corrisponderà al formato immagine nel parametro "options". Se il documento è stato inizializzato con uno stream che non è FileStream, il file immagine verrà salvato nella cartella corrente con il modello di nome file predefinito. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) | Salva il documento in un file immagine nella directory specificata con il nome file specificato. L'estensione del file corrisponderà al formato immagine nel parametro "options". |
| [SaveAsImageBytes](./saveasimagebytes/)(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) | Salva il documento in formato immagine bitmap come array di byte. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Salva il documento in formato PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Presentation::Pdf::PdfSaveOptions\>) | Salva il documento in formato PDF. |
| [SaveAsPs](./saveasps/)(System::String, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Salva il documento in formato PS. |
| [SaveAsPs](./saveasps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<EPS::Device::PsSaveOptions\>) | Salva il documento in formato PS. |
| [SelectActiveDocument](./selectactivedocument/)(int32_t) | Seleziona un documento attivo per la modifica. |
| [SelectActivePage](./selectactivepage/)(int32_t) | Seleziona una pagina del documento attivo per la modifica. |
| [set_JobPrintTicket](./set_jobprintticket/)(System::SharedPtr\<Aspose::Page::XPS::XpsMetadata::JobPrintTicket\>) | Restituisce/imposta il ticket di stampa del lavoro del documento. |
| [SetDocumentPrintTicket](./setdocumentprintticket/)(int32_t, System::SharedPtr\<XpsMetadata::DocumentPrintTicket\>) | Collega il *printTicket* al documento indicizzato da *documentIndex*. |
| [SetPagePrintTicket](./setpageprintticket/)(int32_t, int32_t, System::SharedPtr\<XpsMetadata::PagePrintTicket\>) | Collega il *printTicket* alla pagina indicizzata da *pageIndex* nel documento indicizzato da *documentIndex*. |
| [XpsDocument](./xpsdocument/)() | Crea un documento [XPS](../) vuoto con dimensione di pagina predefinita. |
| [XpsDocument](./xpsdocument/)(System::String) | Apre un documento [XPS](../) esistente situato al percorso *path*. |
| [XpsDocument](./xpsdocument/)(System::String, System::SharedPtr\<LoadOptions\>) | Apre un documento esistente situato al percorso *path* come documento [XPS](../). |
| [XpsDocument](./xpsdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<LoadOptions\>) | Carica un documento esistente memorizzato nello *stream* come documento [XPS](../). |
## Vedi anche

* Class [Document](../../aspose.page/document/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
