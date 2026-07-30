---
title: "System::ICustomFormatter::Format yöntemi"
linktitle: "Format"
second_title: "Aspose.Font için C++"
description: "System::ICustomFormatter::Format yöntemi. Belirtilen biçimi kullanarak, geçerli nesne tarafından temsil edilen bir değerin dize temsili döndürür C++'da."
type: docs
weight: 100
url: /tr/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


Belirtilen biçimi kullanarak geçerli nesne tarafından temsil edilen bir değerin dize temsili döndürür.

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| biçim | System::String | Dize biçimi |
| arg | System::SharedPtr\<System::Object\> | Biçimlendirilecek nesne |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | Biçimlendirme bilgilerini sağlayan nesne |

### ReturnValue

**arg**'ın, **format** ve **formatProvider** tarafından belirtilen biçime göre biçimlendirilmiş dize temsili

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
