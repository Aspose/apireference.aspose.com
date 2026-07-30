---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement-Methode"
linktitle: "ValidateElement"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement-Methode. Validiert das Element im aktuellen Kontext in C++."
type: docs
weight: 1700
url: /de/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


Validiert das Element im aktuellen Kontext.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | const String\& | Der lokale Name des zu validierenden Elements. |
| namespaceUri | const String\& | Der Namespace-URI des zu validierenden Elements. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ein [XmlSchemaInfo](../../xmlschemainfo/)-Objekt, dessen Eigenschaften bei erfolgreicher Validierung des Elementnamens gesetzt werden. Dieser Parameter kann **nullptr** sein. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


Validiert das Element im aktuellen Kontext mit den angegebenen Attributwerten **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** und **xsi:NoNamespaceSchemaLocation**.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | const String\& | Der lokale Name des zu validierenden Elements. |
| namespaceUri | const String\& | Der Namespace-URI des zu validierenden Elements. |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ein [XmlSchemaInfo](../../xmlschemainfo/)-Objekt, dessen Eigenschaften bei erfolgreicher Validierung des Elementnamens gesetzt werden. Dieser Parameter kann **nullptr** sein. |
| xsiType | const String\& | Der **xsi:Type**-Attributwert des Elements. Dieser Parameter kann **nullptr** sein. |
| xsiNil | const String\& | Der **xsi:Nil**-Attributwert des Elements. Dieser Parameter kann **nullptr** sein. |
| xsiSchemaLocation | const String\& | Der **xsi:SchemaLocation** Attributwert des Elements. Dieser Parameter kann **nullptr** sein. |
| xsiNoNamespaceSchemaLocation | const String\& | Der **xsi:NoNamespaceSchemaLocation** Attributwert des Elements. Dieser Parameter kann **nullptr** sein. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
