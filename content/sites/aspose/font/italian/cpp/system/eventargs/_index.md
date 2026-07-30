---
title: "System::EventArgs classe"
linktitle: "EventArgs"
second_title: "Aspose.Font per C++"
description: "System::EventArgs classe. La classe base per le classi che rappresentano un contesto passato agli iscritti all'evento quando un evento viene attivato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2500
url: /it/cpp/system/eventargs/
---
## EventArgs class


La classe base per le classi che rappresentano un contesto passato agli iscritti all'evento quando un evento viene attivato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class EventArgs : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EventArgs](./eventargs/)() | Costruttore. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](./empty/) | Un membro statico che rappresenta un puntatore condiviso \"vuoto\" [EventArgs](./) (null-pointer). |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
