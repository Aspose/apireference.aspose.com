---
title: "Classe System::Xml::XmlUrlResolver"
linktitle: "XmlUrlResolver"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlUrlResolver. Résout les ressources XML externes nommées par un Uniform Resource Identifier (URI) en C++."
type: docs
weight: 4100
url: /fr/cpp/system.xml/xmlurlresolver/
---
## XmlUrlResolver class


Résout les ressources XML externes nommées par un Uniform Resource Identifier (URI).

```cpp
class XmlUrlResolver : public System::Xml::XmlResolver
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) override | Mappe un URI à un objet contenant la ressource réelle. |
| [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) override | Résout l'URI absolu à partir des URI de base et relatifs. |
| [set_CachePolicy](./set_cachepolicy/)(const SharedPtr\<Net::Cache::RequestCachePolicy\>\&) | Définit la politique de cache pour l'objet WebRequest sous-jacent. |
| [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) override | Définit les informations d’identification utilisées pour authentifier les requêtes web. |
| [set_Proxy](./set_proxy/)(const SharedPtr\<Net::IWebProxy\>\&) | Définit le proxy réseau pour l’objet WebRequest sous-jacent. |
| [XmlUrlResolver](./xmlurlresolver/)() | Initialise une nouvelle instance de la classe [XmlUrlResolver](./). |
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
