---
title: Image
second_title: Aspose.Drawing per .NET API Reference
description: Una classe base astratta che fornisce funzionalità per le classi discendenti Bitmap e Metafile.
type: docs
weight: 580
url: /it/net/system.drawing/image/
---
## Image class

Una classe base astratta che fornisce funzionalità per le classi discendenti Bitmap e Metafile.

```csharp
public abstract class Image : IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Image](image)() | Inizializza una nuova istanza di[`Image`](../image) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Ottiene l'intero che rappresenta una combinazione bit per bit di[`ImageFlags`](../../system.drawing.imaging/imageflags) per questa immagine. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist) { get; } | Ottiene una matrice di GUID che rappresentano le dimensioni dei frame all'interno di questoImage . |
| abstract [Height](../../system.drawing/image/height) { get; } | Ottiene l'altezza, in pixel, di questoImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Ottiene la risoluzione orizzontale, in pixel per pollice, di questoImage . |
| abstract [Palette](../../system.drawing/image/palette) { get; set; } | Ottiene o imposta la tavolozza dei colori utilizzata per questoImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Ottiene la larghezza e l'altezza di questa immagine. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat) { get; } | Ottiene il formato pixel per questoImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist) { get; } | Ottiene gli ID degli elementi della proprietà archiviati in questoImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems) { get; } | Ottiene tutti gli elementi della proprietà (pezzi di metadati) archiviati in questoImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat) { get; } | Ottiene il formato file di questoImage . |
| [Size](../../system.drawing/image/size) { get; } | Ottiene la larghezza e l'altezza, in pixel, di questa immagine. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Ottiene o imposta un oggetto che fornisce dati aggiuntivi sull'immagine. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Ottiene la risoluzione verticale, in pixel per pollice, di questoImage . |
| abstract [Width](../../system.drawing/image/width) { get; } | Ottiene la larghezza, in pixel, di questoImage . |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile)(string) | Crea unImage dal file specificato. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream)(Stream) | Crea unImagedal flusso di dati specificato. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream_1)(Stream, bool) | Crea unImage dal flusso di dati specificato, utilizzando facoltativamente le informazioni di gestione del colore incorporate in quel flusso. |
| [Clone](../../system.drawing/image/clone)() | Crea una copia esatta di questoImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Rilascia tutte le risorse utilizzate da questa immagine. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Ottiene i limiti dell'immagine nell'unità specificata. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Restituisce il numero di fotogrammi della dimensione specificata. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem)(int) | Ottiene l'elemento della proprietà specificato da questoImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Restituisce una miniatura per questoImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem)(int) | Rimuove l'elemento della proprietà specificato da questoImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip)(RotateFlipType) | Questo metodo ruota, capovolge o ruota e capovolge ilImage . |
| [Save](../../system.drawing/image/save#save_2)(string) | Salva questoImageal file o al flusso specificato. |
| [Save](../../system.drawing/image/save#save_1)(Stream, ImageFormat) | Salva questa immagine nel flusso specificato nel formato specificato. |
| [Save](../../system.drawing/image/save#save_4)(string, ImageFormat) | Salva questoImage al file specificato nel formato specificato. |
| [Save](../../system.drawing/image/save#save)(Stream, ImageCodecInfo, EncoderParameters) | Salva questa immagine nel flusso specificato, con i parametri del codificatore e del codificatore di immagine specificati. |
| [Save](../../system.drawing/image/save#save_3)(string, ImageCodecInfo, EncoderParameters) | Salva questoImage al file specificato, con l'encoder specificato e i parametri dell'encoder di immagine. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd_1)(EncoderParameters) | Aggiunge un frame al file o al flusso specificato in una chiamata precedente a uno dei metodi Image.Save(...). Utilizzare questo metodo per salvare i frame selezionati da un'immagine a più frame in un'altra immagine a più frame. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd)(Image, EncoderParameters) | Aggiunge un frame al file o al flusso specificato in una precedente chiamata a quello dei metodi Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Seleziona il frame specificato dalla dimensione e dall'indice. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem)(PropertyItem) | Memorizza un elemento della proprietà (pezzo di metadati) in questoImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap)(IntPtr) | Crea aBitmap da un handle a una bitmap GDI. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize)(PixelFormat) | Restituisce la profondità del colore, in numero di bit per pixel, del formato pixel specificato. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat)(PixelFormat) | Restituisce un valore che indica se il formato pixel per questoImage contiene informazioni alfa. |

## Altri membri

| Nome | Descrizione |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | Fornisce un metodo di callback per determinare quando il[`GetThumbnailImage`](./getthumbnailimage) il metodo dovrebbe annullare prematuramente l'esecuzione. |

### Guarda anche

* spazio dei nomi [System.Drawing](../../system.drawing)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
