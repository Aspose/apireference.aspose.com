---
title: Bitmap
second_title: Aspose.Drawing per .NET API Reference
description: Incapsula una bitmap che consiste nei dati pixel per unimmagine grafica e i suoi attributi. ABitmap./bitmap è un oggetto utilizzato per lavorare con immagini definite da dati pixel.
type: docs
weight: 40
url: /it/net/system.drawing/bitmap/
---
## Bitmap class

Incapsula una bitmap, che consiste nei dati pixel per un'immagine grafica e i suoi attributi. A[`Bitmap`](../bitmap) è un oggetto utilizzato per lavorare con immagini definite da dati pixel.

```csharp
public class Bitmap : Image
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe dall'immagine esistente specificata. |
| [Bitmap](bitmap#constructor_6)(Stream) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe dal flusso di dati specificato. |
| [Bitmap](bitmap#constructor_8)(string) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe dal file specificato. |
| [Bitmap](bitmap#constructor_5)(Image, Size) | Inizializza una nuova istanza di[`Bitmap`](../bitmap)classe dall'immagine esistente specificata, ridimensionata alla dimensione specificata. |
| [Bitmap](bitmap#constructor)(int, int) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe con la dimensione specificata. |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe dal flusso di dati specificato. |
| [Bitmap](bitmap#constructor_9)(string, bool) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe dal file specificato. |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe dall'immagine esistente specificata, ridimensionata alla dimensione specificata. |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe con la dimensione e il formato specificati. |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | Inizializza una nuova istanza di[`Bitmap`](../bitmap) classe con la dimensione e i dati pixel specificati. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Ottiene l'intero che rappresenta una combinazione bit per bit di[`ImageFlags`](../../system.drawing.imaging/imageflags) per questa immagine. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | Ottiene una matrice di GUID che rappresentano le dimensioni dei frame all'interno di questoImage . |
| override [Height](../../system.drawing/bitmap/height) { get; } | Ottiene l'altezza, in pixel, di questa bitmap. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Ottiene la risoluzione orizzontale, in pixel per pollice, di questoImage . |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | Ottiene o imposta la tavolozza dei colori utilizzata per questoImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Ottiene la larghezza e l'altezza di questa immagine. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | Ottiene il formato pixel per questoImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | Ottiene gli ID degli elementi della proprietà archiviati in questoImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | Ottiene tutti gli elementi della proprietà (pezzi di metadati) archiviati in questoImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | Ottiene il formato file di questoImage . |
| [Size](../../system.drawing/image/size) { get; } | Ottiene la larghezza e l'altezza, in pixel, di questa immagine. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Ottiene o imposta un oggetto che fornisce dati aggiuntivi sull'immagine. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Ottiene la risoluzione verticale, in pixel per pollice, di questoImage . |
| override [Width](../../system.drawing/bitmap/width) { get; } | Ottiene la larghezza, in pixel, di questa bitmap. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Crea una copia esatta di questoImage . |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | Crea una copia della sezione di questoBitmap definito daRectangle struttura e con una specificaPixelFormat enumerazione. |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | Crea una copia della sezione di questoBitmap definito con uno specificatoPixelFormat enumerazione. |
| virtual [Dispose](../../system.drawing/image/dispose)() | Rilascia tutte le risorse utilizzate da questa immagine. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Ottiene i limiti dell'immagine nell'unità specificata. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Restituisce il numero di fotogrammi della dimensione specificata. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | Ottiene il colore del pixel specificato in questoBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | Ottiene l'elemento della proprietà specificato da questoImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Restituisce una miniatura per questoImage . |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | Serrature aBitmap nella memoria di sistema. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | Rende trasparente il colore specificato per questoBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | Rende trasparente il colore specificato per questoBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | Legge i pixel bitmap in formato ARGB32 in un determinato array. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | Rimuove l'elemento della proprietà specificato da questoImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | Questo metodo ruota, capovolge o ruota e capovolge ilImage . |
| [Save](../../system.drawing/image/save)(string) | Salva questoImageal file o al flusso specificato. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Salva questa immagine nel flusso specificato nel formato specificato. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Salva questoImage al file specificato nel formato specificato. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Salva questa immagine nel flusso specificato, con i parametri del codificatore e del codificatore di immagine specificati. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Salva questoImage al file specificato, con l'encoder specificato e i parametri dell'encoder di immagine. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Aggiunge un frame al file o al flusso specificato in una chiamata precedente a uno dei metodi Image.Save(...). Utilizzare questo metodo per salvare i frame selezionati da un'immagine a più frame in un'altra immagine a più frame. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Aggiunge un frame al file o al flusso specificato in una precedente chiamata a quello dei metodi Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Seleziona il frame specificato dalla dimensione e dall'indice. |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | Imposta il colore del pixel specificato in questoBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | Memorizza un elemento della proprietà (pezzo di metadati) in questoImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | Imposta la risoluzione per questoBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | Sblocca questoBitmap dalla memoria di sistema. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | Scrive pixel nella bitmap. |

### Guarda anche

* class [Image](../image)
* spazio dei nomi [System.Drawing](../../system.drawing)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
