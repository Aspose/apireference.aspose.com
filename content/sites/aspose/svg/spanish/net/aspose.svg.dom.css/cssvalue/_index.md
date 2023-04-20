---
title: Class CSSValue
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Dom.Css.CSSValue clase. Representa un valor simple o complejo. Un objeto CSSValue solo ocurre en un contexto de una propiedad CSS.
type: docs
weight: 490
url: /es/net/aspose.svg.dom.css/cssvalue/
---
## CSSValue class

Representa un valor simple o complejo. Un objeto CSSValue solo ocurre en un contexto de una propiedad CSS.

```csharp
public abstract class CSSValue : DOMObject
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | Una representación de cadena del valor actual. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | Un código que define el tipo del valor. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | Determina si el especificadoObject es igual a esta instancia. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Devuelve un código hash para esta instancia. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | Este método se utiliza para recuperar el objeto ECMAScriptType . |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | Devuelve unString que representa esta instancia. |
| [operator ==](../../aspose.svg.dom.css/cssvalue/op_equality/) | Implementa el operador ==. |
| [operator !=](../../aspose.svg.dom.css/cssvalue/op_inequality/) | Implementa el operador !=. |

## Campos

| Nombre | Descripción |
| --- | --- |
| const [CSS_CUSTOM](../../aspose.svg.dom.css/cssvalue/css_custom/) | El valor es un valor personalizado. |
| const [CSS_INHERIT](../../aspose.svg.dom.css/cssvalue/css_inherit/) | El valor se hereda y cssText contiene "heredar". |
| const [CSS_PRIMITIVE_VALUE](../../aspose.svg.dom.css/cssvalue/css_primitive_value/) | El valor es un valor primitivo y se puede obtener una instancia de la interfaz CSSPrimitiveValue mediante el uso de métodos de conversión específicos de enlace en esta instancia de la interfaz CSSValue. |
| const [CSS_VALUE_LIST](../../aspose.svg.dom.css/cssvalue/css_value_list/) | El valor es una lista CSSValue y se puede obtener una instancia de la interfaz CSSValueList utilizando métodos de conversión específicos de enlace en esta instancia de la interfaz CSSValue. |

### Ver también

* class [DOMObject](../../aspose.svg.dom/domobject/)
* espacio de nombres [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* asamblea [Aspose.SVG](../../)


