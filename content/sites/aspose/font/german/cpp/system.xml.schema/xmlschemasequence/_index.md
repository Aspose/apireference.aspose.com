---
title: "System::Xml::Schema::XmlSchemaSequence‑Klasse"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaSequence‑Klasse. Stellt das **sequence**‑Element (Kompositor) aus dem XML‑Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Die **sequence** erfordert, dass die Elemente in der Gruppe in der angegebenen Reihenfolge innerhalb des enthaltenden Elements in C++ erscheinen."
type: docs
weight: 5700
url: /de/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


Stellt das **sequence**‑Element (Kompositor) aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Die **sequence** erfordert, dass die Elemente in der Gruppe in der angegebenen Reihenfolge innerhalb des enthaltenden Elements erscheinen.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Items](./get_items/)() override | Die im Kompositor enthaltenen Elemente. Sammlung von [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./) oder [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaSequence](./xmlschemasequence/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaSequence](./). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
