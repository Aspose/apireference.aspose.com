---
title: Class XpsDocument
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsDocument classe. Classe che incapsula lentità principale del documento XPS che fornisce metodi di manipolazione per qualsiasi elemento XPS.
type: docs
weight: 480
url: /it/net/aspose.page.xps/xpsdocument/
---
## XpsDocument class

Classe che incapsula l'entità principale del documento XPS che fornisce metodi di manipolazione per qualsiasi elemento XPS.

```csharp
public sealed class XpsDocument : Document, IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [XpsDocument](xpsdocument/#constructor)() | Crea un documento XPS vuoto con dimensione pagina predefinita. |
| [XpsDocument](xpsdocument/#constructor_2)(string) | Apre un documento XPS esistente che si trova in*path* . |
| [XpsDocument](xpsdocument/#constructor_1)(Stream, LoadOptions) | Carica un documento esistente memorizzato nel file*stream* come documento XPS. |
| [XpsDocument](xpsdocument/#constructor_3)(string, LoadOptions) | Apre un documento esistente che si trova in*path* come documento XPS. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [ActiveDocument](../../aspose.page.xps/xpsdocument/activedocument/) { get; } | Ottiene il numero del documento attivo. |
| [ActivePage](../../aspose.page.xps/xpsdocument/activepage/) { get; } | Ottiene il numero di pagina attiva all'interno del documento attivo. |
| [DocumentCount](../../aspose.page.xps/xpsdocument/documentcount/) { get; } | Restituisce il numero di documenti all'interno del pacchetto XPS. |
| [JobPrintTicket](../../aspose.page.xps/xpsdocument/jobprintticket/) { get; set; } | Restituisce/imposta ticket stampa lavoro documento |
| [Page](../../aspose.page.xps/xpsdocument/page/) { get; } | Restituisce an[`XpsPage`](../../aspose.page.xps.xpsmodel/xpspage/) istanza per pagina attiva. |
| [PageCount](../../aspose.page.xps/xpsdocument/pagecount/) { get; } | Restituisce il numero di pagine nel documento attivo. |
| [TotalPageCount](../../aspose.page.xps/xpsdocument/totalpagecount/) { get; } | Restituisce il numero totale di pagine in tutti i documenti all'interno del documento XPS. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps/xpsdocument/add/)(T) | Aggiunge un elemento di contenuto (Canvas, Path o Glyphs) |
| [AddCanvas](../../aspose.page.xps/xpsdocument/addcanvas/)() | Aggiunge una nuova tela alla pagina attiva. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument)(bool) | Aggiunge un documento vuoto con dimensione pagina predefinita. |
| [AddDocument](../../aspose.page.xps/xpsdocument/adddocument/#adddocument_1)(float, float, bool) | Aggiunge un documento vuoto con le dimensioni della prima pagina *width* E*height* . |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs)(XpsFont, float, float, float, string) | Aggiunge nuovi glifi alla pagina attiva. |
| [AddGlyphs](../../aspose.page.xps/xpsdocument/addglyphs/#addglyphs_1)(string, float, FontStyle, float, float, string) | Aggiunge nuovi glifi alla pagina attiva. |
| [AddOutlineEntry](../../aspose.page.xps/xpsdocument/addoutlineentry/)(string, int, XpsHyperlinkTarget) | Aggiunge una voce di contorno al documento. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_1)(bool) | Aggiunge una pagina vuota al documento con dimensione pagina predefinita. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage)(XpsPage, bool) | Aggiunge una pagina al documento. |
| [AddPage](../../aspose.page.xps/xpsdocument/addpage/#addpage_2)(float, float, bool) | Aggiunge una pagina vuota al documento con specificato*width* E*height* . |
| [AddPath](../../aspose.page.xps/xpsdocument/addpath/)(XpsPathGeometry) | Aggiunge un nuovo percorso alla pagina attiva. |
| [CreateArcSegment](../../aspose.page.xps/xpsdocument/createarcsegment/)(PointF, SizeF, float, bool, XpsSweepDirection, bool) | Crea un nuovo segmento di arco ellittico. |
| [CreateCanvas](../../aspose.page.xps/xpsdocument/createcanvas/)() | Crea una nuova tela. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_5)(Color) | Crea un nuovo colore. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_6)(string, params float[]) | Crea un nuovo colore nello spazio colore basato su ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor)(XpsIccProfile, params float[]) | Crea un nuovo colore nello spazio colore basato su ICC. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_3)(float, float, float) | Crea un nuovo colore nello spazio colore scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_1)(int, int, int) | Crea un nuovo colore nello spazio colore sRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_4)(float, float, float, float) | Crea un nuovo colore nello spazio colore scRGB. |
| [CreateColor](../../aspose.page.xps/xpsdocument/createcolor/#createcolor_2)(int, int, int, int) | Crea un nuovo colore nello spazio colore sRGB. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont)(Stream) | Crea una nuova risorsa font TrueType fuori dallo stream. |
| [CreateFont](../../aspose.page.xps/xpsdocument/createfont/#createfont_1)(string, FontStyle) | Crea una nuova risorsa font TrueType. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs)(XpsFont, float, float, float, string) | Crea nuovi glifi. |
| [CreateGlyphs](../../aspose.page.xps/xpsdocument/createglyphs/#createglyphs_1)(string, float, FontStyle, float, float, string) | Crea nuovi glifi. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop_1)(Color, float) | Crea una nuova interruzione del gradiente. |
| [CreateGradientStop](../../aspose.page.xps/xpsdocument/creategradientstop/#creategradientstop)(XpsColor, float) | Crea una nuova interruzione del gradiente. |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile)(Stream) | Crea una nuova risorsa profilo ICC da*stream* . |
| [CreateIccProfile](../../aspose.page.xps/xpsdocument/createiccprofile/#createiccprofile_1)(string) | Crea una nuova risorsa del profilo ICC dal file del profilo ICC che si trova in *iccProfilePath* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage)(Stream) | Crea una nuova risorsa immagine da*stream* . |
| [CreateImage](../../aspose.page.xps/xpsdocument/createimage/#createimage_1)(string) | Crea una nuova risorsa immagine dal file immagine situato in*imagePath* . |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush_1)(string, RectangleF, RectangleF) | Crea un nuovo pennello immagine. |
| [CreateImageBrush](../../aspose.page.xps/xpsdocument/createimagebrush/#createimagebrush)(XpsImage, RectangleF, RectangleF) | Crea un nuovo pennello immagine. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush_1)(PointF, PointF) | Crea un nuovo pennello sfumato lineare. |
| [CreateLinearGradientBrush](../../aspose.page.xps/xpsdocument/createlineargradientbrush/#createlineargradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF) | Crea un nuovo pennello sfumato lineare. |
| [CreateMatrix](../../aspose.page.xps/xpsdocument/creatematrix/)(float, float, float, float, float, float) | Crea una nuova matrice di trasformazione affine. |
| [CreatePath](../../aspose.page.xps/xpsdocument/createpath/)(XpsPathGeometry) | Crea un nuovo percorso. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure)(PointF, bool) | Crea una nuova figura di percorso. |
| [CreatePathFigure](../../aspose.page.xps/xpsdocument/createpathfigure/#createpathfigure_1)(PointF, List&lt;XpsPathSegment&gt;, bool) | Crea una nuova figura di percorso. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry)() | Crea una nuova geometria del percorso. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_1)(List&lt;XpsPathFigure&gt;) | Crea una nuova geometria del percorso con un elenco specificato di figure del percorso. |
| [CreatePathGeometry](../../aspose.page.xps/xpsdocument/createpathgeometry/#createpathgeometry_2)(string) | Crea una nuova geometria del percorso specificata con forma abbreviata. |
| [CreatePolyBezierSegment](../../aspose.page.xps/xpsdocument/createpolybeziersegment/)(PointF[], bool) | Crea un nuovo insieme di curve di Bézier cubiche. |
| [CreatePolyLineSegment](../../aspose.page.xps/xpsdocument/createpolylinesegment/)(PointF[], bool) | Crea un nuovo disegno poligonale contenente un numero arbitrario di singoli vertici. |
| [CreatePolyQuadraticBezierSegment](../../aspose.page.xps/xpsdocument/createpolyquadraticbeziersegment/)(PointF[], bool) | Crea un nuovo set di curve di Bézier quadratiche dal punto precedente nella figura del percorso attraverso un set di vertici, utilizzando i punti di controllo specificati. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush_1)(PointF, PointF, float, float) | Crea un nuovo pennello sfumato radiale. |
| [CreateRadialGradientBrush](../../aspose.page.xps/xpsdocument/createradialgradientbrush/#createradialgradientbrush)(List&lt;XpsGradientStop&gt;, PointF, PointF, float, float) | Crea un nuovo pennello sfumato radiale. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush_1)(Color) | Crea un nuovo pennello a tinta unita. |
| [CreateSolidColorBrush](../../aspose.page.xps/xpsdocument/createsolidcolorbrush/#createsolidcolorbrush)(XpsColor) | Crea un nuovo pennello a tinta unita. |
| [CreateVisualBrush](../../aspose.page.xps/xpsdocument/createvisualbrush/)(XpsContentElement, RectangleF, RectangleF) | Crea un nuovo pennello visivo. |
| [Dispose](../../aspose.page.xps/xpsdocument/dispose/)() | Elimina l'istanza. |
| [GetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/getdocumentprintticket/)(int) | Restituisce il ticket di stampa del documento indicizzato da*documentIndex* . |
| [GetPagePrintTicket](../../aspose.page.xps/xpsdocument/getpageprintticket/)(int, int) | Restituisce il ticket di stampa della pagina indicizzata da*pageIndex* nel documento indicizzato da*documentIndex* . |
| [Insert&lt;T&gt;](../../aspose.page.xps/xpsdocument/insert/)(int, T) | Inserisce un elemento (Canvas, Path o Glyphs) nella pagina attiva a*index* posizione. |
| [InsertCanvas](../../aspose.page.xps/xpsdocument/insertcanvas/)(int) | Inserisce una nuova tela nella pagina attiva in*index* posizione. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument)(int, bool) | Inserisce un documento vuoto con dimensioni pagina predefinite at*index* posizione. |
| [InsertDocument](../../aspose.page.xps/xpsdocument/insertdocument/#insertdocument_1)(int, float, float, bool) | Inserisce un documento vuoto con le dimensioni della prima pagina *width* E*height* A*index* posizione. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs)(int, XpsFont, float, float, float, string) | Inserisce nuovi glifi nella pagina attiva in*index* posizione. |
| [InsertGlyphs](../../aspose.page.xps/xpsdocument/insertglyphs/#insertglyphs_1)(int, string, float, FontStyle, float, float, string) | Inserisce nuovi glifi nella pagina attiva in*index* posizione. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_1)(int, bool) | Inserisce una pagina vuota nel documento con dimensione pagina predefinita at*index* posizione. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage)(int, XpsPage, bool) | Inserisce una pagina nel documento in*index* posizione. |
| [InsertPage](../../aspose.page.xps/xpsdocument/insertpage/#insertpage_2)(int, float, float, bool) | Inserisce una pagina vuota nel documento con specificato*width* E*height* A*index* posizione. |
| [InsertPath](../../aspose.page.xps/xpsdocument/insertpath/)(int, XpsPathGeometry) | Inserisce un nuovo percorso alla pagina attiva in*index* posizione. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge_1)(string[], Stream) | Unione di più file XPS in un unico documento XPS. |
| [Merge](../../aspose.page.xps/xpsdocument/merge/#merge)(string[], Device, SaveOptions) | Unione di documenti XPS in PDF utilizzando il file[`Device`](../../aspose.page/device/) istanza. |
| [Remove&lt;T&gt;](../../aspose.page.xps/xpsdocument/remove/)(T) | Rimuove un elemento dalla pagina attiva. |
| [RemoveAt](../../aspose.page.xps/xpsdocument/removeat/)(int) | Rimuove un elemento in*index* posizione dalla pagina attiva. |
| [RemoveDocumentAt](../../aspose.page.xps/xpsdocument/removedocumentat/)(int) | Rimuove un documento in*index* posizione. |
| [RemovePage](../../aspose.page.xps/xpsdocument/removepage/)(XpsPage) | Rimuove una pagina dal documento. |
| [RemovePageAt](../../aspose.page.xps/xpsdocument/removepageat/)(int) | Rimuove una pagina dal documento in*index* posizione. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_1)(Stream) | Salva il documento XPS nello streaming. |
| [Save](../../aspose.page.xps/xpsdocument/save/#save_2)(string) | Salva il documento XPS nel file XPS situato nel file*path* . |
| override [Save](../../aspose.page.xps/xpsdocument/save/#save)(Device, SaveOptions) | Salva il documento utilizzando il file[`Device`](../../aspose.page/device/) istanza. |
| [SelectActiveDocument](../../aspose.page.xps/xpsdocument/selectactivedocument/)(int) | Seleziona un documento attivo per la modifica. |
| [SelectActivePage](../../aspose.page.xps/xpsdocument/selectactivepage/)(int) | Seleziona una pagina del documento attivo per la modifica. |
| [SetDocumentPrintTicket](../../aspose.page.xps/xpsdocument/setdocumentprintticket/)(int, DocumentPrintTicket) | Collega il*printTicket* al documento indicizzato da*documentIndex* . |
| [SetPagePrintTicket](../../aspose.page.xps/xpsdocument/setpageprintticket/)(int, int, PagePrintTicket) | Collega il*printTicket* alla pagina indicizzata da*pageIndex* nel documento indicizzato da*documentIndex* . |

### Guarda anche

* class [Document](../../aspose.page/document/)
* spazio dei nomi [Aspose.Page.XPS](../../aspose.page.xps/)
* assemblea [Aspose.Page](../../)


