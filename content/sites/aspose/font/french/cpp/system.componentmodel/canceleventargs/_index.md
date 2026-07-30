---
title: "classe System::ComponentModel::CancelEventArgs"
linktitle: "CancelEventArgs"
second_title: "Aspose.Font pour C++"
description: "classe System::ComponentModel::CancelEventArgs. Arguments d'un événement annulable. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 300
url: /fr/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


Arguments d'un événement annulable. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | Informations RTTI. |
| [CancelEventArgs](./canceleventargs/)() | Constructeur ; définit la propriété Cancel à false. |
| [get_Cancel](./get_cancel/)() | Obtient une valeur indiquant si l'événement doit être annulé. |
| [set_Cancel](./set_cancel/)(bool) | Définit une valeur indiquant si l'événement doit être annulé. |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Voir aussi

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
