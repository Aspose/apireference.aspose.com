---
title: Class Device
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.Device classe. Questa classe incapsula il rendering del documento in un dispositivo astratto. Il rendering del documento viene eseguito pagina per pagina.
type: docs
weight: 20
url: /it/net/aspose.page/device/
---
## Device class

Questa classe incapsula il rendering del documento in un dispositivo astratto. Il rendering del documento viene eseguito pagina per pagina.

```csharp
public abstract class Device
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Device](device/)(Size) | Inizializza`Device` con una dimensione di una pagina. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Restituisce o specifica lo sfondo corrente della pagina. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Restituisce o specifica la trasformazione dei caratteri correnti. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Restituisce o specifica il creatore dell'output del dispositivo risultante. |
| virtual [Font](../../aspose.page/device/font/) { get; set; } | Restituisce o specifica il font corrente. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indica se il dispositivo utilizza la modalità RGB diretta, ovvero RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indica se questa istanza della libreria Aspose.Page è concessa in licenza. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Restituisce o specifica l'opacità corrente. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Restituisce o specifica la maschera di opacità corrente. |
| virtual [Paint](../../aspose.page/device/paint/) { get; set; } | Restituisce o specifica il colore corrente. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Proprietà del dispositivo inclusi i metadati. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Opzioni per la gestione del processo di rendering. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Restituisce o specifica una dimensione della pagina. |
| virtual [Stroke](../../aspose.page/device/stroke/) { get; set; } | Restituisce o specifica il tratto corrente. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Restituisce o specifica la modalità di rendering del testo corrente. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Restituisce o specifica la larghezza corrente del tratto di testo. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [Create](../../aspose.page/device/create/)() | Crea una copia di questo dispositivo. |
| virtual [Dispose](../../aspose.page/device/dispose/)() | Smaltisce il dispositivo. |
| virtual [Draw](../../aspose.page/device/draw/)(GraphicsPath) | Disegna un percorso. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Disegna un arco. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Disegna un'immagine con trasformazione e sfondo assegnati. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Disegna un segmento di linea. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Disegna un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon)(double[], double[], int) | Disegna un poligono. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/#drawpolygon_1)(int[], int[], int) | Disegna un poligono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline)(double[], double[], int) | Disegna una polilinea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/#drawpolyline_1)(int[], int[], int) | Disegna una polilinea. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Disegna un rettangolo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Disegna un rettangolo rotondo. |
| virtual [DrawString](../../aspose.page/device/drawstring/)(string, double, double) | Disegna una stringa in un dato punto. |
| virtual [EndDocument](../../aspose.page/device/enddocument/)() | Rende necessaria la preparazione del dispositivo dopo che il documento è stato reso. |
| virtual [Fill](../../aspose.page/device/fill/)(GraphicsPath) | Riempie un percorso. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Riempie un arco. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Riempie un ovale. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon)(double[], double[], int) | Riempie un poligono. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/#fillpolygon_1)(int[], int[], int) | Riempie un poligono. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Riempie un rettangolo. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Riempie un rettangolo rotondo. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Ottiene un valore della proprietà stringa. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Ottiene un valore della proprietà color. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Ottiene un valore di proprietà double. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Ottiene un valore della proprietà Integer. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Ottiene un valore della proprietà margin. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Ottiene un valore della proprietà rettangolo. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Ottiene un valore della proprietà size. |
| virtual [GetTransform](../../aspose.page/device/gettransform/)() | Ottiene la trasformazione corrente. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Inizializza la clip del dispositivo. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Ottiene un valore di proprietà booleana. |
| virtual [ReNew](../../aspose.page/device/renew/)() | Ripristina il dispositivo allo stato iniziale per l'intero documento. Utilizzato per reimpostare il flusso di output. |
| virtual [Reset](../../aspose.page/device/reset/)() | Ripristina il dispositivo allo stato iniziale per una pagina. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate)(double) | Ruota la matrice di trasformazione corrente. Chiama writeTransform(Transform). La rotazione con un angolo positivo theta ruota i punti sull'asse x positivo verso l'asse y positivo. |
| virtual [Rotate](../../aspose.page/device/rotate/#rotate_1)(double, double, double) | Ruota la matrice di trasformazione corrente attorno a un punto. |
| virtual [Scale](../../aspose.page/device/scale/)(double, double) | Ridimensiona la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| virtual [SetClip](../../aspose.page/device/setclip/)(GraphicsPath) | Specifica la clip del dispositivo. |
| virtual [SetTransform](../../aspose.page/device/settransform/)(Matrix) | Specifica la trasformazione corrente. |
| virtual [Shear](../../aspose.page/device/shear/)(double, double) | Taglia la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| virtual [StartDocument](../../aspose.page/device/startdocument/)() | Rende necessaria la preparazione del dispositivo prima di iniziare il rendering del documento. |
| override [ToString](../../aspose.page/device/tostring/)() | Restituisce il nome del tipo di dispositivo. |
| virtual [Transform](../../aspose.page/device/transform/)(Matrix) | Trasforma la matrice di trasformazione corrente. Chiama writeTransform(Transform) |
| virtual [Translate](../../aspose.page/device/translate/)(double, double) | Trasla la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Scrive un commento. |

## Campi

| Nome | Descrizione |
| --- | --- |
| static [VERSION](../../aspose.page/device/version/) | Versione corrente del dispositivo. |

### Guarda anche

* spazio dei nomi [Aspose.Page](../../aspose.page/)
* assemblea [Aspose.Page](../../)


