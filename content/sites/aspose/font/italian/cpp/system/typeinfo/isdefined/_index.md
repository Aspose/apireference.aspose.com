---
title: "Metodo System::TypeInfo::IsDefined"
linktitle: "IsDefined"
second_title: "Aspose.Font per C++"
description: "Metodo System::TypeInfo::IsDefined. NON IMPLEMENTATO. Indica se uno o più attributi del tipo specificato o dei suoi tipi derivati sono applicati a questo membro in C++."
type: docs
weight: 4400
url: /it/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


NON IMPLEMENTATO. Indica se uno o più attributi del tipo specificato o dei suoi tipi derivati sono applicati a questo membro.

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| attributeType | const TypeInfo\& | Il tipo di attributo personalizzato da cercare. La ricerca include i tipi derivati. |
| inherit | bool | true per cercare nella catena di ereditarietà di questo membro per trovare gli attributi; altrimenti, false. Questo parametro è ignorato per le proprietà e gli eventi. |

### ReturnValue

true se una o più istanze di attributeType o di uno dei suoi tipi derivati sono applicate a questo membro; altrimenti, false.

## Vedi anche

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
