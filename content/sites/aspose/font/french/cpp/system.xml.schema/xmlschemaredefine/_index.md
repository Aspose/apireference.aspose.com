---
title: "Classe System::Xml::Schema::XmlSchemaRedefine"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaRedefine. Représente l'élément redefine du schéma XML tel que spécifié par le World Wide Web Consortium (W3C). Cette classe peut être utilisée pour permettre la redéfinition de types simples et complexes, de groupes et de groupes d'attributs provenant de fichiers de schéma externes dans le schéma actuel. Elle peut également être utilisée pour fournir la gestion des versions des éléments du schéma en C++."
type: docs
weight: 5600
url: /fr/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


Représente l'élément **redefine** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe peut être utilisée pour permettre la redéfinition de types simples et complexes, de groupes et de groupes d'attributs provenant de fichiers de schéma externes dans le schéma actuel. Elle peut également être utilisée pour fournir la gestion des versions des éléments du schéma.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Renvoie le [XmlSchemaObjectTable](../xmlschemaobjecttable/) , pour tous les attributs du schéma, qui contient l'interprétation post-compilation de la valeur **AttributeGroups**. |
| [get_Groups](./get_groups/)() | Renvoie le [XmlSchemaObjectTable](../xmlschemaobjecttable/), pour tous les groupes du schéma, qui contient l'interprétation post-compilation de la valeur **Groups**. |
| [get_Items](./get_items/)() | Renvoie la collection des classes suivantes : [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), et [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Renvoie le [XmlSchemaObjectTable](../xmlschemaobjecttable/), pour tous les types simples et complexes du schéma, qui contient l'interprétation post-compilation de la valeur **SchemaTypes**. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | Initialise une nouvelle instance de la classe [XmlSchemaRedefine](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
