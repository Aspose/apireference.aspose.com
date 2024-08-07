---
title: Add
second_title: Справочник по API Aspose.Slides для .NET
description: Если категория существует в коллекции вернуть ее. Else создает новую категорию диаграммы из IChartDataCellaspose.slides.charts/ichartdatacellи добавляет ее в коллекцию.
type: docs
weight: 70
url: /ru/net/aspose.slides.charts/chartcategorycollection/add/
---
## Add(IChartDataCell) {#add}

Если категория существует в коллекции, вернуть ее. Else создает новую категорию диаграммы из [`IChartDataCell`](../../ichartdatacell)и добавляет ее в коллекцию.

```csharp
public IChartCategory Add(IChartDataCell chartDataCell)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| chartDataCell | IChartDataCell | Ячейка, используемая для создания категории диаграммы. |

### Возвращаемое значение

Добавленная или существующая категория.

### Смотрите также

* interface [IChartCategory](../../ichartcategory)
* interface [IChartDataCell](../../ichartdatacell)
* class [ChartCategoryCollection](../../chartcategorycollection)
* пространство имен [Aspose.Slides.Charts](../../chartcategorycollection)
* сборка [Aspose.Slides](../../../)

---

## Add(object) {#add_1}

Создает новый[`ChartCategory`](../../chartcategory)из значения и добавляет его в коллекцию.

```csharp
public IChartCategory Add(object value)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| value | Object | Значение. |

### Возвращаемое значение

Добавлено[`IChartCategory`](../../ichartcategory).

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | при превышении лимита |

### Примечания

Этот метод добавляет рабочий лист с именем AUTO_DATA и добавляет туда все значения. Если вы используете[`ChartDataWorkbook`](../../chartdataworkbook)для добавления или редактирования значений ячеек, убедитесь, что вы не используете этот рабочий лист Максимальное количество значений, добавляемых с помощью этого метод не должен превышать 16711680

### Смотрите также

* interface [IChartCategory](../../ichartcategory)
* class [ChartCategoryCollection](../../chartcategorycollection)
* пространство имен [Aspose.Slides.Charts](../../chartcategorycollection)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
