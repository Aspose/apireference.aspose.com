---
title: "System::Collections::Generic::KeyValuePair classe"
linktitle: "KeyValuePair"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::KeyValuePair classe. Coppia di chiave e valore. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 2900
url: /it/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


Coppia di chiave e valore. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../../system/smartptr/) per gestire oggetti di questo tipo.

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Key](./get_key/)() const | Ottiene la chiave. |
| [get_Value](./get_value/)() const | Ottiene il valore. |
| [GetHashCode](./gethashcode/)() const | Calcola l'hash della coppia chiave-valore eseguendo l'operazione XOR sugli hash della chiave e del valore. |
| [IsNull](./isnull/)() const | Restituisce sempre false. |
| [KeyValuePair](./keyvaluepair/)() | Inizializzatore di coppia chiave-valore nullo. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | Costruttore. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | Costruttore di conversione di tipo. |
| [operator<](./operator_/)(const KeyValuePair\&) const | Patch per le classi ereditate da [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/), non confronta nulla. |
| [ToString](./tostring/)() const | Converte la coppia chiave-valore in stringa. |

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
