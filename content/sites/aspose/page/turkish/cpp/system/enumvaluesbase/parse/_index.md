---
title: "System::EnumValuesBase::Parse metodu"
linktitle: "Parse"
second_title: "Aspose.Page için C++"
description: "System::EnumValuesBase::Parse metodu. Belirtilen enum tipindeki belirtilen isimle bir enum sabiti değerini temsil eden bir nesne döndürür C++'ta."
type: docs
weight: 400
url: /tr/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


Belirtilen isimle belirtilen enum tipinin sabit değerini temsil eden bir nesne döndürür.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| type | const TypeInfo\& | Döndürülecek enum değerinin tipini temsil eden [TypeInfo](../../typeinfo/) nesnesi |
| str | const String\& | Enum sabitinin adı |
| ignoreCase | bool | Enum sabitinin adını yorumlarken büyük/küçük harfin göz ardı edilip edilmemesi gerektiğini belirtir |

### ReturnValue

İsmi **str** içinde belirtilen enum sabitinin değerini temsil eden bir nesne.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
