---
title: "System::Xml::Schema::XmlSchemaInclude Klasse"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaInclude Klasse. Stellt das include-Element aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse wird verwendet, um Deklarationen und Definitionen aus einem externen Schema einzuschließen. Die eingeschlossenen Deklarationen und Definitionen stehen dann für die Verarbeitung im enthaltenden Schema in C++ zur Verfügung."
type: docs
weight: 3600
url: /de/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


Stellt das **include**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse wird verwendet, um Deklarationen und Definitionen aus einem externen Schema einzuschließen. Die eingeschlossenen Deklarationen und Definitionen stehen dann für die Verarbeitung im enthaltenden Schema zur Verfügung.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Gibt den **annotation**-Wert zurück. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Setzt den **annotation**-Wert. |
| [XmlSchemaInclude](./xmlschemainclude/)() | Initialisiert eine neue Instanz der [XmlSchemaInclude](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
