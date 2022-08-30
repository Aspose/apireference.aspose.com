---
title: PdfDevice
second_title: Aspose.Page per riferimento all'API .NET
description: Dispositivo per la composizione di immagini incapsulanti di classe.
type: docs
weight: 340
url: /it/net/aspose.page.xps.presentation.pdf/pdfdevice/
---
## PdfDevice class

Dispositivo per la composizione di immagini incapsulanti di classe.

```csharp
public class PdfDevice : Device, IMultiPageDevice
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PdfDevice](pdfdevice#constructor)(Stream) | Crea la nuova istanza. |
| [PdfDevice](pdfdevice#constructor_1)(Stream, Size) | Crea la nuova istanza con la dimensione del supporto specificata. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.pdf/pdfdevice/background) { get; set; } | Ottiene/imposta il colore di sfondo. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Restituisce o specifica la trasformazione dei caratteri correnti. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Restituisce o specifica il creatore dell'output del dispositivo risultante. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentpagenumber) { get; } | Restituisce il numero assoluto della pagina corrente all'interno del documento. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.pdf/pdfdevice/currentrelativepagenumber) { get; } | Restituisce il numero della pagina corrente all'interno della partizione corrente. |
| override [Font](../../aspose.page.xps.presentation.pdf/pdfdevice/font) { get; set; } | Ottiene/imposta il carattere corrente. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Indica se il dispositivo utilizza la modalità RGB diretta, ovvero RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indica se questa istanza della libreria Aspose.Page è concessa in licenza. |
| override [Opacity](../../aspose.page.xps.presentation.pdf/pdfdevice/opacity) { get; set; } | Ottiene/imposta l'opacità. |
| override [OpacityMask](../../aspose.page.xps.presentation.pdf/pdfdevice/opacitymask) { get; set; } | Ottiene/imposta il pennello per la maschera di opacità. La maschera si applica su Paint o Strike. |
| override [Paint](../../aspose.page.xps.presentation.pdf/pdfdevice/paint) { get; set; } | Ottiene/imposta il pennello per riempire i percorsi. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Proprietà del dispositivo inclusi i metadati. |
| override [SaveOptions](../../aspose.page.xps.presentation.pdf/pdfdevice/saveoptions) { set; } | Inizializza le opzioni di salvataggio. |
| override [Size](../../aspose.page.xps.presentation.pdf/pdfdevice/size) { get; set; } | Ottiene/imposta la dimensione del supporto del dispositivo. |
| override [Stroke](../../aspose.page.xps.presentation.pdf/pdfdevice/stroke) { get; set; } | Ottiene/imposta il tratto per disegnare percorsi. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Restituisce o specifica la modalità di rendering del testo corrente. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Restituisce o specifica la larghezza del tratto del testo corrente. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline)(int, string) | Aggiunge un elemento di struttura con l'ultimo oggetto come destinazione. |
| virtual [AddOutline](../../aspose.page.xps.presentation.pdf/pdfdevice/addoutline#addoutline_1)(PointF, int, string) | Aggiunge un elemento del profilo con il punto di origine come destinazione. |
| virtual [ClosePage](../../aspose.page.xps.presentation.pdf/pdfdevice/closepage)() | Completa la pagina. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.pdf/pdfdevice/closepartition)() | Completata la partizione del documento. |
| override [Create](../../aspose.page.xps.presentation.pdf/pdfdevice/create)() | Crea una nuova istanza del dispositivo in base a questa istanza del dispositivo. Scrive lo stato grafico di questo dispositivo, ovvero creaApsCanvas istanze con le proprietà RenderTransform e Clip corrispondenti. |
| override [Dispose](../../aspose.page.xps.presentation.pdf/pdfdevice/dispose)() | Elimina questa istanza del dispositivo. Finalizza questo stato grafico dell'istanza del dispositivo, , ovvero cambia il contesto di composizione APS inApsCanvas del livello superiore allo stato grafico di questo dispositivoApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.pdf/pdfdevice/draw)(GraphicsPath) | Disegna il percorso specificato. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Disegna un arco. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Disegna un'immagine con trasformazione e sfondo assegnati. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Disegna un segmento di linea. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Disegna un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Disegna un poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Disegna un poligono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Disegna una polilinea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Disegna una polilinea. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Disegna un rettangolo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Disegna un rettangolo rotondo. |
| override [DrawString](../../aspose.page.xps.presentation.pdf/pdfdevice/drawstring)(string, double, double) | Disegna una stringa nella posizione specificata. |
| override [EndDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/enddocument)() | Completa il documento. |
| override [Fill](../../aspose.page.xps.presentation.pdf/pdfdevice/fill)(GraphicsPath) | Riempie il percorso specificato. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Riempie un arco. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Riempie un ovale. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Riempie un poligono. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Riempie un poligono. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Riempie un rettangolo. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Riempie un rettangolo rotondo. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Ottiene un valore della proprietà della stringa. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Ottiene un valore della proprietà color. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Ottiene un valore di doppia proprietà. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Ottiene un valore di proprietà intera. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Ottiene un valore della proprietà margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Ottiene un valore della proprietà rettangolo. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Ottiene un valore della proprietà size. |
| override [GetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/gettransform)() | Restituisce la matrice di trasformazione corrente. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Inizializza la clip del dispositivo. |
| [InitPageNumbers](../../aspose.page.xps.presentation.pdf/pdfdevice/initpagenumbers)() | Inizializza il numero di pagine da stampare. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Ottiene un valore della proprietà booleana. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage_1)(string) | Inizia una nuova pagina con il titolo specificato. |
| virtual [OpenPage](../../aspose.page.xps.presentation.pdf/pdfdevice/openpage#openpage)(float, float) | Inizia una nuova pagina con la larghezza e l'altezza specificate. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.pdf/pdfdevice/openpartition)() | Avvia una nuova partizione del documento. |
| override [ReNew](../../aspose.page.xps.presentation.pdf/pdfdevice/renew)() | Imposta i dispositivi allo stato iniziale. |
| override [Reset](../../aspose.page.xps.presentation.pdf/pdfdevice/reset)() | Ripristina il dispositivo. |
| override [Rotate](../../aspose.page.xps.presentation.pdf/pdfdevice/rotate#rotate)(double) | Applica una rotazione in senso orario attorno all'origine alla matrice di trasformazione corrente. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Ruota la matrice di trasformazione corrente attorno a un punto. |
| override [Scale](../../aspose.page.xps.presentation.pdf/pdfdevice/scale)(double, double) | Applica il vettore di scala specificato alla matrice di trasformazione corrente. |
| override [SetClip](../../aspose.page.xps.presentation.pdf/pdfdevice/setclip)(GraphicsPath) | Aggiunge il percorso specificato al percorso della clip corrente. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget)(int) | Imposta il collegamento ipertestuale con un numero di pagina come destinazione. |
| virtual [SetHyperlinkTarget](../../aspose.page.xps.presentation.pdf/pdfdevice/sethyperlinktarget#sethyperlinktarget_1)(string) | Imposta il collegamento ipertestuale con un URI esterno come destinazione. |
| override [SetTransform](../../aspose.page.xps.presentation.pdf/pdfdevice/settransform)(Matrix) | Imposta la matrice di trasformazione corrente. |
| override [Shear](../../aspose.page.xps.presentation.pdf/pdfdevice/shear)(double, double) | Applica il vettore di taglio specificato alla matrice di trasformazione corrente. |
| override [StartDocument](../../aspose.page.xps.presentation.pdf/pdfdevice/startdocument)() | Avvia il documento. |
| override [ToString](../../aspose.page/device/tostring)() | Restituisce il nome del tipo di dispositivo. |
| override [Transform](../../aspose.page.xps.presentation.pdf/pdfdevice/transform)(Matrix) | Moltiplica la matrice di trasformazione corrente per il valore specificatoMatrix . |
| override [Translate](../../aspose.page.xps.presentation.pdf/pdfdevice/translate)(double, double) | Applica il vettore di traslazione specificato alla matrice di trasformazione corrente. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.pdf/pdfdevice/updatepageparameters)(IMultiPageDevice) | Aggiorna i parametri della pagina corrente. |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | Scrive un commento. |

### Guarda anche

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* spazio dei nomi [Aspose.Page.XPS.Presentation.Pdf](../../aspose.page.xps.presentation.pdf)
* assemblea [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
