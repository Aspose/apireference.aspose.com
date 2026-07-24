---
title: "System::Console Klasse"
linktitle: "Console"
second_title: "Aspose.Page für C++"
description: "System::Console Klasse. Stellt Methoden zum Ausgeben von Daten an den Standardausgabestream bereit. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise in C++ erstellen."
type: docs
weight: 1400
url: /de/cpp/system/console/
---
## Console class


Bietet Methoden zum Ausgeben von Daten in den Standardausgabestream. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class Console
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Beep](./beep/)() | NICHT IMPLEMENTIERT. |
| static [get_Error](./get_error/)() | Gibt einen Shared‑Pointer zurück, der auf das Objekt zeigt, das den Standard‑Fehler‑Stream repräsentiert. |
| static [get_In](./get_in/)() | Gibt einen Shared‑Pointer zurück, der auf das Objekt zeigt, das den Standard‑Eingabe‑Stream repräsentiert. |
| static [get_Out](./get_out/)() | Gibt einen Shared-Pointer zurück, der auf das Objekt zeigt, das den Standardausgabestream darstellt. |
| static [Mute](./mute/)(bool) | Schaltet den Standardausgabestream stumm oder hebt die Stummschaltung auf. |
| static [ReadKey](./readkey/)() | NICHT IMPLEMENTIERT. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | Weist das angegebene Objekt der Error-Eigenschaft der Klasse zu. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | Setzt die In-Eigenschaft auf das angegebene TextReader-Objekt. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | Weist das angegebene Objekt der Out-Eigenschaft der Klasse zu. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | Gibt die Zeichenkettenrepräsentation des angegebenen Objekts an den Standardausgabestream aus. |
| static [Write](./write/)(bool) | Gibt die Zeichenkettenrepräsentation des booleschen Werts an den Standardausgabestream aus. |
| static [Write](./write/)(char_t) | Gibt den angegebenen Zeichenwert an den Standardausgabestream aus. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | Gibt die Zeichenkettenrepräsentation des angegebenen Zeichen-Arrays an den Standardausgabestream aus. |
| static [Write](./write/)(const Decimal\&) | Gibt die Zeichenkettenrepräsentation des [Decimal](../decimal/)-Werts an den Standardausgabestream aus. |
| static [Write](./write/)(double) | Gibt die Zeichenkettenrepräsentation des double‑genauen Gleitkommawerts an den Standardausgabestream aus. |
| static [Write](./write/)(float) | Gibt die Zeichenkettenrepräsentation des single‑genauen Gleitkommawerts an den Standardausgabestream aus. |
| static [Write](./write/)(int32_t) | Gibt die Zeichenkettenrepräsentation des 32‑Bit‑Ganzzahlwerts an den Standardausgabestream aus. |
| static [Write](./write/)(int64_t) | Gibt die Zeichenkettenrepräsentation des 64‑Bit‑Ganzzahlwerts an den Standardausgabestream aus. |
| static [Write](./write/)(const String\&) | Gibt das angegebene Zeichenkettenobjekt an den Standardausgabestream aus. |
| static [Write](./write/)(const char_t *) | Gibt die angegebene C‑Zeichenkette an den Standardausgabestream aus. |
| static [Write](./write/)(const TypeInfo\&) | Gibt die Zeichenkettenrepräsentation des [TypeInfo](../typeinfo/)-Werts an den Standardausgabestream aus. |
| static [Write](./write/)(uint32_t) | Gibt die Zeichenkettenrepräsentation des vorzeichenlosen 32‑Bit‑Ganzzahlwerts an den Standardausgabestream aus. |
| static [Write](./write/)(uint64_t) | Gibt die Zeichenkettenrepräsentation des vorzeichenlosen 64‑Bit‑Ganzzahlwerts an den Standardausgabestream aus. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Gibt die Zeichenkettenrepräsentation des angegebenen Bereichs des angegebenen Zeichen-Arrays an den Standardausgabestream aus. |
| static [Write](./write/)(const String\&, Args\&&...) | Gibt die Zeichenkettenrepräsentation der angegebenen Argumente, formatiert nach dem angegebenen Format, an den Standardausgabestream aus. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | Gibt den aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | Gibt die Zeichenkettenrepräsentation des angegebenen Objekts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(bool) | Gibt die Zeichenkettenrepräsentation des booleschen Werts gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(char_t) | Gibt den angegebenen Zeichenwert gefolgt vom aktuellen Zeilenabschluss an den Standardausgabestream aus. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Gibt die Zeichenkettenrepräsentation des angegebenen Zeichenarrays aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const Decimal\&) | Gibt die Zeichenkettenrepräsentation des [Decimal](../decimal/)-Werts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(double) | Gibt die Zeichenkettenrepräsentation des double‑Präzisions‑Fließkommawerts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(float) | Gibt die Zeichenkettenrepräsentation des single‑Präzisions‑Fließkommawerts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(int32_t) | Gibt die Zeichenkettenrepräsentation des 32‑Bit‑Ganzzahlwerts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(int64_t) | Gibt die Zeichenkettenrepräsentation des 64‑Bit‑Ganzzahlwerts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const String\&) | Gibt das angegebene Zeichenkettenobjekt aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const char_t *) | Gibt die angegebene C‑Zeichenkette aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | Gibt die Zeichenkettenrepräsentation des [TypeInfo](../typeinfo/)-Werts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(uint32_t) | Gibt die Zeichenkettenrepräsentation des vorzeichenlosen 32‑Bit‑Ganzzahlwerts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(uint64_t) | Gibt die Zeichenkettenrepräsentation des vorzeichenlosen 64‑Bit‑Ganzzahlwerts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | Gibt die Zeichenkettenrepräsentation des angegebenen Bereichs des angegebenen Zeichenarrays aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const Exception\&) | Gibt die Zeichenkettenrepräsentation des angegebenen [Exception](../exception/)-Objekts aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | Gibt die Zeichenkettenrepräsentation der angegebenen Argumente, formatiert nach dem angegebenen Format, aus, gefolgt vom aktuellen Zeilenabschluss, an den Standardausgabestream. |
| static [WriteLine](./writeline/)(const char *) |  |
## Hinweise



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // Gib die Begrüßungsnachricht aus.
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
* Library [Aspose.Page for C++](../../)
