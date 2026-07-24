---
title: "System::IConvertible::ToType-methode"
linktitle: "ToType"
second_title: "Aspose.Page voor C++"
description: "System::IConvertible::ToType-methode. Converteert de waarde van deze instantie naar een System::Object van het opgegeven System::Type dat een equivalente waarde heeft, met gebruik van de opgegeven cultuurspecifieke opmaakinformatie in C++."
type: docs
weight: 1400
url: /nl/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Converteert de waarde van deze instantie naar een [System::Object](../../object/) van het opgegeven System::Type dat een equivalente waarde heeft, met gebruik van de opgegeven cultuurspecifieke opmaakinformatie.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| conversionType | const TypeInfo\& | Het System::Type waarin de waarde van deze instantie wordt geconverteerd. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Een implementatie van de [System::IFormatProvider](../../iformatprovider/) interface die cultuurspecifieke opmaakinformatie levert. |

### ReturnValue

Een [System::Object](../../object/) instantie van het type conversionType waarvan de waarde equivalent is aan de waarde van deze instantie.

## Zie ook

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
