---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute-metoden"
linktitle: "ValidateAttribute"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute-metoden. Validerar attributnamnet, namnrymdens URI och värdet i den aktuella elementkontexten i C++."
type: docs
weight: 1600
url: /sv/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Validerar attributnamnet, namnrymdens URI och värdet i det aktuella elementets sammanhang.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | const String\& | Det lokala namnet på attributet som ska valideras. |
| namespaceUri | const String\& | Namespace-URI:n för attributet som ska valideras. |
| attributeValue | const String\& | Värdet på attributet som ska valideras. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ett [XmlSchemaInfo](../../xmlschemainfo/)‑objekt vars egenskaper sätts vid lyckad validering av attributet. Denna parameter kan vara **nullptr**. |

### ReturnValue

Det validerade attributets värde.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


Validerar attributnamnet, namnrymdens URI och värdet i det aktuella elementets sammanhang.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | const String\& | Det lokala namnet på attributet som ska valideras. |
| namespaceUri | const String\& | Namespace-URI:n för attributet som ska valideras. |
| attributeValue | XmlValueGetter | En [XmlValueGetter](../../xmlvaluegetter/)‑återuppringning som används för att skicka attributets värde som en typ kompatibel med XML‑[Schema](../../) Definition Language (XSD)-typen för attributet. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ett [XmlSchemaInfo](../../xmlschemainfo/)‑objekt vars egenskaper sätts vid lyckad validering av attributet. Denna parameter kan vara **nullptr**. |

### ReturnValue

Det validerade attributets värde.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
