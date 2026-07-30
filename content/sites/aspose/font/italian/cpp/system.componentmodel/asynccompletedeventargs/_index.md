---
title: "Classe System::ComponentModel::AsyncCompletedEventArgs"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Font per C++"
description: "Classe System::ComponentModel::AsyncCompletedEventArgs. Un'istanza di questa classe viene passata come argomento al delegato AsyncCompletedEventHandler. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Un'istanza di questa classe viene passata come argomento al delegato AsyncCompletedEventHandler. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Costruttore. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Inizializza una nuova istanza della classe [System.ComponentModel.AsyncCompletedEventArgs](./). |
| [get_Cancelled](./get_cancelled/)() const | Restituisce un valore che indica se un'operazione asincrona è stata annullata. true se l'operazione in background è stata annullata; altrimenti false. Il valore predefinito è false. |
| [get_Error](./get_error/)() const | Restituisce un valore che indica quale errore si è verificato durante un'operazione asincrona. |
| [get_UserState](./get_userstate/)() const | Restituisce l'identificatore univoco per l'attività asincrona. Un riferimento a oggetto che identifica in modo univoco l'attività asincrona; altrimenti, null se non è stato impostato alcun valore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
