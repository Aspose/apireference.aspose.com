---
title: "System::Drawing::StringFormat Klasse"
linktitle: "StringFormat"
second_title: "Aspose.Page für C++"
description: "System::Drawing::StringFormat Klasse. Kapselt Informationen zur Textanordnung, Anzeige-Manipulationen und OpenType-Funktionen. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2500
url: /de/cpp/system.drawing/stringformat/
---
## StringFormat class


Kapselt Informationen zur Textanordnung, Anzeige-Manipulationen und OpenType-Funktionen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringFormat : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Gibt eine exakte Kopie des aktuellen Objekts zurück. |
| [get_Alignment](./get_alignment/)() const | Gibt einen Wert zurück, der die horizontale Ausrichtung der Zeichenkette angibt. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | Gibt einen Wert zurück, der die Sprache angibt, die verwendet wird, wenn lokale Ziffern durch westliche Ziffern ersetzt werden. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | Gibt die Methode zur Ziffernersetzung zurück. |
| [get_FormatFlags](./get_formatflags/)() const | Gibt eine bitweise Kombination von [StringFormatFlags](../stringformatflags/) zurück, die das vom aktuellen Objekt dargestellte Zeichenkettenformat angibt. |
| static [get_GenericDefault](./get_genericdefault/)() | Gibt ein [StringFormat](./)-Objekt zurück, das ein generisches Standardformat darstellt. |
| static [get_GenericTypographic](./get_generictypographic/)() | Gibt ein [StringFormat](./)-Objekt zurück, das ein generisches typografisches Format darstellt. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | Gibt den Wert zurück, der angibt, wie das Hotkey-Präfix angezeigt wird. |
| [get_LineAlignment](./get_linealignment/)() const | Gibt einen Wert zurück, der die vertikale Ausrichtung der Zeichenkette angibt. |
| [get_Trimming](./get_trimming/)() const | Gibt einen Wert zurück, der angibt, wie die Zeichenkette beschnitten wird. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | Ermittelt die Größe des [CharacterRange](../characterrange/)-Arrays. |
| [GetTabStops](./gettabstops/)(float\&) const | Gibt die Tabulatorpositionen für das aktuelle [StringFormat](./)-Objekt zurück. |
| [set_Alignment](./set_alignment/)(StringAlignment) | Setzt die horizontale Ausrichtung der Zeichenkette. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | Setzt die Zeichenkettenformat-Flags. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | Setzt den Wert, der angibt, wie das Hotkey-Präfix angezeigt werden soll. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | Setzt die vertikale Ausrichtung der Zeichenkette. |
| [set_Trimming](./set_trimming/)(StringTrimming) | Setzt einen Wert, der angibt, wie die Zeichenkette beschnitten wird. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | Setzt die Sprache und Methode zur Ziffernersetzung. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | Setzt ein Array von [CharacterRange](../characterrange/)-Objekten, die die Zeichenbereiche darstellen, die durch einen Aufruf der Methode MeasureCharacterRanges() gemessen werden. |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | Setzt die Tabulatorpositionen für das aktuelle [StringFormat](./)-Objekt. |
| [StringFormat](./stringformat/)() | Konstruiert eine neue Instanz der [StringFormat](./)-Klasse. |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | Konstruiert eine neue Instanz der Klasse [StringFormat](./) mit den angegebenen Formatflags und der Sprache. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | Kopierkonstruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
