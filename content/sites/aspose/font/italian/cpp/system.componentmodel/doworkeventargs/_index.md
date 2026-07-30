---
title: "Classe System::ComponentModel::DoWorkEventArgs"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Font per C++"
description: "Classe System::ComponentModel::DoWorkEventArgs. Argomenti dell'evento DoWork. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 600
url: /it/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


Argomenti dell'evento DoWork. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | Informazioni RTTI. |
| [get_Argument](./get_argument/)() | Restituisce la proprietà Argument; non implementata. |
| [get_Result](./get_result/)() | Restituisce la proprietà Result; non implementata. |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Imposta la proprietà Result; non implementata. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Vedi anche

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
