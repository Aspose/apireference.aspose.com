---
title: "Metodo System::ObjectExt::CoalesceAssign"
linktitle: "CoalesceAssign"
second_title: "Aspose.Font per C++"
description: "Metodo System::ObjectExt::CoalesceAssign. Implementazione della traduzione dell'operatore ''??='' in C++."
type: docs
weight: 600
url: /it/cpp/system/objectext/coalesceassign/
---
## ObjectExt::CoalesceAssign method


Implementazione della traduzione dell'operatore '??='.

```cpp
template<typename T0,typename T1> static T0 & System::ObjectExt::CoalesceAssign(T0 &value, T1 func)
```


| Parametro | Descrizione |
| --- | --- |
| T0 | Tipo di valore LHS. |
| T1 | Tipo di lambda che incapsula l'espressione RHS. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | T0\& | Valore LHS. |
| func | T1 | Espressione RHS. |

### ReturnValue

Se il valore LHS non è null, restituisce LHS, altrimenti calcola l'espressione RHS e restituisce il risultato.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
