---
title: "System::Console Klasse"
linktitle: "Console"
second_title: "Aspose.Font für C++"
description: "System::Console Klasse. Stellt Methoden zum Ausgeben von Daten an den Standardausgabestream bereit. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten unter keinen Umständen Instanzen davon in C++ erstellen."
type: docs
weight: 1400
url: /de/cpp/system/console/
---
## Console class


Stellt Methoden zum Ausgeben von Daten in den Standardausgabestream bereit. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class Console
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Beep](./beep/)() | NICHT IMPLEMENTIERT. |
| static [get_Error](./get_error/)() | Gibt einen Shared‑Pointer zurück, der auf das Objekt zeigt, das den Standardfehlerstream repräsentiert. |
| static [get_In](./get_in/)() | Gibt einen Shared‑Pointer zurück, der auf das Objekt zeigt, das den Standardeingabestream repräsentiert. |
| static [get_Out](./get_out/)() | Gibt einen Shared‑Pointer zurück, der auf das Objekt zeigt, das den Standardausgabestream repräsentiert. |
| static [Mute](./mute/)(bool) | Stummschalten oder Aufheben der Stummschaltung des Standardausgabestreams. |
| static [ReadKey](./readkey/)() | NICHT IMPLEMENTIERT. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Weist das angegebene Objekt der Error‑Eigenschaft der Klasse zu. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Setzt die In‑Eigenschaft auf das angegebene TextReader‑Objekt. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Weist das angegebene Objekt der Out‑Eigenschaft der Klasse zu. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Gibt die Zeichenkettenrepräsentation des angegebenen Objekts an den Standardausgabestream aus. |
| static [Write](./write/)(bool) | Gibt die Zeichenkettenrepräsentation eines bool‑Werts an den Standardausgabestream aus. |
| static [Write](./write/)(char_t) | Gibt den angegebenen Zeichenwert an den Standardausgabestream aus. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Gibt die Stringdarstellung des angegebenen Zeichenarrays an den Standardausgabestream aus. |
| static [Write](./write/)(const Decimal\&) | Gibt die Stringdarstellung des [Decimal](../decimal/) Werts an den Standardausgabestream aus. |
| static [Write](./write/)(double) | Gibt die Stringdarstellung des double-precision Gleitkommawerts an den Standardausgabestream aus. |
| static [Write](./write/)(float) | Gibt die Stringdarstellung des single-precision Gleitkommawerts an den Standardausgabestream aus. |
| static [Write](./write/)(int32_t) | Gibt die Stringdarstellung des 32‑Bit‑Ganzzahlwerts an den Standardausgabestream aus. |
| static [Write](./write/)(int64_t) | Gibt die Stringdarstellung des 64‑Bit‑Ganzzahlwerts an den Standardausgabestream aus. |
| static [Write](./write/)(const String\&) | Gibt das angegebene String‑Objekt an den Standardausgabestream aus. |
| static [Write](./write/)(const char_t *) | Gibt die angegebene C‑String an den Standardausgabestream aus. |
| static [Write](./write/)(const TypeInfo\&) | Gibt die Stringdarstellung des [TypeInfo](../typeinfo/) Werts an den Standardausgabestream aus. |
| static [Write](./write/)(uint32_t) | Gibt die Stringdarstellung des unsigned 32‑Bit‑Ganzzahlwerts an den Standardausgabestream aus. |
| static [Write](./write/)(uint64_t) | Gibt die Stringdarstellung des unsigned 64‑Bit‑Ganzzahlwerts an den Standardausgabestream aus. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Gibt die Stringdarstellung des angegebenen Bereichs des angegebenen Zeichenarrays an den Standardausgabestream aus. |
| static [Write](./write/)(const String\&, Args\&&...) | Gibt die Stringdarstellung der angegebenen Argumente, formatiert nach dem angegebenen Format, an den Standardausgabestream aus. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Gibt den aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Gibt die Stringdarstellung des angegebenen Objekts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(bool) | Gibt die Stringdarstellung des bool‑Werts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(char_t) | Gibt den angegebenen Zeichenwert gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Gibt die Stringdarstellung des angegebenen Zeichenarrays gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(const Decimal\&) | Gibt die Stringdarstellung des [Decimal](../decimal/) Werts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(double) | Gibt die Stringdarstellung des double-precision Gleitkommawerts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(float) | Gibt die Stringdarstellung des single-precision Gleitkommawerts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(int32_t) | Gibt die Stringdarstellung des 32‑Bit‑Ganzzahlwerts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(int64_t) | Gibt die Stringdarstellung des 64‑Bit‑Ganzzahlwerts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(const String\&) | Gibt das angegebene String‑Objekt gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(const char_t *) | Gibt die angegebene c-string aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Gibt die Zeichenkettenrepräsentation des [TypeInfo](../typeinfo/)‑Werts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(uint32_t) | Gibt die Zeichenkettenrepräsentation des unsigned 32‑Bit‑Integer‑Werts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(uint64_t) | Gibt die Zeichenkettenrepräsentation des unsigned 64‑Bit‑Integer‑Werts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Gibt die Zeichenkettenrepräsentation des angegebenen Bereichs des angegebenen Zeichenarray aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const Exception\&) | Gibt die Zeichenkettenrepräsentation des angegebenen [Exception](../exception/)‑Objekts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Gibt die Zeichenkettenrepräsentation der angegebenen Argumente, formatiert nach dem angegebenen Format, aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const char *) |  |
## Hinweise



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Gibt die Hello‑Nachricht aus.
  Console::WriteLine(u"Hello, world!");

  // Erstelle eine Instanz der Klasse 'std::array'.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // Gib die Elemente des Arrays aus.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
