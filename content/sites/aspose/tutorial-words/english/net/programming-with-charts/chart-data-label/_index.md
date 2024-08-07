---
title: Chart Data Label
linktitle: Chart Data Label
second_title: Aspose.Words for .NET API Reference
description: Learn how to add and customize data labels in a chart using Aspose.Words for .NET to provide additional information about data points.
type: docs
weight: 10
url: /net/programming-with-charts/chart-data-label/
---

This tutorial explains how to add and customize data labels in a chart using Aspose.Words for .NET. Data labels provide additional information about the data points in a chart.

## Prerequisites
To follow this tutorial, you need to have the following:

- Aspose.Words for .NET library installed.
- Basic knowledge of C# and working with Word documents.

## Step 1: Set up the Document Directory
Start by setting up the path to your document directory. Replace `"YOUR DOCUMENT DIRECTORY"` with the actual path to the directory where you want to save the document.

```csharp
string dataDir = "YOUR DOCUMENT DIRECTORY";
```

## Step 2: Create a New Document and DocumentBuilder
Create a new instance of the `Document` class and a `DocumentBuilder` object to work with the document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## Step 3: Insert and Configure a Chart
Insert a chart into the document using the `InsertChart` method of the `DocumentBuilder` object. Set the desired chart type and dimensions.

```csharp
Shape shape = builder.InsertChart(ChartType.Bar, 432, 252);
Chart chart = shape.Chart;
```

## Step 4: Customize Data Labels
Access the data labels collection of the chart series and modify various properties to customize the appearance of the data labels.

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

## Step 5: Save the Document
Save the document to the specified directory using the `Save` method. Provide the desired filename with the appropriate file extension. In this example, we save the document as "WorkingWithCharts.ChartDataLabel.docx".

```csharp
doc.Save(dataDir + "WorkingWithCharts.ChartDataLabel.docx");
```

### Example source code for Chart Data Label using Aspose.Words for .NET 

```csharp
	// Path to your document directory 
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);
	Shape shape = builder.InsertChart(ChartType.Bar, 432, 252);
	Chart chart = shape.Chart;
	ChartSeries series0 = shape.Chart.Series[0];
	ChartDataLabelCollection labels = series0.DataLabels;
	labels.ShowLegendKey = true;
	// By default, when you add data labels to the data points in a pie chart, leader lines are displayed for data labels that are
	// positioned far outside the end of data points. Leader lines create a visual connection between a data label and its 
	// corresponding data point.
	labels.ShowLeaderLines = true;
	labels.ShowCategoryName = false;
	labels.ShowPercentage = false;
	labels.ShowSeriesName = true;
	labels.ShowValue = true;
	labels.Separator = "/";
	labels.ShowValue = true;
	doc.Save(dataDir + "WorkingWithCharts.ChartDataLabel.docx");
```

That's it! You have successfully added and customized data labels in a chart using Aspose.Words for .NET.