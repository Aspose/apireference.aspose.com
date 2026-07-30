---
title: "System::Xml::Schema::XmlSchemaImport Klasse"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaImport Klasse. Stellt das **import**-Element aus dem XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse wird verwendet, um Schema-Komponenten aus anderen Schemas in C++ zu importieren."
type: docs
weight: 3500
url: /de/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


Stellt das **import**-Element aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse wird verwendet, um Schema-Komponenten aus anderen Schemas zu importieren.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Annotation](./get_annotation/)() | Gibt den **annotation**-Wert zurück. |
| [get_Namespace](./get_namespace/)() | Gibt den Zielnamensraum für das importierte Schema als Uniform Resource Identifier (URI)-Referenz zurück. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | Setzt den **annotation**-Wert. |
| [set_Namespace](./set_namespace/)(const String\&) | Setzt den Zielnamensraum für das importierte Schema als Uniform Resource Identifier (URI)-Referenz. |
| [XmlSchemaImport](./xmlschemaimport/)() | Initialisiert eine neue Instanz der [XmlSchemaImport](./) Klasse. |
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
