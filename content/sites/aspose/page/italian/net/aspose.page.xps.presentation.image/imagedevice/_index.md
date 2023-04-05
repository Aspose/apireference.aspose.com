---
title: Class ImageDevice
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.Presentation.Image.ImageDevice classe. Classe che incapsula il dispositivo di composizione dellimmagine.
type: docs
weight: 350
url: /it/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Classe che incapsula il dispositivo di composizione dell'immagine.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Crea la nuova istanza. |
| [ImageDevice](imagedevice/#constructor_1)(Size) | Crea la nuova istanza con le dimensioni del supporto specificate. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | Ottiene/imposta il colore di sfondo. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Restituisce o specifica la trasformazione dei caratteri correnti. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Restituisce o specifica il creatore dell'output del dispositivo risultante. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | Restituisce il numero assoluto della pagina corrente all'interno del documento. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | Restituisce il numero relativo della pagina corrente all'interno della partizione corrente. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | Ottiene/imposta il font corrente. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indica se il dispositivo utilizza la modalità RGB diretta, ovvero RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indica se questa istanza della libreria Aspose.Page è concessa in licenza. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | Ottiene/imposta l'opacità. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | Ottiene/imposta il pennello per la maschera di opacità. La maschera si applica su Paint o Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | Ottiene/imposta il pennello per riempire i tracciati. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Proprietà del dispositivo inclusi i metadati. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | Restituisce gli array di byte delle immagini risultanti. La prima dimensione è per i documenti interni e la seconda è per le pagine all'interno dei documenti interni. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | Inizializza le opzioni di salvataggio. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | Ottiene/imposta le dimensioni del supporto del dispositivo. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | Ottiene/imposta il tratto per tracciare i percorsi. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Restituisce o specifica la modalità di rendering del testo corrente. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Restituisce o specifica la larghezza corrente del tratto di testo. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | Realizza la pagina. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | Completata la partizione del documento. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | Crea una nuova istanza del dispositivo basata su questa istanza del dispositivo. Scrive questo stato grafico del dispositivo, ovvero creaApsCanvas instance(s) con proprietà RenderTransform e Clip corrispondenti. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | Elimina questa istanza del dispositivo. Finalizza lo stato grafico di questa istanza del dispositivo, ovvero cambia il contesto di composizione APS inApsCanvas del livello più alto dello stato grafico di this dispositivoApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | Disegna il percorso specificato. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Disegna un arco. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Disegna un'immagine con trasformazione e sfondo assegnati. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Disegna un segmento di linea. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Disegna un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Disegna un poligono. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Disegna un poligono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Disegna una polilinea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Disegna una polilinea. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Disegna un rettangolo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Disegna un rettangolo rotondo. |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | Disegna una stringa nella posizione specificata. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | Realizza il documento. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | Riempie il percorso specificato. |
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
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | Restituisce la matrice di trasformazione corrente. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Inizializza la clip del dispositivo. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | Inizializza il numero di pagine da produrre. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Ottiene un valore di proprietà booleana. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | Inizia una nuova pagina con il titolo specificato. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | Inizia una nuova pagina con la larghezza e l'altezza specificate. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | Inizia una nuova partizione del documento. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | Imposta i dispositivi allo stato iniziale. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | Ripristina il dispositivo. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | Applica una rotazione oraria attorno all'origine alla matrice di trasformazione corrente. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Ruota la matrice di trasformazione corrente attorno a un punto. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | Applica il vettore di scala specificato alla matrice di trasformazione corrente. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | Aggiunge il percorso specificato al percorso della clip corrente. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | Imposta la matrice di trasformazione corrente. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | Applica il vettore di taglio specificato alla matrice di trasformazione corrente. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | Avvia il documento. |
| override [ToString](../../aspose.page/device/tostring/)() | Restituisce il nome del tipo di dispositivo. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | Moltiplica la matrice di trasformazione corrente per quella specificataMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | Applica il vettore di traslazione specificato alla matrice di trasformazione corrente. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | Aggiorna i parametri della pagina corrente. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Scrive un commento. |

### Guarda anche

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* spazio dei nomi [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* assemblea [Aspose.Page](../../)


