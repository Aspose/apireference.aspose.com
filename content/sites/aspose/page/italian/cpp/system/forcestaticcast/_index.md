---
title: "Metodo System::ForceStaticCast"
linktitle: "ForzaConversioneStatica"
second_title: "Aspose.Page per C++"
description: "Metodo System::ForceStaticCast. Esegue un cast statico reale su oggetti SmartPtr in C++."
type: docs
weight: 20400
url: /it/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


Esegue un cast statico reale su oggetti [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parametro | Descrizione |
| --- | --- |
| TTo | Tipo dell'oggetto puntato di destinazione. |
| TFrom | Tipo dell'oggetto puntato di origine. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Puntatore di origine. |

### ReturnValue

Risultato del cast se il cast è consentito, altrimenti il comportamento è indefinito.

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
