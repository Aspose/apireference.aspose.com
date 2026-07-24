---
title: "System::ComponentModel::CancelEventArgs classe"
linktitle: "CancelEventArgs"
second_title: "Aspose.Page pour C++"
description: "System::ComponentModel::CancelEventArgs classe. Arguments d'un événement annulable. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


Arguments d'un événement annulable. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | Informations RTTI. |
| [CancelEventArgs](./canceleventargs/)() | Constructeur ; définit la propriété Cancel sur false. |
| [get_Cancel](./get_cancel/)() | Obtient la valeur indiquant si l'événement doit être annulé. |
| [set_Cancel](./set_cancel/)(bool) | Définit la valeur indiquant si l'événement doit être annulé. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Voir aussi

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
