---
title: "classe System::ComponentModel::ProgressChangedEventArgs"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Font per C++"
description: "Classe System::ComponentModel::ProgressChangedEventArgs. Un'istanza di questa classe viene passata come argomento al delegato ProgressChangedEventHandler. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Un'istanza di questa classe viene passata come argomento al delegato ProgressChangedEventHandler. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | Restituisce la percentuale di avanzamento del task asincrono. |
| [get_UserState](./get_userstate/)() const | Restituisce uno stato utente unico. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
