---
title: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes Methode"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes Methode. Validiert Identitätsbeschränkungen der Standardattribute und füllt die angegebene List mit XmlSchemaAttribute-Objekten für alle Attribute mit Standardwerten, die im Elementkontext noch nicht zuvor mit der XmlSchemaValidator::ValidateAttribute-Methode validiert wurden, in C++."
type: docs
weight: 900
url: /de/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


Validiert Identitätsbeschränkungen der Standardattribute und füllt die angegebene List mit [XmlSchemaAttribute](../../xmlschemaattribute/) Objekten für alle Attribute mit Standardwerten, die im Elementkontext noch nicht zuvor mit der [XmlSchemaValidator::ValidateAttribute](../validateattribute/) Methode validiert wurden.

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | Eine List, die mit [XmlSchemaAttribute](../../xmlschemaattribute/) Objekten gefüllt werden soll für alle Attribute, die im Elementkontext während der Validierung noch nicht aufgetreten sind. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
