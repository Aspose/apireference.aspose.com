---
title: "System::IConvertible::ToType yöntemi"
linktitle: "ToType"
second_title: "Aspose.Font için C++"
description: "System::IConvertible::ToType yöntemi. Belirtilen System::Type türünden bir System::Object nesnesine, eşdeğer bir değerle, C++'da belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak bu örneğin değerini dönüştürür."
type: docs
weight: 1400
url: /tr/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Bu örneğin değerini, belirtilen System::Type türünden bir [System::Object](../../object/) nesnesine, eşdeğer bir değerle, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak dönüştürür.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| conversionType | const TypeInfo\& | Bu örneğin değerinin dönüştürüldüğü System::Type. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Kültüre özgü biçimlendirme bilgilerini sağlayan bir [System::IFormatProvider](../../iformatprovider/) arabirim uygulaması. |

### ReturnValue

Bu örneğin değerine eşdeğer bir değere sahip, conversionType türünde bir [System::Object](../../object/) örneği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
