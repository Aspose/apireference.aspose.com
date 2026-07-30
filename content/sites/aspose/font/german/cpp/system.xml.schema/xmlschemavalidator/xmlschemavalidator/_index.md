---
title: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator-Konstruktor"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator-Konstruktor. Initialisiert eine neue Instanz der XmlSchemaValidator-Klasse in C++."
type: docs
weight: 100
url: /de/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


Initialisiert eine neue Instanz der Klasse [XmlSchemaValidator](../).

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | Ein [XmlNameTable](../../../system.xml/xmlnametable/)-Objekt, das Element- und Attributnamen als atomisierte Zeichenketten enthält. |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | Ein [XmlSchemaSet](../../xmlschemaset/)-Objekt, das die für die Validierung verwendeten XML [Schema](../../) Definition Language (XSD)-Schemata enthält. |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | Ein [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)-Objekt, das zum Auflösen von während der Validierung auftretenden Namespaces verwendet wird. |
| validationFlags | XmlSchemaValidationFlags | Ein [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)-Wert, der Schema-Validierungsoptionen angibt. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
