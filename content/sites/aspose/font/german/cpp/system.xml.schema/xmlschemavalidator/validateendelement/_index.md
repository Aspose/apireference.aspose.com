---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement Methode"
linktitle: "ValidateEndElement"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement Methode. Prüft, ob der Textinhalt des Elements gemäß seinem Datentyp für Elemente mit einfachem Inhalt gültig ist, und prüft, ob der Inhalt des aktuellen Elements für Elemente mit komplexem Inhalt vollständig ist in C++."
type: docs
weight: 1800
url: /de/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Überprüft, ob der Textinhalt des Elements gemäß seinem Datentyp für Elemente mit einfachem Inhalt gültig ist, und prüft, ob der Inhalt des aktuellen Elements für Elemente mit komplexem Inhalt vollständig ist.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ein [XmlSchemaInfo](../../xmlschemainfo/) Objekt, dessen Eigenschaften bei erfolgreicher Validierung des Elements gesetzt werden. Dieser Parameter kann **nullptr** sein. |

### ReturnValue

Der geparste, typisierte Textwert des Elements, falls das Element einfachen Inhalt hat.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Überprüft, ob der angegebene Textinhalt des Elements gemäß seinem Datentyp gültig ist.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Ein [XmlSchemaInfo](../../xmlschemainfo/) Objekt, dessen Eigenschaften bei erfolgreicher Validierung des Textinhalts des Elements gesetzt werden. Dieser Parameter kann **nullptr** sein. |
| typedValue | const SharedPtr\<Object\>\& | Der typisierte Textinhalt des Elements. |

### ReturnValue

Der geparste, typisierte einfache Inhalt des Elements.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
