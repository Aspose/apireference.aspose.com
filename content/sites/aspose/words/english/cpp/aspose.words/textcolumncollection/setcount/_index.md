---
title: Aspose::Words::TextColumnCollection::SetCount method
linktitle: SetCount
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::TextColumnCollection::SetCount method. Arranges text into the specified number of text columns in C++.'
type: docs
weight: 13000
url: /cpp/aspose.words/textcolumncollection/setcount/
---
## TextColumnCollection::SetCount method


Arranges text into the specified number of text columns.

```cpp
void Aspose::Words::TextColumnCollection::SetCount(int32_t newCount)
```


| Parameter | Type | Description |
| --- | --- | --- |
| newCount | int32_t | The number of columns the text is to be arranged into. |
## Remarks


When [EvenlySpaced](../get_evenlyspaced/) is **false** and you increase the number of columns, new [TextColumn](../../textcolumn/) objects are created with zero width and spacing. You need to set width and spacing for the new columns.

## Examples



Shows how to create multiple evenly spaced columns in a section. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>();
auto builder = System::MakeObject<Aspose::Words::DocumentBuilder>(doc);

System::SharedPtr<Aspose::Words::TextColumnCollection> columns = builder->get_PageSetup()->get_TextColumns();
columns->set_Spacing(100);
columns->SetCount(2);

builder->Writeln(u"Column 1.");
builder->InsertBreak(Aspose::Words::BreakType::ColumnBreak);
builder->Writeln(u"Column 2.");

doc->Save(get_ArtifactsDir() + u"PageSetup.ColumnsSameWidth.docx");
```

## See Also

* Class [TextColumnCollection](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
