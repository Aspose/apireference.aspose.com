---
title: "System::Xml::Schema::XmlSchema::Compile methode"
linktitle: "Compile"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchema::Compile methode. Compileert het XML SchemaObject Model (SOM) naar schemainformatie voor validatie. Wordt gebruikt om de syntactische en semantische structuur van het programmatisch gebouwde SOM te controleren. Semantische validatiecontrole wordt uitgevoerd tijdens de compilatie in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


Compileert het XML [Schema](../../)[Object](../../../system/object/) Model (SOM) naar schemainformatie voor validatie. Wordt gebruikt om de syntactische en semantische structuur van het programmatisch gebouwde SOM te controleren. Semantische validatiecontrole wordt uitgevoerd tijdens de compilatie.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | De validatie‑event‑handler die informatie ontvangt over XML [Schema](../../) validatiefouten. |

## Zie ook

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


Compileert het XML [Schema](../../)[Object](../../../system/object/) Model (SOM) naar schemainformatie voor validatie. Wordt gebruikt om de syntactische en semantische structuur van het programmatisch gebouwde SOM te controleren. Semantische validatiecontrole wordt uitgevoerd tijdens de compilatie.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | De validatie‑event‑handler die informatie ontvangt over de XML [Schema](../../) validatiefouten. |
| resolver | const SharedPtr\<XmlResolver\>\& | De [XmlResolver](../../../system.xml/xmlresolver/) die wordt gebruikt om namespaces te resolveren die worden verwezen in **include**- en **import**‑elementen. |

## Zie ook

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
