---
title: "System::ForceStaticCast metodo"
linktitle: "ForzaCastStatico"
second_title: "Aspose.Font per C++"
description: "System::ForceStaticCast metodo. Esegue un cast statico reale su oggetti SmartPtr in C++."
type: docs
weight: 20500
url: /it/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Esegue un cast statico reale su oggetti [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo di puntatore di destinazione. |
| TFrom | Tipo di puntatore di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Restituisce il risultato del cast se il cast è consentito, altrimenti il comportamento è indefinito.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
