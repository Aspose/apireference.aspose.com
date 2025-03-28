---
title: DelimiterShape
second_title: Справочник по API Aspose.Slides для .NET
description: Задает форму разделителей в объекте-разделителе. Когда MathDelimiterShape.Centered разделители центрируются вокруг математической оси математического текста и по-прежнему должны соответствовать всей высоте их содержимого. Когда MathDelimiterShape.Match их высота и форма изменяются чтобы точно соответствовать их содержимому.
type: docs
weight: 40
url: /ru/net/aspose.slides.mathtext/imathdelimiter/delimitershape/
---
## IMathDelimiter.DelimiterShape property

Задает форму разделителей в объекте-разделителе. Когда MathDelimiterShape.Centered, разделители центрируются вокруг математической оси математического текста и по-прежнему должны соответствовать всей высоте их содержимого. Когда MathDelimiterShape.Match, их высота и форма изменяются, чтобы точно соответствовать их содержимому.

```csharp
public MathDelimiterShape DelimiterShape { get; set; }
```

### Примеры

Пример:

```csharp
[C#]
IMathDelimiter delimiter = new MathematicalText("x").Divide("y").Enclose();
delimiter.DelimiterShape = MathDelimiterShape.Match;
```

### Смотрите также

* enum [MathDelimiterShape](../../mathdelimitershape)
* interface [IMathDelimiter](../../imathdelimiter)
* пространство имен [Aspose.Slides.MathText](../../imathdelimiter)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
