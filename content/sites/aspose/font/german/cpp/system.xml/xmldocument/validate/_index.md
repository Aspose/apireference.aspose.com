---
title: "System::Xml::XmlDocument::Validate Methode"
linktitle: "Validieren"
second_title: "Aspose.Font für C++"
description: "System::Xml::Validate Methode. Validiert das XmlDocument gegen die im XmlDocument::get_Schemas‑Liste enthaltenen XML Schema Definition Language (XSD)-Schemata in C++."
type: docs
weight: 4300
url: /de/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


Validiert das [XmlDocument](../) gegen die im [XmlDocument::get_Schemas](../get_schemas/)‑Verzeichnis enthaltenen XML [Schema](../../../system.xml.schema/) Definition Language (XSD)-Schemata.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Das [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) Objekt, das Informationen über Warnungen und Fehler bei der Schema‑Validierung erhält. |

## Siehe auch

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


Validiert das angegebene [XmlNode](../../xmlnode/)-Objekt gegen die XML [Schema](../../../system.xml.schema/) Definition Language (XSD)-Schemata in der [XmlDocument::get_Schemas](../get_schemas/)‑Liste.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Das [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) Objekt, das Informationen über Warnungen und Fehler bei der Schema‑Validierung erhält. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | Das aus einem [XmlDocument](../) erstellte [XmlNode](../../xmlnode/)-Objekt zur Validierung. |

## Siehe auch

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
