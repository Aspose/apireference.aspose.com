---
title: Aspose::Font::CffDataProviders::NameIndexDataProvider class
linktitle: NameIndexDataProvider
second_title: Aspose.Font for C++
description: 'Aspose::Font::CffDataProviders::NameIndexDataProvider class. Declares functionality to access CFF Name INDEX structure in C++.'
type: docs
weight: 500
url: /cpp/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class


Declares functionality to access CFF Name INDEX structure.

```cpp
class NameIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Methods

| Method | Description |
| --- | --- |
| virtual [AddName](./addname/)(System::String) | Adds a font name to the Name INDEX structure. Use this method with caution because each font name in the CFF Name INDEX structure must have a corresponding DICT structure in the Top DICT index according to the CFF specification. |
| virtual [get_Count](./get_count/)() | The number of objects in the CFF INDEX structure. |
| virtual [GetName](./getname/)(int32_t) | Gets name of font at the specified index. |
| virtual [GetRawBytes](./getrawbytes/)() | Gets all the bytes of the CFF INDEX structure. |
| virtual [idx_get](./idx_get/)(int32_t) | Gets/sets font name at the specified index. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Gets/sets font name at the specified index. |
| virtual [RemoveName](./removename/)(int32_t) | Removes the name at the specified index. Use this method with caution because each font name in the CFF Name INDEX structure must have a corresponding DICT structure in the Top DICT index according to the CFF specification. |
| virtual [SetName](./setname/)(System::String, int32_t) | Sets font name at the specified index. |
## See Also

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
