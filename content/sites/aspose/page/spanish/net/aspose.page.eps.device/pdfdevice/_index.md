---
title: Class PdfDevice
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.EPS.Device.PdfDevice clase. Esta clase encapsula la representación del documento en PDF.
type: docs
weight: 60
url: /es/net/aspose.page.eps.device/pdfdevice/
---
## PdfDevice class

Esta clase encapsula la representación del documento en PDF.

```csharp
public class PdfDevice : Device, IMultiPageDevice, IStreamable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(Stream) | Inicializa una nueva instancia de`PdfDevice` con flujo de salida. |
| [PdfDevice](pdfdevice/#constructor_1)(Stream, Size) | Inicializa una nueva instancia de`PdfDevice` con flujo de salida y tamaño especificado de una página. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [Background](../../aspose.page/device/background/) { get; set; } | Devuelve o especifica el fondo actual de la página. |
| virtual [CharTM](../../aspose.page/device/chartm/) { get; set; } | Devuelve o especifica los caracteres actuales transform. |
| [Creator](../../aspose.page/device/creator/) { get; set; } | Devuelve o especifica el creador de la salida del dispositivo resultante. |
| virtual [CurrentPageNumber](../../aspose.page.eps.device/pdfdevice/currentpagenumber/) { get; } | Número de página actual. |
| override [Font](../../aspose.page.eps.device/pdfdevice/font/) { set; } | Especifica la fuente actual. |
| virtual [IsDirectRGB](../../aspose.page/device/isdirectrgb/) { get; } | Indica si el dispositivo utiliza el modo RGB directo, es decir, RGB. |
| [IsLicensed](../../aspose.page/device/islicensed/) { get; } | Indica si esta instancia de la biblioteca Aspose.Page tiene licencia. |
| virtual [Opacity](../../aspose.page/device/opacity/) { get; set; } | Devuelve o especifica la opacidad actual. |
| virtual [OpacityMask](../../aspose.page/device/opacitymask/) { get; set; } | Devuelve o especifica la máscara de opacidad actual. |
| [OutputStream](../../aspose.page.eps.device/pdfdevice/outputstream/) { get; set; } | Especifica o devuelve un flujo de salida. |
| override [Paint](../../aspose.page.eps.device/pdfdevice/paint/) { set; } | Devuelve o especifica la pintura actual. |
| [Properties](../../aspose.page/device/properties/) { get; set; } | Propiedades del dispositivo, incluidos los metadatos. |
| virtual [SaveOptions](../../aspose.page/device/saveoptions/) { set; } | Opciones para gestionar el proceso de renderizado. |
| virtual [Size](../../aspose.page/device/size/) { get; set; } | Devuelve o especifica un tamaño de página. |
| override [Stroke](../../aspose.page.eps.device/pdfdevice/stroke/) { set; } | Devuelve o especifica el trazo actual. |
| virtual [TextRenderingMode](../../aspose.page/device/textrenderingmode/) { get; set; } | Devuelve o especifica el modo de representación de texto actual. |
| virtual [TextStrokeWidth](../../aspose.page/device/textstrokewidth/) { get; set; } | Devuelve o especifica el ancho del trazo de texto actual. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| virtual [ClosePage](../../aspose.page.eps.device/pdfdevice/closepage/)() | Realiza la preparación necesaria del dispositivo después de que se haya renderizado la página. |
| override [Create](../../aspose.page.eps.device/pdfdevice/create/)() | Crea una copia de este dispositivo. |
| override [Dispose](../../aspose.page.eps.device/pdfdevice/dispose/)() | Elimina el contexto de gráficos. Si en la creación restoreOnDispose fue verdadero, se llamará a writeGraphicsRestore(). |
| override [Draw](../../aspose.page.eps.device/pdfdevice/draw/)(GraphicsPath) | Dibuja un camino. |
| virtual [DrawArc](../../aspose.page/device/drawarc/)(double, double, double, double, double, double) | Dibuja un arco. |
| override [DrawImage](../../aspose.page.eps.device/pdfdevice/drawimage/)(Bitmap, Matrix, Color) | Dibuja una imagen con transformación y fondo asignados. |
| virtual [DrawLine](../../aspose.page/device/drawline/)(double, double, double, double) | Dibuja un segmento de recta. |
| virtual [DrawOval](../../aspose.page/device/drawoval/)(double, double, double, double) | Dibuja un óvalo. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(double[], double[], int) | Dibuja un polígono. |
| virtual [DrawPolygon](../../aspose.page/device/drawpolygon/)(int[], int[], int) | Dibuja un polígono. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(double[], double[], int) | Dibuja una polilínea. |
| virtual [DrawPolyline](../../aspose.page/device/drawpolyline/)(int[], int[], int) | Dibuja una polilínea. |
| virtual [DrawRect](../../aspose.page/device/drawrect/)(double, double, double, double) | Dibuja un rectángulo. |
| virtual [DrawRoundRect](../../aspose.page/device/drawroundrect/)(double, double, double, double, double, double) | Dibuja un rectángulo redondo. |
| override [DrawString](../../aspose.page.eps.device/pdfdevice/drawstring/)(string, double, double) | Dibuja una cadena en el punto dado. |
| override [EndDocument](../../aspose.page.eps.device/pdfdevice/enddocument/)() | Realiza la preparación necesaria del dispositivo después de que se haya procesado el documento. |
| override [Fill](../../aspose.page.eps.device/pdfdevice/fill/)(GraphicsPath) | Rellena un camino. |
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
| override [GetTransform](../../aspose.page.eps.device/pdfdevice/gettransform/)() | Obtiene la transformación actual. |
| override [InitClip](../../aspose.page.eps.device/pdfdevice/initclip/)() | Inicializa el clip del dispositivo. |
| virtual [InitPageNumbers](../../aspose.page.eps.device/pdfdevice/initpagenumbers/)() | Inicializa el número de páginas a imprimir. |
| [IsProperty](../../aspose.page/device/isproperty/)(string) | Obtiene un valor de propiedad booleana. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage_1)(string) | Hace la preparación necesaria del dispositivo antes de renderizar la página. |
| virtual [OpenPage](../../aspose.page.eps.device/pdfdevice/openpage/#openpage)(float, float) | Realiza la preparación necesaria del dispositivo antes de cada renderizado de página. |
| override [ReNew](../../aspose.page.eps.device/pdfdevice/renew/)() | Restablece el dispositivo al estado inicial para todo el documento. Se utiliza para restablecer el flujo de salida. |
| override [Reset](../../aspose.page.eps.device/pdfdevice/reset/)() | Si se configurarán los parámetros del dispositivo de página, este método permite regresar el flujo de escritura al comienzo de la página. |
| override [Rotate](../../aspose.page.eps.device/pdfdevice/rotate/#rotate)(double) | Gira la transformada actual sobre el eje Z. Llama a writeTransform(Transform). Girar con un ángulo positivo theta gira puntos en el eje x positivo hacia el eje y positivo. |
| virtual [Rotate](../../aspose.page/device/rotate/)(double, double, double) | Gira la matriz de transformación actual alrededor de un punto. |
| override [Scale](../../aspose.page.eps.device/pdfdevice/scale/)(double, double) | Escala la matriz de transformación actual. Llama a writeTransform(Transformar). |
| override [SetClip](../../aspose.page.eps.device/pdfdevice/setclip/)(GraphicsPath) | Especifica el clip del dispositivo. |
| override [SetTransform](../../aspose.page.eps.device/pdfdevice/settransform/)(Matrix) | Especifica la transformación actual. Dado que la mayoría de los formatos de salida no implementan esta funcionalidad, la transformación inversa de currentTransform se calcula y multiplica por la transformación que se establecerá. El resultado se reenvía mediante una llamada a writeTransform(Transform). |
| override [Shear](../../aspose.page.eps.device/pdfdevice/shear/)(double, double) | Corta la matriz de transformación actual. Llama a writeTransform(Transformar). |
| override [StartDocument](../../aspose.page.eps.device/pdfdevice/startdocument/)() | Hace la preparación necesaria del dispositivo antes de comenzar a renderizar el documento. |
| override [ToString](../../aspose.page.eps.device/pdfdevice/tostring/)() | Devuelve el nombre del tipo de dispositivo. |
| override [Transform](../../aspose.page.eps.device/pdfdevice/transform/)(Matrix) | Transforma la matriz de transformación actual. Llama a writeTransform(Transformar) |
| override [Translate](../../aspose.page.eps.device/pdfdevice/translate/)(double, double) | Traduce la matriz de transformación actual. Llama a writeTransform(Transformar). |
| virtual [UpdatePageParameters](../../aspose.page.eps.device/pdfdevice/updatepageparameters/)(IMultiPageDevice) | Actualiza los parámetros de la página desde otro dispositivo de varias páginas. |
| override [WriteComment](../../aspose.page.eps.device/pdfdevice/writecomment/)(string) | Escribe un comentario. |

## Campos

| Nombre | Descripción |
| --- | --- |
| static readonly [AUTHOR](../../aspose.page.eps.device/pdfdevice/author/) | Valor de la propiedad "Autor". |
| static readonly [BACKGROUND](../../aspose.page.eps.device/pdfdevice/background/) | Clave de propiedad "Fondo". |
| static readonly [BACKGROUND_COLOR](../../aspose.page.eps.device/pdfdevice/background_color/) | Clave de propiedad "Color de fondo". |
| static readonly [COMPRESS](../../aspose.page.eps.device/pdfdevice/compress/) | Clave de propiedad "Comprimir". |
| static readonly [EMBED_FONTS](../../aspose.page.eps.device/pdfdevice/embed_fonts/) | Clave de propiedad "Incrustar fuente en el documento". |
| static readonly [EMBED_FONTS_AS](../../aspose.page.eps.device/pdfdevice/embed_fonts_as/) | Clave de propiedad "Qué tipo de fuente se usa para incrustar". |
| static readonly [EMIT_ERRORS](../../aspose.page.eps.device/pdfdevice/emit_errors/) | Valor de la propiedad "Emitir errores". |
| static readonly [EMIT_WARNINGS](../../aspose.page.eps.device/pdfdevice/emit_warnings/) | Valor de la propiedad "Emitir advertencias". |
| static readonly [FIT_TO_PAGE](../../aspose.page.eps.device/pdfdevice/fit_to_page/) | Clave de propiedad "Ajustar contenido a la página". |
| static readonly [KEYWORDS](../../aspose.page.eps.device/pdfdevice/keywords/) | Valor de la propiedad "Palabras clave". |
| static readonly [ORIENTATION](../../aspose.page.eps.device/pdfdevice/orientation/) | Clave de propiedad "Orientación". |
| static readonly [PAGE_MARGINS](../../aspose.page.eps.device/pdfdevice/page_margins/) | Clave de propiedad "Márgenes de página". |
| static readonly [PAGE_SIZE](../../aspose.page.eps.device/pdfdevice/page_size/) | Clave de propiedad "Tamaño de página". |
| static readonly [SUBJECT](../../aspose.page.eps.device/pdfdevice/subject/) | Valor de la propiedad "Asunto". |
| static readonly [TITLE](../../aspose.page.eps.device/pdfdevice/title/) | Valor de la propiedad "Título". |
| static readonly [TRANSPARENT](../../aspose.page.eps.device/pdfdevice/transparent/) | Clave de propiedad "transparente". |
| static readonly [VERSION](../../aspose.page.eps.device/pdfdevice/version/) | Clave de propiedad "Versión". |
| const [VERSION5](../../aspose.page.eps.device/pdfdevice/version5/) | Valor de propiedad "Versión de Adobe Acrobat Reader". |
| static readonly [WRITE_IMAGES_AS](../../aspose.page.eps.device/pdfdevice/write_images_as/) | Clave de propiedad "Formato de imágenes". |

### Ver también

* class [Device](../../aspose.page/device/)
* interface [IMultiPageDevice](../../aspose.page/imultipagedevice/)
* interface [IStreamable](../../aspose.page/istreamable/)
* espacio de nombres [Aspose.Page.EPS.Device](../../aspose.page.eps.device/)
* asamblea [Aspose.Page](../../)


