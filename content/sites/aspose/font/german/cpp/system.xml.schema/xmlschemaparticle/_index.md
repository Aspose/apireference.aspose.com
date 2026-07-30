---
title: "System::Xml::Schema::XmlSchemaParticle Klasse"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaParticle Klasse. Eine Basisklasse dafür ist die Basisklasse für alle Partikeltypen (z. B. XmlSchemaAny) in C++."
type: docs
weight: 5400
url: /de/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


Eine Basisklasse dafür ist die Basisklasse für alle Partikeltypen (z. B. [XmlSchemaAny](../xmlschemaany/)).

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | Gibt die maximale Anzahl an Wiederholungen des Partikels zurück. |
| [get_MaxOccursString](./get_maxoccursstring/)() | Gibt die Zahl als Zeichenkettenwert zurück. Maximale Anzahl an Wiederholungen des Partikels. |
| [get_MinOccurs](./get_minoccurs/)() | Gibt die minimale Anzahl an Wiederholungen des Partikels zurück. |
| [get_MinOccursString](./get_minoccursstring/)() | Gibt die Zahl als Zeichenkettenwert zurück. Die minimale Anzahl an Wiederholungen des Partikels. |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | Setzt die maximale Anzahl an Wiederholungen des Partikels. |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | Setzt die Zahl als Zeichenkettenwert. Maximale Anzahl an Wiederholungen des Partikels. |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | Setzt die minimale Anzahl an Wiederholungen des Partikels. |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | Legt die Zahl als Zeichenkettenwert fest. Die minimale Anzahl, wie oft das Partikel auftreten kann. |
| [XmlSchemaParticle](./xmlschemaparticle/)() | Initialisiert eine neue Instanz der Klasse [XmlSchemaParticle](./). |
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
