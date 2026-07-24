---
title: "System::IO::BasicSTDIStreamWrapper Klasse"
linktitle: "BasicSTDIStreamWrapper"
second_title: "Aspose.Page für C++"
description: "System::IO::BasicSTDIStreamWrapper Klasse. Stellt einen System.IO.Stream-ähnlichen Wrapper für std::basic_istream und dessen abgeleitete Objekte dar. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 200
url: /de/cpp/system.io/basicstdistreamwrapper/
---
## BasicSTDIStreamWrapper class


Stellt einen [System.IO.Stream](../stream/)-ähnlichen Wrapper für std::basic_istream und dessen abgeleitete Objekte dar. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T,typename>class BasicSTDIStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(std::basic_istream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | Konstruiert eine neue Instanz von [BasicSTDIStreamWrapper](./). |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/)(const BasicSTDIStreamWrapper\&) | Kopierkonstruktor. Gelöscht. |
| [Flush](./flush/)() override | Leert die Puffer dieses Streams und schreibt alle gepufferten Daten in den zugrunde liegenden Speicher. Nicht unterstützt! |
| [operator=](./operator=/)(const BasicSTDIStreamWrapper\&) | Kopierzuweisungsoperator. Gelöscht. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Wenn der Wrapper-Modus binär ist, liest er die angegebene Anzahl von Bytes aus dem Stream, andernfalls liest er die angegebene Anzahl von Zeichen und konvertiert sie in den Typ uint8_t. Schreibt das Ergebnis des Lesens in das angegebene Byte‑Array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte‑Array. |
| [ReadByte](./readbyte/)() override | Wenn der Wrapper-Modus binär ist, liest er ein einzelnes Byte aus dem zuletzt dekodierten Zeichenpuffer, andernfalls liest er ein einzelnes Zeichen aus dem Stream und konvertiert es in den Typ uint8_t. |
| [SetLength](./setlength/)(int64_t) override | Setzt die Länge des vom aktuellen Objekt dargestellten Streams. Nicht unterstützt! |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Wenn der Wrapper‑Modus binär ist, schreibt er den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream, andernfalls wird der angegebene Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Typ [char_type](./char_type/) konvertiert und das Ergebnis in den Stream geschrieben. Nicht unterstützt! |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Wenn der Wrapper‑Modus binär ist, schreibt er den angegebenen vorzeichenlosen 8‑Bit‑Integer‑Wert in den Stream, andernfalls wird er in den Typ [char_type](./char_type/) konvertiert und das Ergebnis in den Stream geschrieben. Nicht unterstützt! |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI-Informationen. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Siehe auch

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
