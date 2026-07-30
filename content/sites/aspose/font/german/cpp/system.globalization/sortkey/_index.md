---
title: "System::Globalization::SortKey Klasse"
linktitle: "SortKey"
second_title: "Aspose.Font für C++"
description: "System::Globalization::SortKey Klasse. Zuordnung einer Zeichenkette zu ihrem Sortierschlüssel. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2200
url: /de/cpp/system.globalization/sortkey/
---
## SortKey class


Zuordnung einer Zeichenkette zu ihrem Sortierschlüssel. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SortKey : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | Vergleicht zwei Sortierschlüssel. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Prüft, ob das angegebene Objekt dem aktuellen [SortKey](./)-Objekt entspricht. |
| virtual [get_KeyData](./get_keydata/)() | Liefert das Byte‑Array, das das aktuelle Objekt darstellt. |
| virtual [get_OriginalString](./get_originalstring/)() | Liefert die ursprüngliche Zeichenkette, die zur Erstellung dieses Objekts verwendet wurde. |
| [GetHashCode](./gethashcode/)() const override | Liefert den Hash‑Code für das aktuelle [SortKey](./)-Objekt. |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | Konvertiert das aktuelle Objekt in seine Zeichenkettenrepräsentation. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
