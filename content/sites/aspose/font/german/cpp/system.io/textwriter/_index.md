---
title: "System::IO::TextWriter Klasse"
linktitle: "TextWriter"
second_title: "Aspose.Font für C++"
description: "System::IO::TextWriter Klasse. Eine Basisklasse für Klassen, die Writer darstellen, die Zeichenfolgen an verschiedene Ziele schreiben. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2700
url: /de/cpp/system.io/textwriter/
---
## TextWriter class


Eine Basisklasse für Klassen, die Writer darstellen, die Zeichenfolgen an verschiedene Ziele schreiben. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TextWriter : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Close](./close/)() | Schließt den Stream und gibt erworbene Ressourcen frei. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei und schließt den zugrunde liegenden Stream. |
| virtual [Flush](./flush/)() | Schreibt den Inhalt des Puffers in den zugrunde liegenden Stream. |
| virtual [get_Encoding](./get_encoding/)() | Gibt die aktuell verwendete Kodierung zurück. |
| virtual [get_FormatProvider](./get_formatprovider/)() const | Gibt das aktuell verwendete [IFormatProvider](../../system/iformatprovider/)-Objekt zurück. |
| [get_FormatProvider](./get_formatprovider/)() | Gibt das aktuell verwendete [IFormatProvider](../../system/iformatprovider/)-Objekt zurück. |
| virtual [get_NewLine](./get_newline/)() const | Gibt eine Zeilenabschlusszeichenfolge zurück. |
| [get_NewLine](./get_newline/)() | Gibt eine Zeilenabschlusszeichenfolge zurück. |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | Setzt eine Zeilenabschlusszeichenfolge. |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | Schreibt die Zeichenkettenrepräsentation des angegebenen Objekts in den Stream. |
| virtual [Write](./write/)(bool) | Schreibt die Zeichenkettenrepräsentation des angegebenen booleschen Werts in den Stream. |
| virtual [Write](./write/)(char_t) | Schreibt das angegebene Zeichen in den Stream. |
| virtual [Write](./write/)(Decimal) | Schreibt die Zeichenkettenrepräsentation des angegebenen [Decimal](../../system/decimal/) Objekts in den Stream. |
| virtual [Write](./write/)(double) | Schreibt die Zeichenkettenrepräsentation des angegebenen double‑Präzisions‑Gleitkommawerts in den Stream. |
| virtual [Write](./write/)(int) | Schreibt die Zeichenkettenrepräsentation des angegebenen 32‑Bit‑Ganzzahlwerts in den Stream. |
| virtual [Write](./write/)(int64_t) | Schreibt die Zeichenkettenrepräsentation des angegebenen 64‑Bit‑Ganzzahlwerts in den Stream. |
| virtual [Write](./write/)(float) | Schreibt die Zeichenkettenrepräsentation des angegebenen single‑precision Gleitkommawerts in den Stream. |
| virtual [Write](./write/)(const String\&) | Schreibt die angegebene Zeichenkette in den Stream. |
| virtual [Write](./write/)(uint32_t) | Schreibt die Zeichenkettenrepräsentation des angegebenen unsigned 32‑Bit‑Ganzzahlwerts in den Stream. |
| virtual [Write](./write/)(uint64_t) | Schreibt die Zeichenkettenrepräsentation des angegebenen unsigned 64‑Bit‑Ganzzahlwerts in den Stream. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | Schreibt alle Zeichen aus dem angegebenen Array in den Stream. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Schreibt den angegebenen Teilbereich von UTF‑16‑Zeichen aus dem angegebenen Zeichenarray in den Stream. |
| virtual [Write](./write/)(const char_t *) | Schreibt die angegebene C‑Zeichenkette in den Stream. |
| virtual [Write](./write/)(const TypeInfo\&) | Schreibt die Zeichenkettenrepräsentation des angegebenen [TypeInfo](../../system/typeinfo/) Objekts in den Stream. |
| [Write](./write/)(const String\&, const TArgs\&...) | Schreibt die angegebenen Werte, formatiert gemäß dem angegebenen Format, in den Stream. |
| virtual [WriteLine](./writeline/)() | Schreibt Zeilenabschlusszeichen in den Stream. |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | Schreibt die Zeichenkettenrepräsentation des angegebenen Objekts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(bool) | Schreibt die Zeichenkettenrepräsentation des angegebenen booleschen Werts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(char_t) | Schreibt das angegebene Zeichen, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(Decimal) | Schreibt die Zeichenkettenrepräsentation des angegebenen [Decimal](../../system/decimal/) Objekts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(double) | Schreibt die Zeichenkettenrepräsentation des angegebenen double‑Präzisions‑Gleitkommawerts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(int) | Schreibt die Zeichenkettenrepräsentation des angegebenen 32‑Bit‑Ganzzahlwerts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(int64_t) | Schreibt die Zeichenkettenrepräsentation des angegebenen 64‑Bit‑Ganzzahlwerts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(float) | Schreibt die Zeichenkettenrepräsentation des angegebenen single‑precision Gleitkommawerts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(const String\&) | Schreibt die angegebene Zeichenkette, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(uint32_t) | Schreibt die Zeichenkettenrepräsentation des angegebenen unsigned 32‑Bit‑Ganzzahlwerts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(uint64_t) | Schreibt die Zeichenkettenrepräsentation des angegebenen unsigned 64‑Bit‑Ganzzahlwerts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Schreibt alle Zeichen aus dem angegebenen Array, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Schreibt den angegebenen Teilbereich von UTF-16-Zeichen aus dem angegebenen Zeichenarray, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(const char_t *) | Schreibt die angegebene C‑Zeichenkette, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | Schreibt die Zeichenkettenrepräsentation des angegebenen [TypeInfo](../../system/typeinfo/)-Objekts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | Schreibt die angegebenen Werte, formatiert gemäß dem angegebenen Format, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| virtual [~TextWriter](./~textwriter/)() | Destruktor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf diese Klasse. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
