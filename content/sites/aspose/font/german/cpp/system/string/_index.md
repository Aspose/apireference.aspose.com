---
title: "System::String Klasse"
linktitle: "String"
second_title: "Aspose.Font für C++"
description: "System::String Klasse. String-Klasse, die in der gesamten Bibliothek verwendet wird. Sie ist ein Ersatz für C# System.String beim Übersetzen von Code. Aus Optimierungsgründen wird sie nicht als Unterklasse von Object betrachtet. Dieser Typ sollte auf dem Stack alloziert und an Funktionen per Wert oder Referenz übergeben werden. Verwenden Sie niemals die System::SmartPtr Klasse, um Objekte dieses Typs in C++ zu verwalten."
type: docs
weight: 5800
url: /de/cpp/system/string/
---
## String class


[String](./) class used across the library. Is a substitute for C# [System.String](./) when translating code. For optimization reasons, isn't considered an [Object](../object/) subclass. This type should be allocated on stack and passed to functions by value or by reference. Never use [System::SmartPtr](../smartptr/) class to manage objects of this type.

```cpp
class String
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ASPOSECPP_VALUE_TYPE_IMPLEMENTS_INTERFACES](./asposecpp_value_type_implements_interfaces/)() | [String](./) ist ein Werttyp auf der C++-Seite, der implizit (ohne Vererbung) einige Schnittstellen implementiert. |
| [begin](./begin/)() const | Gibt einen Zeiger auf den Anfang des tatsächlichen String-Puffers zurück. Allokiert niemals etwas neu. Garantiert nicht, dass der Puffer nullterminiert ist. |
| [Clone](./clone/)() const | Erstellt eine Kopie des aktuellen Strings. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool) | Less-equal-greater vergleicht zwei Teilzeichenketten. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater vergleicht zwei Teilzeichenketten. |
| static [Compare](./compare/)(const String\&, const String\&, System::StringComparison) | Less-equal-greater vergleicht zwei Zeichenketten. |
| static [Compare](./compare/)(const String\&, int, const String\&, int, int, System::StringComparison) | Less-equal-greater vergleicht zwei Zeichenketten. |
| static [Compare](./compare/)(const String\&, const String\&, bool) | Less-equal-greater vergleicht zwei Zeichenketten. |
| static [Compare](./compare/)(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) | Less-equal-greater vergleicht zwei Zeichenketten. |
| static [CompareOrdinal](./compareordinal/)(const String\&, const String\&) | Less-equal-greater vergleicht zwei Zeichenketten im Ordinalmodus. |
| static [CompareOrdinal](./compareordinal/)(const String\&, int, const String\&, int, int) | Less-equal-greater vergleicht zwei Zeichenketten im Ordinalmodus. |
| [CompareTo](./compareto/)(const String\&) const | Vergleicht zwei Zeichenketten im 'less-equals-more'-Stil. Verwendet die aktuelle Kultur. |
| static [Concat](./concat/)(const ArrayPtr\<String\>\&) | Verkettet Zeichenketten. |
| static [Concat](./concat/)(const String\&, const String\&) | Verkettet Zeichenketten. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&) | Verkettet Zeichenketten. |
| static [Concat](./concat/)(const String\&, const String\&, const String\&, const String\&) | Verkettet Zeichenketten. |
| [Contains](./contains/)(const String\&) const | Prüft, ob str ein Teilstring der aktuellen Zeichenkette ist. |
| [Contains](./contains/)(char16_t) const | Prüft, ob die Zeichenkette das angegebene Zeichen enthält. |
| static [Copy](./copy/)(const String\&) | Erstellt eine Kopie der Zeichenkette. |
| [CopyTo](./copyto/)(int, const ArrayPtr\<char_t\>\&, int, int) const | Kopiert Zeichenkettenzeichen in vorhandene Array-Elemente. Es wird keine Größenänderung vorgenommen. |
| [end](./end/)() const | Gibt einen Zeiger auf das Ende des tatsächlichen Zeichenkettenpuffers zurück. Allokiert nie neu. Garantiert nicht, dass der Puffer nullterminiert ist. |
| [EndsWith](./endswith/)(const String\&) const | Prüft, ob die Zeichenkette mit dem angegebenen Teilstring endet. |
| [EndsWith](./endswith/)(const String\&, System::StringComparison) const | Prüft, ob die Zeichenkette mit dem angegebenen Teilstring endet. |
| [EndsWith](./endswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Prüft, ob die Zeichenkette mit dem angegebenen Teilstring endet. |
| [Equals](./equals/)(const String\&, System::StringComparison) const | [String](./) Gleichheitsvergleich. Mehrere Modi, bereitgestellt durch die Aufzählung [StringComparison](../stringcomparison/), werden unterstützt. |
| [Equals](./equals/)(const String\&) const | [String](./) Gleichheitsvergleich. Verwendet den Vergleichsmodus [System::StringComparison::Ordinal](../stringcomparison/). |
| static [Equals](./equals/)(const String\&, const String\&) | Equal vergleicht zwei Zeichenketten im Ordial-Vergleichsmodus. |
| static [Equals](./equals/)(const String\&, const String\&, System::StringComparison) | Equal vergleicht zwei Zeichenketten. |
| [FastToAscii](./fasttoascii/)(char, int) const | Versucht, ein [String](./) in eine ASCII-Zeichenkette zu konvertieren. |
| static [Format](./format/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const Args\&...) | Formatiert die Zeichenkette im C#-Stil. |
| static [Format](./format/)(std::nullptr_t, const String\&, const Args\&...) | Formatiert die Zeichenkette im C#-Stil. |
| static [Format](./format/)(std::nullptr_t, const char16_t(&), const Args\&...) | Formatiert die Zeichenkette im C#-Stil. |
| static [Format](./format/)(const String\&, const Args\&...) | Formatiert die Zeichenkette im C#-Stil. |
| static [Format](./format/)(const String\&, const System::ArrayPtr\<T\>\&) | Formatiert die Zeichenkette im C#-Stil. |
| static [FromAscii](./fromascii/)(const char *) | Erstellt ein [String](./) aus einer ASCII-Zeichenkette. |
| static [FromAscii](./fromascii/)(const char *, int) | Erstellt ein [String](./) aus einer ASCII-Zeichenkette. |
| static [FromAscii](./fromascii/)(const std::string\&) | Erstellt ein [String](./) aus einer ASCII-Zeichenkette. |
| static [FromUtf16](./fromutf16/)(const std::u16string\&) | Erstellt ein [String](./) aus einer UTF-16-Zeichenkette. |
| static [FromUtf32](./fromutf32/)(const uint32_t *, int32_t) | Erstellt ein [String](./) aus einer UTF-32-Zeichenkette. |
| static [FromUtf8](./fromutf8/)(const char *) | Erstellt ein [String](./) aus einer UTF-8-Zeichenkette. |
| static [FromUtf8](./fromutf8/)(const char *, int) | Erstellt ein [String](./) aus einer UTF-8-Zeichenkette. |
| static [FromUtf8](./fromutf8/)(const uint8_t *) | Erstellt ein [String](./) aus einer UTF-8-Zeichenkette. |
| static [FromUtf8](./fromutf8/)(const std::string\&) | Erstellt ein [String](./) aus einer UTF-8-Zeichenkette. |
| static [FromWCS](./fromwcs/)(const std::wstring\&) | Erstellt ein [String](./) aus einer Wide-String. |
| [get_Length](./get_length/)() const | Gibt die Länge der Zeichenkette zurück. |
| [GetHashCode](./gethashcode/)() const | Hasht die enthaltene Zeichenkette. Implementiert in ICU, stimmt nicht mit den Hashes in C# überein. |
| [IndexOf](./indexof/)(const String\&, System::StringComparison) const | Vorwärts-Lookup von Teilzeichenketten. |
| [IndexOf](./indexof/)(char_t, int) const | Vorwärtssuche nach Zeichen. |
| [IndexOf](./indexof/)(char_t, int, int) const | Vorwärtssuche nach Zeichen im Teilstring. |
| [IndexOf](./indexof/)(const String\&, int) const | Vorwärts-Lookup von Teilzeichenketten. |
| [IndexOf](./indexof/)(const String\&, int, System::StringComparison) const | Vorwärts-Lookup von Teilzeichenketten. |
| [IndexOf](./indexof/)(const String\&, int, int, System::StringComparison) const | Vorwärts-Lookup von Teilzeichenketten. |
| [IndexOf](./indexof/)(const String\&, int, int) const | Vorwärts-Lookup von Teilzeichenketten. |
| [IndexOfAny](./indexofany/)(char_t, int) const | Vorwärtssuche nach Zeichen. |
| [IndexOfAny](./indexofany/)(const String\&, int) const | Sucht folglich nach allen Zeichen von str in diesem. Wenn das erste Zeichen gefunden wird, wird seine Position zurückgegeben, andernfalls wird nach dem zweiten gesucht usw. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&) const | Sucht nach beliebigen der übergebenen Zeichen im gesamten String. Vergleicht das erste Zeichen des Strings mit allen Zeichen in anyOf, dann das zweite usw. Gibt den Index des ersten Zeichens zurück, das einem der Zielzeichen entspricht. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Sucht nach beliebigen der übergebenen Zeichen im Teilstring. Vergleicht das erste Zeichen des Strings mit allen Zeichen in anyOf, dann das zweite usw. Gibt den Index des ersten Zeichens zurück, das einem der Zielzeichen entspricht. |
| [IndexOfAny](./indexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Sucht nach beliebigen der übergebenen Zeichen im Teilstring. Vergleicht das erste Zeichen des Strings mit allen Zeichen in anyOf, dann das zweite usw. Gibt den Index des ersten Zeichens zurück, das einem der Zielzeichen entspricht. |
| [Insert](./insert/)(int, const String\&) const | Fügt den Teilstring an der angegebenen Position ein. |
| [Is](./is/)(const System::TypeInfo\&) const | Überprüft, ob das String-Objekt vom durch [TypeInfo](../typeinfo/) angegebenen Typ ist. |
| [IsAsciiString](./isasciistring/)() const | Gibt an, ob ein [String](./) nur ASCII‑Symbole enthält. |
| [IsEmpty](./isempty/)() const | Überprüft, ob der String sowohl nicht null als auch leer ist. |
| [IsNormalized](./isnormalized/)(System::Text::NormalizationForm) const | Überprüft, ob ein Unicode‑String mit der angegebenen Normalisierungsform normalisiert ist. |
| [IsNull](./isnull/)() const | Überprüft, ob ein String als null betrachtet wird. Ein [String](./) ist null, und zwar nur, wenn er über den Konstruktor [String()](./string/) erstellt, verschoben, kopiert oder von einem Null‑String zugewiesen wurde oder die Methode [reset()](./reset/) aufgerufen wurde. |
| [IsNullOrEmpty](./isnullorempty/)() const | Überprüft, ob der String leer ist oder als null betrachtet wird. |
| static [IsNullOrEmpty](./isnullorempty/)(const String\&) | Überprüft, ob der übergebene String null oder leer ist. |
| static [IsNullOrWhiteSpace](./isnullorwhitespace/)(const String\&) | Gibt an, ob ein angegebener String null, leer oder nur aus Leerzeichen besteht. |
| static [Join](./join/)(const String\&, const ArrayPtr\<String\>\&, int, int) | Verbindet ein Array unter Verwendung eines Strings als Trennzeichen. |
| static [Join](./join/)(const String\&, const System::Details::ArrayView\<String\>\&, int, int) | Verbindet ein Array unter Verwendung eines Strings als Trennzeichen. |
| static [Join](./join/)(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) | Verbindet ein Array unter Verwendung eines Strings als Trennzeichen. |
| static [Join](./join/)(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) | Verbindet ein Array unter Verwendung eines Strings als Trennzeichen. |
| [LastIndexOf](./lastindexof/)(const String\&, int) const | Rückwärtssuche im Teilstring. |
| [LastIndexOf](./lastindexof/)(const String\&, System::StringComparison) const | Rückwärtssuche im Teilstring. |
| [LastIndexOf](./lastindexof/)(const String\&, int, System::StringComparison) const | Rückwärtssuche im Teilstring. |
| [LastIndexOf](./lastindexof/)(const String\&, int, int, StringComparison) const | Rückwärtssuche im Teilstring. |
| [LastIndexOf](./lastindexof/)(char_t) const | Rückwärtssuche nach Zeichen. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t) const | Rückwärtssuche nach Zeichen. |
| [LastIndexOf](./lastindexof/)(char_t, int32_t, int32_t) const | Rückwärtssuche nach Zeichen. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&) const | Sucht rückwärts nach beliebigen der übergebenen Zeichen im gesamten String. Vergleicht das letzte Zeichen des Strings mit allen Zeichen in anyOf, dann das vorherige usw. Gibt den Index des ersten gefundenen Treffers zurück. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t) const | Sucht rückwärts nach beliebigen der übergebenen Zeichen im Teilstring. Vergleicht das letzte Zeichen des Strings mit allen Zeichen in anyOf, dann das vorherige usw. Gibt den Index des ersten gefundenen Treffers zurück. |
| [LastIndexOfAny](./lastindexofany/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const | Sucht rückwärts nach beliebigen der übergebenen Zeichen im Teilstring. Vergleicht das letzte Zeichen des Strings mit allen Zeichen in anyOf, dann das vorherige usw. Gibt den Index des ersten gefundenen Treffers zurück. |
| [Normalize](./normalize/)(System::Text::NormalizationForm) const | Normalisiert einen Unicode‑String mit der angegebenen Normalisierungsform. |
| [operator!=](./operator!=/)(const String\&) const | Ungleichheits‑Vergleichsoperator. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Überprüft, ob ein String nicht null ist. Verwendet dieselbe Logik wie der Aufruf von [IsNull()](./isnull/). |
| [operator+](./operator+/)(const String\&) const | Verkettungsoperator für [String](./). |
| [operator+](./operator+/)(const T\&) const | Verkettung von [String](./) mit einem String‑Literal oder einem Zeichen‑String‑Zeiger. |
| [operator+](./operator+/)(char_t) const | Fügt ein Zeichen am Ende des Strings hinzu. |
| [operator+](./operator+/)(int) const | Fügt die Zeichenkettenrepräsentation des ganzzahligen Werts am Ende der Zeichenkette hinzu. |
| [operator+](./operator+/)(uint32_t) const | Fügt die Zeichenkettenrepräsentation des vorzeichenlosen Ganzzahlwerts am Ende der Zeichenkette hinzu. |
| [operator+](./operator+/)(double) const | Fügt die Zeichenkettenrepräsentation des Gleitkommawerts am Ende der Zeichenkette hinzu. |
| [operator+](./operator+/)(int64_t) const | Fügt die Zeichenkettenrepräsentation des ganzzahligen Werts am Ende der Zeichenkette hinzu. |
| [operator+](./operator+/)(const T\&) const | Fügt die Zeichenkettenrepräsentation des Referenztyp-Objekts am Ende der Zeichenkette hinzu. |
| [operator+](./operator+/)(const T\&) const | Fügt die Zeichenkettenrepräsentation des Referenztyp-Objekts am Ende der Zeichenkette hinzu. |
| [operator+](./operator+/)(T) const | Fügt die Zeichenkettenrepräsentation des booleschen Werts am Ende der Zeichenkette hinzu. |
| [operator+=](./operator+=/)(char_t) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(const String\&) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(double) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(uint8_t) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(int16_t) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(uint16_t) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(int32_t) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(uint32_t) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(int64_t) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(uint64_t) | Verkettungszuweisungsoperator. |
| [operator+=](./operator+=/)(T) | Verkettungszuweisungsoperator. |
| [operator<](./operator_/)(const String\&) const | Vergleicht Zeichenketten in ihrer Reihenfolge. |
| [operator=](./operator=/)(const String\&) | Zuweisungsoperator. |
| [operator=](./operator=/)(String\&&) | Move-Zuweisungsoperator. |
| [operator==](./operator==/)(const String\&) const | Gleichheitsvergleichsoperator. |
| [operator==](./operator==/)(std::nullptr_t) const | Prüft, ob die Zeichenkette null ist. Verwendet dieselbe Logik wie der Aufruf von [IsNull()](./isnull/). |
| [operator>](./operator_/)(const String\&) const | Vergleicht Zeichenketten in ihrer Reihenfolge. |
| [operator[]](./operator[]/)(int) const | Gibt das Zeichen an der angegebenen Position zurück. |
| [PadLeft](./padleft/)(int, char_t) const | Fügt links von der ursprünglichen Zeichenkette Auffüllung hinzu. |
| [PadRight](./padright/)(int, char_t) const | Fügt rechts von der ursprünglichen Zeichenkette Auffüllung hinzu. |
| [rbegin](./rbegin/)() const | Gibt einen Reverse-Iterator zum letzten Zeichen (falls vorhanden) des tatsächlichen Zeichenkettenpuffers zurück. |
| [Remove](./remove/)(int32_t, int32_t) const | Extrahiert alles außer dem Teilstring aus der aktuellen Zeichenkette. |
| [rend](./rend/)() const | Gibt einen Reverse-Iterator zum vor dem ersten Zeichen (falls vorhanden) des tatsächlichen Zeichenkettenpuffers zurück. |
| [Replace](./replace/)(char_t, char_t) const | Ersetzt alle Vorkommen des Zeichens in der Zeichenkette. |
| [Replace](./replace/)(const String\&, const String\&) const | Ersetzt alle Vorkommen der Suche in dieser Zeichenkette. |
| [reset](./reset/)() | Setzt die Zeichenkette auf null. Entspricht 'string_variable_name = null' in C#. |
| [SetCharAt](./setcharat/)(int, char_t) | Setzt das Zeichen an der angegebenen Position. |
| [Split](./split/)(char_t, StringSplitOptions) const | Teilt die Zeichenkette nach Zeichen. |
| [Split](./split/)(char_t, int32_t, StringSplitOptions) const | Teilt die Zeichenkette nach Zeichen. |
| [Split](./split/)(char_t, char_t, StringSplitOptions) const | Teilt die Zeichenkette nach einem von zwei Zeichen. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, StringSplitOptions) const | Teilt die Zeichenkette nach einem der angegebenen Zeichen. |
| [Split](./split/)(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const | Teilt die Zeichenkette nach einem der angegebenen Zeichen. |
| [Split](./split/)(const String\&, StringSplitOptions) const | Teilt die Zeichenkette nach Teilstring. |
| [Split](./split/)(const String\&, int, StringSplitOptions) const | Teilt die Zeichenkette nach Teilstring. |
| [Split](./split/)(const ArrayPtr\<String\>\&, StringSplitOptions) const | Teilt die Zeichenkette nach Teilstring. |
| [Split](./split/)(const ArrayPtr\<String\>\&, int, StringSplitOptions) const | Teilt die Zeichenkette nach Teilzeichenkette. Derzeit werden nur Trennzeichen‑Arrays mit null oder einem Element unterstützt. |
| [StartsWith](./startswith/)(const String\&) const | Prüft, ob die Zeichenkette mit der angegebenen Teilzeichenkette beginnt. |
| [StartsWith](./startswith/)(const String\&, System::StringComparison) const | Prüft, ob die Zeichenkette mit der angegebenen Teilzeichenkette beginnt. |
| [StartsWith](./startswith/)(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Prüft, ob die Zeichenkette mit der angegebenen Teilzeichenkette beginnt. |
| [String](./string/)() | Standardkonstruktor. Erstellt ein Zeichenkettenobjekt, das als null betrachtet wird. |
| [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) | Konstruiert eine Zeichenkette basierend auf einem String‑Literal. Betrachtet das Literal als nullterminierte Zeichenkette und berechnet die Zielzeichenkettenlänge anhand der Literalgröße. |
| [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) | Konstruiert eine Zeichenkette basierend auf einem Zeiger auf eine Zeichenkette. Behandelt die referenzierte Zeichenkette als nullterminiert und berechnet die Zielzeichenkettenlänge anhand des Null‑Zeichens. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) | Konstruiert eine Zeichenkette basierend auf einem String‑Literal. Betrachtet das Literal als nullterminierte Zeichenkette in UTF‑8 und berechnet die Zielzeichenkettenlänge anhand der Literalgröße. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) | Konstruiert eine Zeichenkette basierend auf einem Zeiger auf eine Zeichenkette. Behandelt die referenzierte Zeichenkette als nullterminiert in UTF‑8 und berechnet die Zielzeichenkettenlänge anhand des Null‑Zeichens. |
| [String](./string/)(const char16_t *, int) | Konstruiert eine Zeichenkette aus einem Zeiger auf eine Zeichenkette und einer expliziten Länge. |
| [String](./string/)(const char *, int) | Konstruiert eine Zeichenkette aus einem Zeiger auf eine Zeichenkette und einer expliziten Länge. |
| [String](./string/)(const char16_t *, int, int) | Konstruiert eine Zeichenkette aus einem Zeiger auf eine Zeichenkette ab einer Startposition unter Verwendung einer Länge. |
| explicit [String](./string/)(const char16_t, int) | Füllkonstruktor. |
| [String](./string/)(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) | Nullptr‑Konstruktor. Als Template deklariert, um Prioritäten mit anderen Template‑Konstruktoren aufzulösen. |
| explicit [String](./string/)(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) | Konstruiert eine Zeichenkette basierend auf einem Wide‑String‑Literal. Betrachtet das Literal als nullterminierte Zeichenkette und berechnet die Zielzeichenkettenlänge anhand der Literalgröße. Die Konvertierung von wchar_t ist auf einigen Plattformen zeitaufwändig, daher sind implizite Konvertierungen nicht erlaubt. |
| explicit [String](./string/)(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) | Konstruiert eine Zeichenkette basierend auf einem Zeiger auf eine Wide‑Character‑Zeichenkette. Behandelt die referenzierte Zeichenkette als nullterminiert und berechnet die Zielzeichenkettenlänge anhand des Null‑Zeichens. Die Konvertierung von wchar_t ist auf einigen Plattformen zeitaufwändig, daher sind implizite Konvertierungen nicht erlaubt. |
| explicit [String](./string/)(const wchar_t *, int) | Konstruiert eine Zeichenkette aus einem Zeiger auf eine Wide‑Character‑Zeichenkette und einer expliziten Länge. Die Konvertierung von wchar_t ist auf einigen Plattformen zeitaufwändig, daher sind implizite Konvertierungen nicht erlaubt. |
| explicit [String](./string/)(const wchar_t, int) | Füllkonstruktor. Die Konvertierung von wchar_t ist auf einigen Plattformen zeitaufwändig, daher sind implizite Konvertierungen nicht erlaubt. |
| [String](./string/)(const String\&) | Kopierkonstruktor. |
| [String](./string/)(String\&&) | Move-Konstruktor. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&) | Konvertiert das gesamte Zeichenarray in eine Zeichenkette. |
| [String](./string/)(const ArrayPtr\<char16_t\>\&, int, int) | Konvertiert einen Teilbereich eines Zeichenarrays in eine Zeichenkette. Wenn Parameter außerhalb der Array‑Grenzen liegen, wird eine leere Zeichenkette erstellt. |
| explicit [String](./string/)(const codeporting_icu::UnicodeString\&) | Wickelt UnicodeString in [String](./) ein. |
| explicit [String](./string/)(codeporting_icu::UnicodeString\&&) | Move-Konstruktor. |
| explicit [String](./string/)(const std::wstring\&) | Erstellt ein [String](./) aus einer Wide-String. |
| explicit [String](./string/)(const std::u16string\&) | Erstellt ein [String](./) aus einer UTF-16-Zeichenkette. |
| explicit [String](./string/)(const std::string\&) | Erstellt [String](./) aus einer std::string‑Zeichenkette im UTF‑8‑Format. |
| explicit [String](./string/)(const std::u32string\&) | Erstellt [String](./) aus einer std::u32string‑Zeichenkette. |
| [Substring](./substring/)(int32_t) const | Extrahiert eine Teilzeichenkette. |
| [Substring](./substring/)(int32_t, int32_t) const | Extrahiert eine Teilzeichenkette. |
| [ToAsciiString](./toasciistring/)() const | Konvertiert die Zeichenkette in std::string. Verwendet ASCII‑Kodierung. |
| [ToByteArray](./tobytearray/)(int32_t, int32_t, bool) const | Konvertiert die Zeichenkette oder Teilzeichenkette in ein Byte‑Array. |
| [ToCharArray](./tochararray/)(int32_t, int32_t) const | Konvertiert die Zeichenkette oder Teilzeichenkette in ein Zeichen‑Array. |
| [ToLower](./tolower/)() const | Konvertiert alle Zeichen der Zeichenkette in Kleinbuchstaben. |
| [ToLower](./tolower/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Konvertiert alle Zeichen einer Zeichenkette in Kleinbuchstaben unter Verwendung einer spezifischen Kultur. |
| [ToLowerInvariant](./tolowerinvariant/)() const | Konvertiert alle Zeichen einer Zeichenkette in Kleinbuchstaben unter Verwendung einer invarianten Kultur. |
| [ToString](./tostring/)() const | Wrapper zum Umgang mit der Klasse [String](./) in Kontexten, in denen [ToString()](./tostring/) für Werttypobjekte aufgerufen wird. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Wrapper zum Umgang mit der Klasse [String](./) in Kontexten, in denen [ToString()](./tostring/) für Werttypobjekte aufgerufen wird. |
| [ToU16Str](./tou16str/)() const | Konvertiert die Zeichenkette zu std::u16string. |
| [ToU32Str](./tou32str/)() const | Konvertiert die Zeichenkette zu std::u32string. |
| [ToUpper](./toupper/)() const | Konvertiert alle Zeichen einer Zeichenkette in Großbuchstaben. |
| [ToUpper](./toupper/)(const SharedPtr\<System::Globalization::CultureInfo\>\&) const | Konvertiert alle Zeichen einer Zeichenkette in Großbuchstaben unter Verwendung einer spezifischen Kultur. |
| [ToUpperInvariant](./toupperinvariant/)() const | Konvertiert alle Zeichen einer Zeichenkette in Großbuchstaben unter Verwendung einer invarianten Kultur. |
| [ToUtf8String](./toutf8string/)() const | Konvertiert die Zeichenkette zu std::string. Verwendet UTF-8-Kodierung. |
| [ToWCS](./towcs/)() const | Konvertiert die Zeichenkette zu std::wstring. |
| [Trim](./trim/)() const | Entfernt alle Leerzeichenzeichen sowohl am Anfang als auch am Ende der Zeichenkette. |
| [Trim](./trim/)(char_t) const | Entfernt alle Vorkommen des übergebenen Zeichens sowohl am Anfang als auch am Ende der Zeichenkette. |
| [Trim](./trim/)(const String\&) const | Entfernt alle Vorkommen der übergebenen Zeichen sowohl am Anfang als auch am Ende der Zeichenkette. |
| [Trim](./trim/)(const ArrayPtr\<char_t\>\&) const | Entfernt alle Vorkommen der übergebenen Zeichen sowohl am Anfang als auch am Ende der Zeichenkette. |
| [TrimEnd](./trimend/)() const | Entfernt alle Leerzeichenzeichen am Ende der Zeichenkette. |
| [TrimEnd](./trimend/)(char_t) const | Entfernt alle Vorkommen des übergebenen Zeichens am Ende der Zeichenkette. |
| [TrimEnd](./trimend/)(const String\&) const | Entfernt alle Vorkommen der übergebenen Zeichen am Ende der Zeichenkette. |
| [TrimEnd](./trimend/)(const ArrayPtr\<char_t\>\&) const | Entfernt alle Vorkommen der übergebenen Zeichen am Ende der Zeichenkette. |
| [TrimStart](./trimstart/)() const | Entfernt alle Leerzeichenzeichen am Anfang der Zeichenkette. |
| [TrimStart](./trimstart/)(char_t) const | Entfernt alle Vorkommen des übergebenen Zeichens am Anfang der Zeichenkette. |
| [TrimStart](./trimstart/)(const String\&) const | Entfernt alle Vorkommen der übergebenen Zeichen am Anfang der Zeichenkette. |
| [TrimStart](./trimstart/)(const ArrayPtr\<char_t\>\&) const | Entfernt alle Vorkommen der übergebenen Zeichen am Anfang der Zeichenkette. |
| [u_str](./u_str/)() const | Gibt einen ICU‑stilisierten nullterminierten Puffer zurück. Kann die Zeichenkette neu allokieren. |
| [~String](./~string/)() | Destruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Empty](./empty/) | Leere Zeichenkette. |
| static [Null](./null/) | Null‑Zeichenkette. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iteratortyp. |
## Hinweise



```cpp
#include "system/string.h"
#include <iostream>

int main()
{
  // Erstellt eine Zeichenkette aus dem Array von Zeichen und gibt sie aus.
  const auto chars = {u'h', u'e', u'l', u'l', u'o'};
  const System::String string1(chars);
  std::cout << string1 << std::endl;

  // Erstellt eine Zeichenkette aus dem Array von Bytes und gibt sie aus.
  const uint8_t bytes[] = {0x77, 0x6f, 0x72, 0x6c, 0x64, 0x0};
  const auto string2 = System::String::FromUtf8(bytes);
  std::cout << string2 << std::endl;

  // Trimmt die untenstehende Zeichenkette und gibt sie aus.
  const System::String string3(u"   This string contains whitespaces in the beginning and at the end.   ");
  std::cout << '"' << string3.Trim() << '"' << std::endl;

  // Gib die Anzahl der Wörter im . aus.
  std::cout << "Number of words: " << string3.Trim().Split(' ')->get_Length() << std::endl;

  return 0;
}
/*
This code example produces the following output:
hello
world
"This string contains whitespaces in the beginning and at the end."
Number of words: 11
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
