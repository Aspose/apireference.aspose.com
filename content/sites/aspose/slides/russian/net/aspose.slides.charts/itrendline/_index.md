---
title: ITrendline
second_title: Справочник по API Aspose.Slides для .NET
description: Класс представляет линию тренда ряда диаграммы
type: docs
weight: 2100
url: /ru/net/aspose.slides.charts/itrendline/
---
## ITrendline interface

Класс представляет линию тренда ряда диаграммы

```csharp
public interface ITrendline : IOverridableText
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [AsIOverridableText](../../aspose.slides.charts/itrendline/asioverridabletext) { get; } | Возвращает интерфейс IOverridableText. Только для чтения[`IOverridableText`](../ioverridabletext). |
| [Backward](../../aspose.slides.charts/itrendline/backward) { get; set; } | Указывает количество категорий (или единиц на точечной диаграмме), которые линия тренда проходит перед данными для ряда, для которого составляется тренд . На точечных и нерассеянных диаграммах значение должно быть любым неотрицательным значением. Чтение/записьDouble. |
| [DisplayEquation](../../aspose.slides.charts/itrendline/displayequation) { get; set; } | Указывает, что уравнение для линии тренда отображается на диаграмме (в той же метке, что и значение Rsquared). Чтение/записьBoolean. |
| [DisplayRSquaredValue](../../aspose.slides.charts/itrendline/displayrsquaredvalue) { get; set; } | Указывает, что значение R-квадрата линии тренда отображается на диаграмме (в той же метке, что и уравнение). Чтение/записьBoolean. |
| [Format](../../aspose.slides.charts/itrendline/format) { get; set; } | Представляет формат линии тренда. Чтение/запись[`IFormat`](../iformat). |
| [Forward](../../aspose.slides.charts/itrendline/forward) { get; set; } | Определяет количество категорий (или единиц на точечной диаграмме), которые линия тренда проходит после данных для ряда, для которого анализируется тренд. На точечных и нерассеянных диаграммах значение должно быть любым неотрицательным значением. Чтение/записьDouble. |
| [Intercept](../../aspose.slides.charts/itrendline/intercept) { get; set; } | Указывает значение, при котором линия тренда должна пересекать ось Y. Это свойство должно поддерживаться только когда тип линии тренда exp, linear или poly. Чтение/записьDouble. |
| [Order](../../aspose.slides.charts/itrendline/order) { get; set; } | Задает порядок полиномиальной линии тренда. Он игнорируется для других типов линий тренда. Значение должно быть между 2 и 6. Чтение/записьByte. |
| [Period](../../aspose.slides.charts/itrendline/period) { get; set; } | Определяет период линии тренда для линии тренда скользящего среднего. Для других вариантов линии тренда игнорируется. Значение должно быть между 2 и 255. Чтение/записьByte. |
| [RelatedLegendEntry](../../aspose.slides.charts/itrendline/relatedlegendentry) { get; } | Представляет запись легенды, связанную с этой линией тренда Только для чтения[`ILegendEntryProperties`](../ilegendentryproperties). |
| [TrendlineName](../../aspose.slides.charts/itrendline/trendlinename) { get; set; } | Получает или задает имя линии тренда. Чтение/записьString. |
| [TrendlineType](../../aspose.slides.charts/itrendline/trendlinetype) { get; set; } | Получает или задает тип линии тренда. Чтение/запись[`TrendlineType`](./trendlinetype). |

### Смотрите также

* interface [IOverridableText](../ioverridabletext)
* пространство имен [Aspose.Slides.Charts](../../aspose.slides.charts)
* сборка [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
