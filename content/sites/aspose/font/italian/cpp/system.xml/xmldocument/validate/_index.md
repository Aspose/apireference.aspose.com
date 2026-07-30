---
title: "System::Xml::XmlDocument::Validate metodo"
linktitle: "Convalida"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlDocument::Validate metodo. Convalida l'XmlDocument contro gli schemi XML Schema Definition Language (XSD) contenuti nell'elenco XmlDocument::get_Schemas in C++."
type: docs
weight: 4300
url: /it/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


Convalida l'[XmlDocument](../) contro gli schemi XML [Schema](../../../system.xml.schema/) Definition Language (XSD) contenuti nell'elenco [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | L'oggetto [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) che riceve informazioni sugli avvisi e sugli errori di convalida dello schema. |

## Vedi anche

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


Convalida l'oggetto [XmlNode](../../xmlnode/) specificato contro gli schemi XML [Schema](../../../system.xml.schema/) Definition Language (XSD) presenti nell'elenco [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | L'oggetto [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) che riceve informazioni sugli avvisi e sugli errori di convalida dello schema. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | L'oggetto [XmlNode](../../xmlnode/) creato da un [XmlDocument](../) da convalidare. |

## Vedi anche

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
