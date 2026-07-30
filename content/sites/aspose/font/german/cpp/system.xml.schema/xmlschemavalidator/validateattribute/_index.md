---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute Methode"
linktitle: "ValidateAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute-Methode. Validiert den Attributnamen, den Namespace-URI und den Wert im aktuellen Elementkontext in C++."
type: docs
weight: 1600
url: /de/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Validiert den Attributnamen, den Namespace-URI und den Wert im Kontext des aktuellen Elements.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | const String\& | Der lokale Name des zu validierenden Attributs. |
| namespaceUri | const String\& | Der Namespace-URI des zu validierenden Attributs. |
| attributeValue | const String\& | Der Wert des zu validierenden Attributs. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ein [XmlSchemaInfo](../../xmlschemainfo/)-Objekt, dessen Eigenschaften nach erfolgreicher Validierung des Attributs gesetzt werden. Dieser Parameter kann **nullptr** sein. |

### ReturnValue

Der Wert des validierten Attributs.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


Validiert den Attributnamen, den Namespace-URI und den Wert im Kontext des aktuellen Elements.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | const String\& | Der lokale Name des zu validierenden Attributs. |
| namespaceUri | const String\& | Der Namespace-URI des zu validierenden Attributs. |
| attributeValue | XmlValueGetter | Ein [XmlValueGetter](../../xmlvaluegetter/)-Callback, der verwendet wird, um den Attributwert als einen mit dem XML [Schema](../../) Definition Language (XSD)-Typ des Attributs kompatiblen Typ zu übergeben. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ein [XmlSchemaInfo](../../xmlschemainfo/)-Objekt, dessen Eigenschaften nach erfolgreicher Validierung des Attributs gesetzt werden. Dieser Parameter kann **nullptr** sein. |

### ReturnValue

Der Wert des validierten Attributs.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
