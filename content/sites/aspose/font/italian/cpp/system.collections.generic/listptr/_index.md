---
title: "System::Collections::Generic::ListPtr classe"
linktitle: "ListPtr"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::ListPtr classe. Puntatore di lista con operatori di accesso. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Dovrebbe essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante in C++."
type: docs
weight: 3500
url: /it/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<T0>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Inizializza un puntatore nullo. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Inizializza un puntatore alla lista specificata. |
| [operator==](./operator==/)(std::nullptr_t) const | Verifica se il puntatore [List](../list/) è nullo. |
| [operator[]](./operator[]/)(int) | Accessor. |
| [operator[]](./operator[]/)(int) const | Accessor. |
## Vedi anche

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
