---
title: "System::Xml::Schema::XmlSchemaCollection::Add Methode"
linktitle: "Add"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaCollection::Add Methode. Fügt das XmlSchema zur Sammlung in C++ hinzu."
type: docs
weight: 200
url: /de/cpp/system.xml.schema/xmlschemacollection/add/
---
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&) method


Fügt das [XmlSchema](../../xmlschema/) zur Sammlung hinzu.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Das [XmlSchema](../../xmlschema/), das zur Sammlung hinzugefügt werden soll. |

### ReturnValue

Das [XmlSchema](../../xmlschema/) Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Fügt das [XmlSchema](../../xmlschema/) zur Sammlung hinzu. Der angegebene [XmlResolver](../../../system.xml/xmlresolver/) wird verwendet, um externe Verweise aufzulösen.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchema> &schema, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Das [XmlSchema](../../xmlschema/), das zur Sammlung hinzugefügt werden soll. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) wird verwendet, um in **include**- und **import**-Elementen referenzierte Namespaces aufzulösen. Wenn dies **nullptr** ist, werden externe Verweise nicht aufgelöst. |

### ReturnValue

Das zum Schemasammlung hinzugefügte [XmlSchema](../../xmlschema/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const SharedPtr\<XmlSchemaCollection\>\&) method


Fügt alle im angegebenen Sammlung definierten Namespaces (einschließlich ihrer zugehörigen Schemas) zu dieser Sammlung hinzu.

```cpp
void System::Xml::Schema::XmlSchemaCollection::Add(const SharedPtr<XmlSchemaCollection> &schema)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchemaCollection\>\& | Die [XmlSchemaCollection](../), die Sie zu dieser Sammlung hinzufügen möchten. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaCollection](../)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&) method


Fügt das im [XmlReader](../../../system.xml/xmlreader/) enthaltene Schema zur Schemasammlung hinzu.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ns | const String\& | Der dem Schema zugeordnete Namespace‑URI. Für XML‑Schemas ist dies typischerweise das **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) mit dem hinzuzufügenden Schema. |

### ReturnValue

Das zur Schemasammlung hinzugefügte [XmlSchema](../../xmlschema/); **nullptr**, wenn das hinzuzufügende Schema ein XDR‑Schema ist oder wenn im Schema Kompilierungsfehler vorliegen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Fügt das im [XmlReader](../../../system.xml/xmlreader/) enthaltene Schema zur Schemasammlung hinzu. Der angegebene [XmlResolver](../../../system.xml/xmlresolver/) wird verwendet, um externe Ressourcen aufzulösen.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const SharedPtr<XmlReader> &reader, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ns | const String\& | Der dem Schema zugeordnete Namespace‑URI. Für XML‑Schemas ist dies typischerweise das **targetNamespace**. |
| reader | const SharedPtr\<XmlReader\>\& | [XmlReader](../../../system.xml/xmlreader/) mit dem hinzuzufügenden Schema. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Der [XmlResolver](../../../system.xml/xmlresolver/) wird verwendet, um Namespaces aufzulösen, die in **include**- und **import**-Elementen oder im **x-schema**-Attribut (XDR‑Schemas) referenziert werden. Wenn dies **nullptr** ist, werden externe Verweise nicht aufgelöst. |

### ReturnValue

Das zur Schemasammlung hinzugefügte [XmlSchema](../../xmlschema/); **nullptr**, wenn das hinzuzufügende Schema ein XDR‑Schema ist oder wenn im Schema Kompilierungsfehler vorliegen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Add(const String\&, const String\&) method


Fügt das durch die angegebene URL gefundene Schema in die Schema-Sammlung ein.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::Add(const String &ns, const String &uri)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ns | const String\& | Der dem Schema zugeordnete Namespace‑URI. Für XML‑Schemas ist dies typischerweise das **targetNamespace**. |
| uri | const String\& | Die URL, die das zu ladende Schema angibt. |

### ReturnValue

Das zur Schemasammlung hinzugefügte [XmlSchema](../../xmlschema/); **nullptr**, wenn das hinzuzufügende Schema ein XDR‑Schema ist oder wenn im Schema Kompilierungsfehler vorliegen.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
