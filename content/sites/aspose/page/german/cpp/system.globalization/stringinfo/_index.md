---
title: "System::Globalization::StringInfo Klasse"
linktitle: "StringInfo"
second_title: "Aspose.Page für C++"
description: "System::Globalization::StringInfo Klasse. Splitter zum Durchlaufen von Zeichenketten‑Teilen. Objekte dieser Klasse dürfen nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 2400
url: /de/cpp/system.globalization/stringinfo/
---
## StringInfo class


Splitter zum Durchlaufen von Zeichenketten‑Teilen. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringInfo : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | Gibt die Anzahl der Textelemente im [StringInfo](./)-Objekt zurück. |
| [get_String](./get_string/)() const | Gibt den Wert des [StringInfo](./)-Objekts zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Gibt das erste Element in der angegebenen Zeichenkette zurück. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Gibt das Element am angegebenen Index der angegebenen Zeichenkette zurück. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Erstellt einen Enumerator zum Durchlaufen der Zeichen einer Zeichenkette. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Erstellt einen Enumerator zum Durchlaufen der Zeichen einer Zeichenkette, beginnend am angegebenen Index. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Gibt die Indizes der Basiszeichen, High‑Surrogate und Steuerzeichen zurück. |
| [set_String](./set_string/)(const String\&) | Setzt den Wert des [StringInfo](./)-Objekts. |
| [StringInfo](./stringinfo/)() | RTTI-Informationen. |
| [StringInfo](./stringinfo/)(const String\&) | Konstruktor. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Gibt die Teilzeichenkette von Textelementen vom angegebenen Textelement bis zum letzten Textelement zurück. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Gibt die Teilzeichenkette von Textelementen vom angegebenen Textelement über die angegebene Anzahl von Textelementen zurück. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
