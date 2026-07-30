---
title: "Classe System::Xml::XmlResolver"
linktitle: "XmlResolver"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlResolver. Résout les ressources XML externes nommées par un Uniform Resource Identifier (URI) en C++."
type: docs
weight: 3500
url: /fr/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Résout les ressources XML externes nommées par un Uniform Resource Identifier (URI).

```cpp
class XmlResolver : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | Lorsqu'elle est remplacée dans une classe dérivée, associe un URI à un objet contenant la ressource réelle. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | Lorsqu'elle est remplacée dans une classe dérivée, résout l'URI absolu à partir des URI de base et relatifs. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | Lorsqu'elle est remplacée dans une classe dérivée, définit les informations d'identification utilisées pour authentifier les requêtes web. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | Permet au résolveur de retourner des types autres que Stream. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
