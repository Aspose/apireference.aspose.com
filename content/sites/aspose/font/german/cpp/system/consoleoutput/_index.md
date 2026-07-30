---
title: "System::ConsoleOutput-Klasse"
linktitle: "ConsoleOutput"
second_title: "Aspose.Font für C++"
description: "System::ConsoleOutput-Klasse. Repräsentiert den Standardausgabestream. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1500
url: /de/cpp/system/consoleoutput/
---
## ConsoleOutput class


Repräsentiert den Standardausgabestream. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | Gibt stets die ASCII-Kodierung zurück. |
| [Write](./write/)(bool) override | Gibt die Zeichenkettenrepräsentation des angegebenen booleschen Werts in den vom aktuellen Objekt dargestellten Ausgabestream aus. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Gibt die Zeichenkettenrepräsentation des angegebenen Objekts in den vom aktuellen Objekt dargestellten Ausgabestream aus. |
| [Write](./write/)(char_t) override | Gibt den angegebenen Zeichenwert in den vom aktuellen Objekt dargestellten Ausgabestream aus. |
| [Write](./write/)(Decimal) override | Gibt die Zeichenkettenrepräsentation des [Decimal](../decimal/)-Werts in den vom aktuellen Objekt dargestellten Ausgabestream aus. |
| [Write](./write/)(double) override | Gibt die Zeichenkettenrepräsentation eines double‑genauen Gleitkommawerts in den vom aktuellen Objekt dargestellten Ausgabestream aus. |
| [Write](./write/)(int32_t) override | Gibt die Zeichenkettenrepräsentation des 32‑Bit‑Ganzzahlwerts im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(int64_t) override | Gibt die Zeichenkettenrepräsentation des 64‑Bit‑Ganzzahlwerts im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(float) override | Gibt die Zeichenkettenrepräsentation des single‑Präzisions‑Gleitkommawerts im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(const String\&) override | Gibt das angegebene Zeichenkettenobjekt im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(uint32_t) override | Gibt die Zeichenkettenrepräsentation des unsigned 32‑Bit‑Ganzzahlwerts im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(uint64_t) override | Gibt die Zeichenkettenrepräsentation des unsigned 64‑Bit‑Ganzzahlwerts im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Gibt die Zeichenkettenrepräsentation des angegebenen Zeichen‑Arrays im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Gibt die Zeichenkettenrepräsentation eines Wertebereichs des angegebenen Zeichen‑Arrays im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(const char_t *) override | Gibt die angegebene C‑Zeichenkette im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(const TypeInfo\&) override | Gibt die Zeichenkettenrepräsentation des angegebenen [TypeInfo](../typeinfo/)-Objekts im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | Gibt den aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Gibt die Zeichenkettenrepräsentation des angegebenen Objekts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(bool) override | Gibt die Zeichenkettenrepräsentation des angegebenen booleschen Werts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(char_t) override | Gibt den angegebenen Zeichenwert gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(Decimal) override | Gibt die Zeichenkettenrepräsentation des [Decimal](../decimal/)-Werts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(double) override | Gibt die Zeichenkettenrepräsentation des double‑Präzisions‑Gleitkommawerts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(int) override | Gibt die Zeichenkettenrepräsentation des 32‑Bit‑Ganzzahlwerts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(int64_t) override | Gibt die Zeichenkettenrepräsentation des 64‑Bit‑Ganzzahlwerts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(float) override | Gibt die Zeichenkettenrepräsentation des single‑Präzisions‑Gleitkommawerts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(const String\&) override | Gibt das angegebene Zeichenkettenobjekt gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(uint32_t) override | Gibt die Zeichenkettenrepräsentation des unsigned 32‑Bit‑Ganzzahlwerts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(uint64_t) override | Gibt die Zeichenkettenrepräsentation des unsigned 64‑Bit‑Ganzzahlwerts gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Gibt die Zeichenkettenrepräsentation des angegebenen Zeichen‑Arrays gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Gibt die Zeichenkettenrepräsentation eines Wertebereichs des angegebenen Zeichen‑Arrays gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(const char_t *) override | Gibt die angegebene C‑Zeichenkette gefolgt vom aktuellen Zeilenabschluss im Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | Gibt die Zeichenkettenrepräsentation des angegebenen [TypeInfo](../typeinfo/)-Objekts gefolgt vom aktuellen Zeilenabschluss an den Ausgabestream aus, der vom aktuellen Objekt repräsentiert wird. |
| [WriteLine](./writeline/)(const char *) |  |
## Siehe auch

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
