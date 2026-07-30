---
title: "Classe System::Collections::Generic::DictionaryPtr"
linktitle: "DictionaryPtr"
second_title: "Aspose.Font per C++"
description: "Classe System::Collections::Generic::DictionaryPtr. Classe di puntatore al dizionario con overload degli operatori. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Dovrebbe essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante in C++."
type: docs
weight: 1300
url: /it/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<T0>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di chiave. |
| V | Tipo valore. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Inizializza un puntatore nullo. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Converte il tipo di puntatore. |
| [operator[]](./operator[]/)(const X\&) const | Operatore di accesso per lavorare con la conversione del tipo di chiave. |
| [operator[]](./operator[]/)(const T\&) const | Operatore di accesso. |

## Vedi anche

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
