---
title: "System::Xml::Schema::XmlSchemaAnnotated Klasse"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaAnnotated Klasse. Die Basisklasse für jedes Element, das Annotations‑Elemente in C++ enthalten kann."
type: docs
weight: 600
url: /de/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


Die Basisklasse für jedes Element, das Annotations‑Elemente enthalten kann.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Gibt die **annotation**‑Eigenschaft zurück. |
| [get_Id](./get_id/)() | Gibt die Zeichenketten-ID zurück. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Gibt die qualifizierten Attribute zurück, die nicht zum Ziel‑Namespace des aktuellen Schemas gehören. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Setzt die **annotation**‑Eigenschaft. |
| [set_Id](./set_id/)(const String\&) | Setzt die Zeichenketten-ID. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Setzt die qualifizierten Attribute, die nicht zum Ziel‑Namespace des aktuellen Schemas gehören. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
