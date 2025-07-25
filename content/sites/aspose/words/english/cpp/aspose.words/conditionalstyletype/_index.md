---
title: Aspose::Words::ConditionalStyleType enum
linktitle: ConditionalStyleType
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::ConditionalStyleType enum. Represents possible table areas to which conditional formatting may be defined in a table style in C++.'
type: docs
weight: 85000
url: /cpp/aspose.words/conditionalstyletype/
---
## ConditionalStyleType enum


Represents possible table areas to which conditional formatting may be defined in a table style.

```cpp
enum class ConditionalStyleType
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| FirstRow | 0 | Specifies formatting of the first row of a table. |
| FirstColumn | 1 | Specifies formatting of the first column of a table. |
| LastRow | 2 | Specifies formatting of the last row of a table. |
| LastColumn | 3 | Specifies formatting of the last column of a table. |
| OddRowBanding | 4 | Specifies formatting of odd-numbered row stripe. |
| OddColumnBanding | 5 | Specifies formatting of odd-numbered column stripe. |
| EvenRowBanding | 6 | Specifies formatting of even-numbered row stripe. |
| EvenColumnBanding | 7 | Specifies formatting of even-numbered column stripe. |
| TopLeftCell | 8 | Specifies formatting of the top left cell of a table. |
| TopRightCell | 9 | Specifies formatting of the top right cell of a table. |
| BottomLeftCell | 10 | Specifies formatting of the bottom left cell of a table. |
| BottomRightCell | 11 | Specifies formatting of the bottom right cell of a table. |


## Examples



Shows how to work with certain area styles of a table. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::Tables::Table> table = builder->StartTable();
builder->InsertCell();
builder->Write(u"Cell 1");
builder->InsertCell();
builder->Write(u"Cell 2");
builder->EndRow();
builder->InsertCell();
builder->Write(u"Cell 3");
builder->InsertCell();
builder->Write(u"Cell 4");
builder->EndTable();

// Create a custom table style.
auto tableStyle = System::ExplicitCast<Aspose::Words::TableStyle>(doc->get_Styles()->Add(Aspose::Words::StyleType::Table, u"MyTableStyle1"));

// Conditional styles are formatting changes that affect only some of the table's cells
// based on a predicate, such as the cells being in the last row.
// Below are three ways of accessing a table style's conditional styles from the "ConditionalStyles" collection.
// 1 -  By style type:
tableStyle->get_ConditionalStyles()->idx_get(Aspose::Words::ConditionalStyleType::FirstRow)->get_Shading()->set_BackgroundPatternColor(System::Drawing::Color::get_AliceBlue());

// 2 -  By index:
tableStyle->get_ConditionalStyles()->idx_get(0)->get_Borders()->set_Color(System::Drawing::Color::get_Black());
tableStyle->get_ConditionalStyles()->idx_get(0)->get_Borders()->set_LineStyle(Aspose::Words::LineStyle::DotDash);
ASSERT_EQ(Aspose::Words::ConditionalStyleType::FirstRow, tableStyle->get_ConditionalStyles()->idx_get(0)->get_Type());

// 3 -  As a property:
tableStyle->get_ConditionalStyles()->get_FirstRow()->get_ParagraphFormat()->set_Alignment(Aspose::Words::ParagraphAlignment::Center);

// Apply padding and text formatting to conditional styles.
tableStyle->get_ConditionalStyles()->get_LastRow()->set_BottomPadding(10);
tableStyle->get_ConditionalStyles()->get_LastRow()->set_LeftPadding(10);
tableStyle->get_ConditionalStyles()->get_LastRow()->set_RightPadding(10);
tableStyle->get_ConditionalStyles()->get_LastRow()->set_TopPadding(10);
tableStyle->get_ConditionalStyles()->get_LastColumn()->get_Font()->set_Bold(true);

// List all possible style conditions.
{
    System::SharedPtr<System::Collections::Generic::IEnumerator<System::SharedPtr<Aspose::Words::ConditionalStyle>>> enumerator = tableStyle->get_ConditionalStyles()->GetEnumerator();
    while (enumerator->MoveNext())
    {
        System::SharedPtr<Aspose::Words::ConditionalStyle> currentStyle = enumerator->get_Current();
        if (currentStyle != nullptr)
        {
            std::cout << System::EnumGetName(currentStyle->get_Type()) << std::endl;
        }
    }
}

// Apply the custom style, which contains all conditional styles, to the table.
table->set_Style(tableStyle);

// Our style applies some conditional styles by default.
ASSERT_EQ(Aspose::Words::Tables::TableStyleOptions::FirstRow | Aspose::Words::Tables::TableStyleOptions::FirstColumn | Aspose::Words::Tables::TableStyleOptions::RowBands, table->get_StyleOptions());

// We will need to enable all other styles ourselves via the "StyleOptions" property.
table->set_StyleOptions(table->get_StyleOptions() | Aspose::Words::Tables::TableStyleOptions::LastRow | Aspose::Words::Tables::TableStyleOptions::LastColumn);

doc->Save(get_ArtifactsDir() + u"Table.ConditionalStyles.docx");
```

## See Also

* Namespace [Aspose::Words](../)
* Library [Aspose.Words for C++](../../)
