---
title: Метка данных диаграммы
linktitle: Метка данных диаграммы
second_title: Справочник по API Aspose.Words для .NET
description: Узнайте, как добавлять и настраивать метки данных на диаграмме с помощью Aspose.Words for .NET, чтобы предоставить дополнительную информацию о точках данных.
type: docs
weight: 10
url: /ru/net/programming-with-charts/chart-data-label/
---

В этом руководстве объясняется, как добавлять и настраивать метки данных на диаграмме с помощью Aspose.Words для .NET. Метки данных предоставляют дополнительную информацию о точках данных на диаграмме.

## Предпосылки
Чтобы следовать этому руководству, вам необходимо иметь следующее:

- Установлена библиотека Aspose.Words for .NET.
- Базовые знания C# и работы с документами Word.

## Шаг 1. Настройте каталог документов
 Начните с настройки пути к каталогу документов. Заменять`"YOUR DOCUMENT DIRECTORY"`с фактическим путем к каталогу, в котором вы хотите сохранить документ.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Шаг 2: Создайте новый документ и DocumentBuilder
 Создайте новый экземпляр`Document` класс и`DocumentBuilder` объект для работы с документом.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Шаг 3. Вставьте и настройте диаграмму
 Вставьте диаграмму в документ с помощью кнопки`InsertChart` метод`DocumentBuilder` объект. Установите желаемый тип диаграммы и размеры.

```csharp
Shape shape = builder.InsertChart(ChartType.Bar, 432, 252);
Chart chart = shape.Chart;
```

## Шаг 4. Настройте метки данных
Получите доступ к коллекции меток данных серии диаграмм и измените различные свойства, чтобы настроить внешний вид меток данных.

```csharp
ChartSeries series0 = shape.Chart.Series[0];
ChartDataLabelCollection labels = series0.DataLabels;
labels.ShowLegendKey = true;
labels.ShowLeaderLines = true;
labels.ShowCategoryName = false;
labels.ShowPercentage = false;
labels.ShowSeriesName = true;
labels.ShowValue = true;
labels.Separator = "/";
```

## Шаг 5: Сохраните документ
 Сохраните документ в указанную директорию с помощью`Save` метод. Укажите желаемое имя файла с соответствующим расширением файла. В этом примере мы сохраняем документ как «WorkingWithCharts.ChartDataLabel.docx».

```csharp
doc.Save(dataDir + "WorkingWithCharts.ChartDataLabel.docx");
```

### Пример исходного кода для метки данных диаграммы с использованием Aspose.Words для .NET 

```csharp
	// Путь к вашему каталогу документов
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);
	Shape shape = builder.InsertChart(ChartType.Bar, 432, 252);
	Chart chart = shape.Chart;
	ChartSeries series0 = shape.Chart.Series[0];
	ChartDataLabelCollection labels = series0.DataLabels;
	labels.ShowLegendKey = true;
	//По умолчанию, когда вы добавляете метки данных к точкам данных на круговой диаграмме, линии выноски отображаются для меток данных, которые
	// расположен далеко за пределами конца точек данных. Линии выноски создают визуальную связь между меткой данных и ее
	// соответствующую точку данных.
	labels.ShowLeaderLines = true;
	labels.ShowCategoryName = false;
	labels.ShowPercentage = false;
	labels.ShowSeriesName = true;
	labels.ShowValue = true;
	labels.Separator = "/";
	labels.ShowValue = true;
	doc.Save(dataDir + "WorkingWithCharts.ChartDataLabel.docx");
```

Вот и все! Вы успешно добавили и настроили метки данных на диаграмме с помощью Aspose.Words для .NET.