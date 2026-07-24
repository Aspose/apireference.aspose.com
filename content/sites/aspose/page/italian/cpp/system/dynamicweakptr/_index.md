---
title: "Classe System::DynamicWeakPtr"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Page per C++"
description: "Classe System::DynamicWeakPtr. Classe di smart pointer che traccia le modalità dei puntatori degli argomenti template dell'oggetto memorizzato e le aggiorna dopo ogni assegnazione. Questo tipo è un puntatore per gestire l'eliminazione di altri oggetti. Dovrebbe essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante in C++."
type: docs
weight: 2200
url: /it/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


Classe smart pointer che traccia le modalità dei puntatori degli argomenti template dell'oggetto memorizzato e le aggiorna dopo ogni assegnazione. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante.

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| Parametro | Descrizione |
| --- | --- |
| Pointee | tipo. |
| trunkMode | Modalità dello smart pointer stesso, condivisa o debole. |
| weakLeafs | Indici degli argomenti template del tipo memorizzato che dovrebbero essere impostati in modalità puntatore debole. |
## Nested classes

* Class [Reference](./reference/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | Crea uno smart pointer nullo. |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | Crea uno smart pointer che punta all'oggetto fornito. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | Crea una copia dello smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | Crea una copia dello smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | Crea una copia dello smart pointer. |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | Costruisce tramite move lo smart pointer. |
| [operator=](./operator=/)(SmartPtr_\&&) | Assegna tramite move lo smart pointer. |
| [operator=](./operator=/)(const SmartPtr_\&) | Assegna tramite copia lo smart pointer. |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Assegna tramite copia lo smart pointer. |
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
* Library [Aspose.Page for C++](../../)
