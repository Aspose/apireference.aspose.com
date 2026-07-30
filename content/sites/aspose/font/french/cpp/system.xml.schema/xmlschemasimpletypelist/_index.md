---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList classe"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList classe. Représente l'élément list du schéma XML tel que spécifié par le World Wide Web Consortium (W3C). Cette classe peut être utilisée pour définir un élément simpleType comme une liste de valeurs d'un type de données spécifié en C++."
type: docs
weight: 6400
url: /fr/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


Représente l'élément **list** du [Schema](../) XML tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe peut être utilisée pour définir un élément **simpleType** comme une liste de valeurs d'un type de données spécifié.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Renvoie le [XmlSchemaSimpleType](../xmlschemasimpletype/) représentant le type de l'élément **simpleType** basé sur les valeurs [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) et [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) du type simple. |
| [get_ItemType](./get_itemtype/)() | Renvoie l'élément **simpleType** qui est dérivé du type spécifié par la valeur de base. |
| [get_ItemTypeName](./get_itemtypename/)() | Renvoie le nom d'un type de données intégré ou d'un élément **simpleType** défini dans ce schéma (ou un autre schéma indiqué par l'espace de noms spécifié). |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Définit le [XmlSchemaSimpleType](../xmlschemasimpletype/) représentant le type de l'élément **simpleType** basé sur les valeurs [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) et [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) du type simple. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Définit l'élément **simpleType** qui est dérivé du type spécifié par la valeur de base. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Définit le nom d'un type de données intégré ou d'un élément **simpleType** défini dans ce schéma (ou un autre schéma indiqué par l'espace de noms spécifié). |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Initialise une nouvelle instance de la classe [XmlSchemaSimpleTypeList](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
