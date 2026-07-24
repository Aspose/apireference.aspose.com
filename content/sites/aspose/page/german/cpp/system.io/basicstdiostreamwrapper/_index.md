---
title: "System::IO::BasicSTDIOStreamWrapper Klasse"
linktitle: "BasicSTDIOStreamWrapper"
second_title: "Aspose.Page für C++"
description: "System::IO::BasicSTDIOStreamWrapper Klasse. Stellt einen System.IO.Stream-ähnlichen Wrapper für std::basic_iostream und dessen abgeleitete Objekte dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.io/basicstdiostreamwrapper/
---
## BasicSTDIOStreamWrapper class


Stellt einen [System.IO.Stream](../stream/)-ähnlichen Wrapper für std::basic_iostream und dessen abgeleitete Objekte dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T,typename>class BasicSTDIOStreamWrapper : public System::IO::BasicSTDIStreamWrapper<T>,
                                                             public System::IO::BasicSTDOStreamWrapper<T>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(std::basic_iostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode, STDIOStreamPositionPreference) | Konstruiert eine neue Instanz von [BasicSTDIOStreamWrapper](./). |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/)(const BasicSTDIOStreamWrapper\&) | Kopierkonstruktor. Gelöscht. |
| [Flush](./flush/)() override | Leert die Puffer dieses Streams und schreibt alle gepufferten Daten in den zugrunde liegenden Speicher. |
| [operator=](./operator=/)(const BasicSTDIOStreamWrapper\&) | Kopierzuweisungsoperator. Gelöscht. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Wenn der Wrapper-Modus binär ist, liest er die angegebene Anzahl von Bytes aus dem Stream, andernfalls liest er die angegebene Anzahl von Zeichen und konvertiert sie in den Typ uint8_t. Schreibt das Ergebnis des Lesens in das angegebene Byte‑Array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte‑Array. |
| [ReadByte](./readbyte/)() override | Wenn der Wrapper-Modus binär ist, liest er ein einzelnes Byte aus dem zuletzt dekodierten Zeichenpuffer, andernfalls liest er ein einzelnes Zeichen aus dem Stream und konvertiert es in den Typ uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Setzt die Länge des Streams, der durch das aktuelle Objekt repräsentiert wird. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Wenn der Wrapper‑Modus binär ist, schreibt er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream, andernfalls konvertiert er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Typ [char_type](./char_type/) und schreibt anschließend das Ergebnis in den Stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Wenn der Wrapper‑Modus binär ist, schreibt er den angegebenen vorzeichenlosen 8‑Bit‑Ganzzahlwert in den Stream, andernfalls konvertiert er ihn in den Typ [char_type](./char_type/) und schreibt anschließend das Ergebnis in den Stream. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [BaseIType](./baseitype/) |  |
| [BaseOType](./baseotype/) |  |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI-Informationen. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Siehe auch

* Class [BasicSTDIStreamWrapper](../basicstdistreamwrapper/)
* Class [BasicSTDOStreamWrapper](../basicstdostreamwrapper/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
