---
title: Class ImageDevice
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.Presentation.Image.ImageDevice clase. Clase que encapsula el dispositivo de composición de imágenes.
type: docs
weight: 350
url: /es/net/aspose.page.xps.presentation.image/imagedevice/
---
## ImageDevice class

Clase que encapsula el dispositivo de composición de imágenes.

```csharp
public class ImageDevice : Device, IMultiPageDevice
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [ImageDevice](imagedevice/#constructor)() | Crea la nueva instancia. |
| [ImageDevice](imagedevice/#constructor_1)(Size) | Crea la nueva instancia con el tamaño de medio especificado. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| override [Background](../../aspose.page.xps.presentation.image/imagedevice/background/) { get; set; } | Obtiene/establece el color de fondo. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Devuelve o especifica los caracteres actuales transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Devuelve o especifica el creador de la salida del dispositivo resultante. |
| virtual [CurrentPageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentpagenumber/) { get; } | Devuelve el número absoluto de la página actual dentro del documento. |
| virtual [CurrentRelativePageNumber](../../aspose.page.xps.presentation.image/imagedevice/currentrelativepagenumber/) { get; } | Devuelve el número relativo de la página actual dentro de la partición actual. |
| override [Font](../../aspose.page.xps.presentation.image/imagedevice/font/) { get; set; } | Obtiene/establece la fuente actual. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indica si el dispositivo utiliza el modo RGB directo, es decir, RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indica si esta instancia de la biblioteca Aspose.Page tiene licencia. |
| override [Opacity](../../aspose.page.xps.presentation.image/imagedevice/opacity/) { get; set; } | Obtiene/establece la opacidad. |
| override [OpacityMask](../../aspose.page.xps.presentation.image/imagedevice/opacitymask/) { get; set; } | Obtiene/establece el pincel para la máscara de opacidad. La máscara se aplica sobre Paint o Strike. |
| override [Paint](../../aspose.page.xps.presentation.image/imagedevice/paint/) { get; set; } | Obtiene/establece el pincel para rellenar trazados. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Propiedades del dispositivo, incluidos los metadatos. |
| [Result](../../aspose.page.xps.presentation.image/imagedevice/result/) { get; } | Devuelve las matrices de bytes de imágenes resultantes. La primera dimensión es para documentos internos y la segunda es para páginas dentro de documentos internos. |
| override [SaveOptions](../../aspose.page.xps.presentation.image/imagedevice/saveoptions/) { set; } | Inicializa las opciones de guardado. |
| override [Size](../../aspose.page.xps.presentation.image/imagedevice/size/) { get; set; } | Obtiene/establece el tamaño de medios del dispositivo. |
| override [Stroke](../../aspose.page.xps.presentation.image/imagedevice/stroke/) { get; set; } | Obtiene/establece el trazo para dibujar caminos. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Devuelve o especifica el modo de representación de texto actual. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Devuelve o especifica el ancho del trazo de texto actual. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| virtual [ClosePage](../../aspose.page.xps.presentation.image/imagedevice/closepage/)() | Realiza la pagina. |
| virtual [ClosePartition](../../aspose.page.xps.presentation.image/imagedevice/closepartition/)() | Realizada la partición del documento. |
| override [Create](../../aspose.page.xps.presentation.image/imagedevice/create/)() | Crea una nueva instancia del dispositivo basada en esta instancia de dispositivo. Escribe el estado de gráficos de este dispositivo, es decir, creaApsCanvas instancia(s) con las propiedades RenderTransform y Clip correspondientes. |
| override [Dispose](../../aspose.page.xps.presentation.image/imagedevice/dispose/)() | Elimina esta instancia de dispositivo. Finaliza el estado de gráficos de esta instancia de dispositivo, , es decir, cambia el contexto de composición de APS alApsCanvas del nivel más alto que el estado de gráficos de este dispositivoApsCanvas . |
| override [Draw](../../aspose.page.xps.presentation.image/imagedevice/draw/)(GraphicsPath) | Dibuja la ruta especificada. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Dibuja un arco. |
| virtual [DrawImage](../../aspose.page/device/drawimage/)(Bitmap, Matrix, Color) | Dibuja una imagen con transformación y fondo asignados. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Dibuja un segmento de recta. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Dibuja un óvalo. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Dibuja un polígono. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Dibuja un polígono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Dibuja una polilínea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Dibuja una polilínea. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Dibuja un rectángulo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Dibuja un rectángulo redondo. |
| override [DrawString](../../aspose.page.xps.presentation.image/imagedevice/drawstring/)(string, double, double) | Dibuja una cadena en la posición especificada. |
| override [EndDocument](../../aspose.page.xps.presentation.image/imagedevice/enddocument/)() | Realiza el documento. |
| override [Fill](../../aspose.page.xps.presentation.image/imagedevice/fill/)(GraphicsPath) | Rellena la ruta especificada. |
| virtual [FillArc](../../aspose.page/device/fillarc/)(double, double, double, double, double, double) | Rellena un arco. |
| virtual [FillOval](../../aspose.page/device/filloval/)(double, double, double, double) | Rellena un óvalo. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(double[], double[], int) | Rellena un polígono. |
| virtual [FillPolygon](../../aspose.page/device/fillpolygon/)(int[], int[], int) | Rellena un polígono. |
| virtual [FillRect](../../aspose.page/device/fillrect/)(double, double, double, double) | Rellena un rectángulo. |
| virtual [FillRoundRect](../../aspose.page/device/fillroundrect/)(double, double, double, double, double, double) | Rellena un rectángulo redondo. |
| [GetProperty](../../aspose.page/device/getproperty/)(string) | Obtiene un valor de propiedad de cadena. |
| [GetPropertyColor](../../aspose.page/device/getpropertycolor/)(string) | Obtiene un valor de propiedad de color. |
| [GetPropertyDouble](../../aspose.page/device/getpropertydouble/)(string) | Obtiene un valor de doble propiedad. |
| [GetPropertyInt](../../aspose.page/device/getpropertyint/)(string) | Obtiene un valor de propiedad entera. |
| [GetPropertyMargins](../../aspose.page/device/getpropertymargins/)(string) | Obtiene un valor de propiedad de margen. |
| [GetPropertyRectangle](../../aspose.page/device/getpropertyrectangle/)(string) | Obtiene un valor de la propiedad del rectángulo. |
| [GetPropertySize](../../aspose.page/device/getpropertysize/)(string) | Obtiene un valor de la propiedad size. |
| override [GetTransform](../../aspose.page.xps.presentation.image/imagedevice/gettransform/)() | Devuelve la matriz de transformación actual. |
| virtual [InitClip](../../aspose.page/device/initclip/)() | Inicializa el clip del dispositivo. |
| [InitPageNumbers](../../aspose.page.xps.presentation.image/imagedevice/initpagenumbers/)() | Inicializa el número de páginas a imprimir. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Obtiene un valor de propiedad booleana. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage_1)(string) | Comienza una nueva página con el título especificado. |
| virtual [OpenPage](../../aspose.page.xps.presentation.image/imagedevice/openpage/#openpage)(float, float) | Comienza una nueva página con el ancho y el alto especificados. |
| virtual [OpenPartition](../../aspose.page.xps.presentation.image/imagedevice/openpartition/)() | Inicia una nueva partición de documento. |
| override [ReNew](../../aspose.page.xps.presentation.image/imagedevice/renew/)() | Pone los dispositivos al estado inicial. |
| override [Reset](../../aspose.page.xps.presentation.image/imagedevice/reset/)() | Reinicia el dispositivo. |
| override [Rotate](../../aspose.page.xps.presentation.image/imagedevice/rotate/#rotate)(double) | Aplica una rotación en el sentido de las agujas del reloj sobre el origen a la matriz de transformación actual. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Gira la matriz de transformación actual alrededor de un punto. |
| override [Scale](../../aspose.page.xps.presentation.image/imagedevice/scale/)(double, double) | Aplica el vector de escala especificado a la matriz de transformación actual. |
| override [SetClip](../../aspose.page.xps.presentation.image/imagedevice/setclip/)(GraphicsPath) | Agrega la ruta especificada a la ruta del clip actual. |
| override [SetTransform](../../aspose.page.xps.presentation.image/imagedevice/settransform/)(Matrix) | Establece la matriz de transformación actual. |
| override [Shear](../../aspose.page.xps.presentation.image/imagedevice/shear/)(double, double) | Aplica el vector de corte especificado a la matriz de transformación actual. |
| override [StartDocument](../../aspose.page.xps.presentation.image/imagedevice/startdocument/)() | Inicia el documento. |
| override [ToString](../../aspose.page/device/tostring/)() | Devuelve el nombre del tipo de dispositivo. |
| override [Transform](../../aspose.page.xps.presentation.image/imagedevice/transform/)(Matrix) | Multiplica la matriz de transformación actual por la especificadaMatrix . |
| override [Translate](../../aspose.page.xps.presentation.image/imagedevice/translate/)(double, double) | Aplica el vector de traslación especificado a la matriz de transformación actual. |
| virtual [UpdatePageParameters](../../aspose.page.xps.presentation.image/imagedevice/updatepageparameters/)(IMultiPageDevice) | Actualiza los parámetros de la página actual. |
| virtual [WriteComment](../../aspose.page/device/writecomment/)(string) | Escribe un comentario. |

### Ver también

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* espacio de nombres [Aspose.Page.XPS.Presentation.Image](../../aspose.page.xps.presentation.image/)
* asamblea [Aspose.Page](../../)


