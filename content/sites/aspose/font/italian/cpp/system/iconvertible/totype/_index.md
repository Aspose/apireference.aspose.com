---
title: "Metodo System::IConvertible::ToType"
linktitle: "ToType"
second_title: "Aspose.Font per C++"
description: "Metodo System::IConvertible::ToType. Converte il valore di questa istanza in un System::Object del System::Type specificato che ha un valore equivalente, utilizzando le informazioni di formattazione specifiche della cultura indicate in C++."
type: docs
weight: 1400
url: /it/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Converte il valore di questa istanza in un [System::Object](../../object/) del System::Type specificato che ha un valore equivalente, utilizzando le informazioni di formattazione specifiche della cultura indicate.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| conversionType | const TypeInfo\& | Il System::Type al quale il valore di questa istanza è convertito. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Una implementazione dell'interfaccia [System::IFormatProvider](../../iformatprovider/) che fornisce informazioni di formattazione specifiche della cultura. |

### ReturnValue

Un'istanza di [System::Object](../../object/) di tipo conversionType il cui valore è equivalente al valore di questa istanza.

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
