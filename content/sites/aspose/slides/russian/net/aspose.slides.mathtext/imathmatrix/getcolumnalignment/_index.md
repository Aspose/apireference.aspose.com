---
title: GetColumnAlignment
second_title: Справочник по API Aspose.Slides для .NET
description: Получить горизонтальное выравнивание указанного столбца
type: docs
weight: 140
url: /ru/net/aspose.slides.mathtext/imathmatrix/getcolumnalignment/
---
## IMathMatrix.GetColumnAlignment method

Получить горизонтальное выравнивание указанного столбца

```csharp
public MathHorizontalAlignment GetColumnAlignment(int columnIndex)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| columnIndex | Int32 | Zero- индекс столбца на основе |

### Возвращаемое значение

Горизонтальное выравнивание указанного столбца

### Примеры

Пример:

```csharp
[C#]
IMathMatrix matrix = new MathMatrix(2, 3);
MathHorizontalAlignment alignment = matrix.GetColumnAlignment(0);
```

### Смотрите также

* enum [MathHorizontalAlignment](../../mathhorizontalalignment)
* interface [IMathMatrix](../../imathmatrix)
* пространство имен [Aspose.Slides.MathText](../../imathmatrix)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
