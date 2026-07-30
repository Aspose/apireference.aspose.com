---
title: "System::IO::STDIOStreamWrapperBase Klasse"
linktitle: "STDIOStreamWrapperBase"
second_title: "Aspose.Font für C++"
description: "System::IO::STDIOStreamWrapperBase Klasse. Stellt eine Basisklasse für System.IO.Stream‑ähnliche Wrapper dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2000
url: /de/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


Stellt eine Basisklasse für [System.IO.Stream](../stream/)-ähnliche Wrapper dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | Bestimmt, ob der Stream das Lesen unterstützt. |
| [get_CanSeek](./get_canseek/)() const override | Bestimmt, ob der Stream das Suchen unterstützt. |
| [get_CanWrite](./get_canwrite/)() const override | Bestimmt, ob der Stream das Schreiben unterstützt. |
| [get_Length](./get_length/)() const override | Gibt die Länge des Streams zurück. |
| [get_Position](./get_position/)() const override | Gibt die aktuelle Position des Streams zurück. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | Kopierzuweisungsoperator. Gelöscht. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Setzt die Position des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [set_Position](./set_position/)(int64_t) override | Setzt die Position des Streams. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | Kopierkonstruktor. Gelöscht. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI-Informationen. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## Siehe auch

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
