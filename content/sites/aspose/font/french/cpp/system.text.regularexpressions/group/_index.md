---
title: "classe System::Text::RegularExpressions::Group"
linktitle: "Group"
second_title: "Aspose.Font pour C++"
description: "classe System::Text::RegularExpressions::Group. Résultat d'une correspondance effectuée par un seul groupe de capture. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.text.regularexpressions/group/
---
## Group class


Résultat d'une correspondance effectuée par un seul groupe de capture. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Ajoute une capture au groupe. |
| [get_Captures](./get_captures/)() | Obtient les captures disponibles. |
| [get_Success](./get_success/)() | Vérifie si la capture a réussi pour ce groupe. |
| [Group](./group/)(const UStringPtr\&, int, int) | Constructeur. |
| [Group](./group/)() | Constructeur d'un groupe vide. |
## Voir aussi

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
