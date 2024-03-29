---
title: Enum EquationNodeType
second_title: Aspose.Cells for .NET API Reference
description: Aspose.Cells.Drawing.Equations.EquationNodeType enum. Equation node type. Notice 1199 Currently there is only one node in the scope and its enumeration value is 1. The node it specifies is used to store mathematical text. 2100199 Indicates that the node is a component of some special function nodes. 3200 Indicates that the node has some special functionsUsually with Equation suffix. EquationParagraph is a special case
type: docs
url: /net/aspose.cells.drawing.equations/equationnodetype/
---
## EquationNodeType enumeration

Equation node type. Notice: (1)[1-99] Currently there is only one node in the scope, and its enumeration value is 1. The node it specifies is used to store mathematical text. (2)[100-199] Indicates that the node is a component of some special function nodes. (3)[200-] Indicates that the node has some special functions(Usually with 'Equation' suffix. 'EquationParagraph' is a special case.).

```csharp
public enum EquationNodeType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| UnKnow | `0` | UnKnow |
| Text | `1` | specifies a node that stores math text |
| Base | `100` | Specifies a component of type 'Base' |
| Denominator | `101` | Specifies a component of type 'Denominator' |
| Numerator | `102` | Specifies a component of type 'Numerator' |
| FunctionName | `103` | Specifies a component of type 'FunctionName' |
| Subscript | `104` | Specifies a component of type 'Subscript' |
| Superscript | `105` | Specifies a component of type 'Superscript' |
| Degree | `106` | Specifies a component of type 'Degree' |
| MatrixRow | `107` | Specifies a component of type 'MatrixRow'.A single row of the matrix |
| EquationParagraph | `200` | Specifies a mathematical paragraph(oMathPara). |
| MathematicalEquation | `201` | Specifies an equation or mathematical expression(OMath). |
| FractionEquation | `202` | Specifies fractional equation |
| FunctionEquation | `203` | Specifies function equation |
| DelimiterEquation | `204` | Specifies delimiter equation |
| NaryEquation | `205` | Specifies n-ary operator equation |
| RadicalEquation | `206` | Specifies the radical equation |
| SuperscriptEquation | `207` | Specifies superscript equation |
| SubscriptEquation | `208` | Specifies subscript equation |
| SubSupEquation | `209` | Specifies an equation with superscripts and subscripts to the right of the operands. |
| PreSubSupEquation | `210` | Specifies an equation with superscripts and subscripts to the left of the operands. |
| AccentEquation | `211` | Specifies accent equation |
| BarEquation | `212` | Specifies bar equation |
| BorderBoxEquation | `213` | Specifies border box equation |
| BoxEquation | `214` | Specifies box equation |
| GroupCharacterEquation | `215` | Specifies Group-Character equation |
| MatrixEquation | `216` | Specifies the Matrix equation, |

### See Also

* namespace [Aspose.Cells.Drawing.Equations](../../aspose.cells.drawing.equations/)
* assembly [Aspose.Cells](../../)


