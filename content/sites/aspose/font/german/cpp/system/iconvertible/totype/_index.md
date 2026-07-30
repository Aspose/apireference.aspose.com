---
title: "System::IConvertible::ToType-Methode"
linktitle: "ToType"
second_title: "Aspose.Font für C++"
description: "System::IConvertible::ToType-Methode. Konvertiert den Wert dieser Instanz in ein System::Object des angegebenen System::Type, das einen äquivalenten Wert hat, unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen in C++."
type: docs
weight: 1400
url: /de/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Konvertiert den Wert dieser Instanz in ein [System::Object](../../object/) des angegebenen System::Type, das einen äquivalenten Wert hat, unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| conversionType | const TypeInfo\& | Der System::Type, in den der Wert dieser Instanz konvertiert wird. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Eine [System::IFormatProvider](../../iformatprovider/)-Schnittstellenimplementierung, die kulturspezifische Formatierungsinformationen bereitstellt. |

### ReturnValue

Eine [System::Object](../../object/)-Instanz vom Typ conversionType, deren Wert dem Wert dieser Instanz entspricht.

## Siehe auch

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
