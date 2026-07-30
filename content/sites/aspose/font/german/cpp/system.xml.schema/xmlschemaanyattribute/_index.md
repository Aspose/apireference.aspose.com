---
title: "System::Xml::Schema::XmlSchemaAnyAttribute Klasse"
linktitle: "XmlSchemaAnyAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaAnyAttribute Klasse. Stellt das anyAttribute‑Element des World Wide Web Consortium (W3C) in C++ dar."
type: docs
weight: 900
url: /de/cpp/system.xml.schema/xmlschemaanyattribute/
---
## XmlSchemaAnyAttribute class


Stellt das World Wide [Web](../../system.web/) Consortium (W3C) **anyAttribute** Element dar.

```cpp
class XmlSchemaAnyAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Gibt die Namespaces zurück, die die Attribute enthalten, die verwendet werden können. |
| [get_ProcessContents](./get_processcontents/)() | Gibt Informationen darüber zurück, wie eine Anwendung oder ein XML‑Prozessor die Validierung von XML‑Dokumenten für die durch das **anyAttribute** Element angegebenen Attribute handhaben soll. |
| [set_Namespace](./set_namespace/)(const String\&) | Legt die Namespaces fest, die die Attribute enthalten, die verwendet werden können. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Legt Informationen darüber fest, wie eine Anwendung oder ein XML‑Prozessor die Validierung von XML‑Dokumenten für die durch das **anyAttribute** Element angegebenen Attribute handhaben soll. |
| [XmlSchemaAnyAttribute](./xmlschemaanyattribute/)() | Initialisiert eine neue Instanz der [XmlSchemaAnyAttribute](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
