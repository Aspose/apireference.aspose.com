---
title: "System::Collections::Generic::SortedDictionaryPtr class"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page per C++"
description: "System::Collections::Generic::SortedDictionaryPtr class. Puntatore a dizionario ordinato con operatori di accesso. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante in C++."
type: docs
weight: 4100
url: /it/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Puntatore a dizionario ordinato con operatori di accesso. Questo tipo è un puntatore per gestire l'eliminazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Funzione di accesso. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Costruisce un puntatore nullo. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Costruisce un puntatore al dizionario ordinato specificato. |
## Vedi anche

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
