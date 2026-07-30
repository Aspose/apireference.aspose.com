---
title: "System::IO::UnmanagedMemoryStream Klasse"
linktitle: "UnmanagedMemoryStream"
second_title: "Aspose.Font für C++"
description: "System::IO::UnmanagedMemoryStream Klasse. Stellt Zugriff auf nicht verwalteten Speicher bereit. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2800
url: /de/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


Bietet Zugriff auf nicht verwalteten Speicher. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Flush](./flush/)() override | Tut nichts. |
| [get_CanRead](./get_canread/)() const override | Bestimmt, ob der Stream lesbar ist. |
| [get_CanSeek](./get_canseek/)() const override | Bestimmt, ob der Stream das Suchen unterstützt. |
| [get_CanWrite](./get_canwrite/)() const override | Bestimmt, ob der Stream beschreibbar ist. |
| virtual [get_Capacity](./get_capacity/)() const | Gibt die aktuelle Kapazität des zugrunde liegenden Speicherpuffers zurück. |
| [get_Length](./get_length/)() const override | Gibt die Länge des Streams in Bytes zurück. |
| [get_Position](./get_position/)() const override | Gibt die aktuelle Position des Streams zurück. |
| [get_PositionPointer](./get_positionpointer/)() | NICHT IMPLEMENTIERT. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Setzt die Position des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [set_Position](./set_position/)(int64_t) override | Setzt die Position des Streams. |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | NICHT IMPLEMENTIERT. |
| [SetLength](./setlength/)(int64_t) override | NICHT IMPLEMENTIERT. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | Konstruiert eine neue Instanz von [UnmanagedMemoryStream](./). |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | Konstruiert eine neue Instanz von [UnmanagedMemoryStream](./). |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | NICHT IMPLEMENTIERT. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | NICHT IMPLEMENTIERT. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Siehe auch

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
