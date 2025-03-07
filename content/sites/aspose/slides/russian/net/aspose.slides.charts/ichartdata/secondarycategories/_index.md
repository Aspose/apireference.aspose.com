---
title: SecondaryCategories
second_title: Справочник по API Aspose.Slides для .NET
description: Получает вторичные категории если свойствоUseSecondaryCategoriesaspose.slides.charts/ichartdata/usesecondarycategoriesравно true. Только для чтенияIChartCategoryCollectionaspose.slides.charts/ichartcategorycollection.
type: docs
weight: 50
url: /ru/net/aspose.slides.charts/ichartdata/secondarycategories/
---
## IChartData.SecondaryCategories property

Получает вторичные категории, если свойство[`UseSecondaryCategories`](../usesecondarycategories)равно true. Только для чтения[`IChartCategoryCollection`](../../ichartcategorycollection).

```csharp
public IChartCategoryCollection SecondaryCategories { get; }
```

### Примечания

Если[`UseSecondaryCategories`](../usesecondarycategories)имеет значение false, то это свойство`SecondaryCategories` возвращает значение null и данные вCategoriesиспользуется как для первичного , так и для вторичного ряда. Если свойство[`UseSecondaryCategories`](../usesecondarycategories)истинно, то данные в этом`SecondaryCategories`свойство используется для вторичных рядов и данных в[`Categories`](../categories)свойство используется для первичных серии.

### Примеры

Пример. Какие категории связаны с сериями - ChartData.Categories или ChartData.SecondaryCategories?

```csharp
if (series.PlotOnSecondAxis && series.Chart.ChartData.UseSecondaryCategories)
{
     // связанные категории: series.Chart.ChartData.SecondaryCategories
}
else
{
     // связанные категории: series.Chart.ChartData.Categories
}
```

### Смотрите также

* interface [IChartCategoryCollection](../../ichartcategorycollection)
* interface [IChartData](../../ichartdata)
* пространство имен [Aspose.Slides.Charts](../../ichartdata)
* сборка [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
