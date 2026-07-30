---
title: "System::Data::Common::DbDataReader classe"
linktitle: "DbDataReader"
second_title: "Aspose.Font pour C++"
description: "System::Data::Common::DbDataReader classe. API pour recevoir des données de la base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne jamais créer d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Toujours encapsuler cette classe dans un pointeur System::SmartPtr et utiliser ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 400
url: /fr/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


API pour recevoir des données de la base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne jamais créer d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Toujours encapsuler cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utiliser ce pointeur pour le passer aux fonctions en argument.

```cpp
class DbDataReader : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Close](./close/)() | Ferme le canal de récupération de données. |
| virtual [idx_get](./idx_get/)(String) | Obtient l'élément nommé. |
| virtual [idx_get](./idx_get/)(int) | Obtient l'élément par indice. |
| virtual [Read](./read/)() | Lit l'enregistrement suivant de la base de données. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Informations RTTI. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
