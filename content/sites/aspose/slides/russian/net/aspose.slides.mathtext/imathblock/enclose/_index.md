---
title: Enclose
second_title: Справочник по API Aspose.Slides для .NET
description: Заключает дочерние элементы этого блока в указанные символы такие как круглые скобки или другие в качестве обрамления и разделяет символом-разделителем
type: docs
weight: 40
url: /ru/net/aspose.slides.mathtext/imathblock/enclose/
---
## IMathBlock.Enclose method

Заключает дочерние элементы этого блока в указанные символы, такие как круглые скобки или другие в качестве обрамления и разделяет символом-разделителем

```csharp
public IMathDelimiter Enclose(char beginningCharacter, char endingCharacter, 
    char separatorCharacter)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| beginningCharacter | Char | Начальный символ (обычно левая скобка) |
| endingCharacter | Char | Конечный символ (обычно правая скобка) ) |
| separatorCharacter | Char | Знак-разделитель |

### Возвращаемое значение

Математический элемент типа[`IMathDelimiter`](../../imathdelimiter)который включает указанные символы в качестве обрамления и разделителя

### Примеры

Пример:

```csharp
[C#]
IMathBlock mathBlock = new MathematicalText("x").Join("y");
IMathDelimiter delimiterElement = mathBlock.Enclose('{', '}', '%');
```

### Смотрите также

* interface [IMathDelimiter](../../imathdelimiter)
* interface [IMathBlock](../../imathblock)
* пространство имен [Aspose.Slides.MathText](../../imathblock)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
