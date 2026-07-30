---
title: "System::Xml::XmlQualifiedName‑Klasse"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlQualifiedName‑Klasse. Stellt einen XML‑qualifizierten Namen in C++ dar."
type: docs
weight: 3200
url: /de/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


Stellt einen XML-qualifizierten Namen dar.

```cpp
class XmlQualifiedName : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Bestimmt, ob das angegebene [XmlQualifiedName](./)-Objekt dem aktuellen [XmlQualifiedName](./)-Objekt gleich ist. |
| [get_IsEmpty](./get_isempty/)() const | Gibt einen Wert zurück, der angibt, ob das [XmlQualifiedName](./) leer ist. |
| [get_Name](./get_name/)() const | Gibt eine Zeichenkettenrepräsentation des qualifizierten Namens des [XmlQualifiedName](./) zurück. |
| [get_Namespace](./get_namespace/)() const | Gibt eine Zeichenkettenrepräsentation des Namespace des [XmlQualifiedName](./) zurück. |
| [GetHashCode](./gethashcode/)() const override | Gibt den Hash‑Code für das [XmlQualifiedName](./) zurück. |
| static [ToString](./tostring/)(const String\&, const String\&) | Gibt den Zeichenkettenwert des [XmlQualifiedName](./) zurück. |
| [ToString](./tostring/)() const override | Gibt den Zeichenkettenwert des [XmlQualifiedName](./) zurück. |
| [XmlQualifiedName](./xmlqualifiedname/)() | Initialisiert eine neue Instanz der [XmlQualifiedName](./)-Klasse. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | Initialisiert eine neue Instanz der [XmlQualifiedName](./)-Klasse mit dem angegebenen Namen. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | Initialisiert eine neue Instanz der [XmlQualifiedName](./)-Klasse mit dem angegebenen Namen und Namespace. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Stellt ein leeres [XmlQualifiedName](./) bereit. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
