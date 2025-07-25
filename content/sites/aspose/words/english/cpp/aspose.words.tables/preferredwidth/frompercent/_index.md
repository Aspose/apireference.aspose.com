---
title: Aspose::Words::Tables::PreferredWidth::FromPercent method
linktitle: FromPercent
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Tables::PreferredWidth::FromPercent method. A creation method that returns a new instance that represents a preferred width specified as a percentage in C++.'
type: docs
weight: 2000
url: /cpp/aspose.words.tables/preferredwidth/frompercent/
---
## PreferredWidth::FromPercent method


A creation method that returns a new instance that represents a preferred width specified as a percentage.

```cpp
static System::SharedPtr<Aspose::Words::Tables::PreferredWidth> Aspose::Words::Tables::PreferredWidth::FromPercent(double percent)
```


| Parameter | Type | Description |
| --- | --- | --- |
| percent | double | The value must be from 0 to 100. |

## Examples



Shows how to set a table to auto fit to 50% of the width of the page. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::Tables::Table> table = builder->StartTable();
builder->InsertCell();
builder->Write(u"Cell #1");
builder->InsertCell();
builder->Write(u"Cell #2");
builder->InsertCell();
builder->Write(u"Cell #3");

table->set_PreferredWidth(Aspose::Words::Tables::PreferredWidth::FromPercent(50));

doc->Save(get_ArtifactsDir() + u"DocumentBuilder.InsertTableWithPreferredWidth.docx");
```


Shows how to set a preferred width for table cells. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);
System::SharedPtr<Aspose::Words::Tables::Table> table = builder->StartTable();

// There are two ways of applying the "PreferredWidth" class to table cells.
// 1 -  Set an absolute preferred width based on points:
builder->InsertCell();
builder->get_CellFormat()->set_PreferredWidth(Aspose::Words::Tables::PreferredWidth::FromPoints(40));
builder->get_CellFormat()->get_Shading()->set_BackgroundPatternColor(System::Drawing::Color::get_LightYellow());
builder->Writeln(System::String::Format(u"Cell with a width of {0}.", builder->get_CellFormat()->get_PreferredWidth()));

// 2 -  Set a relative preferred width based on percent of the table's width:
builder->InsertCell();
builder->get_CellFormat()->set_PreferredWidth(Aspose::Words::Tables::PreferredWidth::FromPercent(20));
builder->get_CellFormat()->get_Shading()->set_BackgroundPatternColor(System::Drawing::Color::get_LightBlue());
builder->Writeln(System::String::Format(u"Cell with a width of {0}.", builder->get_CellFormat()->get_PreferredWidth()));

builder->InsertCell();

// A cell with no preferred width specified will take up the rest of the available space.
builder->get_CellFormat()->set_PreferredWidth(Aspose::Words::Tables::PreferredWidth::Auto());

// Each configuration of the "PreferredWidth" property creates a new object.
ASSERT_NE(System::ObjectExt::GetHashCode(table->get_FirstRow()->get_Cells()->idx_get(1)->get_CellFormat()->get_PreferredWidth()), System::ObjectExt::GetHashCode(builder->get_CellFormat()->get_PreferredWidth()));

builder->get_CellFormat()->get_Shading()->set_BackgroundPatternColor(System::Drawing::Color::get_LightGreen());
builder->Writeln(u"Automatically sized cell.");

doc->Save(get_ArtifactsDir() + u"DocumentBuilder.InsertCellsWithPreferredWidths.docx");
```

## See Also

* Class [PreferredWidth](../)
* Class [PreferredWidth](../)
* Namespace [Aspose::Words::Tables](../../)
* Library [Aspose.Words for C++](../../../)
