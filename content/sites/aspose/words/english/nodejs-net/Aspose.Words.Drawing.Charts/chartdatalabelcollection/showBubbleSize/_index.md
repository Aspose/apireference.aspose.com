﻿---
title: ChartDataLabelCollection.showBubbleSize property
linktitle: showBubbleSize property
articleTitle: showBubbleSize property
second_title: Aspose.Words for Node.js
description: "ChartDataLabelCollection.showBubbleSize property. Allows to specify whether bubble size is to be displayed for the data labels of the entire series"
type: docs
weight: 90
url: /nodejs-net/aspose.words.drawing.charts/chartdatalabelcollection/showBubbleSize/
---

## ChartDataLabelCollection.showBubbleSize property

Allows to specify whether bubble size is to be displayed for the data labels of the entire series.
Applies only to Bubble charts.
Default value is ``false``.



```js
get showBubbleSize(): boolean
```

### Remarks

Value defined for this property can be overridden for an individual data label with using the
[ChartDataLabel.showBubbleSize](../../chartdatalabel/showBubbleSize/) property.



### Examples

Shows how to work with data labels of a bubble chart.

```js
let doc = new aw.Document();
let builder = new aw.DocumentBuilder(doc);

let chart = builder.insertChart(aw.Drawing.Charts.ChartType.Bubble, 500, 300).chart;

// Clear the chart's demo data series to start with a clean chart.
chart.series.clear();

// Add a custom series with X/Y coordinates and diameter of each of the bubbles. 
let series = chart.series.add("Aspose Test Series",
  [ 2.9, 3.5, 1.1, 4.0, 4.0 ],
  [ 1.9, 8.5, 2.1, 6.0, 1.5 ],
  [ 9.0, 4.5, 2.5, 8.0, 5.0 ]);

// Enable data labels, and then modify their appearance.
series.hasDataLabels = true;
let dataLabels = series.dataLabels;
dataLabels.showBubbleSize = true;
dataLabels.showCategoryName = true;
dataLabels.showSeriesName = true;
dataLabels.separator = " & ";

doc.save(base.artifactsDir + "Charts.DataLabelsBubbleChart.docx");
```

### See Also

* module [Aspose.Words.Drawing.Charts](../../)
* class [ChartDataLabelCollection](../)

