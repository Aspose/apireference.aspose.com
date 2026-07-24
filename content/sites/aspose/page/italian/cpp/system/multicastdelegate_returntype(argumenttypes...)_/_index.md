---
title: "classe System::MulticastDelegate< ReturnType(ArgumentTypes...)>"
linktitle: "MulticastDelegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Page per C++"
description: "classe System::MulticastDelegate< ReturnType(ArgumentTypes...)>. Rappresenta una collezione di delegate. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe System::SmartPtr per gestire oggetti di questo tipo in C++."
type: docs
weight: 4500
url: /it/cpp/system/multicastdelegate_returntype(argumenttypes...)_/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)> class


Rappresenta una collezione di delegate. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](../smartptr/) per gestire oggetti di questo tipo.

```cpp
template<class ReturnType,class...>class MulticastDelegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Parametro | Descrizione |
| --- | --- |
| ReturnType | Tipo di ritorno delle entità invocabili a cui punta ciascun delegate nella collezione |
| ArgumentTypes | Elenco degli argomenti delle entità invocabili a cui punta ciascun delegate nella collezione |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BeginInvoke](./begininvoke/)(ArgumentTypes..., const AsyncCallback\&, const CallbackArgumentType\&) | NOT IMPLEMENTED. |
| [connect](./connect/)(Callback) | Aggiunge il delegate specificato alla collezione. |
| [connect](./connect/)(std::function\<R(Args...)>) | Aggiunge l'oggetto funzione specificato alla collezione di delegate. L'oggetto funzione viene convertito al tipo delegate [Callback](./callback/) prima di essere aggiunto alla collezione. |
| [connect](./connect/)(MulticastDelegate\&) | Aggiunge l'oggetto MulticastDelegate specificato alla collezione di delegate. |
| [connect](./connect/)(MemberType ClassType::*, ClassType *) | Aggiunge il metodo non statico specificato dell'oggetto specificato alla collezione di delegate. |
| [connect](./connect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Aggiunge il metodo non statico specificato dell'oggetto specificato alla collezione di delegate. |
| [disconnect](./disconnect/)(Callback) | Rimuove il delegate specificato dalla collezione di delegate. |
| [disconnect](./disconnect/)(MemberType ClassType::*, ClassType *) | Rimuove il metodo non statico specificato dell'oggetto specificato dalla collezione di delegate. |
| [disconnect](./disconnect/)(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) | Rimuove il metodo non statico specificato dell'oggetto specificato dalla collezione di delegate. |
| [disconnect](./disconnect/)(MulticastDelegate\&) | Rimuove l'oggetto MulticastDelegate specificato dalla collezione di delegate. |
| [disconnect_all_slots](./disconnect_all_slots/)() | Rimuove tutti i delegate dalla collezione di delegate. |
| [empty](./empty/)() const | Determina se la collezione di delegate è vuota. |
| [EndInvoke](./endinvoke/)(const SharedPtr\<IAsyncResult\>\&) | NOT IMPLEMENTED. |
| [GetHashCode](./gethashcode/)() const |  |
| [GetType](./gettype/)() const |  |
| [invoke](./invoke/)(ArgumentTypes...) const | Invoca tutti i delegate attualmente presenti nella collezione di delegate. I delegate vengono invocati nello stesso ordine in cui sono stati aggiunti alla collezione. Il metodo blocca l'esecuzione finché i delegate non sono completati. |
| [IsNull](./isnull/)() const | Determina se la collezione di delegate è vuota. |
| [MulticastDelegate](./multicastdelegate/)() | Costruisce una collezione vuota. |
| [MulticastDelegate](./multicastdelegate/)(std::nullptr_t) | Equivalente al costruttore predefinito. |
| [MulticastDelegate](./multicastdelegate/)(const MulticastDelegate\&) | Esegue una copia superficiale della collezione di delegate. |
| [MulticastDelegate](./multicastdelegate/)(MulticastDelegate\&&) | Costruttore di spostamento. |
| [MulticastDelegate](./multicastdelegate/)(Callback\&&) | Crea un'istanza e inserisce il delegato specificato nella raccolta dei delegati. |
| [MulticastDelegate](./multicastdelegate/)(T) | Crea un'istanza e inserisce il valore specificato nella raccolta dei delegati. |
| [MulticastDelegate](./multicastdelegate/)(std::function\<ReturnType(ArgumentTypes...)>) | Crea un'istanza e inserisce il valore specificato nella raccolta dei delegati. |
| [operator!=](./operator!=/)(const std::nullptr_t\&) const | Determina se la raccolta dei delegati non è vuota. |
| [operator!=](./operator!=/)(const MulticastDelegate\&) const | Determina se due istanze di MulticastDelegate - l'oggetto corrente e l'oggetto specificato - sono diverse. |
| [operator()](./operator()/)(ArgumentTypes...) const | Invoca tutti i delegati attualmente presenti nella raccolta dei delegati. I delegati vengono invocati nello stesso ordine in cui sono stati aggiunti alla raccolta. L'operatore blocca l'esecuzione finché i delegati non sono eseguiti. |
| [operator+=](./operator+=/)(Callback) | Aggiunge il delegate specificato alla collezione. |
| [operator-=](./operator-=/)(Callback) | Rimuove il delegate specificato dalla collezione di delegate. |
| [operator=](./operator=/)(const MulticastDelegate\&) | Assegna la raccolta dei delegati rappresentata dall'oggetto specificato all'oggetto corrente. Di conseguenza entrambi gli oggetti puntano alla stessa raccolta di delegati. |
| [operator=](./operator=/)(MulticastDelegate\&&) | Operatore di assegnazione di spostamento. |
| [operator==](./operator==/)(const std::nullptr_t\&) const | Determina se la collezione di delegate è vuota. |
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
* Library [Aspose.Page for C++](../../)
