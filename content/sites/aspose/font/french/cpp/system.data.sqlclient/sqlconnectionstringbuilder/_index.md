---
title: "System::Data::SqlClient::SqlConnectionStringBuilder classe"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Font pour C++"
description: "classe System::Data::SqlClient::SqlConnectionStringBuilder. Constructeur de connexion basé sur SQL. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 100
url: /fr/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


Constructeur de connexion basé sur SQL. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | Obtient la source de données (par ex. le nom d'hôte et le port). |
| [get_Encrypt](./get_encrypt/)() const | Vérifie si le chiffrement est activé en ligne. |
| [get_InitialCatalog](./get_initialcatalog/)() const | Obtient le nom de la base de données associée à la connexion. |
| [get_NetworkLibrary](./get_networklibrary/)() const | Obtient le nom de la bibliothèque réseau utilisée. |
| [get_Password](./get_password/)() const | Obtient le mot de passe utilisé pour se connecter à la base de données. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | Vérifie si la connexion est protégée en utilisant le certificat de serveur de confiance. |
| [get_UserID](./get_userid/)() const | Obtient l'identifiant d'utilisateur utilisé pour la connexion. |
| [idx_get](./idx_get/)(String) override | Informations RTTI. |
| [idx_set](./idx_set/)(String, Object::ptr) override | Définit l'objet clé. |
| [set_DataSource](./set_datasource/)(const String\&) | Obtient la source de données (par ex. le nom d'hôte et le port). |
| [set_Encrypt](./set_encrypt/)(bool) | Active ou désactive le chiffrement. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | Définit le nom de la base de données associée à la connexion. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | Sélectionne la bibliothèque réseau à utiliser. |
| [set_Password](./set_password/)(const String\&) | Définit le mot de passe à utiliser pour se connecter à la base de données. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | Détermine si la connexion est protégée en utilisant le certificat de serveur de confiance. |
| [set_UserID](./set_userid/)(const String\&) | Définit l'identifiant d'utilisateur à utiliser pour la connexion. |
## Voir aussi

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Font for C++](../../)
