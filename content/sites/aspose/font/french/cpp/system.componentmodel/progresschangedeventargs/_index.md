---
title: "System::ComponentModel::ProgressChangedEventArgs classe"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Font pour C++"
description: "System::ComponentModel::ProgressChangedEventArgs class. Une instance de cette classe est transmise comme argument au délégué ProgressChangedEventHandler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1100
url: /fr/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Une instance de cette classe est transmise comme argument au délégué ProgressChangedEventHandler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | Obtient le pourcentage de progression de la tâche asynchrone. |
| [get_UserState](./get_userstate/)() const | Obtient un état utilisateur unique. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | Constructeur. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Voir aussi

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
