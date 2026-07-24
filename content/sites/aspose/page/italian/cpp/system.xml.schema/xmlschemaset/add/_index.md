---
title: "Metodo System::Xml::Schema::XmlSchemaSet::Add"
linktitle: "Add"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::Schema::XmlSchemaSet::Add. Aggiunge lo XmlSchema fornito all'XmlSchemaSet in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


Aggiunge lo [XmlSchema](../../xmlschema/) fornito al [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'oggetto [XmlSchema](../../xmlschema/) da aggiungere al [XmlSchemaSet](../). |

### ReturnValue

Un oggetto [XmlSchema](../../xmlschema/) se lo schema è valido. Se lo schema non è valido e viene specificato un [ValidationEventHandler](../../validationeventhandler/), allora viene restituito **nullptr** e viene sollevato l'evento di validazione appropriato. Altrimenti, viene generata un' [XmlSchemaException](../../xmlschemaexception/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


Aggiunge tutti gli schemi XML [Schema](../../) definition language (XSD) nel [XmlSchemaSet](../) fornito al [XmlSchemaSet](../).

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | L'oggetto [XmlSchemaSet](../). |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


Aggiunge lo schema XML [Schema](../../) definition language (XSD) contenuto nel [XmlReader](../../../system.xml/xmlreader/) al [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetNamespace | String | Il valore **targetNamespace** dello schema, oppure **nullptr** per utilizzare il **targetNamespace** specificato nello schema. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | L'oggetto [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

Un oggetto [XmlSchema](../../xmlschema/) se lo schema è valido. Se lo schema non è valido e viene specificato un [ValidationEventHandler](../../validationeventhandler/), allora viene restituito **nullptr** e viene sollevato l'evento di validazione appropriato. Altrimenti, viene generata un' [XmlSchemaException](../../xmlschemaexception/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


Aggiunge lo schema XML [Schema](../../) definition language (XSD) all'URL specificato al [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetNamespace | String | Il valore **targetNamespace** dello schema, oppure **nullptr** per utilizzare il **targetNamespace** specificato nello schema. |
| schemaUri | const String\& | L'URL che specifica lo schema da caricare. |

### ReturnValue

Un oggetto [XmlSchema](../../xmlschema/) se lo schema è valido. Se lo schema non è valido e viene specificato un [ValidationEventHandler](../../validationeventhandler/), allora viene restituito **nullptr** e viene sollevato l'evento di validazione appropriato. Altrimenti, viene generata un' [XmlSchemaException](../../xmlschemaexception/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
