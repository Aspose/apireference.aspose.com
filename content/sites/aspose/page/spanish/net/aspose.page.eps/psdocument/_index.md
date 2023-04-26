---
title: Class PsDocument
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.EPS.PsDocument clase. Esta clase encapsula documentos PS/EPS.
type: docs
weight: 140
url: /es/net/aspose.page.eps/psdocument/
---
## PsDocument class

Esta clase encapsula documentos PS/EPS.

```csharp
public sealed class PsDocument : Document
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PsDocument](psdocument/#constructor)(Stream) | Inicializa`PsDocument` con un flujo de archivo PS/EPS. |
| [PsDocument](psdocument/#constructor_1)(Stream, PsSaveOptions) | Inicializa vacío`PsDocument` con página inicializada. |
| [PsDocument](psdocument/#constructor_2)(Stream, PsSaveOptions, bool) | Inicializa vacío`PsDocument` . |
| [PsDocument](psdocument/#constructor_3)(Stream, PsSaveOptions, int) | Inicializa vacío`PsDocument` cuando se conoce de antemano el número de páginas del documento Postscript. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [NumberOfPages](../../aspose.page.eps/psdocument/numberofpages/) { get; } | Devuelve el número de páginas del documento PDF resultante. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clip](../../aspose.page.eps/psdocument/clip/)(GraphicsPath) | Agrega clip al estado de gráficos actual. |
| [ClipAndNewPath](../../aspose.page.eps/psdocument/clipandnewpath/)(GraphicsPath) | Agrega un clip al estado actual de los gráficos y luego escribe el operador "nueva ruta". Es necesario hacer para escapar de la confluencia de esta ruta de recorte y algunas rutas posteriores, como los glifos delineados con el operador "charpath". |
| [ClipRectangle](../../aspose.page.eps/psdocument/cliprectangle/)(RectangleF) | Agrega un rectángulo de recorte al estado actual de los gráficos. |
| [ClipText](../../aspose.page.eps/psdocument/cliptext/)(string, Font, float, float) |  |
| [ClosePage](../../aspose.page.eps/psdocument/closepage/)() | Completa la página actual. |
| [Draw](../../aspose.page.eps/psdocument/draw/)(GraphicsPath) | Dibujar una ruta arbitraria. |
| [DrawExplicitImageMask](../../aspose.page.eps/psdocument/drawexplicitimagemask/)(Bitmap, Bitmap, Matrix) | Dibujar imagen enmascarada. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage)(Bitmap) | Dibujar imagen. |
| [DrawImage](../../aspose.page.eps/psdocument/drawimage/#drawimage_1)(Bitmap, Matrix, Color) | Dibujar imagen transformada con fondo. |
| [DrawTransparentImage](../../aspose.page.eps/psdocument/drawtransparentimage/)(Bitmap, Matrix, int) | Dibujar imagen transparente transformada. Si la imagen no tiene canal alfa, se dibujará como imagen opaca |
| [Fill](../../aspose.page.eps/psdocument/fill/)(GraphicsPath) | Rellena una ruta arbitraria. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext)(string, DrFont, float, float, Brush, Pen) | Agrega una cadena de texto llenando el interior de los glifos y dibujando los contornos de los glifos. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_3)(string, Font, float, float, Brush, Pen) | Agrega una cadena de texto llenando el interior de los glifos y dibujando los contornos de los glifos. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_1)(string, float[], DrFont, float, float, Brush, Pen) | Agrega una cadena de texto llenando el interior de los glifos y dibujando los contornos de los glifos. |
| [FillAndStrokeText](../../aspose.page.eps/psdocument/fillandstroketext/#fillandstroketext_2)(string, float[], Font, float, float, Brush, Pen) | Agrega una cadena de texto llenando el interior de los glifos y dibujando los contornos de los glifos. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext)(string, DrFont, float, float) | Agrega una cadena de texto llenando el interior de los glifos. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_6)(string, Font, float, float) | Agrega una cadena de texto llenando el interior de los glifos. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_1)(string, DrFont, float, float, Brush) | Agrega una cadena de texto llenando el interior de los glifos. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_2)(string, float[], DrFont, float, float) | Agrega una cadena de texto llenando el interior de los glifos. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_4)(string, float[], Font, float, float) | Agrega una cadena de texto llenando el interior de los glifos. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_7)(string, Font, float, float, Brush) | Agrega una cadena de texto llenando el interior de los glifos. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_3)(string, float[], DrFont, float, float, Brush) | Agrega una cadena de texto llenando el interior de los glifos. |
| [FillText](../../aspose.page.eps/psdocument/filltext/#filltext_5)(string, float[], Font, float, float, Brush) | Agrega una cadena de texto llenando el interior de los glifos. |
| [GetPaint](../../aspose.page.eps/psdocument/getpaint/)() | Obtiene la pintura del estado actual de los gráficos. |
| [GetStroke](../../aspose.page.eps/psdocument/getstroke/)() | Obtiene el trazo del estado actual de los gráficos. |
| [GetXmpMetadata](../../aspose.page.eps/psdocument/getxmpmetadata/)() | Lee el archivo PS/EPS y extrae XmpMetdata si ya existe o agrega uno nuevo si no existe. |
| [Merge](../../aspose.page.eps/psdocument/merge/)(string[], Device, SaveOptions) | Fusiona archivos PS/EPS en un dispositivo. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage_1)(string) | Crea una nueva página con el tamaño del documento y la convierte en la actual. |
| [OpenPage](../../aspose.page.eps/psdocument/openpage/#openpage)(float, float) | Crea una nueva página y la convierte en la actual. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext)(string, DrFont, float, float) | Agrega una cadena de texto dibujando contornos de glifos. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_6)(string, Font, float, float) | Agrega una cadena de texto dibujando contornos de glifos. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_1)(string, DrFont, float, float, Pen) | Agrega una cadena de texto dibujando contornos de glifos. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_2)(string, float[], DrFont, float, float) | Agrega una cadena de texto dibujando contornos de glifos. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_4)(string, float[], Font, float, float) | Agrega una cadena de texto dibujando contornos de glifos. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_7)(string, Font, float, float, Pen) | Agrega una cadena de texto dibujando contornos de glifos. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_3)(string, float[], DrFont, float, float, Pen) | Agrega una cadena de texto dibujando contornos de glifos. |
| [OutlineText](../../aspose.page.eps/psdocument/outlinetext/#outlinetext_5)(string, float[], Font, float, float, Pen) | Agrega una cadena de texto dibujando contornos de glifos. |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate_1)(float) | Agrega rotación en sentido antihorario sobre el origen al estado gráfico actual (rotar matriz actual). |
| [Rotate](../../aspose.page.eps/psdocument/rotate/#rotate)(int) | Agrega rotación en sentido antihorario sobre el origen al estado gráfico actual (rotar matriz actual). |
| [Save](../../aspose.page.eps/psdocument/save/#save)() | Guardados dados`PsDocument`como archivo EPS. Este método se usa solo cuando PsDocument se creó desde cero. |
| [Save](../../aspose.page.eps/psdocument/save/#save_2)(Stream) | Guardados dados`PsDocument` como archivo EPS. Este método se usa solo después de actualizar los metadatos XMP. Guarda el archivo EPS inicial con los metadatos existentes actualizados o uno nuevo creado al llamar al método GetMetadata. En el último caso, se agrega todo el código PostScript y los comentarios EPS necesarios. |
| override [Save](../../aspose.page.eps/psdocument/save/#save_1)(Device, SaveOptions) | Guarda el archivo PS/EPS en un dispositivo. |
| [Scale](../../aspose.page.eps/psdocument/scale/)(float, float) | Agrega escala al estado gráfico actual (matriz actual de escala). |
| [SetPageDevice](../../aspose.page.eps/psdocument/setpagedevice/)(Dictionary&lt;string, object&gt;) | Establece los parámetros del dispositivo de página (consulte la especificación PostScript del operador "setpagedevice"). Entre estos puede estar el tamaño y el color de la página, etc. |
| [SetPageSize](../../aspose.page.eps/psdocument/setpagesize/)(float, float) | Establece el tamaño de la página. Para crear páginas con diferentes tamaños en un documento, use[`SetPageDevice`](./setpagedevice/) método justo después de este método. |
| [SetPaint](../../aspose.page.eps/psdocument/setpaint/)(Brush) | Establece la pintura en el estado actual de los gráficos. |
| [SetStroke](../../aspose.page.eps/psdocument/setstroke/)(Pen) | Establece el trazo en el estado gráfico actual. |
| [SetTransform](../../aspose.page.eps/psdocument/settransform/)(Matrix) | Establece la transformación actual a esta. |
| [Shear](../../aspose.page.eps/psdocument/shear/)(float, float) | Agrega transformación de corte al estado gráfico actual (matriz de corriente de corte). |
| [Transform](../../aspose.page.eps/psdocument/transform/)(Matrix) | Agrega transformación al estado gráfico actual (concatena esta matriz con la actual). |
| [Translate](../../aspose.page.eps/psdocument/translate/)(float, float) | Agrega traducción al estado gráfico actual (traduce la matriz actual). |
| [WriteGraphicsRestore](../../aspose.page.eps/psdocument/writegraphicsrestore/)() | Restauración de escrituras del estado actual de los gráficos (consulte la especificación de PostScript sobre el operador "grestore"). |
| [WriteGraphicsSave](../../aspose.page.eps/psdocument/writegraphicssave/)() | Escribe guardando el estado actual de los gráficos (consulte la especificación de PostScript sobre el operador "gsave"). |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps)(Bitmap, Stream, PsSaveOptions) | Guarda el objeto de mapa de bits en el flujo de salida EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_1)(Bitmap, string, PsSaveOptions) | Guarda el objeto de mapa de bits en un archivo EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_2)(Stream, Stream, PsSaveOptions) | Guarda la imagen PNG/JPEG/TIFF/BMP/GIF/EMF del flujo de entrada al flujo de salida EPS. |
| static [SaveImageAsEps](../../aspose.page.eps/psdocument/saveimageaseps/#saveimageaseps_3)(string, string, PsSaveOptions) | Guarda la imagen PNG/JPEG/TIFF/BMP/GIF/EMF de un archivo a un archivo EPS. |

### Ver también

* class [Document](../../aspose.page/document/)
* espacio de nombres [Aspose.Page.EPS](../../aspose.page.eps/)
* asamblea [Aspose.Page](../../)


