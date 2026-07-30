---
title: "System::ComponentModel::PropertyChangedEventArgs class"
linktitle: "PropertyChangedEventArgs"
second_title: "Aspose.Font pour C++"
description: "System::ComponentModel::PropertyChangedEventArgs class. Arguments de l'événement PropertyChanged. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


Arguments de l'événement PropertyChanged. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | Informations RTTI. |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | Initialise les arguments de l'événement PropertyChanged. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Voir aussi

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
