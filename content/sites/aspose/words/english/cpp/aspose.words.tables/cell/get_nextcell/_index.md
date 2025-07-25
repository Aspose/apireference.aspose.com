---
title: Aspose::Words::Tables::Cell::get_NextCell method
linktitle: get_NextCell
second_title: Aspose.Words for C++ API Reference
description: 'Aspose::Words::Tables::Cell::get_NextCell method. Gets the next Cell node in C++.'
type: docs
weight: 9500
url: /cpp/aspose.words.tables/cell/get_nextcell/
---
## Cell::get_NextCell method


Gets the next [Cell](../) node.

```cpp
System::SharedPtr<Aspose::Words::Tables::Cell> Aspose::Words::Tables::Cell::get_NextCell()
```


## Examples



Shows how to enumerate through all table cells. 
```cpp
auto doc = System::MakeObject<Aspose::Words::Document>(get_MyDir() + u"Tables.docx");
System::SharedPtr<Aspose::Words::Tables::Table> table = doc->get_FirstSection()->get_Body()->get_Tables()->idx_get(0);

// Enumerate through all cells of the table.
for (System::SharedPtr<Aspose::Words::Tables::Row> row = table->get_FirstRow(); row != nullptr; row = row->get_NextRow())
{
    for (System::SharedPtr<Aspose::Words::Tables::Cell> cell = row->get_FirstCell(); cell != nullptr; cell = cell->get_NextCell())
    {
        std::cout << cell->GetText() << std::endl;
    }
}
```

## See Also

* Class [Cell](../)
* Class [Cell](../)
* Namespace [Aspose::Words::Tables](../../)
* Library [Aspose.Words for C++](../../../)
