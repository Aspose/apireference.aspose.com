---
title: Color
second_title: Referencia de API de Aspose.SVG para .NET
description: La clase Color le permite especificar colores como valores RojoVerdeAzul RGB valores TonoSaturaciónLuminosidad HSL valores TonoSaturaciónValor HSV TonoBlancuraNegrura HWB  valores de luminosidadAB LAB valores de LuminanceChromaHue LCH valores de CyanMagentaYellowKey CMYK valores de colores naturales NCOL o con un nombre de color . También está disponible un canal alfa para indicar transparencia.
type: docs
weight: 1390
url: /es/net/aspose.svg.drawing/color/
---
## Color class

La clase Color le permite especificar colores como valores Rojo-Verde-Azul (RGB), valores Tono-Saturación-Luminosidad (HSL), valores Tono-Saturación-Valor (HSV), Tono-Blancura-Negrura (HWB) ), valores de luminosidad-AB (LAB), valores de Luminance-Chroma-Hue (LCH), valores de Cyan-Magenta-Yellow-Key (CMYK), valores de colores naturales (NCOL), o con un nombre de color . También está disponible un canal alfa para indicar transparencia.

```csharp
public class Color
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Color](color#constructor)() | Inicializa una nueva instancia del[`Color`](../color) class. Por defecto el color es black. |
| [Color](color#constructor_1)(byte, byte, byte) | Inicializa una nueva instancia del[`Color`](../color)class. Todos los componentes de color deben estar en el rango 0-255. |
| [Color](color#constructor_5)(float, float, float) | Inicializa una nueva instancia del[`Color`](../color) class. Todos los componentes de color deben estar en el rango 0-1. |
| [Color](color#constructor_3)(int, int, int) | Inicializa una nueva instancia del[`Color`](../color)class. Todos los componentes de color deben estar en el rango 0-255. |
| [Color](color#constructor_2)(byte, byte, byte, byte) | Inicializa una nueva instancia del[`Color`](../color)class. Todos los componentes de color deben estar en el rango 0-255. |
| [Color](color#constructor_6)(float, float, float, float) | Inicializa una nueva instancia del[`Color`](../color) class. Todos los componentes de color deben estar en el rango 0-1. |
| [Color](color#constructor_4)(int, int, int, int) | Inicializa una nueva instancia del[`Color`](../color)class. Todos los componentes de color deben estar en el rango 0-255. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Alpha](../../aspose.svg.drawing/color/alpha) { get; } | Representa el componente alfa del color. |
| [Blue](../../aspose.svg.drawing/color/blue) { get; } | Representa el componente azul del color. |
| [Green](../../aspose.svg.drawing/color/green) { get; } | Representa el componente verde del color. |
| [Red](../../aspose.svg.drawing/color/red) { get; } | Representa el componente rojo del color |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [FromCmyk](../../aspose.svg.drawing/color/fromcmyk)(float, float, float, float) | Devuelve un nuevo Color con los valores solicitados de cian, magenta, amarillo, clave (negro). |
| static [FromCmyka](../../aspose.svg.drawing/color/fromcmyka)(float, float, float, float, float) | Devuelve un nuevo Color con los valores solicitados de cian, magenta, amarillo, clave (negro), alfa. |
| static [FromGray](../../aspose.svg.drawing/color/fromgray)(float) | Devuelve un nuevo Color con el valor de gris solicitado. |
| static [FromHsl](../../aspose.svg.drawing/color/fromhsl)(float, float, float) | Devuelve un nuevo color con el matiz, la saturación y los valores de saturación solicitados. |
| static [FromHsla](../../aspose.svg.drawing/color/fromhsla)(float, float, float, float) | Devuelve un nuevo Color con el matiz, la saturación, la saturación y los valores alfa solicitados. |
| static [FromHsv](../../aspose.svg.drawing/color/fromhsv)(float, float, float) | Devuelve un nuevo Color con el matiz, la saturación y el valor solicitados. |
| static [FromHsva](../../aspose.svg.drawing/color/fromhsva)(float, float, float, float) | Devuelve un nuevo Color con el matiz, la saturación, el valor, alfa. solicitados |
| static [FromHwb](../../aspose.svg.drawing/color/fromhwb)(float, float, float) | Devuelve un nuevo Color con los valores de matiz, blancura y negrura solicitados. |
| static [FromHwba](../../aspose.svg.drawing/color/fromhwba)(float, float, float, float) | Devuelve un nuevo Color con los valores de matiz, blancura y negrura solicitados. |
| static [FromInt](../../aspose.svg.drawing/color/fromint)(int) | Devuelve un nuevo Color con el valor ARGB solicitado. |
| static [FromLab](../../aspose.svg.drawing/color/fromlab)(float, float, float) | Devuelve un nuevo Color con la luminosidad solicitada, valores A, B. |
| static [FromLaba](../../aspose.svg.drawing/color/fromlaba)(float, float, float, float) | Devuelve un nuevo Color con la luminosidad solicitada, A, B, valores alfa. |
| static [FromLch](../../aspose.svg.drawing/color/fromlch)(float, float, float) | Devuelve un nuevo color con los valores de luminancia, croma y matiz solicitados. |
| static [FromLcha](../../aspose.svg.drawing/color/fromlcha)(float, float, float, float) | Devuelve un nuevo Color con los valores solicitados de luminancia, croma, matiz y alfa. |
| static [FromOklab](../../aspose.svg.drawing/color/fromoklab)(float, float, float) | Devuelve un nuevo Color con la luminosidad solicitada, valores A, B para el modelo OKLAB. |
| static [FromOklaba](../../aspose.svg.drawing/color/fromoklaba)(float, float, float, float) | Devuelve un nuevo Color con la luminosidad solicitada, A, B, valores alfa para el modelo OKLAB. |
| static [FromOklch](../../aspose.svg.drawing/color/fromoklch)(float, float, float) | Devuelve un nuevo color con los valores de luminancia, croma y matiz solicitados para el modelo OKLAB. |
| static [FromOklcha](../../aspose.svg.drawing/color/fromoklcha)(float, float, float, float) | Devuelve un nuevo Color con los valores solicitados de luminancia, croma, matiz y alfa para el modelo OKLAB. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb)(byte, byte, byte) | Devuelve un nuevo Color con los valores solicitados de ged, green, blue. Todos los componentes de color deben estar en el rango 0-255. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb_2)(float, float, float) | Devuelve un nuevo Color con los valores solicitados de ged, green, blue. Todos los componentes de color deben estar en el rango 0-1. |
| static [FromRgb](../../aspose.svg.drawing/color/fromrgb#fromrgb_1)(int, int, int) | Devuelve un nuevo Color con los valores solicitados de ged, green, blue. Todos los componentes de color deben estar en el rango 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba)(byte, byte, byte, byte) | Devuelve un nuevo Color con los valores alfa, verde, azul y ged solicitados. Todos los componentes de color deben estar en el rango 0-255. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba_2)(float, float, float, float) | Devuelve un nuevo Color con los valores alfa, verde, azul y ged solicitados. Todos los componentes de color deben estar en el rango 0-1. |
| static [FromRgba](../../aspose.svg.drawing/color/fromrgba#fromrgba_1)(int, int, int, int) | Devuelve un nuevo Color con los valores alfa, verde, azul y ged solicitados. Todos los componentes de color deben estar en el rango 0-255. |
| static [FromString](../../aspose.svg.drawing/color/fromstring)(string) | Analiza la cadena que contiene el color CSS y devuelve un nuevo Color. |
| static [FromUint](../../aspose.svg.drawing/color/fromuint)(uint) | Devuelve un nuevo Color con el valor ARGB solicitado. |
| [AddLuminosity](../../aspose.svg.drawing/color/addluminosity)(float) | Crea una copia del Color con la Suma de su luminosidad y el valor delta. |
| [Convert](../../aspose.svg.drawing/color/convert)(ColorModel) | Devuelve componentes de color en el formato del modelo de color especificado. |
| override [Equals](../../aspose.svg.drawing/color/equals)(object) | Determina si el especificado[`Color`](../color) es igual a esta instancia. |
| [GetComplementary](../../aspose.svg.drawing/color/getcomplementary)() | Devuelve un nuevo color que está en el lado opuesto de la rueda de colores del original. |
| override [GetHashCode](../../aspose.svg.drawing/color/gethashcode)() | Devuelve un código hash. |
| [GetHue](../../aspose.svg.drawing/color/gethue)() | Devuelve un Tono del Color. |
| [GetLuminosity](../../aspose.svg.drawing/color/getluminosity)() | Devuelve una luminosidad del Color. |
| [GetSaturation](../../aspose.svg.drawing/color/getsaturation)() | Devuelve una saturación del Color. |
| [ToInt](../../aspose.svg.drawing/color/toint)() | Codifica los componentes Color ARGB en int. |
| [ToName](../../aspose.svg.drawing/color/toname)() | Devuelve el nombre del color si coincide con un color en la lista de colores con nombre CSS, o una cadena vacía. |
| [ToNaturalColorString](../../aspose.svg.drawing/color/tonaturalcolorstring)(int) | Devuelve un color especificado de Colores naturales (NCol) usando una letra de color con un número para especificar la distancia (en porcentaje) desde el color. |
| [ToRgbaHexString](../../aspose.svg.drawing/color/torgbahexstring)() | Devuelve un color hexadecimal especificado con: #RRGGBBAA. |
| [ToRgbaString](../../aspose.svg.drawing/color/torgbastring)() | Devuelve una cadena que contiene el color RGBA especificado por: rgba(R, G, B, A). |
| [ToRgbHexString](../../aspose.svg.drawing/color/torgbhexstring)() | Devuelve un color hexadecimal especificado con: #RRGGBB. |
| [ToRgbString](../../aspose.svg.drawing/color/torgbstring)() | Devuelve una cadena que contiene el color RGB especificado por: rgb(R, G, B). |
| override [ToString](../../aspose.svg.drawing/color/tostring)() | Devuelve una cadena que consta de los valores del componente RGBA. |
| [ToUint](../../aspose.svg.drawing/color/touint)() | Codifica los componentes Color ARGB en int. sin firmar |
| [WithAlpha](../../aspose.svg.drawing/color/withalpha)(float) | Crea una copia del Color con el componente alfa especificado. |
| [WithHue](../../aspose.svg.drawing/color/withhue)(float) | Crea una copia del color con el tono especificado. |
| [WithLuminosity](../../aspose.svg.drawing/color/withluminosity)(float) | Crea una copia del Color con la luminosidad especificada. |
| [WithSaturation](../../aspose.svg.drawing/color/withsaturation)(float) | Crea una copia del Color con la saturación especificada. |

### Ver también

* espacio de nombres [Aspose.Svg.Drawing](../../aspose.svg.drawing)
* asamblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
