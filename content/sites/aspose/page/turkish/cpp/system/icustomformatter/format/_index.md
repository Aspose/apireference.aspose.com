---
title: "System::ICustomFormatter::Format yöntemi"
linktitle: "Biçim"
second_title: "Aspose.Page için C++"
description: "System::ICustomFormatter::Format yöntemi. Belirtilen formatı kullanarak C++'de mevcut nesne tarafından temsil edilen bir değerin dize temsili döndürür."
type: docs
weight: 100
url: /tr/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


Geçerli nesne tarafından temsil edilen bir değerin, belirtilen biçimi kullanarak dize temsili döndürür.

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| biçim | System::String | Dize biçimi |
| arg | System::SharedPtr\<System::Object\> | Biçimlendirilecek nesne |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | Biçimlendirme bilgilerini sağlayan nesne |

### ReturnValue

**arg**'in, **format** ve **formatProvider** tarafından belirtilen formata göre biçimlendirilmiş dize temsili

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
