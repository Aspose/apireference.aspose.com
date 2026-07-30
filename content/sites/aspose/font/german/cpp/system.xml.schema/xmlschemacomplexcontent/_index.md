---
title: "System::Xml::Schema::XmlSchemaComplexContent Klasse"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaComplexContent Klasse. Stellt das complexContent-Element aus dem XML Schema dar, wie vom World Wide Web Consortium (W3C) festgelegt. Diese Klasse repräsentiert das komplexe Inhaltsmodell für komplexe Typen. Sie enthält Erweiterungen oder Einschränkungen für einen komplexen Typ, der entweder nur Elemente oder gemischten Inhalt in C++ hat."
type: docs
weight: 1800
url: /de/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


Stellt das **complexContent**-Element aus dem XML [Schema](../) dar, wie vom World Wide [Web](../../system.web/) Consortium (W3C) festgelegt. Diese Klasse repräsentiert das komplexe Inhaltsmodell für komplexe Typen. Sie enthält Erweiterungen oder Einschränkungen für einen komplexen Typ, der entweder nur Elemente oder gemischten Inhalt hat.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Content](./get_content/)() override | Gibt den Inhalt zurück. |
| [get_IsMixed](./get_ismixed/)() | Gibt Informationen zurück, die bestimmen, ob der Typ ein gemischtes Inhaltsmodell hat. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Setzt den Inhalt. |
| [set_IsMixed](./set_ismixed/)(bool) | Setzt Informationen, die bestimmen, ob der Typ ein gemischtes Inhaltsmodell hat. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaComplexContent](./). |
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
