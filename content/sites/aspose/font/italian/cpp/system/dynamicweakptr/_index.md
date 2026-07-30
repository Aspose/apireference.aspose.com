---
title: "System::DynamicWeakPtr classe"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Font per C++"
description: "System::DynamicWeakPtr classe. Classe di smart pointer che traccia le modalità dei puntatori degli argomenti template dell'oggetto memorizzato e le aggiorna dopo ogni assegnazione. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Dovrebbe essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante in C++."
type: docs
weight: 2200
url: /it/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Classe smart pointer che traccia le modalità dei puntatori degli argomenti template dell'oggetto memorizzato e le aggiorna dopo ogni assegnazione. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento const.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Parametro | Descrizione |
| --- | --- |
| Pointee | tipo. |
| trunkMode | Modalità dello smart pointer stesso, condiviso o debole. |
| weakLeafs | Indici degli argomenti template del tipo memorizzato che dovrebbero essere impostati alla modalità puntatore debole. |
## Nested classes

* Class [Reference](./reference/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Crea uno smart pointer nullo. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Crea uno smart pointer che punta all'oggetto fornito. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Copia-costruisce lo smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Copia-costruisce lo smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Copia-costruisce lo smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Sposta-costruisce lo smart pointer. |
| [operator=](./operator=/)(SmartPtr_\&&) | Sposta-assegna lo smart pointer. |
| [operator=](./operator=/)(const SmartPtr_\&) | Copia-assegna lo smart pointer. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Copia-assegna lo smart pointer. |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | Assegna lo smart pointer. |
| [operator=](./operator=/)(std::nullptr_t) | Imposta lo smart pointer a null. |
| [operator==](./operator==/)(std::nullptr_t) const | Verifica se lo smart pointer è null. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | Alias del tipo stesso. |
| [Pointee_](./pointee_/) | Tipo puntato. |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) alias della classe base. |

## Vedi anche

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
