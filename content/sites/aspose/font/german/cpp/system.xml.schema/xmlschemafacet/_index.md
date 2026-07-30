---
title: "System::Xml::Schema::XmlSchemaFacet class"
linktitle: "XmlSchemaFacet"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaFacet class. Eine Basisklasse für alle Facetten, die verwendet werden, wenn simple types durch Einschränkung in C++ abgeleitet werden."
type: docs
weight: 2900
url: /de/cpp/system.xml.schema/xmlschemafacet/
---
## XmlSchemaFacet class


Eine Basisklasse für alle Facetten, die verwendet werden, wenn einfache Typen durch Einschränkung abgeleitet werden.

```cpp
class XmlSchemaFacet : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_IsFixed](./get_isfixed/)() | Gibt Informationen zurück, die anzeigen, dass diese Facette fest ist. |
| [get_Value](./get_value/)() | Gibt das **value**-Attribut der Facette zurück. |
| virtual [set_IsFixed](./set_isfixed/)(bool) | Setzt Informationen, die anzeigen, dass diese Facette fest ist. |
| [set_Value](./set_value/)(const String\&) | Setzt das **value**-Attribut der Facette. |
| [XmlSchemaFacet](./xmlschemafacet/)() | Initialisiert eine neue Instanz der [XmlSchemaFacet](./)-Klasse. |
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
