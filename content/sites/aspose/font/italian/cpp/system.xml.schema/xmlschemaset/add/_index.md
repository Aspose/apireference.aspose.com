---
title: "System::Xml::Schema::XmlSchemaSet::Add method"
linktitle: "Add"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSet::Add method. Aggiunge lo XmlSchema fornito all'XmlSchemaSet in C++."
type: docs
weight: 200
url: /it/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


Aggiunge lo [XmlSchema](../../xmlschema/) fornito all'[XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'oggetto [XmlSchema](../../xmlschema/) da aggiungere all'[XmlSchemaSet](../). |

### ReturnValue

Un oggetto [XmlSchema](../../xmlschema/) se lo schema è valido. Se lo schema non è valido e viene specificato un [ValidationEventHandler](../../validationeventhandler/), allora viene restituito **nullptr** e viene sollevato l'evento di validazione appropriato. Altrimenti, viene generata un'[XmlSchemaException](../../xmlschemaexception/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


Aggiunge tutti gli schemi del linguaggio di definizione XML [Schema](../../) (XSD) nel [XmlSchemaSet](../) fornito all'[XmlSchemaSet](../).

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
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


Aggiunge lo schema XML [Schema](../../) linguaggio di definizione (XSD) contenuto nel [XmlReader](../../../system.xml/xmlreader/) al [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetNamespace | Stringa | Il valore **targetNamespace** dello schema, o **nullptr** per utilizzare il **targetNamespace** specificato nello schema. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | L'oggetto [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

Un oggetto [XmlSchema](../../xmlschema/) se lo schema è valido. Se lo schema non è valido e viene specificato un [ValidationEventHandler](../../validationeventhandler/), allora viene restituito **nullptr** e viene sollevato l'evento di validazione appropriato. Altrimenti, viene generata un'[XmlSchemaException](../../xmlschemaexception/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


Aggiunge lo schema XML [Schema](../../) linguaggio di definizione (XSD) all'URL specificato al [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetNamespace | Stringa | Il valore **targetNamespace** dello schema, o **nullptr** per utilizzare il **targetNamespace** specificato nello schema. |
| schemaUri | const String\& | L'URL che specifica lo schema da caricare. |

### ReturnValue

Un oggetto [XmlSchema](../../xmlschema/) se lo schema è valido. Se lo schema non è valido e viene specificato un [ValidationEventHandler](../../validationeventhandler/), allora viene restituito **nullptr** e viene sollevato l'evento di validazione appropriato. Altrimenti, viene generata un'[XmlSchemaException](../../xmlschemaexception/).

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
