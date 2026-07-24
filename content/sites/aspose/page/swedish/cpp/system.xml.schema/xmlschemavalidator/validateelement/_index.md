---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement metod"
linktitle: "ValidateElement"
second_title: "Aspose.Page för C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement metod. Validerar elementet i den aktuella kontexten i C++."
type: docs
weight: 1700
url: /sv/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Validerar elementet i det aktuella sammanhanget.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | const String\& | Det lokala namnet på elementet som ska valideras. |
| namespaceUri | const String\& | Namespace-URI för elementet som ska valideras. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ett [XmlSchemaInfo](../../xmlschemainfo/)-objekt vars egenskaper sätts vid lyckad validering av elementets namn. Denna parameter kan vara **nullptr**. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Validerar elementet i det aktuella sammanhanget med de angivna attributvärdena **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** och **xsi:NoNamespaceSchemaLocation**.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | const String\& | Det lokala namnet på elementet som ska valideras. |
| namespaceUri | const String\& | Namespace-URI för elementet som ska valideras. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ett [XmlSchemaInfo](../../xmlschemainfo/)-objekt vars egenskaper sätts vid lyckad validering av elementets namn. Denna parameter kan vara **nullptr**. |
| xsiType | const String\& | Värdet för attributet **xsi:Type** för elementet. Denna parameter kan vara **nullptr**. |
| xsiNil | const String\& | Värdet för attributet **xsi:Nil** för elementet. Denna parameter kan vara **nullptr**. |
| xsiSchemaLocation | const String\& | Värdet för attributet **xsi:SchemaLocation** för elementet. Denna parameter kan vara **nullptr**. |
| xsiNoNamespaceSchemaLocation | const String\& | Värdet för attributet **xsi:NoNamespaceSchemaLocation** för elementet. Denna parameter kan vara **nullptr**. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
