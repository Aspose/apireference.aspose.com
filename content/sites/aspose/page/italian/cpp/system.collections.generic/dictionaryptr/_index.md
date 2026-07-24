---
title: "System::Collections::Generic::DictionaryPtr classe"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page per C++"
description: "System::Collections::Generic::DictionaryPtr classe. Classe di puntatore al dizionario con overload degli operatori. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento const in C++."
type: docs
weight: 1300
url: /it/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di chiave. |
| V | Tipo valore. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Inizializza un puntatore nullo. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Converte il tipo puntatore. |
| [operator[]](./operator[]/)(const X\&) const | Operatore di accesso per lavorare con la conversione del tipo chiave. |
| [operator[]](./operator[]/)(const T\&) const | Operatore di accesso. |

## Vedi anche

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
