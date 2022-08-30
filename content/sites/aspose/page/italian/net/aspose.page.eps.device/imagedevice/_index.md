---
title: ImageDevice
second_title: Aspose.Page per riferimento all'API .NET
description: Questa classe incapsula il rendering del documento in immagine.
type: docs
weight: 40
url: /it/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Questa classe incapsula il rendering del documento in immagine.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | Inizializza la nuova istanza di[`ImageDevice`](../imagedevice) . |
| [ImageDevice](imagedevice#constructor_1)(ImageFormat) | Inizializza la nuova istanza di[`ImageDevice`](../imagedevice) con il formato immagine specificato. |
| [ImageDevice](imagedevice#constructor_2)(Size) | Inizializza la nuova istanza di[`ImageDevice`](../imagedevice) con la dimensione specificata di una pagina. |
| [ImageDevice](imagedevice#constructor_3)(Size, ImageFormat) | Inizializza la nuova istanza di[`ImageDevice`](../imagedevice)con la dimensione specificata di una pagina e il formato dell'immagine. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background) { get; set; } | Indica se il dispositivo utilizza la modalità RGB diretta, ovvero RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm) { get; set; } | Restituisce o specifica la trasformazione dei caratteri correnti. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator) { get; set; } | Restituisce o specifica il creatore dell'output del dispositivo risultante. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber) { get; } | Numero di pagina corrente. |
| override [Font](../../aspose.page.eps.device/imagedevice/font) { get; set; } | Restituisce o specifica il font corrente. |
| [Format](../../aspose.page.eps.device/imagedevice/format) { get; } | Formato immagine. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes) { get; } | Restituisce le immagini risultanti in byte, un array di byte per una pagina. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb) { get; } | Indica se il dispositivo utilizza la modalità RGB diretta, ovvero RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indica se questa istanza della libreria Aspose.Page è concessa in licenza. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity) { get; set; } | Restituisce o specifica lo sfondo corrente della pagina. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Restituisce o specifica la maschera di opacità corrente. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint) { get; set; } | Restituisce o specifica la vernice corrente. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Proprietà del dispositivo inclusi i metadati. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions) { set; } | Opzioni per la gestione del processo di rendering. |
| override [Size](../../aspose.page.eps.device/imagedevice/size) { get; set; } | Restituisce o specifica una dimensione della pagina. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke) { get; set; } | Restituisce o specifica il tratto corrente. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode) { get; set; } | Restituisce o specifica la modalità di rendering del testo corrente. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth) { get; set; } | Restituisce o specifica la larghezza del tratto del testo corrente. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage)() | Effettua la preparazione necessaria del dispositivo dopo il rendering della pagina. |
| override [Create](../../aspose.page.eps.device/imagedevice/create)() | Crea una copia di questo dispositivo. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose)() | Elimina il dispositivo. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw)(GraphicsPath) | Disegna un percorso. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Disegna un arco. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage)(Bitmap, Matrix, Color) | Disegna un'immagine con trasformazione e sfondo assegnati. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Disegna un segmento di linea. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Disegna un ovale. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Disegna un poligone. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Disegna un poligono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Disegna una polilinea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Disegna una polilinea. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Disegna un rettangolo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Disegna un rettangolo rotondo. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring)(string, double, double) | Disegna una stringa in un determinato punto. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument)() | Rende necessaria la preparazione del dispositivo dopo il rendering del documento. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill)(GraphicsPath) | Riempie un percorso. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Riempie un arco. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Riempie un ovale. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Riempie un poligono. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Riempie un poligono. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Riempie un rettangolo. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Riempie un rettangolo rotondo. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty#getproperty)(string) | Ottiene un valore della proprietà della stringa. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor#getpropertycolor)(string) | Ottiene un valore della proprietà color. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble#getpropertydouble)(string) | Ottiene un valore di doppia proprietà. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint#getpropertyint)(string) | Ottiene un valore di proprietà intera. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins#getpropertymargins)(string) | Ottiene un valore della proprietà margini. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle#getpropertyrectangle)(string) | Ottiene un valore della proprietà rettangolo. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize#getpropertysize)(string) | Ottiene un valore della proprietà size. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform)() | Ottiene la trasformazione corrente. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip)() | Inizializza una clip del dispositivo. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers)() | Inizializza il numero di pagine da stampare. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty#isproperty)(string) | Ottiene un valore della proprietà booleana. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage_1)(string) | Effettua la preparazione necessaria del dispositivo prima del rendering della pagina. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage)(float, float) | Effettua la necessaria preparazione del dispositivo prima di ogni rendering di pagina. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew)() | Reimposta il dispositivo allo stato iniziale per l'intero documento. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset)() | Reimposta il dispositivo allo stato iniziale per una pagina. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate#rotate)(double) | Ruota la matrice di trasformazione corrente sull'asse Z. Chiama writeTransform(Transform). Ruotando con un angolo positivo theta ruota i punti sull'asse x positivo verso l'asse y positivo. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Ruota la matrice di trasformazione corrente attorno a un punto. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale)(double, double) | Ridimensiona la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip)(GraphicsPath) | Forma clip. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform)(Matrix) | Specifica la trasformazione corrente. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear)(double, double) | Taglia la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument)() | Rende necessaria la preparazione del dispositivo prima di iniziare il rendering del documento. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring)() | Restituisce il nome del tipo di dispositivo. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform)(Matrix) | Trasforma la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate)(double, double) | Traduce la matrice di trasformazione corrente. Chiama writeTransform(Transform). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters)(IMultiPageDevice) | Aggiorna i parametri della pagina da un altro dispositivo a più pagine. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment)(string) | Scrive un commento. |

## Campi

| Nome | Descrizione |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background) | Chiave proprietà "Sfondo". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color) | Chiave di proprietà "Colore di sfondo". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts) | Chiave di proprietà "Incorpora carattere nel documento". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors) | Valore della proprietà "Emetti errori". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings) | Valore della proprietà "Emetti avvisi". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page) | Chiave proprietà "Adatta contenuto alla pagina". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation) | Chiave proprietà "Orientamento". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins) | Chiave proprietà "Margini pagina". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size) | Chiave proprietà "Dimensioni pagina". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer) | Valore della proprietà "Produttore". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent) | Chiave proprietà "Trasparente". |

### Guarda anche

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* spazio dei nomi [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* assemblea [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
