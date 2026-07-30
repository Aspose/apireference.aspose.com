---
title: "System::Xml::Schema::XmlSchemaCollection class"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaCollection class. Contient un cache de schémas XML Schema Definition Language (XSD) et XML-Data Reduced (XDR) en C++."
type: docs
weight: 1500
url: /fr/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


Contient un cache de schémas XML [Schema](../) Definition Language (XSD) et XML-Data Reduced (XDR).

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Ajoute le schéma situé à l'URL fournie dans la collection de schémas. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | Ajoute le schéma contenu dans le [XmlReader](../../system.xml/xmlreader/) à la collection de schémas. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Ajoute le schéma contenu dans le [XmlReader](../../system.xml/xmlreader/) à la collection de schémas. Le [XmlResolver](../../system.xml/xmlresolver/) spécifié est utilisé pour résoudre toutes les ressources externes. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Ajoute le [XmlSchema](../xmlschema/) à la collection. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Ajoute le [XmlSchema](../xmlschema/) à la collection. Le [XmlResolver](../../system.xml/xmlresolver/) spécifié est utilisé pour résoudre toutes les références externes. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | Ajoute tous les espaces de noms définis dans la collection donnée (y compris leurs schémas associés) à cette collection. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Renvoie une valeur indiquant si le **targetNamespace** du [XmlSchema](../xmlschema/) spécifié se trouve dans la collection. |
| [Contains](./contains/)(const String\&) | Renvoie une valeur indiquant si un schéma avec l'espace de noms spécifié se trouve dans la collection. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Copie tous les objets [XmlSchema](../xmlschema/) de cette collection dans le tableau donné en commençant à l'index indiqué. |
| [get_Count](./get_count/)() | Renvoie le nombre d'espaces de noms définis dans cette collection. |
| [get_NameTable](./get_nametable/)() | Renvoie la [XmlNameTable](../../system.xml/xmlnametable/) par défaut utilisée par la [XmlSchemaCollection](./) lors du chargement de nouveaux schémas. |
| [GetEnumerator](./getenumerator/)() override | Fournit un support pour l'itération sur la collection de schémas. |
| [idx_get](./idx_get/)(const String\&) | Renvoie le [XmlSchema](../xmlschema/) associé à l'URI d'espace de noms fourni. |
| [XmlSchemaCollection](./xmlschemacollection/)() | Initialise une nouvelle instance de la classe [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlSchemaCollection](./) avec la [XmlNameTable](../../system.xml/xmlnametable/) spécifiée. La [XmlNameTable](../../system.xml/xmlnametable/) est utilisée lors du chargement des schémas. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques


## Deprecated
La classe XmlSchemaCollection est obsolète. Utilisez XmlSchemaSet à la place.

Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
