---
title: CSSValueList Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.Css.CSSValueList class. The CSSValueList interface provides the abstraction of an ordered collection of CSS values
type: docs
weight: 360
url: /net/aspose.svg.dom.css/cssvaluelist/
---
## CSSValueList class

The CSSValueList interface provides the abstraction of an ordered collection of CSS values.

```csharp
public class CSSValueList : CSSValue, ICSSValueList, IEnumerable<CSSValue>
```

## Constructors

| Name | Description |
| --- | --- |
| [CSSValueList](cssvaluelist/#constructor)() | Initializes a new instance of the `CSSValueList` class. |
| [CSSValueList](cssvaluelist/#constructor_1)(params CSSValue[]) | Initializes a new instance of the `CSSValueList` class. |
| [CSSValueList](cssvaluelist/#constructor_2)(IEnumerable&lt;CSSValue&gt;) | Initializes a new instance of the `CSSValueList` class. |

## Properties

| Name | Description |
| --- | --- |
| override [CSSText](../../aspose.svg.dom.css/cssvaluelist/csstext/) { get; set; } | A string representation of the current value. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | A code defining the type of the value. |
| [Item](../../aspose.svg.dom.css/cssvaluelist/item/) { get; } | Gets the [`CSSValue`](../cssvalue/) at the specified index. |
| [Length](../../aspose.svg.dom.css/cssvaluelist/length/) { get; } | The number of CSSValues in the list. |

## Methods

| Name | Description |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | Determines whether the specified Object is equal to this instance. |
| [GetEnumerator](../../aspose.svg.dom.css/cssvaluelist/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Returns a hash code for this instance. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvaluelist/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | Returns a String that represents this instance. |

### See Also

* class [CSSValue](../cssvalue/)
* interface [ICSSValueList](../icssvaluelist/)
* namespace [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* assembly [Aspose.SVG](../../)
