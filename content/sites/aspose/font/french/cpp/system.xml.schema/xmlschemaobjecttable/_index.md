---
title: "System::Xml::Schema::XmlSchemaObjectTable classe"
linktitle: "TableauObjetXmlSchema"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaObjectTable classe. Fournit les collections pour les éléments contenus dans la classe XmlSchema (par exemple, Attributes, AttributeGroups, Elements, etc.) en C++."
type: docs
weight: 5300
url: /fr/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


Fournit les collections pour les éléments contenus dans la classe [XmlSchema](../xmlschema/) (par exemple, Attributes, AttributeGroups, Elements, etc.).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Détermine si le nom qualifié spécifié existe dans la collection. |
| [get_Count](./get_count/)() | Renvoie le nombre d'éléments contenus dans le [XmlSchemaObjectTable](./). |
| [get_Names](./get_names/)() | Renvoie une collection de tous les éléments nommés dans le [XmlSchemaObjectTable](./). |
| [get_Values](./get_values/)() | Renvoie une collection de toutes les valeurs pour tous les éléments du [XmlSchemaObjectTable](./). |
| [GetEnumerator](./getenumerator/)() override | Renvoie un énumérateur qui peut parcourir le [XmlSchemaObjectTable](./). |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Renvoie l'élément du [XmlSchemaObjectTable](./) spécifié par le nom qualifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
