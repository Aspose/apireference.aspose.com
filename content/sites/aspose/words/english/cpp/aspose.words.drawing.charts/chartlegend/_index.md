---
title: Aspose::Words::Drawing::Charts::ChartLegend class
linktitle: ChartLegend
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Drawing::Charts::ChartLegend class. Represents chart legend properties. To learn more, visit the  documentation article in C++.'
type: docs
weight: 11000
url: /cpp/aspose.words.drawing.charts/chartlegend/
---
## ChartLegend class


Represents chart legend properties. To learn more, visit the [Working with Charts](https://docs.aspose.com/words/cpp/working-with-charts/) documentation article.

```cpp
class ChartLegend : public Aspose::Words::Drawing::Core::Dml::IDmlExtensionListSource,
                    public Aspose::Words::Drawing::Charts::Core::IChartFormatSource
```

## Methods

| Method | Description |
| --- | --- |
| [get_Font](./get_font/)() | Provides access to the default font formatting of legend entries. To override the font formatting for a specific legend entry, use the[Font](../chartlegendentry/get_font/) property. |
| [get_Format](./get_format/)() | Provides access to fill and line formatting of the legend. |
| [get_LegendEntries](./get_legendentries/)() const | Returns a collection of legend entries for all series and trendlines of the parent chart. |
| [get_Overlay](./get_overlay/)() const | Determines whether other chart elements shall be allowed to overlap legend. Default value is **false**. |
| [get_Position](./get_position/)() | Specifies the position of the legend on a chart. |
| [GetType](./gettype/)() const override |  |
| [Is](./is/)(const System::TypeInfo\&) const override |  |
| [set_Overlay](./set_overlay/)(bool) | Setter for [Aspose::Words::Drawing::Charts::ChartLegend::get_Overlay](./get_overlay/). |
| [set_Position](./set_position/)(Aspose::Words::Drawing::Charts::LegendPosition) | Setter for [Aspose::Words::Drawing::Charts::ChartLegend::get_Position](./get_position/). |
| static [Type](./type/)() |  |

## Examples



Shows how to edit the appearance of a chart's legend. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::Drawing::Shape> shape = builder->InsertChart(Aspose::Words::Drawing::Charts::ChartType::Line, 450, 300);
System::SharedPtr<Aspose::Words::Drawing::Charts::Chart> chart = shape->get_Chart();

ASSERT_EQ(3, chart->get_Series()->get_Count());
ASSERT_EQ(u"Series 1", chart->get_Series()->idx_get(0)->get_Name());
ASSERT_EQ(u"Series 2", chart->get_Series()->idx_get(1)->get_Name());
ASSERT_EQ(u"Series 3", chart->get_Series()->idx_get(2)->get_Name());

// Move the chart's legend to the top right corner.
System::SharedPtr<Aspose::Words::Drawing::Charts::ChartLegend> legend = chart->get_Legend();
legend->set_Position(Aspose::Words::Drawing::Charts::LegendPosition::TopRight);

// Give other chart elements, such as the graph, more room by allowing them to overlap the legend.
legend->set_Overlay(true);

doc->Save(get_ArtifactsDir() + u"Charts.ChartLegend.docx");
```

## See Also

* Namespace [Aspose::Words::Drawing::Charts](../)
* Library [Aspose.Words for C++](../../)
