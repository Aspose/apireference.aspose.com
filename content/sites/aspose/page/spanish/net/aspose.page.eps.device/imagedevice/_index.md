---
title: ImageDevice
second_title: Referencia de la API de Aspose.Page para .NET
description: Esta clase encapsula la representación del documento en imagen.
type: docs
weight: 40
url: /es/net/aspose.page.eps.device/imagedevice/
---
## ImageDevice class

Esta clase encapsula la representación del documento en imagen.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [ImageDevice](imagedevice#constructor)() | Inicializa una nueva instancia de[`ImageDevice`](../imagedevice) . |
| [ImageDevice](imagedevice#constructor_1)(ImageFormat) | Inicializa una nueva instancia de[`ImageDevice`](../imagedevice) con formato de imagen especificado. |
| [ImageDevice](imagedevice#constructor_2)(Size) | Inicializa una nueva instancia de[`ImageDevice`](../imagedevice) con el tamaño especificado de una página. |
| [ImageDevice](imagedevice#constructor_3)(Size, ImageFormat) | Inicializa una nueva instancia de[`ImageDevice`](../imagedevice)con el tamaño especificado de una página y formato de imagen. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [Background](../../aspose.page.eps.device/imagedevice/background) { get; set; } | Indica si el dispositivo utiliza el modo RGB directo, es decir, RGB. |
| override [CharTM](../../aspose.page.eps.device/imagedevice/chartm) { get; set; } | Devuelve o especifica los caracteres actuales transform. |
| [Creator](../../aspose.page.eps.device/imagedevice/creator) { get; set; } | Devuelve o especifica el creador de la salida del dispositivo resultante. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/imagedevice/currentpagenumber) { get; } | Número de página actual. |
| override [Font](../../aspose.page.eps.device/imagedevice/font) { get; set; } | Devuelve o especifica la fuente actual. |
| [Format](../../aspose.page.eps.device/imagedevice/format) { get; } | Formato de imagen. |
| [ImagesBytes](../../aspose.page.eps.device/imagedevice/imagesbytes) { get; } | Devuelve las imágenes resultantes en bytes, una matriz de bytes para una página. |
| override [IsDirectRGB](../../aspose.page.eps.device/imagedevice/isdirectrgb) { get; } | Indica si el dispositivo utiliza el modo RGB directo, es decir, RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indica si esta instancia de la biblioteca Aspose.Page tiene licencia. |
| override [Opacity](../../aspose.page.eps.device/imagedevice/opacity) { get; set; } | Devuelve o especifica el fondo actual de la página. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Devuelve o especifica la máscara de opacidad actual. |
| override [Paint](../../aspose.page.eps.device/imagedevice/paint) { get; set; } | Devuelve o especifica la pintura actual. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Propiedades del dispositivo, incluidos los metadatos. |
| override [SaveOptions](../../aspose.page.eps.device/imagedevice/saveoptions) { set; } | Opciones para gestionar el proceso de renderizado. |
| override [Size](../../aspose.page.eps.device/imagedevice/size) { get; set; } | Devuelve o especifica un tamaño de página. |
| override [Stroke](../../aspose.page.eps.device/imagedevice/stroke) { get; set; } | Devuelve o especifica el trazo actual. |
| override [TextRenderingMode](../../aspose.page.eps.device/imagedevice/textrenderingmode) { get; set; } | Devuelve o especifica el modo de representación de texto actual. |
| override [TextStrokeWidth](../../aspose.page.eps.device/imagedevice/textstrokewidth) { get; set; } | Devuelve o especifica el ancho del trazo de texto actual. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/imagedevice/closepage)() | Realiza la preparación necesaria del dispositivo después de que se haya renderizado la página. |
| override [Create](../../aspose.page.eps.device/imagedevice/create)() | Crea una copia de este dispositivo. |
| override [Dispose](../../aspose.page.eps.device/imagedevice/dispose)() | Elimina el dispositivo. |
| override [Draw](../../aspose.page.eps.device/imagedevice/draw)(GraphicsPath) | Dibuja un camino. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Dibuja un arco. |
| override [DrawImage](../../aspose.page.eps.device/imagedevice/drawimage)(Bitmap, Matrix, Color) | Dibuja una imagen con transformación y fondo asignados. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Dibuja un segmento de recta. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Dibuja un óvalo. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(double[], double[], int) | Dibuja un polígono. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon)(int[], int[], int) | Dibuja un polígono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(double[], double[], int) | Dibuja una polilínea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline)(int[], int[], int) | Dibuja una polilínea. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Dibuja un rectángulo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Dibuja un rectángulo redondo. |
| override [DrawString](../../aspose.page.eps.device/imagedevice/drawstring)(string, double, double) | Dibuja una cadena en el punto dado. |
| override [EndDocument](../../aspose.page.eps.device/imagedevice/enddocument)() | Realiza la preparación necesaria del dispositivo después de que se haya procesado el documento. |
| override [Fill](../../aspose.page.eps.device/imagedevice/fill)(GraphicsPath) | Rellena un camino. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Rellena un arco. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Rellena un óvalo. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(double[], double[], int) | Rellena un polígono. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon)(int[], int[], int) | Rellena un polígono. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Rellena un rectángulo. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Rellena un rectángulo redondo. |
| [GetProperty](../../aspose.page.eps.device/imagedevice/getproperty#getproperty)(string) | Obtiene un valor de propiedad de cadena. (2 methods) |
| [GetPropertyColor](../../aspose.page.eps.device/imagedevice/getpropertycolor#getpropertycolor)(string) | Obtiene un valor de propiedad de color. (2 methods) |
| [GetPropertyDouble](../../aspose.page.eps.device/imagedevice/getpropertydouble#getpropertydouble)(string) | Obtiene un valor de doble propiedad. (2 methods) |
| [GetPropertyInt](../../aspose.page.eps.device/imagedevice/getpropertyint#getpropertyint)(string) | Obtiene un valor de propiedad entera. (2 methods) |
| [GetPropertyMargins](../../aspose.page.eps.device/imagedevice/getpropertymargins#getpropertymargins)(string) | Obtiene un valor de la propiedad margins. (2 methods) |
| [GetPropertyRectangle](../../aspose.page.eps.device/imagedevice/getpropertyrectangle#getpropertyrectangle)(string) | Obtiene un valor de la propiedad del rectángulo. (2 methods) |
| [GetPropertySize](../../aspose.page.eps.device/imagedevice/getpropertysize#getpropertysize)(string) | Obtiene un valor de la propiedad size. (2 methods) |
| override [GetTransform](../../aspose.page.eps.device/imagedevice/gettransform)() | Obtiene la transformada actual. |
| override [InitClip](../../aspose.page.eps.device/imagedevice/initclip)() | Inicializa un clip del dispositivo. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/imagedevice/initpagenumbers)() | Inicializa el número de páginas a imprimir. |
| [IsProperty](../../aspose.page.eps.device/imagedevice/isproperty#isproperty)(string) | Obtiene un valor de propiedad booleana. (2 methods) |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage_1)(string) | Hace la preparación necesaria del dispositivo antes de renderizar la página. |
| virtual [OpenPage](../../aspose.page.eps.device/imagedevice/openpage#openpage)(float, float) | Realiza la preparación necesaria del dispositivo antes de cada renderizado de página. |
| override [ReNew](../../aspose.page.eps.device/imagedevice/renew)() | Restablece el dispositivo al estado inicial para todo el documento. |
| override [Reset](../../aspose.page.eps.device/imagedevice/reset)() | Restablece el dispositivo al estado inicial para una página. |
| override [Rotate](../../aspose.page.eps.device/imagedevice/rotate#rotate)(double) | Gira la matriz de transformación actual sobre el eje Z. Llama a writeTransform(Transform). Girar con un ángulo positivo theta gira puntos en el eje x positivo hacia el eje y positivo. |
| virtual [Rotate](../../aspose.page/device/rotate)(double, double, double) | Gira la matriz de transformación actual alrededor de un punto. |
| override [Scale](../../aspose.page.eps.device/imagedevice/scale)(double, double) | Escala la matriz de transformación actual. Llama a writeTransform(Transformar). |
| override [SetClip](../../aspose.page.eps.device/imagedevice/setclip)(GraphicsPath) | Forma de clips. |
| override [SetTransform](../../aspose.page.eps.device/imagedevice/settransform)(Matrix) | Especifica la transformación actual. |
| override [Shear](../../aspose.page.eps.device/imagedevice/shear)(double, double) | Corta la matriz de transformación actual. Llama a writeTransform(Transformar). |
| override [StartDocument](../../aspose.page.eps.device/imagedevice/startdocument)() | Hace la preparación necesaria del dispositivo antes de comenzar a renderizar el documento. |
| override [ToString](../../aspose.page.eps.device/imagedevice/tostring)() | Devuelve el nombre del tipo de dispositivo. |
| override [Transform](../../aspose.page.eps.device/imagedevice/transform)(Matrix) | Transforma la matriz de transformación actual. Llama a writeTransform(Transformar). |
| override [Translate](../../aspose.page.eps.device/imagedevice/translate)(double, double) | Traduce la matriz de transformación actual. Llama a writeTransform(Transformar). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/imagedevice/updatepageparameters)(IMultiPageDevice) | Actualiza los parámetros de la página desde otro dispositivo de varias páginas. |
| override [WriteComment](../../aspose.page.eps.device/imagedevice/writecomment)(string) | Escribe un comentario. |

## Campos

| Nombre | Descripción |
| --- | --- |
| static readonly [BACKGROUND](../../aspose.page.eps.device/imagedevice/background) | Clave de propiedad "Fondo". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/imagedevice/background_color) | Clave de propiedad "Color de fondo". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/imagedevice/embed_fonts) | Clave de propiedad "Incrustar fuente en el documento". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/imagedevice/emit_errors) | Valor de la propiedad "Emitir errores". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/imagedevice/emit_warnings) | Valor de la propiedad "Emitir advertencias". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/imagedevice/fit_to_page) | Clave de propiedad "Ajustar contenido a la página". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/imagedevice/orientation) | Clave de propiedad "Orientación". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/imagedevice/page_margins) | Clave de propiedad "Márgenes de página". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/imagedevice/page_size) | Clave de propiedad "Tamaño de página". |
| static readonly [PRODUCER](../../aspose.page.eps.device/imagedevice/producer) | Valor de la propiedad "Productor". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/imagedevice/transparent) | Clave de propiedad "transparente". |

### Ver también

* class [Device](../../aspose.page/device)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice)
* espacio de nombres [Aspose.Page.EPS.Device](../../aspose.page.eps.device)
* asamblea [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
