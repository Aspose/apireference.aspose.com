---
title: "Classe System::IAsyncResult"
linktitle: "IAsyncResult"
second_title: "Aspose.Font per C++"
description: "Classe System::IAsyncResult. Rappresenta lo stato di un'operazione asincrona. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 3100
url: /it/cpp/system/iasyncresult/
---
## IAsyncResult class


Rappresenta lo stato di un'operazione asincrona. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class IAsyncResult : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | Restituisce un oggetto che contiene le informazioni sull'operazione asincrona. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | Restituisce un'istanza di WaitHandle che può essere utilizzata per attendere il completamento dell'operazione asincrona. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | Restituisce un valore che indica se l'operazione asincrona è stata completata in modo sincrono. |
| virtual [get_IsCompleted](./get_iscompleted/)() | Restituisce un valore che indica se l'operazione asincrona è stata completata. |
| virtual [~IAsyncResult](./~iasyncresult/)() | Distruttore. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [smart_ptr](./smart_ptr/) | Puntatore condiviso a [IAsyncResult](./). |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
