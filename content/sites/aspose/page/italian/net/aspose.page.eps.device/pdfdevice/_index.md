---
title: Class PdfDevice
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.EPS.Device.PdfDevice classe. Questa classe incapsula il rendering del documento in PDF.
type: docs
weight: 60
url: /it/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Questa classe incapsula il rendering del documento in PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Inizializza una nuova istanza di`PdfDevice` con flusso di output. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Inizializza una nuova istanza di`PdfDevice` con flusso di output e dimensione specificata di una pagina. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Restituisce o specifica lo sfondo corrente della pagina. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Restituisce o specifica la trasformazione dei caratteri correnti. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Restituisce o specifica il creatore dell'output del dispositivo risultante. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Numero pagina corrente. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Specifica il carattere corrente. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indica se il dispositivo utilizza la modalità RGB diretta, ovvero RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indica se questa istanza della libreria Aspose.Page è concessa in licenza. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Restituisce o specifica l'opacità corrente. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Restituisce o specifica la maschera di opacità corrente. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Specifica o restituisce un flusso di output. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Restituisce o specifica il colore corrente. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Proprietà del dispositivo inclusi i metadati. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Opzioni per la gestione del processo di rendering. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Restituisce o specifica una dimensione della pagina. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Restituisce o specifica il tratto corrente. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Restituisce o specifica la modalità di rendering del testo corrente. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Restituisce o specifica la larghezza corrente del tratto di testo. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Rende necessaria la preparazione del dispositivo dopo che la pagina è stata renderizzata. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Crea una copia di questo dispositivo. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Elimina il contesto grafico. Se alla creazione restoreOnDispose era vero, verrà chiamato writeGraphicsRestore(). |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Disegna un percorso. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Disegna un arco. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Disegna un'immagine con trasformazione e sfondo assegnati. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Disegna un segmento di linea. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Disegna un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Disegna un poligono. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Disegna un poligono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Disegna una polilinea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Disegna una polilinea. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Disegna un rettangolo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Disegna un rettangolo rotondo. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Disegna una stringa in un dato punto. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Rende necessaria la preparazione del dispositivo dopo che il documento è stato reso. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Riempie un percorso. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Riempie un arco. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Riempie un ovale. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Riempie un poligono. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Riempie un poligono. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Riempie un rettangolo. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Riempie un rettangolo rotondo. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Ottiene un valore della proprietà stringa. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Ottiene un valore della proprietà color. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Ottiene un valore di proprietà double. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Ottiene un valore della proprietà Integer. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Ottiene un valore della proprietà margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Ottiene un valore della proprietà rettangolo. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Ottiene un valore della proprietà size. |
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Ottiene la trasformazione corrente. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Inizializza la clip del dispositivo. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Inizializza il numero di pagine da produrre. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Ottiene un valore di proprietà booleana. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Rende necessaria la preparazione del dispositivo prima del rendering della pagina. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Rende necessaria la preparazione del dispositivo prima di ogni rendering della pagina. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Ripristina il dispositivo allo stato iniziale per l'intero documento. Utilizzato per reimpostare il flusso di output. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Se verranno impostati i parametri del dispositivo della pagina, questo metodo consente di restituire il flusso di scrittura indietro all'inizio della pagina. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Ruota la trasformazione corrente sull'asse Z. Chiama writeTransform(Transform). La rotazione con un angolo positivo theta ruota i punti sull'asse x positivo verso l'asse y positivo. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Ruota la matrice di trasformazione corrente attorno a un punto. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Ridimensiona la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Specifica la clip del dispositivo. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Specifica la trasformazione corrente. Poiché la maggior parte dei formati di output non implementa questa funzionalità, la trasformazione inversa di currentTransform viene calcolata e moltiplicata per la trasformazione da impostare. Il risultato viene quindi inoltrato da una chiamata a writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Taglia la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Rende necessaria la preparazione del dispositivo prima di iniziare il rendering del documento. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Restituisce il nome del tipo di dispositivo. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Trasforma la matrice di trasformazione corrente. Chiama writeTransform(Transform) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Trasla la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Aggiorna i parametri della pagina da un altro dispositivo con più pagine. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | Scrive un commento. |

## Campi

| Nome | Descrizione |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | Valore della proprietà "Autore". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | Chiave di proprietà "Sfondo". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | Chiave di proprietà "Colore di sfondo". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | Chiave di proprietà "Comprimi". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | Chiave di proprietà "Incorpora carattere nel documento". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | Chiave di proprietà "Quale tipo di carattere viene utilizzato per l'incorporamento". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | Valore della proprietà "Emetti errori". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | Valore della proprietà "Emetti avvisi". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | Chiave di proprietà "Adatta contenuto alla pagina". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | Valore della proprietà "Parole chiave". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | Chiave della proprietà "Orientamento". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | Chiave di proprietà "Margini pagina". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | Chiave di proprietà "Dimensione pagina". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | Valore della proprietà "Soggetto". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | Valore della proprietà "Titolo". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | Chiave di proprietà "Trasparente". |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | Chiave di proprietà "Versione". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | Valore della proprietà "Versione di Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | Chiave di proprietà "Formato delle immagini". |

### Guarda anche

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* spazio dei nomi [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* assemblea [Aspose.Page](../../)


