---
title: "System::EnumValuesBase::Parse metodo"
linktitle: "Analizza"
second_title: "Aspose.Font per C++"
description: "System::EnumValuesBase::Parse metodo. Restituisce un oggetto che rappresenta un valore di costante di enumerazione del tipo di enumerazione specificato con il nome specificato in C++."
type: docs
weight: 400
url: /it/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


Restituisce un oggetto che rappresenta il valore di una costante di enumerazione del tipo di enumerazione specificato con il nome specificato.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | const TypeInfo\& | L'oggetto [TypeInfo](../../typeinfo/) che rappresenta il tipo del valore di enumerazione da restituire |
| str | const String\& | Il nome della costante enum |
| ignoreCase | bool | Specifica se il case deve essere ignorato quando si interpreta il nome della costante enum. |

### ReturnValue

Un oggetto che rappresenta il valore della costante enum il cui nome è specificato in **str**.

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
