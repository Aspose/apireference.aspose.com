---
title: CSSValue Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.Css.CSSValue class. Represents a simple or a complex value. A CSSValue object only occurs in a context of a CSS property
type: docs
weight: 2490
url: /net/aspose.svg.dom.css/cssvalue/
---
## CSSValue class

Represents a simple or a complex value. A CSSValue object only occurs in a context of a CSS property.

```csharp
public abstract class CSSValue : DOMObject
```

## Properties

| Name | Description |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | The CSSText property of the `CSSValue` interface represents the current computed CSS property value. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | A code defining the type of the value. |

## Methods

| Name | Description |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(*object*) | Determines whether the specified Object is equal to this instance. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Returns a hash code for this instance. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | Returns a String that represents this instance. |
| [operator ==](../../aspose.svg.dom.css/cssvalue/op_equality/) | Implements the operator ==. |
| [operator !=](../../aspose.svg.dom.css/cssvalue/op_inequality/) | Implements the operator !=. |

## Fields

| Name | Description |
| --- | --- |
| const [CSS_CUSTOM](../../aspose.svg.dom.css/cssvalue/css_custom/) | The value is a custom value. |
| const [CSS_INHERIT](../../aspose.svg.dom.css/cssvalue/css_inherit/) | The value is inherited and the cssText contains "inherit". |
| const [CSS_PRIMITIVE_VALUE](../../aspose.svg.dom.css/cssvalue/css_primitive_value/) | The value is a primitive value and an instance of the CSSPrimitiveValue interface can be obtained by using binding-specific casting methods on this instance of the CSSValue interface. |
| const [CSS_VALUE_LIST](../../aspose.svg.dom.css/cssvalue/css_value_list/) | The value is a CSSValue list and an instance of the CSSValueList interface can be obtained by using binding-specific casting methods on this instance of the CSSValue interface. |

### See Also

* class [DOMObject](../../aspose.svg.dom/domobject/)
* namespace [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* assembly [Aspose.SVG](../../)
