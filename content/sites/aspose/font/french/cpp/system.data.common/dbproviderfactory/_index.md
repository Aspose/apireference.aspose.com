---
title: "System::Data::Common::DbProviderFactory classe"
linktitle: "DbProviderFactory"
second_title: "Aspose.Font pour C++"
description: "System::Data::Common::DbProviderFactory classe. Fournisseur d'accès à la base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne jamais créer d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Toujours encapsuler cette classe dans un pointeur System::SmartPtr et utiliser ce pointeur pour le passer aux fonctions en argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.data.common/dbproviderfactory/
---
## DbProviderFactory class


Fournisseur d'accès à la base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne jamais créer d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Toujours encapsuler cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utiliser ce pointeur pour le passer aux fonctions en argument.

```cpp
class DbProviderFactory : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [CreateCommand](./createcommand/)() | Informations RTTI. |
| virtual [CreateConnection](./createconnection/)() | Crée une connexion à la base de données. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
