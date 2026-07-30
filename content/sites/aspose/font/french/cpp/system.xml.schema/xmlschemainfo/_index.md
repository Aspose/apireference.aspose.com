---
title: "Classe System::Xml::Schema::XmlSchemaInfo"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaInfo. Représente l’ensemble d’informations post-validation de schéma d’un nœud XML validé en C++."
type: docs
weight: 3800
url: /fr/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


Représente l'infoset post-validation de schéma d'un nœud XML validé.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | Renvoie l’objet [XmlSchemaContentType](../xmlschemacontenttype/) qui correspond au type de contenu de ce nœud XML validé. |
| [get_IsDefault](./get_isdefault/)() override | Renvoie une valeur indiquant si ce nœud XML validé a été défini à la suite d’une valeur par défaut appliquée lors de la validation du schéma XML [Schema](../) Definition Language (XSD). |
| [get_IsNil](./get_isnil/)() override | Renvoie une valeur indiquant si la valeur de ce nœud XML validé est **nil**. |
| [get_MemberType](./get_membertype/)() override | Renvoie le type de schéma dynamique pour ce nœud XML validé. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | Renvoie l’objet compilé [XmlSchemaAttribute](../xmlschemaattribute/) qui correspond à ce nœud XML validé. |
| [get_SchemaElement](./get_schemaelement/)() override | Renvoie l’objet compilé [XmlSchemaElement](../xmlschemaelement/) qui correspond à ce nœud XML validé. |
| [get_SchemaType](./get_schematype/)() override | Renvoie le type de schéma statique XML [Schema](../) Definition Language (XSD) de ce nœud XML validé. |
| [get_Validity](./get_validity/)() override | Renvoie la valeur [XmlSchemaValidity](../xmlschemavalidity/) de ce nœud XML validé. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | Définit l’objet [XmlSchemaContentType](../xmlschemacontenttype/) qui correspond au type de contenu de ce nœud XML validé. |
| [set_IsDefault](./set_isdefault/)(bool) | Définit une valeur indiquant si ce nœud XML validé a été défini à la suite d’une valeur par défaut appliquée lors de la validation du schéma XML [Schema](../) Definition Language (XSD). |
| [set_IsNil](./set_isnil/)(bool) | Définit une valeur indiquant si la valeur de ce nœud XML validé est **nil**. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Définit le type de schéma dynamique pour ce nœud XML validé. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | Définit l’objet compilé [XmlSchemaAttribute](../xmlschemaattribute/) qui correspond à ce nœud XML validé. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | Définit l’objet compilé [XmlSchemaElement](../xmlschemaelement/) qui correspond à ce nœud XML validé. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Définit le type de schéma statique XML [Schema](../) Definition Language (XSD) de ce nœud XML validé. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | Définit la valeur [XmlSchemaValidity](../xmlschemavalidity/) de ce nœud XML validé. |
| [XmlSchemaInfo](./xmlschemainfo/)() | Initialise une nouvelle instance de la classe [XmlSchemaInfo](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
