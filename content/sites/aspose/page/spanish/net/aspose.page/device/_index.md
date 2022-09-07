---
title: Device
second_title: Referencia de la API de Aspose.Page para .NET
description: Esta clase encapsula la representación del documento en un dispositivo abstracto. La representación del documento se realiza página por página.
type: docs
weight: 20
url: /es/net/aspose.page/device/
---
## Device class

Esta clase encapsula la representación del documento en un dispositivo abstracto. La representación del documento se realiza página por página.

```csharp
public abstract class Device
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Device](device)(Size) | Inicializa[`Device`](../device) con un tamaño de una página. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [Background](../../aspose.page/device/background) { get; set; } | Devuelve o especifica el fondo actual de la página. |
| virtual [CharTM](../../aspose.page/device/chartm) { get; set; } | Devuelve o especifica los caracteres actuales transform. |
| [Creator](../../aspose.page/device/creator) { get; set; } | Devuelve o especifica el creador de la salida del dispositivo resultante. |
| virtual [Font](../../aspose.page/device/font) { get; set; } | Devuelve o especifica la fuente actual. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb) { get; } | Indica si el dispositivo utiliza el modo RGB directo, es decir, RGB. |
| [IsLicensed](../../aspose.page/device/islicensed) { get; } | Indica si esta instancia de la biblioteca Aspose.Page tiene licencia. |
| virtual [Opacity](../../aspose.page/device/opacity) { get; set; } | Devuelve o especifica la opacidad actual. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask) { get; set; } | Devuelve o especifica la máscara de opacidad actual. |
| virtual [Paint](../../aspose.page/device/paint) { get; set; } | Devuelve o especifica la pintura actual. |
| [Properties](../../aspose.page/device/properties) { get; set; } | Propiedades del dispositivo, incluidos los metadatos. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions) { set; } | Opciones para gestionar el proceso de renderizado. |
| virtual [Size](../../aspose.page/device/size) { get; set; } | Devuelve o especifica un tamaño de página. |
| virtual [Stroke](../../aspose.page/device/stroke) { get; set; } | Devuelve o especifica el trazo actual. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode) { get; set; } | Devuelve o especifica el modo de representación de texto actual. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth) { get; set; } | Devuelve o especifica el ancho del trazo de texto actual. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| virtual [Create](../../aspose.page/device/create)() | Crea una copia de este dispositivo. |
| virtual [Dispose](../../aspose.page/device/dispose)() | Elimina el dispositivo. |
| virtual [Draw](../../aspose.page/device/draw)(GraphicsPath) | Dibuja un camino. |
| virtual [DrawArc](../../aspose.page/device/drawarc)(double, double, double, double, double, double) | Dibuja un arco. |
| virtual [DrawImage](../../aspose.page/device/drawimage)(Bitmap, Matrix, Color) | Dibuja una imagen con transformación y fondo asignados. |
| virtual [DrawLine](../../aspose.page/device/drawline)(double, double, double, double) | Dibuja un segmento de recta. |
| virtual [DrawOval](../../aspose.page/device/drawoval)(double, double, double, double) | Dibuja un óvalo. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon)(double[], double[], int) | Dibuja un polígono. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon#drawpolygon_1)(int[], int[], int) | Dibuja un polígono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline)(double[], double[], int) | Dibuja una polilínea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline#drawpolyline_1)(int[], int[], int) | Dibuja una polilínea. |
| virtual [DrawRect](../../aspose.page/device/drawrect)(double, double, double, double) | Dibuja un rectángulo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect)(double, double, double, double, double, double) | Dibuja un rectángulo redondo. |
| virtual [DrawString](../../aspose.page/device/drawstring)(string, double, double) | Dibuja una cadena en el punto dado. |
| virtual [EndDocument](../../aspose.page/device/enddocument)() | Realiza la preparación necesaria del dispositivo después de que se haya procesado el documento. |
| virtual [Fill](../../aspose.page/device/fill)(GraphicsPath) | Rellena un camino. |
| virtual [FillArc](../../aspose.page/device/fillarc)(double, double, double, double, double, double) | Rellena un arco. |
| virtual [FillOval](../../aspose.page/device/filloval)(double, double, double, double) | Rellena un óvalo. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon)(double[], double[], int) | Rellena un polígono. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon#fillpolygon_1)(int[], int[], int) | Rellena un polígono. |
| virtual [FillRect](../../aspose.page/device/fillrect)(double, double, double, double) | Rellena un rectángulo. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect)(double, double, double, double, double, double) | Rellena un rectángulo redondo. |
| [GetProperty](../../aspose.page/device/getproperty)(string) | Obtiene un valor de propiedad de cadena. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor)(string) | Obtiene un valor de propiedad de color. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble)(string) | Obtiene un valor de doble propiedad. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint)(string) | Obtiene un valor de propiedad entera. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins)(string) | Obtiene un valor de propiedad de margen. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle)(string) | Obtiene un valor de la propiedad del rectángulo. |
| [GetPropertySize](../../aspose.page/device/getpropertysize)(string) | Obtiene un valor de la propiedad size. |
| virtual [GetTransform](../../aspose.page/device/gettransform)() | Obtiene la transformada actual. |
| virtual [InitClip](../../aspose.page/device/initclip)() | Inicializa el clip del dispositivo. |
| [IsProperty](../../aspose.page/device/isproperty)(string) | Obtiene un valor de propiedad booleana. |
| virtual [ReNew](../../aspose.page/device/renew)() | Restablece el dispositivo al estado inicial para todo el documento. Se utiliza para restablecer el flujo de salida. |
| virtual [Reset](../../aspose.page/device/reset)() | Restablece el dispositivo al estado inicial para una página. |
| virtual [Rotate](../../aspose.page/device/rotate#rotate)(double) | Rota la matriz de transformación actual. Llama a writeTransform(Transform). Girar con un ángulo positivo theta gira puntos en el eje x positivo hacia el eje y positivo. |
| virtual [Rotate](../../aspose.page/device/rotate#rotate_1)(double, double, double) | Gira la matriz de transformación actual alrededor de un punto. |
| virtual [Scale](../../aspose.page/device/scale)(double, double) | Escala la matriz de transformación actual. Llama a writeTransform(Transformar). |
| virtual [SetClip](../../aspose.page/device/setclip)(GraphicsPath) | Especifica el clip del dispositivo. |
| virtual [SetTransform](../../aspose.page/device/settransform)(Matrix) | Especifica la transformación actual. |
| virtual [Shear](../../aspose.page/device/shear)(double, double) | Corta la matriz de transformación actual. Llama a writeTransform(Transformar). |
| virtual [StartDocument](../../aspose.page/device/startdocument)() | Hace la preparación necesaria del dispositivo antes de comenzar a renderizar el documento. |
| override [ToString](../../aspose.page/device/tostring)() | Devuelve el nombre del tipo de dispositivo. |
| virtual [Transform](../../aspose.page/device/transform)(Matrix) | Transforma la matriz de transformación actual. Llama a writeTransform(Transformar) |
| virtual [Translate](../../aspose.page/device/translate)(double, double) | Traduce la matriz de transformación actual. Llama a writeTransform(Transformar). |
| virtual [WriteComment](../../aspose.page/device/writecomment)(string) | Escribe un comentario. |

## Campos

| Nombre | Descripción |
| --- | --- |
| static [VERSION](../../aspose.page/device/version) | Versión actual del dispositivo. |

### Ver también

* espacio de nombres [Aspose.Page](../../aspose.page)
* asamblea [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
