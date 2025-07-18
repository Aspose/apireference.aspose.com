---
title: Aspose::Words::Drawing::Charts::ChartDataLabelCollection::get_ShowLeaderLines method
linktitle: get_ShowLeaderLines
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::Charts::ChartDataLabelCollection::get_ShowLeaderLines method. Allows to specify whether data label leader lines need be shown for the data labels of the entire series. Default value is false in C++.'
type: docs
weight: 10000
url: /cpp/aspose.words.drawing.charts/chartdatalabelcollection/get_showleaderlines/
---
## ChartDataLabelCollection::get_ShowLeaderLines method


Allows to specify whether data label leader lines need be shown for the data labels of the entire series. Default value is **false**.

```cpp
bool Aspose::Words::Drawing::Charts::ChartDataLabelCollection::get_ShowLeaderLines()
```

## Remarks


Applies to Pie charts only. Leader lines create a visual connection between a data label and its corresponding data point.

Value defined for this property can be overridden for an individual data label with using the [ShowLeaderLines](../../chartdatalabel/get_showleaderlines/) property.

## Examples



Shows how to work with data labels of a pie chart. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::Drawing::Charts::Chart> chart = builder->InsertChart(Aspose::Words::Drawing::Charts::ChartType::Pie, 500, 300)->get_Chart();

// Clear the chart's demo data series to start with a clean chart.
chart->get_Series()->Clear();

// Insert a custom chart series with a category name for each of the sectors, and their frequency table.
System::SharedPtr<Aspose::Words::Drawing::Charts::ChartSeries> series = chart->get_Series()->Add(u"Aspose Test Series", System::MakeArray<System::String>({u"Word", u"PDF", u"Excel"}), System::MakeArray<double>({2.7, 3.2, 0.8}));

// Enable data labels that will display both percentage and frequency of each sector, and modify their appearance.
series->set_HasDataLabels(true);
System::SharedPtr<Aspose::Words::Drawing::Charts::ChartDataLabelCollection> dataLabels = series->get_DataLabels();
dataLabels->set_ShowLeaderLines(true);
dataLabels->set_ShowLegendKey(true);
dataLabels->set_ShowPercentage(true);
dataLabels->set_ShowValue(true);
dataLabels->set_Separator(u"; ");

doc->Save(get_ArtifactsDir() + u"Charts.DataLabelsPieChart.docx");
```

## See Also

* Class [ChartDataLabelCollection](../)
* Namespace [Aspose::Words::Drawing::Charts](../../)
* Library [Aspose.Words for C++](../../../)
