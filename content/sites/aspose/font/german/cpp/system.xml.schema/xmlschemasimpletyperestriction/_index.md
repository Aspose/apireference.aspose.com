---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction Klasse"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction Klasse. Stellt das restriction-Element für einfache Typen aus dem XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse kann verwendet werden, um das simpleType-Element in C++ zu beschränken."
type: docs
weight: 6500
url: /de/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


Stellt das **restriction**-Element für einfache Typen aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse kann verwendet werden, um das **simpleType**-Element zu beschränken.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_BaseType](./get_basetype/)() | Gibt Informationen zum Basistyp zurück. |
| [get_BaseTypeName](./get_basetypename/)() | Gibt den Namen des qualifizierten Basistyps zurück. |
| [get_Facets](./get_facets/)() | Gibt eine [Xml](../../system.xml/)[Schema](../)-Facette zurück. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Setzt Informationen zum Basistyp. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Namen des qualifizierten Basistyps. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | Initialisiert eine neue Instanz der [XmlSchemaSimpleTypeRestriction](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
