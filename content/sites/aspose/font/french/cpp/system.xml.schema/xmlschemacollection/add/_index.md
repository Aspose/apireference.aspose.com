---
title: "Méthode System::Xml::Schema::XmlSchemaCollection::Add"
linktitle: "Add"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaCollection::Add. Ajoute le XmlSchema à la collection en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


Ajoute le [XmlSchema](../../xmlschema/) à la collection.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Le [XmlSchema](../../xmlschema/) à ajouter à la collection. |

### ReturnValue

L'objet [XmlSchema](../../xmlschema/).

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Ajoute le [XmlSchema](../../xmlschema/) à la collection. Le [XmlResolver](../../../system.xml/xmlresolver/) spécifié est utilisé pour résoudre toutes les références externes.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Le [XmlSchema](../../xmlschema/) à ajouter à la collection. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre les espaces de noms référencés dans les éléments **include** et **import**. Si c’est **nullptr**, les références externes ne sont pas résolues. |

### ReturnValue

Le [XmlSchema](../../xmlschema/) ajouté à la collection de schémas.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


Ajoute tous les espaces de noms définis dans la collection donnée (y compris leurs schémas associés) à cette collection.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | La [XmlSchemaCollection](../) que vous souhaitez ajouter à cette collection. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


Ajoute le schéma contenu dans le [XmlReader](../../../system.xml/xmlreader/) à la collection de schémas.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ns | const String\& | L'URI d'espace de noms associé au schéma. Pour les schémas XML, il s'agit généralement du **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) contenant le schéma à ajouter. |

### ReturnValue

Le [XmlSchema](../../xmlschema/) ajouté à la collection de schémas ; **nullptr** si le schéma ajouté est un schéma XDR ou s'il y a des erreurs de compilation dans le schéma.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Ajoute le schéma contenu dans le [XmlReader](../../../system.xml/xmlreader/) à la collection de schémas. Le [XmlResolver](../../../system.xml/xmlresolver/) spécifié est utilisé pour résoudre toutes les ressources externes.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ns | const String\& | L'URI d'espace de noms associé au schéma. Pour les schémas XML, il s'agit généralement du **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) contenant le schéma à ajouter. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre les espaces de noms référencés dans les éléments **include** et **import** ou l'attribut **x-schema** (schémas XDR). Si c’est **nullptr**, les références externes ne sont pas résolues. |

### ReturnValue

Le [XmlSchema](../../xmlschema/) ajouté à la collection de schémas ; **nullptr** si le schéma ajouté est un schéma XDR ou s'il y a des erreurs de compilation dans le schéma.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


Ajoute le schéma situé à l'URL fournie dans la collection de schémas.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ns | const String\& | L'URI d'espace de noms associé au schéma. Pour les schémas XML, il s'agit généralement du **targetNamespace**. |
| uri | const String\& | L'URL qui spécifie le schéma à charger. |

### ReturnValue

Le [XmlSchema](../../xmlschema/) ajouté à la collection de schémas ; **nullptr** si le schéma ajouté est un schéma XDR ou s'il y a des erreurs de compilation dans le schéma.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
