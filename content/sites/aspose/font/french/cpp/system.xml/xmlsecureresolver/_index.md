---
title: "Classe System::Xml::XmlSecureResolver"
linktitle: "XmlSecureResolver"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlSecureResolver. Aide à sécuriser une autre implémentation de XmlResolver en enveloppant l'objet XmlResolver et en restreignant les ressources auxquelles le XmlResolver sous-jacent a accès en C++."
type: docs
weight: 3600
url: /fr/cpp/system.xml/xmlsecureresolver/
---
## XmlSecureResolver class


Aide à sécuriser une autre implémentation de [XmlResolver](../xmlresolver/) en enveloppant l'objet [XmlResolver](../xmlresolver/) et en restreignant les ressources auxquelles le [XmlResolver](../xmlresolver/) sous-jacent a accès.

```cpp
class XmlSecureResolver : public System::Xml::XmlResolver
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Mappe un URI à un objet contenant la ressource réelle. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Résout l'URI absolu à partir des URI de base et relatifs en appelant **ResolveUri** sur le [XmlResolver](../xmlresolver/) sous-jacent. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Définit les informations d’identification utilisées pour authentifier les requêtes web. |
| [XmlSecureResolver](./xmlsecureresolver/)(const SharedPtr\<XmlResolver\>\&, const String\&) | Initialise une nouvelle instance de la classe [XmlSecureResolver](./) avec le [XmlResolver](../xmlresolver/) et l'URL fournis. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlResolver](../xmlresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
