---
title: "System::Xml::Schema::XmlSchema::Compile-Methode"
linktitle: "Compile"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchema::Compile-Methode. Kompiliert das XML SchemaObject Model (SOM) in Schemainformationen zur Validierung. Wird verwendet, um die syntaktische und semantische Struktur des programmgesteuert erstellten SOM zu prüfen. Die semantische Validierungsprüfung wird während der Kompilierung in C++ durchgeführt."
type: docs
weight: 200
url: /de/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


Kompiliert das XML [Schema](../../)[Object](../../../system/object/)-Modell (SOM) in Schemainformationen zur Validierung. Wird verwendet, um die syntaktische und semantische Struktur des programmgesteuert erstellten SOM zu prüfen. Die semantische Validierungsprüfung wird während der Kompilierung durchgeführt.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Der Validierungs‑Ereignishandler, der Informationen über XML [Schema](../../)-Validierungsfehler empfängt. |

## Siehe auch

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


Kompiliert das XML [Schema](../../)[Object](../../../system/object/)-Modell (SOM) in Schemainformationen zur Validierung. Wird verwendet, um die syntaktische und semantische Struktur des programmgesteuert erstellten SOM zu prüfen. Die semantische Validierungsprüfung wird während der Kompilierung durchgeführt.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Der Validierungs‑Ereignishandler, der Informationen über die XML [Schema](../../)-Validierungsfehler empfängt. |
| resolver | const SharedPtr\<XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/), der zum Auflösen von Namespaces verwendet wird, die in **include**- und **import**-Elementen referenziert werden. |

## Siehe auch

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
