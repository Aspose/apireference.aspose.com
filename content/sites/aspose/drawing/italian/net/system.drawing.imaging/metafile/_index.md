---
title: Metafile
second_title: Aspose.Drawing per .NET API Reference
description: Definisce un metafile grafico. Un metafile contiene record che descrivono una sequenza di operazioni grafiche che possono essere registrate costruite e riprodotte visualizzate. Questa classe non è ereditabile.
type: docs
weight: 800
url: /it/net/system.drawing.imaging/metafile/
---
## Metafile class

Definisce un metafile grafico. Un metafile contiene record che descrivono una sequenza di operazioni grafiche che possono essere registrate (costruite) e riprodotte (visualizzate). Questa classe non è ereditabile.

```csharp
public sealed class Metafile : Image
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | Inizializza una nuova istanza di[`Metafile`](../metafile) classe dal flusso di dati specificato. |
| [Metafile](metafile#constructor_6)(string) | Inizializza una nuova istanza di[`Metafile`](../metafile) classe dal nome file specificato. |
| [Metafile](metafile#constructor)(IntPtr, bool) | Inizializza una nuova istanza di[`Metafile`](../metafile) classe dall'handle specificato. |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | Inizializza una nuova istanza di[`Metafile`](../metafile) classe dall'handle specificato a un contesto di dispositivo e anEmfTypeenumerazione che specifica il formato delMetafile . |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | Inizializza una nuova istanza di[`Metafile`](../metafile) classe dal flusso di dati specificato e un handle di Windows in un contesto di dispositivo. /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | Inizializza una nuova istanza di[`Metafile`](../metafile) classe dal nome file specificato. |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | Inizializza una nuova istanza di[`Metafile`](../metafile) classe dal flusso di dati specificato , un handle di Windows in un contesto di dispositivo e unEmfType enumeration che specifica il formato del fileMetafile . |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Inizializza una nuova istanza di[`Metafile`](../metafile) classe dal flusso di dati specificato , un handle di Windows in un contesto di dispositivo e unEmfType enumeration che specifica il formato del fileMetafile . |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Ottiene l'intero che rappresenta una combinazione bit per bit di[`ImageFlags`](../imageflags) per questa immagine. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | Ottiene una matrice di GUID che rappresentano le dimensioni dei frame all'interno di questoImage . |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | Ottiene l'altezza, in pixel, di questoMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Ottiene la risoluzione orizzontale, in pixel per pollice, di questoImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | Ottiene o imposta la tavolozza dei colori utilizzata per questoImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Ottiene la larghezza e l'altezza di questa immagine. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | Ottiene il formato pixel per questoImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | Ottiene gli ID degli elementi della proprietà archiviati in questoImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | Ottiene tutti gli elementi della proprietà (pezzi di metadati) archiviati in questoImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | Ottiene il formato file di questoImage . |
| [Size](../../system.drawing/image/size) { get; } | Ottiene la larghezza e l'altezza, in pixel, di questa immagine. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Ottiene o imposta un oggetto che fornisce dati aggiuntivi sull'immagine. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Ottiene la risoluzione verticale, in pixel per pollice, di questoImage . |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | Ottiene la larghezza, in pixel, di questoMetafile . |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Crea una copia esatta di questoImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Rilascia tutte le risorse utilizzate da questa immagine. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Ottiene i limiti dell'immagine nell'unità specificata. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Restituisce il numero di fotogrammi della dimensione specificata. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | Restituisce un handle di Windows a un avanzatoMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | Restituisce ilMetafileHeader associato a questoMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | Ottiene l'elemento della proprietà specificato da questoImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Restituisce una miniatura per questoImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | Riproduce un singolo record di metafile. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | Rimuove l'elemento della proprietà specificato da questoImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | Questo metodo ruota, capovolge o ruota e capovolge ilImage . |
| [Save](../../system.drawing/image/save)(string) | Salva questoImageal file o al flusso specificato. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Salva questa immagine nel flusso specificato nel formato specificato. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Salva questoImage al file specificato nel formato specificato. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Salva questa immagine nel flusso specificato, con i parametri del codificatore e del codificatore di immagine specificati. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Salva questoImage al file specificato, con l'encoder specificato e i parametri dell'encoder di immagine. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Aggiunge un frame al file o al flusso specificato in una chiamata precedente a uno dei metodi Image.Save(...). Utilizzare questo metodo per salvare i frame selezionati da un'immagine a più frame in un'altra immagine a più frame. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Aggiunge un frame al file o al flusso specificato in una precedente chiamata a quello dei metodi Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Seleziona il frame specificato dalla dimensione e dall'indice. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | Memorizza un elemento della proprietà (pezzo di metadati) in questoImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | Restituisce ilMetafileHeader associato a quello specificatoMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | Restituisce ilMetafileHeader associato a quello specificatoMetafile . |

### Guarda anche

* class [Image](../../system.drawing/image)
* spazio dei nomi [System.Drawing.Imaging](../../system.drawing.imaging)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
