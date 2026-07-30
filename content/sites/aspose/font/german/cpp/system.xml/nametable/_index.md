---
title: "System::Xml::NameTable Klasse"
linktitle: "NameTable"
second_title: "Aspose.Font für C++"
description: "System::Xml::NameTable Klasse. Implementiert eine einzelthreadige XmlNameTable in C++."
type: docs
weight: 500
url: /de/cpp/system.xml/nametable/
---
## NameTable class


Implementiert eine einzelthreadige [XmlNameTable](../xmlnametable/).

```cpp
class NameTable : public System::Xml::XmlNameTable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const String\&) override | Atomisiert die angegebene Zeichenkette und fügt sie der [NameTable](./) hinzu. |
| [Add](./add/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Atomisiert die angegebene Zeichenkette und fügt sie der [NameTable](./) hinzu. |
| [Get](./get/)(const String\&) override | Gibt die atomisierte Zeichenkette mit dem angegebenen Wert zurück. |
| [Get](./get/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) override | Gibt die atomisierte Zeichenkette zurück, die dieselben Zeichen wie der angegebene Zeichenbereich im übergebenen Array enthält. |
| [NameTable](./nametable/)() | Initialisiert eine neue Instanz der [NameTable](./) Klasse. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlNameTable](../xmlnametable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
