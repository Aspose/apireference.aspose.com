---
title: "System::Xml::Schema::XmlSchemaIdentityConstraint Klasse"
linktitle: "XmlSchemaIdentityConstraint"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaIdentityConstraint class. Klasse für die Identitätsbeschränkungen: key-, keyref- und unique-Elemente in C++."
type: docs
weight: 3400
url: /de/cpp/system.xml.schema/xmlschemaidentityconstraint/
---
## XmlSchemaIdentityConstraint class


Klasse für die Identitätsbeschränkungen: **key**, **keyref** und **unique**-Elemente.

```cpp
class XmlSchemaIdentityConstraint : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Fields](./get_fields/)() | Gibt die Sammlung von Feldern zurück, die als Kinder für den XML Path Language ([XPath](../../system.xml.xpath/)) Ausdrucksselektor gelten. |
| [get_Name](./get_name/)() | Gibt den Namen der Identitätsbeschränkung zurück. |
| [get_QualifiedName](./get_qualifiedname/)() | Gibt den qualifizierten Namen der Identitätsbeschränkung zurück, der die nach der Kompilierung interpretierte **QualifiedName**-Wert enthält. |
| [get_Selector](./get_selector/)() | Gibt das [XPath](../../system.xml.xpath/) Ausdruck **selector**-Element zurück. |
| [set_Name](./set_name/)(const String\&) | Legt den Namen der Identitätsbeschränkung fest. |
| [set_Selector](./set_selector/)(const SharedPtr\<XmlSchemaXPath\>\&) | Legt das [XPath](../../system.xml.xpath/) Ausdruck **selector**-Element fest. |
| [XmlSchemaIdentityConstraint](./xmlschemaidentityconstraint/)() | Initialisiert eine neue Instanz der [XmlSchemaIdentityConstraint](./) Klasse. |
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
