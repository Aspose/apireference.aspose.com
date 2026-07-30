---
title: "System::Text::RegularExpressions::Match classe"
linktitle: "Match"
second_title: "Aspose.Font pour C++"
description: "System::Text::RegularExpressions::Match class. Correspondance unique d'une expression régulière sur une chaîne. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.text.regularexpressions/match/
---
## Match class


[Single](../../system/single/) match of regexp over string. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Match : public System::Text::RegularExpressions::Group
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | Ajoute une capture à la correspondance. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Ajoute un groupe à la correspondance. |
| static [get_Empty](./get_empty/)() | Accesseur de correspondance vide. |
| [get_Groups](./get_groups/)() | Obtient la liste des groupes. |
| [Match](./match/)(const UStringPtr\&, int, int) | Constructeur. |
| [NextMatch](./nextmatch/)() | Itération sur les correspondances. |
| virtual [Result](./result/)(const String\&) | Formate la chaîne en remplaçant les références de sous-correspondance par leurs valeurs. |
| [SetMappedIndexes](./setmappedindexes/)(const std::vector\<int\>\&) |  |
## Voir aussi

* Class [Group](../group/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
