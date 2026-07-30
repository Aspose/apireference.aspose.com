---
title: "classe System::MulticastDelegate< ReturnType(ArgumentTypes...)>"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font per C++"
description: "classe System::MulticastDelegate< ReturnType(ArgumentTypes...)>. Rappresenta una collezione di delegati. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 4500
url: /it/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


Rappresenta una collezione di delegati. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parametro | Descrizione |
| --- | --- |
| ReturnType | Tipo di ritorno delle entità invocabili a cui punta ciascun delegato nella collezione |
| ArgumentTypes | Elenco degli argomenti delle entità invocabili a cui punta ciascun delegato nella collezione |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | NON IMPLEMENTATO. |
| [connect](./connect/)(Callback) | Aggiunge il delegato specificato alla collezione. |
| [connect](./connect/)(std::function\<R(Args...)>) | Aggiunge l'oggetto funzione specificato alla collezione di delegati. L'oggetto funzione viene convertito al tipo delegato [Callback](./callback/) prima di essere aggiunto alla collezione. |
| [connect](./connect/)(MulticastDelegate\&) | Aggiunge l'oggetto MulticastDelegate specificato alla collezione di delegati. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | Aggiunge il metodo non statico specificato dell'oggetto specificato alla collezione di delegati. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Aggiunge il metodo non statico specificato dell'oggetto specificato alla collezione di delegati. |
| [disconnect](./disconnect/)(Callback) | Rimuove il delegato specificato dalla collezione di delegati. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | Rimuove il metodo non statico specificato dell'oggetto specificato dalla collezione di delegati. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Rimuove il metodo non statico specificato dell'oggetto specificato dalla collezione di delegati. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | Rimuove l'oggetto MulticastDelegate specificato dalla collezione di delegati. |
| [disconnect_all_slots](./disconnect_all_slots/)() | Rimuove tutti i delegati dalla collezione di delegati. |
| [empty](./empty/)() const | Determina se la collezione di delegati è vuota. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | NON IMPLEMENTATO. |
| [Equals](./equals/)(const MulticastDelegate\&) |  |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | Invoca tutti i delegati attualmente presenti nella collezione di delegati. I delegati vengono invocati nello stesso ordine in cui sono stati aggiunti alla collezione. Il metodo blocca l'esecuzione finché i delegati non sono completati. |
| [IsNull](./isnull/)() const | Determina se la collezione di delegati è vuota. |
| [MulticastDelegate](./multicastdelegate/)() | Costruisce una collezione vuota. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | Equivalente al costruttore predefinito. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | Esegue una copia superficiale della collezione di delegati. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | Costruttore di spostamento. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | Crea un'istanza e inserisce il delegato specificato nella collezione dei delegati. |
| [MulticastDelegate](./multicastdelegate/)(T) | Crea un'istanza e inserisce il valore specificato nella collezione dei delegati. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | Crea un'istanza e inserisce il valore specificato nella collezione dei delegati. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Determina se la collezione dei delegati non è vuota. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | Determina se due istanze di MulticastDelegate - l'oggetto corrente e l'oggetto specificato - sono diverse. |
| [operator()](./operator()/)(ArgumentTypes...) const | Invoca tutti i delegati attualmente presenti nella collezione dei delegati. I delegati sono invocati nello stesso ordine in cui sono stati aggiunti alla collezione. L'operatore blocca l'esecuzione finché i delegati non sono eseguiti. |
| [operator+=](./operator+=/)(Callback) | Aggiunge il delegato specificato alla collezione. |
| [operator-=](./operator-=/)(Callback) | Rimuove il delegato specificato dalla collezione di delegati. |
| [operator=](./operator=/)(const MulticastDelegate\&) | Assegna la collezione di delegati rappresentata dall'oggetto specificato all'oggetto corrente. Di conseguenza entrambi gli oggetti puntano alla stessa collezione di delegati. |
| [operator=](./operator=/)(MulticastDelegate\&&) | Operatore di assegnazione di spostamento. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Determina se la collezione di delegati è vuota. |
| [operator==](./operator==/)(const MulticastDelegate\&) const | Determina se due istanze di MulticastDelegate - l'oggetto corrente e l'oggetto specificato - sono uguali. |
| [remove_empty_callbacks](./remove_empty_callbacks/)() const | Rimuove i callback contenuti che sono vuoti (non chiamano effettivamente nulla). |
| [ToString](./tostring/)() const |  |
| static [Type](./type/)() | Restituisce un riferimento all'oggetto [TypeInfo](../typeinfo/) che rappresenta le informazioni sul tipo della classe MulticastDelegate. |
| [~MulticastDelegate](./~multicastdelegate/)() | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Callback](./callback/) | Il tipo dei delegati rappresentati dalla classe MulticastDelegate. |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
