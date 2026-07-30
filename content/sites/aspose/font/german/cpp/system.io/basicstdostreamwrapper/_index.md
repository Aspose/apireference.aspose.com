---
title: "System::IO::BasicSTDOStreamWrapper Klasse"
linktitle: "BasicSTDOStreamWrapper"
second_title: "Aspose.Font für C++"
description: "System::IO::BasicSTDOStreamWrapper Klasse. Stellt einen System.IO.Stream-ähnlichen Wrapper für std::basic_ostream und dessen abgeleiteten Objekte dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.io/basicstdostreamwrapper/
---
## BasicSTDOStreamWrapper class


Stellt einen [System.IO.Stream](../stream/)-ähnlichen Wrapper für std::basic_ostream und dessen abgeleiteten Objekte dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T,typename>class BasicSTDOStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Konstruiert eine neue Instanz von [BasicSTDOStreamWrapper](./). |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(const BasicSTDOStreamWrapper\&) | Kopierkonstruktor. Gelöscht. |
| [Flush](./flush/)() override | Leert die Puffer dieses Streams und schreibt alle gepufferten Daten in den zugrunde liegenden Speicher. |
| [operator=](./operator=/)(const BasicSTDOStreamWrapper\&) | Kopierzuweisungsoperator. Gelöscht. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Wenn der Wrapper‑Modus binär ist, liest er die angegebene Anzahl von Bytes aus dem Stream, andernfalls liest er die angegebene Anzahl von Zeichen und konvertiert sie in den Typ uint8_t. Das Ergebnis der Leseoperation wird in das angegebene Byte‑Array geschrieben. Nicht unterstützt! |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [ReadByte](./readbyte/)() override | Wenn der Wrapper‑Modus binär ist, liest er ein einzelnes Byte aus dem zuletzt dekodierten Zeichenspeicher, andernfalls liest er ein einzelnes Zeichen aus dem Stream und konvertiert es in den Typ uint8_t. Nicht unterstützt! |
| [SetLength](./setlength/)(int64_t) override | Setzt die Länge des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Wenn der Wrapper‑Modus binär ist, schreibt er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream, andernfalls konvertiert er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Typ [char_type](./char_type/) und schreibt das Ergebnis in den Stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Wenn der Wrapper‑Modus binär ist, schreibt er den angegebenen unsigned 8‑Bit‑Integer‑Wert in den Stream, andernfalls konvertiert er ihn in den Typ [char_type](./char_type/) und schreibt das Ergebnis in den Stream. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI-Informationen. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Siehe auch

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
