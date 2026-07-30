---
title: "classe System::ComponentModel::AsyncCompletedEventArgs"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Font pour C++"
description: "classe System::ComponentModel::AsyncCompletedEventArgs. Une instance de cette classe est transmise en argument au délégué AsyncCompletedEventHandler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Une instance de cette classe est transmise en argument au délégué AsyncCompletedEventHandler. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Constructeur. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Initialise une nouvelle instance de la classe [System.ComponentModel.AsyncCompletedEventArgs](./). |
| [get_Cancelled](./get_cancelled/)() const | Obtient une valeur indiquant si une opération asynchrone a été annulée. true si l'opération en arrière-plan a été annulée ; sinon false. La valeur par défaut est false. |
| [get_Error](./get_error/)() const | Obtient une valeur indiquant quelle erreur s'est produite lors d'une opération asynchrone. |
| [get_UserState](./get_userstate/)() const | Obtient l'identifiant unique de la tâche asynchrone. Une référence d'objet qui identifie de manière unique la tâche asynchrone ; sinon null si aucune valeur n'a été définie. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Voir aussi

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
