---
title: "classe System::ComponentModel::DoWorkEventArgs"
linktitle: "DoWorkEventArgs"
second_title: "Aspose.Font pour C++"
description: "classe System::ComponentModel::DoWorkEventArgs. Arguments de l'événement DoWork. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


Arguments de l'événement DoWork. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | Informations RTTI. |
| [get_Argument](./get_argument/)() | Obtient la propriété Argument ; non implémenté. |
| [get_Result](./get_result/)() | Obtient la propriété Result ; non implémenté. |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Définit la propriété Result ; non implémenté. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Voir aussi

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
