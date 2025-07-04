---
title: Aspose::Words::PageSetup::get_TextColumns method
linktitle: get_TextColumns
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::PageSetup::get_TextColumns method. Returns a collection that represents the set of text columns in C++.'
type: docs
weight: 44000
url: /cpp/aspose.words/pagesetup/get_textcolumns/
---
## PageSetup::get_TextColumns method


Returns a collection that represents the set of text columns.

```cpp
System::SharedPtr<Aspose::Words::TextColumnCollection> Aspose::Words::PageSetup::get_TextColumns()
```


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

* Class [TextColumnCollection](../../textcolumncollection/)
* Class [PageSetup](../)
* Namespace [Aspose::Words](../../)
* Library [Aspose.Words for C++](../../../)
