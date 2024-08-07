---
title: EndingCharacter
second_title: Aspose.Sildes for .NET API Reference
description: Delimiter Ending Character specifies the ending or closing delimiter character. Mathematical delimiters are enclosing characters such as parentheses brackets and braces. The default .
type: docs
weight: 50
url: /net/aspose.slides.mathtext/mathdelimiter/endingcharacter/
---
## MathDelimiter.EndingCharacter property

Delimiter Ending Character specifies the ending, or closing, delimiter character. Mathematical delimiters are enclosing characters such as parentheses, brackets, and braces. The default: ')'.

```csharp
public char EndingCharacter { get; set; }
```

### Examples

Example:

```csharp
[C#]
IMathDelimiter delimiter = new MathematicalText("x").Join("y").Enclose();
delimiter.EndingCharacter = ']';
```

### See Also

* class [MathDelimiter](../../mathdelimiter)
* namespace [Aspose.Slides.MathText](../../mathdelimiter)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
