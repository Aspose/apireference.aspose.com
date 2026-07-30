---
title: "Aspose::Font::CffDataProviders::NameIndexDataProvider sınıfı"
linktitle: "NameIndexDataProvider"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::CffDataProviders::NameIndexDataProvider sınıfı. C++'da CFF Name INDEX yapısına erişim işlevselliğini bildirir."
type: docs
weight: 500
url: /tr/cpp/aspose.font.cffdataproviders/nameindexdataprovider/
---
## NameIndexDataProvider class


CFF Name INDEX yapısına erişim işlevselliğini bildirir.

```cpp
class NameIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AddName](./addname/)(System::String) | Name INDEX yapısına bir yazı tipi adı ekler. Bu yöntemi dikkatli kullanın; çünkü CFF Name INDEX yapısındaki her yazı tipi adı, CFF spesifikasyonuna göre Top DICT indeksindeki karşılık gelen bir DICT yapısına sahip olmalıdır. |
| virtual [get_Count](./get_count/)() | CFF INDEX yapısındaki nesne sayısı. |
| virtual [GetName](./getname/)(int32_t) | Belirtilen indeksdeki yazı tipinin adını alır. |
| virtual [GetRawBytes](./getrawbytes/)() | CFF INDEX yapısının tüm baytlarını alır. |
| virtual [idx_get](./idx_get/)(int32_t) | Belirtilen indeksdeki yazı tipi adını alır/ayar. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Belirtilen indeksdeki yazı tipi adını alır/ayar. |
| virtual [RemoveName](./removename/)(int32_t) | Belirtilen indeksdeki adı kaldırır. Bu yöntemi dikkatli kullanın; çünkü CFF Name INDEX yapısındaki her yazı tipi adı, CFF spesifikasyonuna göre Top DICT indeksindeki karşılık gelen bir DICT yapısına sahip olmalıdır. |
| virtual [SetName](./setname/)(System::String, int32_t) | Belirtilen dizinde yazı tipi adını ayarlar. |
## Ayrıca Bakınız

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
