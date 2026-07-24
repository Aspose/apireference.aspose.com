---
title: "System::IConvertible::ToType yöntemi"
linktitle: "ToType"
second_title: "Aspose.Page için C++"
description: "System::IConvertible::ToType yöntemi. Bu örneğin değerini, belirtilen System::Type türünden eşdeğer bir değere sahip bir System::Object nesnesine, C++'da belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak dönüştürür."
type: docs
weight: 1400
url: /tr/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Bu örneğin değerini, belirtilen System::Type türünden eşdeğer bir değere sahip bir [System::Object](../../object/) nesnesine, belirtilen kültüre özgü biçimlendirme bilgilerini kullanarak dönüştürür.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| conversionType | const TypeInfo\& | Bu örneğin değeri dönüştürülen System::Type. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Kültüre özgü biçimlendirme bilgilerini sağlayan bir [System::IFormatProvider](../../iformatprovider/) arabirim uygulaması. |

### ReturnValue

Değeri bu örnek ile eşdeğer olan, conversionType türünden bir [System::Object](../../object/) örneği.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
