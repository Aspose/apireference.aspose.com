---
title: "Classe System::ComponentModel::CancelEventArgs"
linktitle: "CancelEventArgs"
second_title: "Aspose.Font per C++"
description: "Classe System::ComponentModel::CancelEventArgs. Argomenti di un evento annullabile. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


Argomenti di un evento annullabile. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | Informazioni RTTI. |
| [CancelEventArgs](./canceleventargs/)() | Costruttore; imposta la proprietà Cancel a false. |
| [get_Cancel](./get_cancel/)() | Ottiene il valore che indica se l'evento deve essere annullato. |
| [set_Cancel](./set_cancel/)(bool) | Imposta il valore che indica se l'evento deve essere annullato. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
