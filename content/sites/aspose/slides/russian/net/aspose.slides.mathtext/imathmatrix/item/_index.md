---
title: Item
second_title: Справочник по API Aspose.Slides для .NET
description: Элементы матрицы
type: docs
weight: 70
url: /ru/net/aspose.slides.mathtext/imathmatrix/item/
---
## IMathMatrix indexer

Элементы матрицы

```csharp
public IMathElement this[int row, int column] { get; set; }
```

| Параметр | Описание |
| --- | --- |
| row | Отсчитываемый от нуля индекс матрицы строка для получения элемента |
| column | Отсчитываемый от нуля индекс столбца для получения элемента |

### Примеры

Пример:

```csharp
[C#]
IMathMatrix matrix = new MathMatrix(2, 3);
matrix[0, 0] = new MathematicalText("item.1.1");
```

### Смотрите также

* interface [IMathElement](../../imathelement)
* interface [IMathMatrix](../../imathmatrix)
* пространство имен [Aspose.Slides.MathText](../../imathmatrix)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
