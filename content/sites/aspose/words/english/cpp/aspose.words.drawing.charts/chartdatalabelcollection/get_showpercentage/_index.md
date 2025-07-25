---
title: Aspose::Words::Drawing::Charts::ChartDataLabelCollection::get_ShowPercentage method
linktitle: get_ShowPercentage
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::Charts::ChartDataLabelCollection::get_ShowPercentage method. Allows to specify whether percentage value is to be displayed for the data labels of the entire series. Default value is false. Applies only to Pie charts in C++.'
type: docs
weight: 12000
url: /cpp/aspose.words.drawing.charts/chartdatalabelcollection/get_showpercentage/
---
## ChartDataLabelCollection::get_ShowPercentage method


Allows to specify whether percentage value is to be displayed for the data labels of the entire series. Default value is **false**. Applies only to Pie charts.

```cpp
bool Aspose::Words::Drawing::Charts::ChartDataLabelCollection::get_ShowPercentage()
```


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
