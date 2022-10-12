---
title: CSSPrimitiveValue
second_title: Referencia de API de Aspose.SVG para .NET
description: La interfaz CSSPrimitiveValue representa un único valor CSS. Esta interfaz se puede usar para determinar el valor de una propiedad de estilo específica establecida actualmente en un bloque o para establecer una propiedad de estilo específica explícitamente dentro del bloque. Se puede obtener una instancia de esta interfaz del método getPropertyCSSValue de la interfaz CSSStyleDeclaration. Un objeto CSSPrimitiveValue solo ocurre en un contexto de una propiedad CSS.
type: docs
weight: 480
url: /es/net/aspose.svg.dom.css/cssprimitivevalue/
---
## CSSPrimitiveValue class

La interfaz CSSPrimitiveValue representa un único valor CSS. Esta interfaz se puede usar para determinar el valor de una propiedad de estilo específica establecida actualmente en un bloque o para establecer una propiedad de estilo específica explícitamente dentro del bloque. Se puede obtener una instancia de esta interfaz del método getPropertyCSSValue de la interfaz CSSStyleDeclaration. Un objeto CSSPrimitiveValue solo ocurre en un contexto de una propiedad CSS.

```csharp
public abstract class CSSPrimitiveValue : CSSValue
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext) { get; set; } | Una representación de cadena del valor actual. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype) { get; } | Un código que define el tipo del valor. |
| [PrimitiveType](../../aspose.svg.dom.css/cssprimitivevalue/primitivetype) { get; } | El tipo del valor definido por las constantes especificadas anteriormente. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals)(object) | Determina si el especificadoObject es igual a esta instancia. |
| abstract [GetCounterValue](../../aspose.svg.dom.css/cssprimitivevalue/getcountervalue)() | Este método se utiliza para obtener el valor del contador. Si este valor de CSS no contiene un valor de contador, se genera una DOMException. La modificación de la propiedad de estilo correspondiente se puede lograr usando la interfaz Counter. |
| abstract [GetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/getfloatvalue)(ushort) | Este método se utiliza para obtener un valor flotante en una unidad específica. Si este valor CSS no contiene un valor flotante o no se puede convertir a la unidad especificada, se genera una DOMException. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode)() | Devuelve un código hash para esta instancia. |
| abstract [GetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/getintvalue)(ushort) | Este método se usa para obtener un valor int en una unidad específica. Si este valor CSS no contiene un valor int o no se puede convertir a la unidad especificada, se genera una DOMException. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype)() | Este método se utiliza para recuperar el objeto ECMAScriptType . |
| abstract [GetRectValue](../../aspose.svg.dom.css/cssprimitivevalue/getrectvalue)() | Este método se utiliza para obtener el valor Rect. Si este valor CSS no contiene un valor rect, se genera una DOMException. La modificación de la propiedad de estilo correspondiente se puede lograr usando la interfaz Rect. |
| abstract [GetRGBColorValue](../../aspose.svg.dom.css/cssprimitivevalue/getrgbcolorvalue)() | Este método se utiliza para obtener el color RGB. Si este valor CSS no contiene un valor de color RGB, se genera una DOMException. La modificación de la propiedad de estilo correspondiente se puede lograr utilizando la interfaz RGBColor. |
| abstract [GetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/getstringvalue)() | Este método se utiliza para obtener el valor de la cadena. Si el valor de CSS no contiene un valor de cadena, se genera una DOMException. |
| abstract [SetFloatValue](../../aspose.svg.dom.css/cssprimitivevalue/setfloatvalue)(ushort, float) | Un método para establecer el valor flotante con una unidad específica. Si la propiedad asociada con este valor no puede aceptar la unidad especificada o el valor flotante, el valor no cambiará y se generará una DOMException. |
| abstract [SetIntValue](../../aspose.svg.dom.css/cssprimitivevalue/setintvalue)(ushort, int) | Un método para establecer el valor int con una unidad específica. Si la propiedad adjunta con este valor no puede aceptar la unidad especificada o el valor int, el valor no cambiará y se generará una DOMException. |
| abstract [SetStringValue](../../aspose.svg.dom.css/cssprimitivevalue/setstringvalue)(ushort, string) | Un método para establecer el valor de cadena con la unidad especificada. Si la propiedad adjunta a este valor no puede aceptar la unidad especificada o el valor de cadena, el valor no cambiará y se generará una DOMException. |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring)() | Devuelve unString que representa esta instancia. |

## Campos

| Nombre | Descripción |
| --- | --- |
| const [CSS_ATTR](../../aspose.svg.dom.css/cssprimitivevalue/css_attr) | El valor es una función de atributo. El valor se puede obtener usando el método getStringValue. |
| const [CSS_CH](../../aspose.svg.dom.css/cssprimitivevalue/css_ch) | El valor es una longitud (ch). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_CM](../../aspose.svg.dom.css/cssprimitivevalue/css_cm) | El valor es una longitud (cm). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_COUNTER](../../aspose.svg.dom.css/cssprimitivevalue/css_counter) | El valor es una función de contador o contadores. El valor se puede obtener utilizando el método GetCounterValue. |
| const [CSS_DEG](../../aspose.svg.dom.css/cssprimitivevalue/css_deg) | El valor es un ángulo (grados). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_DIMENSION](../../aspose.svg.dom.css/cssprimitivevalue/css_dimension) | El valor es un número con una dimensión desconocida. El valor se puede obtener usando el método getFloatValue. |
| const [CSS_DPCM](../../aspose.svg.dom.css/cssprimitivevalue/css_dpcm) | El valor es un punto por centímetro (dpcm). |
| const [CSS_DPI](../../aspose.svg.dom.css/cssprimitivevalue/css_dpi) | El valor es puntos por pulgada (ppp). |
| const [CSS_DPPX](../../aspose.svg.dom.css/cssprimitivevalue/css_dppx) | El valor es un punto por unidad 'px' (dppx). |
| const [CSS_EMS](../../aspose.svg.dom.css/cssprimitivevalue/css_ems) | El valor es una longitud (ems). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_EXS](../../aspose.svg.dom.css/cssprimitivevalue/css_exs) | El valor es una longitud (exs). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_GRAD](../../aspose.svg.dom.css/cssprimitivevalue/css_grad) | El valor es un ángulo (grad). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_HZ](../../aspose.svg.dom.css/cssprimitivevalue/css_hz) | El valor es una frecuencia (Hz). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_IDENT](../../aspose.svg.dom.css/cssprimitivevalue/css_ident) | El valor es un identificador. El valor se puede obtener usando el método getStringValue. |
| const [CSS_IN](../../aspose.svg.dom.css/cssprimitivevalue/css_in) | El valor es una longitud (in). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_KHZ](../../aspose.svg.dom.css/cssprimitivevalue/css_khz) | El valor es una frecuencia (kHz). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_MM](../../aspose.svg.dom.css/cssprimitivevalue/css_mm) | El valor es una longitud (mm). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_MS](../../aspose.svg.dom.css/cssprimitivevalue/css_ms) | El valor es un tiempo (ms). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_NUMBER](../../aspose.svg.dom.css/cssprimitivevalue/css_number) | El valor es un número simple. El valor se puede obtener usando el método getFloatValue. |
| const [CSS_PC](../../aspose.svg.dom.css/cssprimitivevalue/css_pc) | El valor es una longitud (pc). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_PERCENTAGE](../../aspose.svg.dom.css/cssprimitivevalue/css_percentage) | El valor es un porcentaje. El valor se puede obtener usando el método getFloatValue. |
| const [CSS_PT](../../aspose.svg.dom.css/cssprimitivevalue/css_pt) | El valor es una longitud (pt). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_PX](../../aspose.svg.dom.css/cssprimitivevalue/css_px) | El valor es una longitud (px). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_RAD](../../aspose.svg.dom.css/cssprimitivevalue/css_rad) | El valor es un ángulo (rad). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_RECT](../../aspose.svg.dom.css/cssprimitivevalue/css_rect) | El valor es una función rect. El valor se puede obtener utilizando el método GetRectValue. |
| const [CSS_REM](../../aspose.svg.dom.css/cssprimitivevalue/css_rem) | El valor es una longitud (rem). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_RGBCOLOR](../../aspose.svg.dom.css/cssprimitivevalue/css_rgbcolor) | El valor es un color RGB. El valor se puede obtener usando el método GetRGBColorValue. |
| const [CSS_S](../../aspose.svg.dom.css/cssprimitivevalue/css_s) | El valor es un tiempo (s). El valor se puede obtener usando el método getFloatValue. |
| const [CSS_STRING](../../aspose.svg.dom.css/cssprimitivevalue/css_string) | El valor es una CADENA. El valor se puede obtener usando el método getStringValue. |
| const [CSS_UNKNOWN](../../aspose.svg.dom.css/cssprimitivevalue/css_unknown) | El valor no es un valor CSS2 reconocido. El valor solo se puede obtener utilizando el atributo cssText. |
| const [CSS_URI](../../aspose.svg.dom.css/cssprimitivevalue/css_uri) | El valor es un URI. El valor se puede obtener usando el método getStringValue. |
| const [CSS_VH](../../aspose.svg.dom.css/cssprimitivevalue/css_vh) | El valor es un porcentaje de la altura total de la ventana gráfica. |
| const [CSS_VMAX](../../aspose.svg.dom.css/cssprimitivevalue/css_vmax) | El valor es un porcentaje del ancho o alto de la ventana gráfica, el que sea mayor. |
| const [CSS_VMIN](../../aspose.svg.dom.css/cssprimitivevalue/css_vmin) | El valor es un porcentaje del ancho o alto de la ventana gráfica, el que sea menor. |
| const [CSS_VW](../../aspose.svg.dom.css/cssprimitivevalue/css_vw) | El valor es un porcentaje del ancho total de la ventana gráfica. |

### Ver también

* class [CSSValue](../cssvalue)
* espacio de nombres [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css)
* asamblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
