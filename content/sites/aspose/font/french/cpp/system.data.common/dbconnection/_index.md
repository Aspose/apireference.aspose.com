---
title: "System::Data::Common::DbConnection classe"
linktitle: "DbConnection"
second_title: "Aspose.Font pour C++"
description: "System::Data::Common::DbConnection classe. Connexion à la base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.data.common/dbconnection/
---
## DbConnection class


Connexion à la base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class DbConnection : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | Informations RTTI. |
| virtual [Open](./open/)() | Ouvre la connexion à la base de données. |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | Définit les informations de connexion (par ex. serveur et port). |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
