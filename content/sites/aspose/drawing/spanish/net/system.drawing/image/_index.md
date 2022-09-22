---
title: Image
second_title: Referencia de Aspose.Drawing para .NET API
description: Una clase base abstracta que proporciona funcionalidad para las clases descendientes de mapa de bits y metarchivo.
type: docs
weight: 580
url: /es/net/system.drawing/image/
---
## Image class

Una clase base abstracta que proporciona funcionalidad para las clases descendientes de mapa de bits y metarchivo.

```csharp
public abstract class Image : IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Image](image)() | Inicializa una nueva instancia del[`Image`](../image) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Obtiene el número entero que representa una combinación bit a bit de[`ImageFlags`](../../system.drawing.imaging/imageflags) para esta Imagen. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist) { get; } | Obtiene una matriz de GUID que representan las dimensiones de los marcos dentro de esteImage . |
| abstract [Height](../../system.drawing/image/height) { get; } | Obtiene la altura, en píxeles, de esteImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Obtiene la resolución horizontal, en píxeles por pulgada, de esteImage . |
| abstract [Palette](../../system.drawing/image/palette) { get; set; } | Obtiene o establece la paleta de colores utilizada para esteImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Obtiene el ancho y el alto de esta imagen. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat) { get; } | Obtiene el formato de píxel para esteImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist) { get; } | Obtiene los ID de los elementos de propiedad almacenados en esteImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems) { get; } | Obtiene todos los elementos de propiedad (piezas de metadatos) almacenados en esteImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat) { get; } | Obtiene el formato de archivo de esteImage . |
| [Size](../../system.drawing/image/size) { get; } | Obtiene el ancho y el alto, en píxeles, de esta imagen. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Obtiene o establece un objeto que proporciona datos adicionales sobre la imagen. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Obtiene la resolución vertical, en píxeles por pulgada, de esteImage . |
| abstract [Width](../../system.drawing/image/width) { get; } | Obtiene el ancho, en píxeles, de esteImage . |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile)(string) | Crea unImage del archivo especificado. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream)(Stream) | Crea unImagedel flujo de datos especificado. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream_1)(Stream, bool) | Crea unImage del flujo de datos especificado, opcionalmente utilizando la información de gestión de color incrustada en ese flujo. |
| [Clone](../../system.drawing/image/clone)() | Crea una copia exacta de esteImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | Libera todos los recursos usados por esta Imagen. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Obtiene los límites de la imagen en la unidad especificada. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Devuelve el número de fotogramas de la dimensión especificada. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem)(int) | Obtiene el elemento de propiedad especificado de esteImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Devuelve una miniatura para estoImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem)(int) | Elimina el elemento de propiedad especificado de esteImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip)(RotateFlipType) | Este método gira, voltea o gira y voltea elImage . |
| [Save](../../system.drawing/image/save#save_2)(string) | Guarda estoImageal archivo o flujo especificado. |
| [Save](../../system.drawing/image/save#save_1)(Stream, ImageFormat) | Guarda esta imagen en el flujo especificado en el formato especificado. |
| [Save](../../system.drawing/image/save#save_4)(string, ImageFormat) | Guarda estoImage al archivo especificado en el formato especificado. |
| [Save](../../system.drawing/image/save#save)(Stream, ImageCodecInfo, EncoderParameters) | Guarda esta imagen en el flujo especificado, con el codificador especificado y los parámetros del codificador de imágenes. |
| [Save](../../system.drawing/image/save#save_3)(string, ImageCodecInfo, EncoderParameters) | Guarda estoImage al archivo especificado, con el codificador especificado y los parámetros del codificador de imágenes. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd_1)(EncoderParameters) | Agrega un marco al archivo o flujo especificado en una llamada anterior a uno de los métodos Image.Save(...). Use este método para guardar los marcos seleccionados de una imagen de múltiples marcos a otra imagen de múltiples marcos. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd)(Image, EncoderParameters) | Agrega un marco al archivo o flujo especificado en una llamada anterior a uno de los métodos Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Selecciona el marco especificado por la dimensión y el índice. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem)(PropertyItem) | Almacena un elemento de propiedad (pieza de metadatos) en esteImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap)(IntPtr) | Crea unBitmap de un identificador a un mapa de bits GDI. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize)(PixelFormat) | Devuelve la profundidad de color, en número de bits por píxel, del formato de píxel especificado. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat)(PixelFormat) | Devuelve un valor que indica si el formato de píxel para esteImage contiene información alfa. |

## Otros miembros

| Nombre | Descripción |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | Proporciona un método de devolución de llamada para determinar cuándo[`GetThumbnailImage`](./getthumbnailimage) el método debería cancelar prematuramente la ejecución. |

### Ver también

* espacio de nombres [System.Drawing](../../system.drawing)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
