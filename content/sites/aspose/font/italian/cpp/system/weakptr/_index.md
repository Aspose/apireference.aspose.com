---
title: "Classe System::WeakPtr"
linktitle: "WeakPtr"
second_title: "Aspose.Font per C++"
description: "Classe System::WeakPtr. Sottoclasse di System::SmartPtr che si imposta in modalità debole al momento della costruzione. Si noti che questa classe non garantisce che la sua istanza rimanga sempre in modalità debole poiché set_Mode() è ancora accessibile. Questo tipo è un puntatore per gestire l'eliminazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento const in C++."
type: docs
weight: 7500
url: /it/cpp/system/weakptr/
---
## WeakPtr class


Sottoclasse di [System::SmartPtr](../smartptr/) che si imposta in modalità debole al momento della costruzione. Si noti che questa classe non garantisce che la sua istanza rimanga sempre in modalità debole poiché [set_Mode()](../smartptr/set_mode/) è ancora accessibile. Questo tipo è un puntatore per gestire l'eliminazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento const.

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo puntato. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [expired](./expired/)() const | Verifica se l'oggetto referenziato è già stato eliminato. |
| [get_weak](./get_weak/)() const | Ottiene l'oggetto referenziato. Afferma che il puntatore è in modalità debole. |
| [operator=](./operator=/)(Q\&&) | Assegna un valore al puntatore debole. Chiama l'operatore di assegnazione specifico di [SmartPtr_](./smartptr_/). |
| [operator==](./operator==/)(std::nullptr_t) const | Verifica se il puntatore debole è nullo. |
| [WeakPtr](./weakptr/)(std::nullptr_t) | Crea un puntatore nullo. |
| [WeakPtr](./weakptr/)(Pointee_ *) | Crea un puntatore debole all'oggetto specificato. |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | Crea un puntatore debole che fa riferimento allo stesso puntatore a cui punta ptr. |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | Crea un puntatore debole che fa riferimento allo stesso puntatore a cui punta x. |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | Costruisce per copia il puntatore debole. |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | Costruisce per copia il puntatore debole. |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | Costruisce per spostamento il puntatore debole. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Pointee_](./pointee_/) | Tipo puntato. |
| [SmartPtr_](./smartptr_/) | Alias per la classe [SmartPtr](../smartptr/) corrispondente. |
| [WeakPtr_](./weakptr_/) | Alias per il tipo stesso. |

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
