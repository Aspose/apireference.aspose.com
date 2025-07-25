---
title: CSSValue Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Css.CSSValue class. Represents a simple or a complex value. A CSSValue object only occurs in a context of a CSS property
type: docs
weight: 510
url: /net/aspose.html.dom.css/cssvalue/
---
## CSSValue class

Represents a simple or a complex value. A CSSValue object only occurs in a context of a CSS property.

```csharp
public abstract class CSSValue : DOMObject
```

## Properties

| Name | Description |
| --- | --- |
| abstract [CSSText](../../aspose.html.dom.css/cssvalue/csstext/) { get; set; } | The CSSText property of the `CSSValue` interface represents the current computed CSS property value. |
| [CSSValueType](../../aspose.html.dom.css/cssvalue/cssvaluetype/) { get; } | A code defining the type of the value. |

## Methods

| Name | Description |
| --- | --- |
| override [Equals](../../aspose.html.dom.css/cssvalue/equals/)(*object*) | Determines whether the specified Object is equal to this instance. |
| override [GetHashCode](../../aspose.html.dom.css/cssvalue/gethashcode/)() | Returns a hash code for this instance. |
| override [GetPlatformType](../../aspose.html.dom.css/cssvalue/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| override [ToString](../../aspose.html.dom.css/cssvalue/tostring/)() | Returns a String that represents this instance. |
| [operator ==](../../aspose.html.dom.css/cssvalue/op_equality/) | Implements the operator ==. |
| [operator !=](../../aspose.html.dom.css/cssvalue/op_inequality/) | Implements the operator !=. |

## Fields

| Name | Description |
| --- | --- |
| const [CSS_CUSTOM](../../aspose.html.dom.css/cssvalue/css_custom/) | The value is a custom value. |
| const [CSS_INHERIT](../../aspose.html.dom.css/cssvalue/css_inherit/) | The value is inherited and the cssText contains "inherit". |
| const [CSS_PRIMITIVE_VALUE](../../aspose.html.dom.css/cssvalue/css_primitive_value/) | The value is a primitive value and an instance of the CSSPrimitiveValue interface can be obtained by using binding-specific casting methods on this instance of the CSSValue interface. |
| const [CSS_VALUE_LIST](../../aspose.html.dom.css/cssvalue/css_value_list/) | The value is a CSSValue list and an instance of the CSSValueList interface can be obtained by using binding-specific casting methods on this instance of the CSSValue interface. |

### See Also

* class [DOMObject](../../aspose.html.dom/domobject/)
* namespace [Aspose.Html.Dom.Css](../../aspose.html.dom.css/)
* assembly [Aspose.HTML](../../)
