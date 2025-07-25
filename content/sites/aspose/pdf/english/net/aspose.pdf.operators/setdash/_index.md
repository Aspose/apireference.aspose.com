---
title: Class SetDash
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.Operators.SetDash class. Class representing d operator set line dash pattern
type: docs
weight: 7830
url: /net/aspose.pdf.operators/setdash/
---
## SetDash class

Class representing d operator (set line dash pattern).

```csharp
public class SetDash : Operator
```

## Constructors

| Name | Description |
| --- | --- |
| [SetDash](setdash/)(int[], int) | Creates set dash pattern operator. |

## Properties

| Name | Description |
| --- | --- |
| [Index](../../aspose.pdf/operator/index/) { get; set; } | Operator index in page operators list. |
| [Pattern](../../aspose.pdf.operators/setdash/pattern/) { get; set; } | Dash pattern. Array's elements shall be numbers that specify the lengths of alternating dashes and gaps. In case of one element array dash and gap lengths are equal. |
| [Phase](../../aspose.pdf.operators/setdash/phase/) { get; set; } | Dash phase. Before beginning to stroke a path, the dash array shall be cycled through, adding up the lengths of dashes and gaps. When the accumulated length equals the value specified by the dash phase, stroking of the path shall begin, and the dash array shall be used cyclically from that point onward. |

## Methods

| Name | Description |
| --- | --- |
| override [Accept](../../aspose.pdf.operators/setdash/accept/)(IOperatorSelector) | Accepts visitor object to process operator. |
| override [ToString](../../aspose.pdf.operators/setdash/tostring/)() | Gets operator string representation. |
| [ValueEquals](../../aspose.pdf/operator/valueequals/)(Operator) | Compares this instance with the given object. |

### See Also

* class [Operator](../../aspose.pdf/operator/)
* namespace [Aspose.Pdf.Operators](../../aspose.pdf.operators/)
* assembly [Aspose.PDF](../../)


