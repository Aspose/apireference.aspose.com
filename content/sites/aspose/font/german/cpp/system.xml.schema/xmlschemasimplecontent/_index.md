---
title: "System::Xml::Schema::XmlSchemaSimpleContent class"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent class. Stellt das simpleContent-Element aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse ist für einfache und komplexe Typen mit einfachem Inhaltsmodell in C++."
type: docs
weight: 5900
url: /de/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


Stellt das **simpleContent**-Element aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse ist für einfache und komplexe Typen mit einfachem Inhaltsmodell.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Content](./get_content/)() override | Gibt eines der [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) oder [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/) zurück. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Gibt eines der [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) oder [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/) zurück. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
