---
title: "Metodo System::Collections::Generic::operator=="
linktitle: "operator=="
second_title: "Aspose.Page per C++"
description: "Metodo System::Collections::Generic::operator==. Confronta due coppie chiave-valore usando la semantica ''equals''. Utilizza l'operatore == o il metodo EqualsTo per entrambe le chiavi e i valori, a seconda di quale sia definito in C++."
type: docs
weight: 5600
url: /it/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


Confronta due coppie chiave-valore usando la semantica 'equals'. Utilizza l'operatore == o il metodo EqualsTo per entrambe le chiavi e i valori, a seconda di quale sia definito.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| Parametro | Descrizione |
| --- | --- |
| TKey | Tipo di chiave. |
| TValue | Tipo valore. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sinistra | const KeyValuePair\<TKey, TValue\>\& | Operando LHS. |
| destra | const KeyValuePair\<TKey, TValue\>\& | Operando RHS. |

### ReturnValue

Vero se entrambe le chiavi e i valori corrispondono, falso altrimenti.

## Vedi anche

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
