---
title: "System::Xml::Schema::XmlSchemaNotation Klasse"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaNotation Klasse. Stellt das Notationselement aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Eine XML‑Schemanotation‑Deklaration ist eine Rekonstruktion von XML 1.0‑NOTATION‑Deklarationen. Der Zweck von Notationen besteht darin, das Format von Nicht‑XML‑Daten innerhalb eines XML‑Dokuments in C++ zu beschreiben."
type: docs
weight: 4800
url: /de/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


Stellt das **notation**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Eine XML [Schema](../)**notation**-Deklaration ist eine Rekonstruktion von **XML** 1.0 NOTATION‑Deklarationen. Der Zweck von Notationen besteht darin, das Format von Nicht‑XML‑Daten innerhalb eines XML‑Dokuments zu beschreiben.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Name](./get_name/)() | Gibt den Namen der Notation zurück. |
| [get_Public](./get_public/)() | Gibt den **public**‑Identifier zurück. |
| [get_System](./get_system/)() | Gibt den **system**-Bezeichner zurück. |
| [set_Name](./set_name/)(const String\&) | Setzt den Namen der Notation. |
| [set_Public](./set_public/)(const String\&) | Setzt den **public**-Bezeichner. |
| [set_System](./set_system/)(const String\&) | Setzt den **system**-Bezeichner. |
| [XmlSchemaNotation](./xmlschemanotation/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaNotation](./). |
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
