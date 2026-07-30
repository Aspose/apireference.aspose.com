---
title: "System::Globalization::StringInfo class"
linktitle: "StringInfo"
second_title: "Aspose.Font für C++"
description: "System::Globalization::StringInfo class. Aufteiler zum Durchlaufen von Zeichenkettenteilen. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2400
url: /de/cpp/system.globalization/stringinfo/
---
## StringInfo class


Aufteiler zum Durchlaufen von Zeichenkettenteilen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringInfo : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | Liefert die Anzahl der Textelemente im [StringInfo](./)-Objekt. |
| [get_String](./get_string/)() const | Liefert den Wert des [StringInfo](./)-Objekts. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | Liefert das erste Element im angegebenen String. |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | Liefert das Element am angegebenen Index des angegebenen Strings. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | Erstellt einen Enumerator, um durch die Zeichen des Strings zu iterieren. |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | Erstellt einen Enumerator, um ab dem angegebenen Index durch die Zeichen des Strings zu iterieren. |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | Liefert die Indizes der Basiszeichen, High-Surrogate und Steuerzeichen. |
| [set_String](./set_string/)(const String\&) | Setzt den Wert des [StringInfo](./)-Objekts. |
| [StringInfo](./stringinfo/)() | RTTI-Informationen. |
| [StringInfo](./stringinfo/)(const String\&) | Konstruktor. |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | Liefert einen Teilstring von Textelementen vom angegebenen Textelement bis zum letzten Textelement. |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | Liefert einen Teilstring von Textelementen vom angegebenen Textelement über die angegebene Anzahl von Textelementen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
