---
title: "System::Text::StringBuilder Klasse"
linktitle: "StringBuilder"
second_title: "Aspose.Page für C++"
description: "System::Text::StringBuilder Klasse. Puffer zum schrittweisen Aufbauen eines Strings. Dieser Typ kann entweder im Stack als Werttyp oder im Heap mittels der Funktion System::MakeObject() alloziert werden. Sobald das Objekt alloziert ist, dürfen diese beiden Anwendungsfälle niemals vermischt werden: SmartPtr‑Zeiger auf stack‑alloziierte Objekte sind in C++ streng verboten."
type: docs
weight: 2400
url: /de/cpp/system.text/stringbuilder/
---
## StringBuilder class


[Buffer](../../system/buffer/) to accumulate string part by part. This type can be allocated either in stack as value type or in heap using [System::MakeObject()](../../system/makeobject/) function. Once the object is allocated, never mix up these two usecases: having [SmartPtr](../../system/smartptr/) pointers onto stack-allocated objects is strictly prohibited.

```cpp
class StringBuilder : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Append](./append/)(char_t) | Fügt ein Zeichen zum Builder hinzu. |
| [Append](./append/)(char_t, int) | Fügt Zeichen zum Builder hinzu. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&) | Fügt ein Zeichenarray zum Builder hinzu. |
| [Append](./append/)(const ArrayPtr\<char_t\>\&, int, int) | Fügt einen Ausschnitt eines Zeichenarrays zum Builder hinzu. |
| [Append](./append/)(const String\&) | Fügt einen String zum Builder hinzu. |
| [Append](./append/)(const String\&, int, int) | Fügt einen String‑Ausschnitt zum Builder hinzu. |
| [Append](./append/)(const SharedPtr\<T\>\&) | Fügt die String‑Repräsentation des Objekts zum Builder hinzu. |
| [Append](./append/)(const SharedPtr\<StringBuilder\>\&) | Fügt den Inhalt des Builders zum Builder hinzu. |
| [Append](./append/)(float) | Fügt einen Gleitkommawert zum Builder hinzu. |
| [Append](./append/)(double) | Fügt einen Gleitkommawert zum Builder hinzu. |
| [Append](./append/)(int) | Fügt einen Ganzzahlwert zum Builder hinzu. |
| [Append](./append/)(T) | Fügt einen arithmetischen Wert zum Builder hinzu. |
| [Append](./append/)(E) | Fügt die Zeichenkettenrepräsentation des Enum‑Werts zum Builder hinzu. |
| [AppendFormat](./appendformat/)(const String\&, const TArgs\&...) | Fügt formatierte Zeichenkette an den Builder an. |
| [AppendFormat](./appendformat/)(const SharedPtr\<IFormatProvider\>\&, const String\&, const TArgs\&...) | Fügt formatierte Zeichenkette an den Builder an. |
| [AppendLine](./appendline/)() | Fügt ein Zeilenumbruchzeichen an den Builder an. |
| [AppendLine](./appendline/)(const String\&) | Fügt eine Zeichenkette, gefolgt von einem Zeilenumbruchzeichen, an den Builder an. |
| [Clear](./clear/)() | Entfernt alle Zeichen aus dem Builder. |
| [CopyTo](./copyto/)(int, System::ArrayPtr\<char_t\> const\&, int, int) | Kopiert die Daten des Builders in vorhandene Array‑Positionen. |
| [get_Capacity](./get_capacity/)() const | Ermittelt die aktuelle Kapazität des String‑Builders. |
| [get_Length](./get_length/)() const | Ermittelt die Länge der derzeit im Builder befindlichen Zeichenkette. |
| [idx_get](./idx_get/)(int) const | Gibt das Zeichen an der angegebenen Position zurück. |
| [idx_set](./idx_set/)(int, char_t) | Setzt das Zeichen an der angegebenen Position. |
| [Insert](./insert/)(int, const String\&) | Fügt Zeichenkette an einer festen Position im Builder ein. |
| [Insert](./insert/)(int32_t, const String\&, int32_t) | Fügt wiederholte Zeichenkette an einer festen Position im Builder ein. |
| [Insert](./insert/)(int, char_t) | Fügt Zeichen an einer festen Position im Builder ein. |
| [Insert](./insert/)(int, const System::ArrayPtr\<char_t\>\&, int, int) | Fügt Zeichen an einer festen Position im Builder ein. |
| [Insert](./insert/)(int, T) | Fügt Wert an einer festen Position im Builder ein. |
| [operator[]](./operator[]/)(int) const | Gibt das Zeichen an der angegebenen Position zurück. |
| [Remove](./remove/)(int, int) | Entfernt Fragment aus dem Builder. |
| [Replace](./replace/)(const String\&, const String\&) | Ersetzt Teilzeichenkette im Builder. |
| [Replace](./replace/)(const String\&, const String\&, int, int) | Ersetzt Teilzeichenkette im Bereich des Builders. |
| [Replace](./replace/)(char_t, char_t) | Ersetzt Zeichen im Builder. |
| [Replace](./replace/)(char_t, char_t, int, int) | Ersetzt Zeichen im Bereich des Builders. |
| [set_Capacity](./set_capacity/)(int) | Setzt die aktuelle Kapazität des String‑Builders. |
| [set_Length](./set_length/)(int) | Kürzt oder erweitert den String‑Builder auf die angegebene Länge. |
| [StringBuilder](./stringbuilder/)() | Konstruktor. |
| [StringBuilder](./stringbuilder/)(int) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&, int) | Konstruktor. |
| [StringBuilder](./stringbuilder/)(const String\&, int, int, int) | Konstruktor. |
| [ToString](./tostring/)() const override | Ermittelt die derzeit im Builder enthaltene Zeichenkette. |
| [ToString](./tostring/)(int, int) const | Ermittelt die derzeit im Builder enthaltene Teilzeichenkette. |
| [~StringBuilder](./~stringbuilder/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
