---
title: "System::Xml::Schema::XmlSchemaAny Klasse"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaAny Klasse. Stellt das World Wide Web Consortium (W3C) any-Element in C++ dar."
type: docs
weight: 800
url: /de/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


Stellt das World Wide [Web](../../system.web/) Consortium (W3C) **any**-Element dar.

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Gibt die Namespaces zurück, die die verwendbaren Elemente enthalten. |
| [get_ProcessContents](./get_processcontents/)() | Gibt Informationen darüber zurück, wie eine Anwendung oder ein XML-Prozessor die Validierung von XML-Dokumenten für die durch das **any**-Element angegebenen Elemente handhaben soll. |
| [set_Namespace](./set_namespace/)(const String\&) | Setzt die Namespaces, die die verwendbaren Elemente enthalten. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Setzt Informationen darüber, wie eine Anwendung oder ein XML-Prozessor die Validierung von XML-Dokumenten für die durch das **any**-Element angegebenen Elemente handhaben soll. |
| [XmlSchemaAny](./xmlschemaany/)() | Initialisiert eine neue Instanz der [XmlSchemaAny](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
