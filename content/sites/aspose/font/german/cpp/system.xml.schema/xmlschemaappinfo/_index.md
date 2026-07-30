---
title: "System::Xml::Schema::XmlSchemaAppInfo Klasse"
linktitle: "XmlSchemaAppInfo"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaAppInfo Klasse. Stellt das appinfo-Element des World Wide Web Consortium (W3C) in C++ dar."
type: docs
weight: 1000
url: /de/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


Stellt das World Wide [Web](../../system.web/) Consortium (W3C) **appinfo**-Element dar.

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Markup](./get_markup/)() | Gibt ein Array von [XmlNode](../../system.xml/xmlnode/) Objekten zurück, das die **appinfo** Kindknoten darstellt. |
| [get_Source](./get_source/)() | Gibt die Quelle der Anwendungsinformationen zurück. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Legt ein Array von [XmlNode](../../system.xml/xmlnode/) Objekten fest, das die **appinfo** Kindknoten darstellt. |
| [set_Source](./set_source/)(const String\&) | Legt die Quelle der Anwendungsinformationen fest. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
