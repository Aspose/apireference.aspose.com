---
title: "Metodo System::ObjectExt::CoalesceInternal"
linktitle: "CoalesceInternal"
second_title: "Aspose.Font per C++"
description: "Metodo System::ObjectExt::CoalesceInternal. Implementazione della traduzione dell'operatore ''??'' per i tipi non nullable. Sovraccarico per il caso in cui RT2 è convertibile in RT1 in C++."
type: docs
weight: 700
url: /it/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Implementazione della traduzione dell'operatore '??' per i tipi non nullable. Sovraccarico per il caso in cui RT2 è convertibile in RT1.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parametro | Descrizione |
| --- | --- |
| T0 | Tipo di valore LHS. |
| T1 | Tipo di lambda che incapsula l'espressione RHS. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | RT1 | Valore LHS. |
| func | F | Espressione RHS. |

### ReturnValue

Se il valore LHS non è null, restituisce LHS, altrimenti calcola l'espressione RHS e restituisce il risultato.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
