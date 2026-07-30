---
title: "System::Data::Common::DbCommand classe"
linktitle: "DbCommand"
second_title: "Aspose.Font pour C++"
description: "System::Data::Common::DbCommand classe. Commande de base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.data.common/dbcommand/
---
## DbCommand class


Commande de base de données. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class DbCommand : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | Exécute une commande non requête. |
| virtual [ExecuteReader](./executereader/)() | Exécute une commande de requête. |
| virtual [get_CommandText](./get_commandtext/)() const | Informations RTTI. |
| virtual [get_Connection](./get_connection/)() const | Obtient la connexion à la base de données associée à la commande. |
| virtual [set_CommandText](./set_commandtext/)(String) const | Définit le texte de la commande DB. |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | Obtient la connexion à la base de données associée à la commande. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Font for C++](../../)
