---
title: "System::Drawing::Printing::PrintEventArgs classe"
linktitle: "PrintEventArgs"
second_title: "Aspose.Font pour C++"
description: "System::Drawing::Printing::PrintEventArgs classe. Fournit des données pour les événements BeginPrint et EndPrint. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 800
url: /fr/cpp/system.drawing.printing/printeventargs/
---
## PrintEventArgs class


Fournit des données pour les événements BeginPrint et EndPrint. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class PrintEventArgs : public System::ComponentModel::CancelEventArgs
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_PrintAction](./get_printaction/)() | Renvoie une valeur qui spécifie une action d'impression représentée par l'objet actuel. |
| [PrintEventArgs](./printeventargs/)() | Construit une nouvelle instance de l'objet [PrintEventArgs](./). |
## Champs

| Champ | Description |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Un membre statique qui représente un pointeur partagé "vide" [EventArgs](../../system/eventargs/) (pointeur nul). |
## Voir aussi

* Class [CancelEventArgs](../../system.componentmodel/canceleventargs/)
* Namespace [System::Drawing::Printing](../)
* Library [Aspose.Font for C++](../../)
