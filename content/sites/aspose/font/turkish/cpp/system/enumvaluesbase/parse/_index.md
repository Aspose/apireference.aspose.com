---
title: "System::EnumValuesBase::Parse yöntemi"
linktitle: "Ayrıştır"
second_title: "Aspose.Font için C++"
description: "System::EnumValuesBase::Parse yöntemi. Belirtilen enum tipinde belirtilen isimle bir enum sabitinin değerini temsil eden bir nesne döndürür C++'ta."
type: docs
weight: 400
url: /tr/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


Belirtilen isimle, belirtilen enum tipinin sabit değerini temsil eden bir nesne döndürür.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type | const TypeInfo\& | Döndürülecek enum değerinin tipini temsil eden [TypeInfo](../../typeinfo/) nesnesi |
| str | const String\& | Enum sabitinin adı |
| ignoreCase | bool | Enum sabitinin adını yorumlarken büyük/küçük harfin göz ardı edilip edilmemesi belirlenir |

### ReturnValue

Adı **str** içinde belirtilen enum sabitinin değerini temsil eden bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
