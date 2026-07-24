---
title: "Classe System::Data::Common::DbDataReader"
linktitle: "DbDataReader"
second_title: "Aspose.Page pour C++"
description: "Classe System::Data::Common::DbDataReader. API pour recevoir des données depuis la base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


API pour recevoir des données depuis la base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class DbDataReader : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Close](./close/)() | Ferme le canal de récupération des données. |
| virtual [idx_get](./idx_get/)(String) | Obtient l'élément nommé. |
| virtual [idx_get](./idx_get/)(int) | Obtient l'élément par indice. |
| virtual [Read](./read/)() | Lit l'enregistrement suivant depuis la base de données. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Informations RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
