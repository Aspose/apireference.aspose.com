---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction Klasse"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Page für C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction Klasse. Stellt das Restriction-Element für einfache Typen aus XML Schema dar, wie vom World Wide Web Consortium (W3C) spezifiziert. Diese Klasse kann verwendet werden, um ein simpleType-Element in C++ einzuschränken."
type: docs
weight: 6500
url: /de/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


Stellt das **restriction**-Element für einfache Typen aus XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) spezifiziert. Diese Klasse kann verwendet werden, um ein **simpleType**-Element einzuschränken.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_BaseType](./get_basetype/)() | Gibt Informationen über den Basistyp zurück. |
| [get_BaseTypeName](./get_basetypename/)() | Gibt den Namen des qualifizierten Basistyps zurück. |
| [get_Facets](./get_facets/)() | Gibt ein [Xml](../../system.xml/)[Schema](../)-Facet zurück. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Setzt Informationen über den Basistyp. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Setzt den Namen des qualifizierten Basistyps. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaSimpleTypeRestriction](./). |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
