---
title: Insert Scatter Chart
linktitle: Insert Scatter Chart
second_title: Aspose.Words for .NET API Reference
description: Learn how to insert a scatter chart into a document using Aspose.Words for .NET. Add series data with X and Y coordinates.
type: docs
weight: 10
url: /net/programming-with-charts/insert-scatter-chart/
---

This tutorial explains how to use Aspose.Words for .NET to insert a scatter chart into a document. The provided source code demonstrates how to create a chart, add series data, and save the document.

## Step 1: Set up the project

Ensure that you have the following prerequisites:

- Aspose.Words for .NET library installed. You can download it from the official Aspose website or use NuGet package manager to install it.
- A document directory path where the output document will be saved.

## Step 2: Create a new document and insert a chart

Create a new `Document` object and a `DocumentBuilder` to build the document.

```csharp
// Path to your document directory
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

Next, use the `InsertChart` method of the `DocumentBuilder` to insert a scatter chart into the document.

```csharp
Shape shape = builder.InsertChart(ChartType.Scatter, 432, 252);
Chart chart = shape.Chart;
```

## Step 3: Add series data to the chart

Add series data to the chart. In this example, we'll add two sets of X and Y coordinates.

```csharp
chart.Series.Add("Aspose Series 1", new double[] { 0.7, 1.8, 2.6 }, new double[] { 2.7, 3.2, 0.8 });
```

## Step 4: Save the document

Finally, save the document to the specified directory using the `Save` method of the `Document` object.

```csharp
doc.Save(dataDir + "WorkingWithCharts.InsertScatterChart.docx");
```

This completes the implementation of inserting a scatter chart using Aspose.Words for .NET.

### Example source code for Insert Scatter Chart using Aspose.Words for .NET 

```csharp
	// Path to your document directory 
	string dataDir = "YOUR DOCUMENT DIRECTORY";

	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);
	Shape shape = builder.InsertChart(ChartType.Scatter, 432, 252);
	Chart chart = shape.Chart;
	chart.Series.Add("Aspose Series 1", new double[] { 0.7, 1.8, 2.6 }, new double[] { 2.7, 3.2, 0.8 });
	doc.Save(dataDir + "WorkingWithCharts.InsertScatterChart.docx");
```