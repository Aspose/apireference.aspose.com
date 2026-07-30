---
title: "System::Xml::Schema::XmlSchemaAnnotation Klasse"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaAnnotation Klasse. Stellt das World Wide Web Consortium (W3C) **annotation**-Element in C++ dar."
type: docs
weight: 700
url: /de/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


Stellt das World Wide [Web](../../system.web/) Consortium (W3C) **annotation**-Element dar.

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Id](./get_id/)() | Gibt die Zeichenketten-ID zurück. |
| [get_Items](./get_items/)() | Gibt die **Items**-Sammlung zurück, die zum Speichern der untergeordneten Elemente **appinfo** und **documentation** verwendet wird. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Gibt die qualifizierten Attribute zurück, die nicht zum Zielnamensraum des Schemas gehören. |
| [set_Id](./set_id/)(const String\&) | Setzt die Zeichenketten-ID. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Setzt die qualifizierten Attribute, die nicht zum Zielnamensraum des Schemas gehören. |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaAnnotation](./). |
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
