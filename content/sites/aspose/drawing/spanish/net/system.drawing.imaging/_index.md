---
title: System.Drawing.Imaging
second_title: Referencia de Aspose.Drawing para .NET API
description: ElImaging El espacio de nombres proporciona funcionalidad avanzada de generación de imágenes GDI. La funcionalidad básica de gráficos la proporciona elDrawing espacio de nombres.
type: docs
weight: 40
url: /es/net/system.drawing.imaging/
---
ElImaging El espacio de nombres proporciona funcionalidad avanzada de generación de imágenes GDI+. La funcionalidad básica de gráficos la proporciona elDrawing espacio de nombres.

## Clases

| Clase | Descripción |
| --- | --- |
| [BitmapData](./bitmapdata) | Especifica los atributos de una imagen de mapa de bits. losBitmapData la clase es utilizada por the LockBits yUnlockBits métodos delBitmap clase. No heredable. |
| [ColorMap](./colormap) | Define un mapa para convertir colores. Varios métodos de laImageAttributes clasifique los colores de imagen de ajuste mediante el uso de una tabla de reasignación de colores, que es una matriz deColorMap estructuras. No heredable. |
| [ColorMatrix](./colormatrix) | Define una matriz de 5 x 5 que contiene las coordenadas para el espacio RGBA. Varios métodos de laImageAttributes class ajusta los colores de la imagen usando una matriz de color. Esta clase no se puede heredar. |
| [ColorPalette](./colorpalette) | Define una matriz de colores que componen una paleta de colores. Los colores son colores ARGB de 32 bits. No heredable. |
| [Encoder](./encoder) | UnEncoder El objeto encapsula un identificador único global (GUID) que identifica la categoría de un parámetro de codificador de imagen. |
| [EncoderParameter](./encoderparameter) | Se utiliza para pasar un valor, o una matriz de valores, a un codificador de imágenes. |
| [EncoderParameters](./encoderparameters) | Encapsula una matriz deEncoderParameter objetos. |
| [FrameDimension](./framedimension) | Proporciona propiedades que obtienen las dimensiones del marco de una imagen. No heredable. |
| [ImageAttributes](./imageattributes) | Contiene información sobre cómo se manipulan los colores del mapa de bits y del metarchivo durante el renderizado. |
| [ImageCodecInfo](./imagecodecinfo) | ElImageCodecInfo class proporciona los miembros y métodos de almacenamiento necesarios para recuperar toda la información pertinente sobre los codificadores y decodificadores de imágenes instalados (llamados códecs). No heredable. |
| [ImageFormat](./imageformat) | Especifica el formato de archivo de la imagen. No heredable. |
| [Metafile](./metafile) | Define un metarchivo gráfico. Un metarchivo contiene registros que describen una secuencia de operaciones gráficas que se pueden grabar (construir) y reproducir (mostrar). Esta clase no es heredable. |
| [MetafileHeader](./metafileheader) | Contiene atributos de un asociadoMetafile . No heredable. |
| [MetaHeader](./metaheader) | Contiene información sobre un metarchivo con formato de Windows (WMF). |
| [NamespaceDoc](./namespacedoc) | ElImaging El espacio de nombres proporciona funcionalidad avanzada de generación de imágenes GDI+. La funcionalidad básica de gráficos la proporciona elDrawing espacio de nombres. |
| [PlayRecordCallback](./playrecordcallback) | Este delegado no se utiliza. Para ver un ejemplo de cómo enumerar los registros de un metarchivo, consulte[`EnumerateMetafile`](../system.drawing/graphics/enumeratemetafile) . |
| [PropertyItem](./propertyitem) | Encapsula una propiedad de metadatos para incluirla en un archivo de imagen. No heredable. |
| [WmfPlaceableFileHeader](./wmfplaceablefileheader) | Define un metarchivo colocable. No heredable. |
## Enumeración

| Enumeración | Descripción |
| --- | --- |
| [ColorAdjustType](./coloradjusttype) | Especifica qué objetos GDI+ usan información de ajuste de color. |
| [ColorChannelFlag](./colorchannelflag) | Especifica canales individuales en el espacio de color CMYK (cian, magenta, amarillo, negro). Esta enumeración la utiliza el[`SetOutputChannel`](../system.drawing.imaging/imageattributes/setoutputchannel) métodos. |
| [ColorMatrixFlag](./colormatrixflag) | Especifica los tipos de imágenes y colores que se verán afectados por la configuración de ajuste de color y escala de grises de unImageAttributes . |
| [EmfPlusRecordType](./emfplusrecordtype) | Especifica los métodos disponibles para usar con un metarchivo para leer y escribir comandos gráficos. |
| [EmfType](./emftype) | Especifica la naturaleza de los registros que se colocan en un archivo de metarchivo mejorado (EMF). Varios constructores utilizan esta enumeración en elMetafile clase. |
| [EncoderValue](./encodervalue) | Se usa para especificar el valor del parámetro pasado a un codificador de imágenes JPEG o TIFF cuando se usa elEncoderParameters) oEncoderParameters) métodos. |
| [ImageFlags](./imageflags) | Especifica los atributos de los datos de píxeles contenidos en un[`Image`](../system.drawing/image) objeto. La propiedad Flags devuelve un miembro de esta enumeración. Esta enumeración tiene un atributo FlagsAttribute que permite una combinación bit a bit de sus valores de miembro. |
| [ImageLockMode](./imagelockmode) | Especifica banderas que se pasan al parámetro de banderas del[`LockBits`](../system.drawing/bitmap/lockbits) método. El[`LockBits`](../system.drawing/bitmap/lockbits) El método bloquea una parte de una imagen para que pueda leer o escribir los datos de píxeles. |
| [MetafileFrameUnit](./metafileframeunit) | Especifica la unidad de medida del rectángulo que se utiliza para cambiar el tamaño y la posición de un metarchivo. Esto se especifica durante la creación delMetafile objeto. |
| [MetafileType](./metafiletype) | Especifica tipos de metarchivos. |
| [PixelFormat](./pixelformat) | Especifica el formato de los datos de color para cada píxel de la imagen. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
