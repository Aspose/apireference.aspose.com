---
title: "classe System::Data::DataRow"
linktitle: "DataRow"
second_title: "Aspose.Page pour C++"
description: "classe System::Data::DataRow. Ligne dans l'ensemble de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 500
url: /fr/cpp/system.data/datarow/
---
## DataRow class


Ligne dans l'ensemble de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en argument.

```cpp
class DataRow : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Table](./get_table/)() | Obtient la ligne de tableau à laquelle elle appartient. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | Obtient les lignes qui sont considérées comme enfants via la relation spécifiée. |
| [idx_get](./idx_get/)(const int32_t) | Informations RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
