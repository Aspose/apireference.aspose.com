---
title: Aspose::Words::Drawing::Charts::ChartSeriesType enum
linktitle: ChartSeriesType
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::Charts::ChartSeriesType enum. Specifies a type of a chart series in C++.'
type: docs
weight: 27500
url: /cpp/aspose.words.drawing.charts/chartseriestype/
---
## ChartSeriesType enum


Specifies a type of a chart series.

```cpp
enum class ChartSeriesType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| Area | 0 | Represents an Area chart series. |
| AreaStacked | 1 | Represents a Stacked Area chart series. |
| AreaPercentStacked | 2 | Represents a 100% Stacked Area chart series. |
| Area3D | 3 | Represents a 3D Area chart series. |
| Area3DStacked | 4 | Represents a 3D Stacked Area chart series. |
| Area3DPercentStacked | 5 | Represents a 3D 100% Stacked Area chart series. |
| Bar | 6 | Represents a Bar chart series. |
| BarStacked | 7 | Represents a Stacked Bar chart series. |
| BarPercentStacked | 8 | Represents a 100% Stacked Bar chart series. |
| Bar3D | 9 | Represents a 3D Bar chart series. |
| Bar3DStacked | 10 | Represents a 3D Stacked Bar chart series. |
| Bar3DPercentStacked | 11 | Represents a 3D 100% Stacked Bar chart series. |
| Bubble | 12 | Represents a Bubble chart series. |
| Bubble3D | 13 | Represents a 3D Bubble chart series. |
| Column | 14 | Represents a Column chart series. |
| ColumnStacked | 15 | Represents a Stacked Column chart series. |
| ColumnPercentStacked | 16 | Represents a 100% Stacked Column chart series. |
| Column3D | 17 | Represents a 3D Column chart series. |
| Column3DStacked | 18 | Represents a 3D Stacked Column chart series. |
| Column3DPercentStacked | 19 | Represents a 3D 100% Stacked Column chart series. |
| Column3DClustered | 20 | Represents a 3D Clustered Column chart series. |
| Doughnut | 21 | Represents a Doughnut chart series. |
| Line | 22 | Represents a Line chart series. |
| LineStacked | 23 | Represents a Stacked Line chart series. |
| LinePercentStacked | 24 | Represents a 100% Stacked Line chart series. |
| Line3D | 25 | Represents a 3D Line chart series. |
| Pie | 26 | Represents a Pie chart series. |
| Pie3D | 27 | Represents a 3D Pie chart series. |
| PieOfBar | 28 | Represents a Pie of Bar chart series. |
| PieOfPie | 29 | Represents a Pie of Pie chart series. |
| Radar | 30 | Represents a Radar chart series. |
| Scatter | 31 | Represents a Scatter chart series. |
| Stock | 32 | Represents a Stock chart series. |
| Surface | 33 | Represents a Surface chart series. |
| Surface3D | 34 | Represents a 3D Surface chart series. |
| Treemap | 35 | Represents a Treemap chart series. |
| Sunburst | 36 | Represents a Sunburst chart series. |
| Histogram | 37 | Represents a Histogram chart series. |
| Pareto | 38 | Represents a Pareto chart series. |
| ParetoLine | 39 | Represents a Pareto Line chart series. |
| BoxAndWhisker | 40 | Represents a Box and Whisker chart series. |
| Waterfall | 41 | Represents a Waterfall chart series. |
| Funnel | 42 | Represents a Funnel chart series. |
| RegionMap | 43 | Represents a Region Map chart series. |


## Examples



Shows how to remove specific chart serie. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Reporting engine template - Chart series.docx");
System::SharedPtr<Aspose::Words::Drawing::Charts::Chart> chart = (System::ExplicitCast<Aspose::Words::Drawing::Shape>(doc->GetChild(Aspose::Words::NodeType::Shape, 0, true)))->get_Chart();

// Remove all series of the Column type.
for (int32_t i = chart->get_Series()->get_Count() - 1; i >= 0; i--)
{
    if (chart->get_Series()->idx_get(i)->get_SeriesType() == Aspose::Words::Drawing::Charts::ChartSeriesType::Column)
    {
        chart->get_Series()->RemoveAt(i);
    }
}

chart->get_Series()->Add(u"Aspose Series", System::MakeArray<System::String>({u"Category 1", u"Category 2", u"Category 3", u"Category 4"}), System::MakeArray<double>({5.6, 7.1, 2.9, 8.9}));

doc->Save(get_ArtifactsDir() + u"Charts.RemoveSpecificChartSeries.docx");
```

## See Also

* Namespace [Aspose::Words::Drawing::Charts](../)
* Library [Aspose.Words for C++](../../)
