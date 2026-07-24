---
title: "System::Xml::XmlDocument::Validate methode"
linktitle: "Valideren"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocument::Validate methode. Valideert het XmlDocument tegen de XML Schema Definition Language (XSD)-schema's die in de XmlDocument::get_Schemas-lijst staan in C++."
type: docs
weight: 4300
url: /nl/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


Valideert het [XmlDocument](../) tegen de XML [Schema](../../../system.xml.schema/) Definition Language (XSD)-schema's die in de [XmlDocument::get_Schemas](../get_schemas/) lijst staan.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Het [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) object dat informatie ontvangt over waarschuwingen en fouten bij schema‑validatie. |

## Zie ook

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


Valideert het opgegeven [XmlNode](../../xmlnode/) object tegen de XML [Schema](../../../system.xml.schema/) Definition Language (XSD)-schema's in de [XmlDocument::get_Schemas](../get_schemas/) lijst.

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | Het [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) object dat informatie ontvangt over waarschuwingen en fouten bij schema‑validatie. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | Het [XmlNode](../../xmlnode/) object dat is gemaakt vanuit een [XmlDocument](../) om te valideren. |

## Zie ook

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
