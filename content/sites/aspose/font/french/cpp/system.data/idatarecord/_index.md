---
title: "Classe System::Data::IDataRecord"
linktitle: "IDataRecord"
second_title: "Aspose.Font pour C++"
description: "Classe System::Data::IDataRecord. Interface vers un enregistrement avec des colonnes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1300
url: /fr/cpp/system.data/idatarecord/
---
## IDataRecord class


Interface vers un enregistrement avec des colonnes. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Ne jamais créer d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class IDataRecord : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | Informations RTTI. |
| virtual [GetName](./getname/)(const int32_t) | Obtient le nom du champ à la position spécifiée. |
| virtual [idx_get](./idx_get/)(const int32_t) | Obtient la valeur à l'index spécifié. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Font for C++](../../)
