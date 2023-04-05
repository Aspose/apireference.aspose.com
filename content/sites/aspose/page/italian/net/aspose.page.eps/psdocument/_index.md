---
title: Class PsDocument
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.EPS.PsDocument classe. Questa classe incapsula i documenti PS/EPS.
type: docs
weight: 140
url: /it/net/aspose.page.eps/psdocument/
---
## PsDocument class

Questa classe incapsula i documenti PS/EPS.

```csharp
public sealed class PsDocument : Document
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Inizializza`PsDocument` con un flusso di file PS/EPS. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Inizializza vuoto`PsDocument` con pagina inizializzata. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Inizializza vuoto`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Inizializza vuoto`PsDocument` quando il numero di pagine del documento Postscript è noto in anticipo. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Restituisce il numero di pagine nel documento PDF risultante. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Aggiunge clip allo stato grafico corrente. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Aggiunge una clip allo stato grafico corrente e quindi scrive l'operatore "newpath". È necessario eseguire l'escape della confluenza di questo tracciato di ritaglio e di alcuni tracciati successivi come i glifi delineati con l'operatore "charpath". |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Aggiunge un rettangolo di ritaglio allo stato grafico corrente. |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Completa la pagina corrente. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Disegna un percorso arbitrario. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Disegna un'immagine mascherata. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Disegna immagine. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Disegna un'immagine trasformata con sfondo. |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Riempi un percorso arbitrario. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, Font, float, float, Brush, Brush, Pen) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, float[], Font, float, float, Brush, Brush, Pen) | Aggiunge una stringa di testo riempiendo l'interno dei glifi e disegnando i contorni dei glifi. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, Font, float, float) | Aggiunge una stringa di testo riempiendo l'interno di glifi. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, float[], Font, float, float) | Aggiunge una stringa di testo riempiendo l'interno di glifi. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Ottiene il disegno dello stato grafico corrente. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Ottiene il tratto dello stato grafico corrente. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Legge il file PS/EPS ed estrae XmpMetdata se esiste già o ne aggiunge uno nuovo se non esiste. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Unisce i file PS/EPS a un dispositivo. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/)(float, float) | Crea una nuova pagina e la rende attuale. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, Font, float, float) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, float[], Font, float, float) | Aggiunge una stringa di testo disegnando i contorni dei glifi. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/)(float) | Aggiunge la rotazione allo stato grafico corrente (ruota matrice corrente). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Salvataggi dati`PsDocument` come file EPS. Questo metodo viene utilizzato solo quando PsDocument è stato creato da zero. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Salvataggi dati`PsDocument` come file EPS. Questo metodo viene utilizzato solo dopo l'aggiornamento dei metadati XMP. Salva il file EPS iniziale con i metadati esistenti aggiornati o uno nuovo creato durante la chiamata al metodo GetMetadata. Nell'ultimo caso vengono aggiunti tutti i codici PostScript e i commenti EPS necessari. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Salva il file PS/EPS su un dispositivo. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Aggiunge scala allo stato grafico corrente (scala matrice corrente). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Imposta i parametri del dispositivo della pagina (vedere la specifica PostScript dell'operatore "setpagedevice"). Tra questi possono esserci dimensione e colore della pagina, ecc. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Imposta le dimensioni della pagina. Per creare pagine con dimensioni diverse in un unico documento utilizzare[`SetPageDevice`](./setpagedevice/) metodo subito dopo questo metodo. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Imposta il disegno nello stato grafico corrente. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Imposta il tratto nello stato grafico corrente. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Aggiunge la trasformazione di taglio allo stato grafico corrente (matrice corrente di taglio). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Aggiunge la trasformazione allo stato grafico corrente (concatena questa matrice con quella corrente). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Aggiunge la traduzione allo stato grafico corrente (traduce la matrice corrente). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Scrive il ripristino dello stato grafico corrente (Vedi specifica PostScript sull'operatore "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Scrive il salvataggio dello stato grafico corrente (Vedi specifica PostScript sull'operatore "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Salva l'oggetto Bitmap nel flusso di output EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Salva l'oggetto Bitmap in un file EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Salva l'immagine PNG/JPEG/TIFF/BMP/GIF/EMF dal flusso di input al flusso di output EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Salva l'immagine PNG/JPEG/TIFF/BMP/GIF/EMF dal file al file EPS. |

### Guarda anche

* class [Document](../../aspose.page/document/)
* spazio dei nomi [Aspose.Page.EPS](../../aspose.page.eps/)
* assemblea [Aspose.Page](../../)


