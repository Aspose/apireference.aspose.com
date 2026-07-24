---
title: "System::IConvertible::ToType‑metod"
linktitle: "ToType"
second_title: "Aspose.Page för C++"
description: "System::IConvertible::ToType metod. Konverterar värdet för den här instansen till ett System::Object av den angivna System::Type som har ett motsvarande värde, med den angivna kulturspecifika formateringsinformationen i C++."
type: docs
weight: 1400
url: /sv/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Konverterar värdet för den här instansen till ett [System::Object](../../object/) av den angivna System::Type som har ett motsvarande värde, med den angivna kulturspecifika formateringsinformationen.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| conversionType | const TypeInfo\& | Den System::Type till vilken värdet för den här instansen konverteras. |
| provider | System::SharedPtr\<System::IFormatProvider\> | En [System::IFormatProvider](../../iformatprovider/)-gränssnittsimplementation som tillhandahåller kulturspecifik formateringsinformation. |

### ReturnValue

En [System::Object](../../object/)-instans av typen conversionType vars värde är motsvarande värdet för den här instansen.

## Se även

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
