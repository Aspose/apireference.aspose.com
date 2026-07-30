---
title: "System::ComponentModel::RunWorkerCompletedEventArgs classe"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Font pour C++"
description: "System::ComponentModel::RunWorkerCompletedEventArgs class. Une instance de cette classe est transmise comme argument au délégué RunWorkerCompletedEventHandler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1300
url: /fr/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


Une instance de cette classe est transmise comme argument au délégué RunWorkerCompletedEventHandler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Result](./get_result/)() const | Obtient une valeur qui représente le résultat d'une opération asynchrone. |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | Informations RTTI. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Voir aussi

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
