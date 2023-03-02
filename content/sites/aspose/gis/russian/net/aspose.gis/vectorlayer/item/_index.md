---
title: VectorLayer.Item
second_title: Справочник по Aspose.GIS for .NET API
description: VectorLayer свойство. ПолучаетFeature по указанному индексу.
type: docs
weight: 70
url: /ru/net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

Получает[`Feature`](../../feature/) по указанному индексу.

```csharp
public virtual Feature this[int index] { get; }
```

| Параметр | Описание |
| --- | --- |
| index | Индекс функции. |

### Стоимость имущества

[`Feature`](../../feature/) .

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | выбрасывается, если слой открыт только для записи. |
| ArgumentOutOfRangeException | Индекс вне допустимого диапазона. |
| [GisException](../../gisexception/) | Ошибка чтения функции из файла. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [Feature](../../feature/)
* class [VectorLayer](../)
* пространство имен [Aspose.Gis](../../vectorlayer/)
* сборка [Aspose.GIS](../../../)


