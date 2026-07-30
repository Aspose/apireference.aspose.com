---
title: "Aspose::Font::CffDataProviders::StringIndexDataProvider class"
linktitle: "StringIndexDataProvider"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::CffDataProviders::StringIndexDataProvider sınıfı. C++'de CFF String INDEX yapısına erişim işlevselliğini bildirir."
type: docs
weight: 700
url: /tr/cpp/aspose.font.cffdataproviders/stringindexdataprovider/
---
## StringIndexDataProvider class


CFF String INDEX yapısına erişim işlevselliğini bildirir.

```cpp
class StringIndexDataProvider : public Aspose::Font::CffDataProviders::ICffIndexDataProvider
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [AddString](./addstring/)(System::String) | CFF String INDEX yapısına dize ekler. |
| virtual [get_Count](./get_count/)() | CFF INDEX yapısındaki nesne sayısı. |
| virtual [GetRawBytes](./getrawbytes/)() | CFF INDEX yapısının tüm baytlarını alır. |
| virtual [GetString](./getstring/)(int32_t) | CFF String INDEX yapısından belirtilen dizindeki dizeyi alır. |
| virtual [idx_get](./idx_get/)(int32_t) | Belirtilen dizindeki dizeyi alır/ayar. |
| virtual [idx_set](./idx_set/)(int32_t, System::String) | Belirtilen dizindeki dizeyi alır/ayar. |
| virtual [RemoveString](./removestring/)(int32_t) | Belirtilen dizindeki CFF String Index yapısından dizeyi kaldırır. |
| virtual [SetString](./setstring/)(System::String, int32_t) | Belirtilen dizindeki CFF String Index yapısına dizeyi ayarlar. |
## Ayrıca Bakınız

* Class [ICffIndexDataProvider](../icffindexdataprovider/)
* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
