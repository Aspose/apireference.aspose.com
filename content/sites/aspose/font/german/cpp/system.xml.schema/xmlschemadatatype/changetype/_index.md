---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType Methode"
linktitle: "ChangeType"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType Methode. Konvertiert den angegebenen Wert, dessen Typ eine der gültigen Darstellungen des XML-Schematyps ist, der durch das XmlSchemaDatatype repräsentiert wird, in den zur Laufzeit angegebenen Typ in C++."
type: docs
weight: 100
url: /de/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


Konvertiert den angegebenen Wert, dessen Typ eine der gültigen Darstellungen des XML-Schematyps ist, der durch das [XmlSchemaDatatype](../) repräsentiert wird, in den zur Laufzeit angegebenen Typ.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | SharedPtr\<Object\> | Der Eingabewert, der in den angegebenen Typ konvertiert werden soll. |
| targetType | const TypeInfo\& | Der Zieltyp, in den der Eingabewert konvertiert werden soll. |

### ReturnValue

Der konvertierte Eingabewert.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Konvertiert den angegebenen Wert, dessen Typ eine der gültigen Darstellungen des XML‑Schematyps ist, der durch [XmlSchemaDatatype](../) repräsentiert wird, in den zur Laufzeit angegebenen Typ unter Verwendung des [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), falls [XmlSchemaDatatype](../) den **xs:QName**‑Typ oder einen davon abgeleiteten Typ darstellt.

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | SharedPtr\<Object\> | Der Eingabewert, der in den angegebenen Typ konvertiert werden soll. |
| targetType | const TypeInfo\& | Der Zieltyp, in den der Eingabewert konvertiert werden soll. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ein [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) zum Auflösen von Namensraumpräfixen. Dies ist nur nützlich, wenn [XmlSchemaDatatype](../) den **xs:QName**‑Typ oder einen davon abgeleiteten Typ darstellt. |

### ReturnValue

Der konvertierte Eingabewert.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
