---
title: Bitmap
second_title: Referencia de Aspose.Drawing para .NET API
description: Encapsula un mapa de bits que consta de los datos de píxeles de una imagen gráfica y sus atributos. ABitmap./bitmap es un objeto que se utiliza para trabajar con imágenes definidas por datos de píxeles.
type: docs
weight: 40
url: /es/net/system.drawing/bitmap/
---
## Bitmap class

Encapsula un mapa de bits, que consta de los datos de píxeles de una imagen gráfica y sus atributos. A[`Bitmap`](../bitmap) es un objeto que se utiliza para trabajar con imágenes definidas por datos de píxeles.

```csharp
public class Bitmap : Image
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase de la imagen existente especificada. |
| [Bitmap](bitmap#constructor_6)(Stream) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase del flujo de datos especificado. |
| [Bitmap](bitmap#constructor_8)(string) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase del archivo especificado. |
| [Bitmap](bitmap#constructor_5)(Image, Size) | Inicializa una nueva instancia del[`Bitmap`](../bitmap)clase de la imagen existente especificada, escalada al tamaño especificado. |
| [Bitmap](bitmap#constructor)(int, int) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase con el tamaño especificado. |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase del flujo de datos especificado. |
| [Bitmap](bitmap#constructor_9)(string, bool) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase del archivo especificado. |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase de la imagen existente especificada, escalada al tamaño especificado. |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase con el tamaño y formato especificado. |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | Inicializa una nueva instancia del[`Bitmap`](../bitmap) clase con el tamaño especificado y datos de píxeles. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | Obtiene el número entero que representa una combinación bit a bit de[`ImageFlags`](../../system.drawing.imaging/imageflags) para esta Imagen. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | Obtiene una matriz de GUID que representan las dimensiones de los marcos dentro de esteImage . |
| override [Height](../../system.drawing/bitmap/height) { get; } | Obtiene la altura, en píxeles, de este Bitmap. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | Obtiene la resolución horizontal, en píxeles por pulgada, de esteImage . |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | Obtiene o establece la paleta de colores utilizada para esteImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | Obtiene el ancho y el alto de esta imagen. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | Obtiene el formato de píxel para esteImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | Obtiene los ID de los elementos de propiedad almacenados en esteImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | Obtiene todos los elementos de propiedad (piezas de metadatos) almacenados en esteImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | Obtiene el formato de archivo de esteImage . |
| [Size](../../system.drawing/image/size) { get; } | Obtiene el ancho y el alto, en píxeles, de esta imagen. |
| [Tag](../../system.drawing/image/tag) { get; set; } | Obtiene o establece un objeto que proporciona datos adicionales sobre la imagen. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | Obtiene la resolución vertical, en píxeles por pulgada, de esteImage . |
| override [Width](../../system.drawing/bitmap/width) { get; } | Obtiene el ancho, en píxeles, de este Bitmap. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | Crea una copia exacta de esteImage . |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | Crea una copia de la sección de esteBitmap definido porRectangle estructura y con un especificadoPixelFormat enumeración. |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | Crea una copia de la sección de esteBitmap definido con un determinadoPixelFormat enumeración. |
| virtual [Dispose](../../system.drawing/image/dispose)() | Libera todos los recursos usados por esta Imagen. |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | Obtiene los límites de la imagen en la unidad especificada. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | Devuelve el número de fotogramas de la dimensión especificada. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | Obtiene el color del píxel especificado en esteBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | Obtiene el elemento de propiedad especificado de esteImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | Devuelve una miniatura para estoImage . |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | Bloquea unBitmap en la memoria del sistema. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | Hace que el color especificado sea transparente para esteBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | Hace que el color especificado sea transparente para esteBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | Lee píxeles de mapa de bits en formato ARGB32 en una matriz determinada. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | Elimina el elemento de propiedad especificado de esteImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | Este método gira, voltea o gira y voltea elImage . |
| [Save](../../system.drawing/image/save)(string) | Guarda estoImageal archivo o flujo especificado. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | Guarda esta imagen en el flujo especificado en el formato especificado. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | Guarda estoImage al archivo especificado en el formato especificado. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | Guarda esta imagen en el flujo especificado, con el codificador especificado y los parámetros del codificador de imágenes. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | Guarda estoImage al archivo especificado, con el codificador especificado y los parámetros del codificador de imágenes. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | Agrega un marco al archivo o flujo especificado en una llamada anterior a uno de los métodos Image.Save(...). Use este método para guardar los marcos seleccionados de una imagen de múltiples marcos a otra imagen de múltiples marcos. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | Agrega un marco al archivo o flujo especificado en una llamada anterior a uno de los métodos Image.Save(...). |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | Selecciona el marco especificado por la dimensión y el índice. |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | Establece el color del píxel especificado en esteBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | Almacena un elemento de propiedad (pieza de metadatos) en esteImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | Establece la resolución para esteBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | Desbloquea estoBitmap de la memoria del sistema. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | Escribe píxeles en el mapa de bits. |

### Ver también

* class [Image](../image)
* espacio de nombres [System.Drawing](../../system.drawing)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
