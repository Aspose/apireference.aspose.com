---
title: "System::Xml::Schema::XmlSchemaSimpleType Klasse"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaSimpleType Klasse. Stellt das **simpleType**-Element für einfachen Inhalt aus XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse definiert einen einfachen Typ. Einfache Typen können Informationen und Einschränkungen für den Wert von Attributen oder Elementen mit reinem Textinhalt in C++ angeben."
type: docs
weight: 6200
url: /de/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


Stellt das **simpleType**-Element für einfachen Inhalt aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse definiert einen einfachen Typ. Einfache Typen können Informationen und Einschränkungen für den Wert von Attributen oder Elementen mit reinem Textinhalt angeben.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Content](./get_content/)() | Gibt eines von [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/) oder [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) zurück. |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Setzt eines von [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/) oder [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Initialisiert eine neue Instanz der [XmlSchemaSimpleType](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
