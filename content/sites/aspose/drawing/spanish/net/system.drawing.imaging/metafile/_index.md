---
title: Metafile
second_title: Referencia de Aspose.Drawing para .NET API
description: Define un metarchivo gráfico. Un metarchivo contiene registros que describen una secuencia de operaciones gráficas que se pueden grabar construir y reproducir mostrar. Esta clase no es heredable.
type: docs
weight: 800
url: /es/net/system.drawing.imaging/metafile/
---
## Metafile class

Define un metarchivo gráfico. Un metarchivo contiene registros que describen una secuencia de operaciones gráficas que se pueden grabar (construir) y reproducir (mostrar). Esta clase no es heredable.

```csharp
public sealed class Metafile : Image
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | Inicializa una nueva instancia del[`Metafile`](../metafile) clase del flujo de datos especificado. |
| [Metafile](metafile#constructor_6)(string) | Inicializa una nueva instancia del[`Metafile`](../metafile) clase del nombre de archivo especificado. |
| [Metafile](metafile#constructor)(IntPtr, bool) | Inicializa una nueva instancia del[`Metafile`](../metafile) clase del identificador especificado. |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | Inicializa una nueva instancia del[`Metafile`](../metafile) clase del identificador especificado a un contexto de dispositivo y unEmfTypeenumeración que especifica el formato delMetafile . |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | Inicializa una nueva instancia del[`Metafile`](../metafile) clase del flujo de datos especificado y un identificador de Windows a un contexto de dispositivo. /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | Inicializa una nueva instancia del[`Metafile`](../metafile) clase del nombre de archivo especificado. |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | Inicializa una nueva instancia del[`Metafile`](../metafile) clase del flujo de datos especificado , un identificador de Windows para un contexto de dispositivo y unEmfType enumeration que especifica el formato delMetafile . |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | Inicializa una nueva instancia del[`Metafile`](../metafile) clase del flujo de datos especificado , un identificador de Windows para un contexto de dispositivo y unEmfType enumeration que especifica el formato delMetafile . |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Obtiene el número entero que representa una combinación bit a bit de[`ImageFlags`](../imageflags) para esta Imagen. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | Obtiene una matriz de GUID que representan las dimensiones de los marcos dentro de esteImage . |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | Obtiene la altura, en píxeles, de esteMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Obtiene la resolución horizontal, en píxeles por pulgada, de esteImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | Obtiene o establece la paleta de colores utilizada para esteImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Obtiene el ancho y el alto de esta imagen. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | Obtiene el formato de píxel para esteImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | Obtiene los ID de los elementos de propiedad almacenados en esteImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | Obtiene todos los elementos de propiedad (piezas de metadatos) almacenados en esteImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | Obtiene el formato de archivo de esteImage . |
| [Size](../../system.drawing/image/size) { get; } | Obtiene el ancho y el alto, en píxeles, de esta imagen. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Obtiene o establece un objeto que proporciona datos adicionales sobre la imagen. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Obtiene la resolución vertical, en píxeles por pulgada, de esteImage . |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | Obtiene el ancho, en píxeles, de esteMetafile . |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Crea una copia exacta de esteImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Libera todos los recursos usados por esta Imagen. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Obtiene los límites de la imagen en la unidad especificada. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Devuelve el número de fotogramas de la dimensión especificada. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | Devuelve un identificador de Windows a un mejoradoMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | Devuelve elMetafileHeader asociado con esteMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | Obtiene el elemento de propiedad especificado de esteImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Devuelve una miniatura para estoImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | Reproduce un registro de metarchivo individual. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | Elimina el elemento de propiedad especificado de esteImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | Este método gira, voltea o gira y voltea elImage . |
| [Save](../../system.drawing/image/save)(string) | Guarda estoImageal archivo o flujo especificado. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Guarda esta imagen en el flujo especificado en el formato especificado. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Guarda estoImage al archivo especificado en el formato especificado. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Guarda esta imagen en el flujo especificado, con el codificador especificado y los parámetros del codificador de imágenes. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Guarda estoImage al archivo especificado, con el codificador especificado y los parámetros del codificador de imágenes. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Agrega un marco al archivo o flujo especificado en una llamada anterior a uno de los métodos Image.Save(...). Use este método para guardar los marcos seleccionados de una imagen de múltiples marcos a otra imagen de múltiples marcos. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Agrega un marco al archivo o flujo especificado en una llamada anterior a uno de los métodos Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Selecciona el marco especificado por la dimensión y el índice. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | Almacena un elemento de propiedad (pieza de metadatos) en esteImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | Devuelve elMetafileHeader asociado con lo especificadoMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | Devuelve elMetafileHeader asociado con lo especificadoMetafile . |

### Ver también

* class [Image](../../system.drawing/image)
* espacio de nombres [System.Drawing.Imaging](../../system.drawing.imaging)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
