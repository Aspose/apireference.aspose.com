---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef classe"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef classe. Représente l'élément attributeGroup avec l'attribut ref du schéma XML tel que spécifié par le . AttributesGroupRef est la référence d'un attributeGroup, la propriété name contient le groupe d'attributs référencé en C++."
type: docs
weight: 1300
url: /fr/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


Représente l'élément **attributeGroup** avec l'attribut **ref** du XML [Schema](../) tel que spécifié par le [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef est la référence d'un attributeGroup, la propriété name contient le groupe d'attributs référencé.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_RefName](./get_refname/)() | Renvoie le nom de l'élément **attributeGroup** référencé. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom de l'élément **attributeGroup** référencé. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | Initialise une nouvelle instance de la classe [XmlSchemaAttributeGroupRef](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
