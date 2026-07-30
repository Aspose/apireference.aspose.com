---
title: "System::Xml::Schema::XmlSchemaChoice Klasse"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaChoice Klasse. Stellt das choice‑Element (Kompositor) aus dem XML‑Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Das choice‑Element erlaubt, dass nur eines seiner Kind‑Elemente in einer Instanz in C++ erscheint."
type: docs
weight: 1400
url: /de/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Stellt das **choice**-Element (Kompositor) aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) spezifiziert. Das **choice** erlaubt nur, dass eines seiner Kind-Elemente in einer Instanz erscheint.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Items](./get_items/)() override | Gibt die Sammlung der Elemente zurück, die im Kompositor (**choice**) enthalten sind: [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), oder [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaChoice](./). |
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
