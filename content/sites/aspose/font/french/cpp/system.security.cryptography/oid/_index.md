---
title: "classe System::Security::Cryptography::Oid"
linktitle: "Oid"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::Cryptography::Oid. Identifiant d'objet cryptographique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 2500
url: /fr/cpp/system.security.cryptography/oid/
---
## Oid class


Identifiant d'objet cryptographique. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans le pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class Oid : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | Créez un objet OID à partir du nom convivial OID spécifié. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | Créez un objet OID à partir de la valeur OID spécifiée. |
| [get_FriendlyName](./get_friendlyname/)() const | Obtient le nom convivial de l'objet. |
| [get_Value](./get_value/)() const | Obtient la chaîne d'identifiant de l'objet. |
| [Oid](./oid/)() | Informations RTTI. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | Constructeur de copie. |
| [Oid](./oid/)(const String\&) | Constructeur. |
| [Oid](./oid/)(const String\&, const String\&) | Constructeur. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Définit le nom convivial de l'objet. |
| [set_Value](./set_value/)(const String\&) | Définit la chaîne d'identifiant de l'objet. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
