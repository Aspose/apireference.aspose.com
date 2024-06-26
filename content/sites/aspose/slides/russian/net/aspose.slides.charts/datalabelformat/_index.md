---
title: DataLabelFormat
second_title: Справочник по API Aspose.Slides для .NET
description: Представляет параметры форматирования для DataLabel.
type: docs
weight: 1430
url: /ru/net/aspose.slides.charts/datalabelformat/
---
## DataLabelFormat class

Представляет параметры форматирования для DataLabel.

```csharp
public class DataLabelFormat : PVIObject, IDataLabelFormat
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [AsIPresentationComponent](../../aspose.slides/pviobject/asipresentationcomponent) { get; } | Позволяет получить базовый интерфейс IPresentationComponent. Только для чтения[`IPresentationComponent`](../../aspose.slides/ipresentationcomponent). |
| [Chart](../../aspose.slides.charts/datalabelformat/chart) { get; } | Возвращает диаграмму. Только для чтения[`IChart`](../ichart). |
| [Format](../../aspose.slides.charts/datalabelformat/format) { get; } | Представляет формат метки данных. Только для чтения[`IFormat`](../iformat). |
| [IsNumberFormatLinkedToSource](../../aspose.slides.charts/datalabelformat/isnumberformatlinkedtosource) { get; set; } | Чтение/записьBoolean. |
| [NumberFormat](../../aspose.slides.charts/datalabelformat/numberformat) { get; set; } | Представляет строку формата для объекта DataLabels. Чтение/записьString. |
| [Position](../../aspose.slides.charts/datalabelformat/position) { get; set; } | Представляет позицию метки данных. Чтение/запись[`LegendDataLabelPosition`](../legenddatalabelposition). |
| [Separator](../../aspose.slides.charts/datalabelformat/separator) { get; set; } | Задает или возвращает Variant, представляющий разделитель, используемый для меток данных на диаграмме. Чтение/записьString. |
| [ShowBubbleSize](../../aspose.slides.charts/datalabelformat/showbubblesize) { get; set; } | Представляет поведение отображения значения размера пузырька метки данных указанной диаграммы. True отображает значение размера пузырька. Ложь скрывать. Чтение/записьBoolean. |
| [ShowCategoryName](../../aspose.slides.charts/datalabelformat/showcategoryname) { get; set; } | Представляет поведение отображения имени категории метки данных указанной диаграммы. Значение true, чтобы отобразить имя категории для меток данных на диаграмме. Ложь скрывать. Чтение/записьBoolean. |
| [ShowLabelAsDataCallout](../../aspose.slides.charts/datalabelformat/showlabelasdatacallout) { get; set; } | Определяет, будет ли указанная метка данных диаграммы отображаться как выноска данных или как метка данных.  Если родителем этого объекта DataLabelFormat является коллекция меток данных DataLabelCollection, то это свойство получает или задает значение по умолчанию значение свойства ShowLabelAsDataCallout для новых меток данных в коллекции DataLabelCollection. Присвоение этому свойству значения также устанавливает это значение в свойство ShowLabelAsDataCallout для всех меток данных в коллекции DataLabelCollection (т.е. "DataLabels.DefaultDataLabelFormat.ShowLabelAsDataCallout = val;" приводит к тому, что все DataLabels[i].ShowLabelAsDataCallout равно val). |
| [ShowLabelValueFromCell](../../aspose.slides.charts/datalabelformat/showlabelvaluefromcell) { get; set; } | Представляет поведение отображения значения ячейки метки данных указанной диаграммы. True отображает значение ячейки. Ложь скрывать. Чтение/записьBoolean. |
| [ShowLeaderLines](../../aspose.slides.charts/datalabelformat/showleaderlines) { get; set; } | Представляет поведение отображения линий выноски меток данных указанной диаграммы. True отображает линии выноски. Ложь скрывать. Чтение/записьBoolean. |
| [ShowLegendKey](../../aspose.slides.charts/datalabelformat/showlegendkey) { get; set; } | Представляет поведение отображения клавиши легенды метки данных указанной диаграммы. True, если ключ легенды метки данных виден. Чтение/записьBoolean. |
| [ShowPercentage](../../aspose.slides.charts/datalabelformat/showpercentage) { get; set; } | Представляет поведение отображения процентного значения метки данных указанной диаграммы. True отображает процентное значение. Ложь скрывать. Чтение/записьBoolean. |
| [ShowSeriesName](../../aspose.slides.charts/datalabelformat/showseriesname) { get; set; } | Возвращает или задает логическое значение, указывающее поведение отображения имени ряда для меток данных на диаграмме. True, чтобы показать название серии. Ложь скрывать. Чтение/записьBoolean. |
| [ShowValue](../../aspose.slides.charts/datalabelformat/showvalue) { get; set; } | Представляет поведение отображения процентного значения метки данных указанной диаграммы. True отображает процентное значение. Ложь скрывать. Чтение/записьBoolean. |
| [TextFormat](../../aspose.slides.charts/datalabelformat/textformat) { get; } | Возвращает формат текста диаграммы. Только чтение[`IChartTextFormat`](../icharttextformat). |

## Методы

| Имя | Описание |
| --- | --- |
| override [Equals](../../aspose.slides/pviobject/equals)(object) | Сравнивает с указанным объектом. |
| override [GetHashCode](../../aspose.slides/pviobject/gethashcode)() | Возвращает хэш-код. |

### Смотрите также

* class [PVIObject](../../aspose.slides/pviobject)
* interface [IDataLabelFormat](../idatalabelformat)
* пространство имен [Aspose.Slides.Charts](../../aspose.slides.charts)
* сборка [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
