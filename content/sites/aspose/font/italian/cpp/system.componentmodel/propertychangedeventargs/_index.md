---
title: "Classe System::ComponentModel::PropertyChangedEventArgs"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Font per C++"
description: "Classe System::ComponentModel::PropertyChangedEventArgs. Argomenti dell'evento PropertyChanged. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


Argomenti dell'evento PropertyChanged. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | Informazioni RTTI. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | Inizializza gli argomenti dell'evento PropertyChanged. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membro statico che rappresenta un puntatore condiviso "empty" [EventArgs](../../system/eventargs/) (null-pointer). |
## Vedi anche

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
