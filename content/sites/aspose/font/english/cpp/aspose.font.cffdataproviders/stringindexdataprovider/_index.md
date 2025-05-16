---
title: Aspose::Font::CffDataProviders::StringIndexDataProvider class
linktitle: StringIndexDataProvider
second_title: Aspose.Font for C++
description: 'Aspose::Font::CffDataProviders::StringIndexDataProvider class. Declares functionality to access CFF String INDEX structure in C++.'
type: docs
weight: 700
url: /cpp/aspose.font.cffdataproviders/stringindexdataprovider/
---
## StringIndexDataProvider class


Declares functionality to access CFF String INDEX structure.

```cpp
class StringIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Methods

| Method | Description |
| --- | --- |
| virtual [AddString](./addstring/)(System::String) | Adds string into CFF String INDEX structure. |
| virtual [get_Count](./get_count/)() | The number of objects in the CFF INDEX structure. |
| virtual [GetRawBytes](./getrawbytes/)() | Gets all the bytes of the CFF INDEX structure. |
| virtual [GetString](./getstring/)(int32_t) | Gets string at the specified index from CFF String INDEX structure. |
| virtual [idx_get](./idx_get/)(int32_t) | Gets/sets string at the specified index. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Gets/sets string at the specified index. |
| virtual [RemoveString](./removestring/)(int32_t) | Removes string from CFF String Index structure at the specified index. |
| virtual [SetString](./setstring/)(System::String, int32_t) | Sets string in the CFF String Index structure at the specified index. |
## See Also

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
