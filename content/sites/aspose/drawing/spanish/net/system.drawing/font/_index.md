---
title: Font
second_title: Referencia de Aspose.Drawing para .NET API
description: Define un formato particular para el texto incluidos los atributos de fuente tamaño y estilo. Esta clase no se puede heredar.
type: docs
weight: 500
url: /es/net/system.drawing/font/
---
## Font class

Define un formato particular para el texto, incluidos los atributos de fuente, tamaño y estilo. Esta clase no se puede heredar.

```csharp
public sealed class Font : IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Font](font#constructor)(Font, FontStyle) | Inicializa una nueva instancia del[`Font`](../font) clase utiliza el existente especificadoFont yFontStyle enumeración.. |
| [Font](font#constructor_1)(FontFamily, float) | Inicializa una nueva instancia del[`Font`](../font) clase. |
| [Font](font#constructor_7)(string, float) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño especificado. |
| [Font](font#constructor_2)(FontFamily, float, FontStyle) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño y estilo especificados.. |
| [Font](font#constructor_6)(FontFamily, float, GraphicsUnit) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño y una unidad especificados. Establece el estilo enRegular . |
| [Font](font#constructor_8)(string, float, FontStyle) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño y estilo especificado. |
| [Font](font#constructor_12)(string, float, GraphicsUnit) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño y una unidad especificados. El estilo se establece enRegular . |
| [Font](font#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño, estilo y unidad especificados. |
| [Font](font#constructor_9)(string, float, FontStyle, GraphicsUnit) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño, estilo y unidad especificados. |
| [Font](font#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño, estilo, unidad y conjunto de caracteres especificados.. |
| [Font](font#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Inicializa una nueva instancia del[`Font`](../font)clase utilizando un tamaño, estilo, unidad y conjunto de caracteres especificados. |
| [Font](font#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Inicializa una nueva instancia del[`Font`](../font) clase usando un tamaño, estilo, unidad y conjunto de caracteres especificados.. |
| [Font](font#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Inicializa una nueva instancia del[`Font`](../font) class usando el tamaño, estilo, unidad y conjunto de caracteres especificados. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | Obtiene un valor que indica si esteFont está en negrita. |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | Obtiene elFontFamily asociado con esteFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | Obtiene un valor de byte que especifica el conjunto de caracteres GDI queFont usa. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | Obtiene un valor que indica si esteFont se deriva de una fuente vertical GDI.. |
| [Height](../../system.drawing/font/height) { get; } | Obtiene el interlineado de esta fuente. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | Obtiene un valor que indica si la fuente es miembro deSystemFonts . |
| [Italic](../../system.drawing/font/italic) { get; } | Obtiene un valor que indica si esteFont es cursiva. |
| [Name](../../system.drawing/font/name) { get; } | Obtiene el nombre de la cara de esteFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | Obtiene el nombre de la fuente especificada originalmente. |
| [Size](../../system.drawing/font/size) { get; } | Obtiene el tamaño em de esteFont medido en las unidades especificadas por the Unit propiedad. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | Obtiene el tamaño em, en puntos, de esteFont . |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | Obtiene un valor que indica si esteFont especifica una línea horizontal a través de la fuente. |
| [Style](../../system.drawing/font/style) { get; } | Obtiene información de estilo para esteFont . |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | Obtiene el nombre de la fuente del sistema si la propiedad IsSystemFont devuelve verdadero. |
| [Underline](../../system.drawing/font/underline) { get; } | Obtiene un valor que indica si esteFont está subrayado. |
| [Unit](../../system.drawing/font/unit) { get; } | Obtiene la unidad de medida para esteFont . |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | Crea una copia exacta de esteFont . |
| [Dispose](../../system.drawing/font/dispose)() | Libera todos los recursos utilizados por esteFont . |
| override [Equals](../../system.drawing/font/equals)(object) | Indica si el objeto especificado es unFont y tiene lo mismoFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , yUnit valores de propiedad como esteFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | Obtiene el código hash para esteFont . |
| [GetHeight](../../system.drawing/font/getheight#getheight)() | Devuelve el interlineado, en píxeles, de esta fuente. |
| [GetHeight](../../system.drawing/font/getheight#getheight_1)(float) | Devuelve la altura, en píxeles, de esteFontcuando se dibuja en un dispositivo con la resolución vertical especificada. |
| [GetHeight](../../system.drawing/font/getheight#getheight_2)(Graphics) | Devuelve el interlineado, en la unidad actual de un especificadoGraphics , de esta fuente. |
| override [ToString](../../system.drawing/font/tostring)() | Devuelve una representación de cadena legible por humanos de esteFont . |

### Ver también

* espacio de nombres [System.Drawing](../../system.drawing)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
