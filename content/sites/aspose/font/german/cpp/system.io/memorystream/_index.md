---
title: "System::IO::MemoryStream-Klasse"
linktitle: "MemoryStream"
second_title: "Aspose.Font für C++"
description: "System::IO::MemoryStream-Klasse. Stellt einen Stream dar, der aus dem Speicher liest und in den Speicher schreibt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickele diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwende diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1800
url: /de/cpp/system.io/memorystream/
---
## MemoryStream class


Stellt einen Stream dar, der aus dem Speicher liest und in den Speicher schreibt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickele diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwende diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class MemoryStream : public System::IO::Stream
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt den Stream. |
| [Flush](./flush/)() override | Tut nichts. |
| [get_CanRead](./get_canread/)() const override | Bestimmt, ob der Stream lesbar ist. |
| [get_CanSeek](./get_canseek/)() const override | Bestimmt, ob der Stream das Suchen unterstützt. |
| [get_CanWrite](./get_canwrite/)() const override | Bestimmt, ob der Stream beschreibbar ist. |
| [get_Capacity](./get_capacity/)() | Gibt die aktuelle Kapazität des zugrunde liegenden Speicherpuffers zurück. |
| [get_Length](./get_length/)() const override | Gibt die Länge des Streams in Bytes zurück. |
| [get_Position](./get_position/)() const override | Gibt die aktuelle Position des Streams zurück. |
| virtual [GetBuffer](./getbuffer/)() | Gibt einen Zeiger auf den zugrunde liegenden Puffer zurück. |
| [MemoryStream](./memorystream/)() | Konstruiert eine neue Instanz der [MemoryStream](./)-Klasse mit einer anfänglichen Kapazität von 0. |
| [MemoryStream](./memorystream/)(int) | Konstruiert eine neue Instanz der [MemoryStream](./)-Klasse, die einen Stream basierend auf einem Speicherpuffer der angegebenen Größe darstellt. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | Konstruiert eine neue Instanz der [MemoryStream](./)-Klasse, die einen Memory-Stream darstellt, der mit dem angegebenen Speicherpuffer verbunden ist. Ein Parameter gibt an, ob der Stream schreibbar ist. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | Konstruiert eine neue Instanz der [MemoryStream](./)-Klasse, die einen Speicherstrom darstellt, der mit einem Segment des angegebenen Speicherpuffers verbunden ist, beginnend bei dem angegebenen Index und einschließlich der angegebenen Anzahl von Elementen. Parameter gibt an, ob der Stream schreibbar ist und ob die Methode GetBytes() aufgerufen werden kann. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [ReadByte](./readbyte/)() override | Liest ein einzelnes Byte aus dem Stream und gibt einen 32‑Bit‑Integer‑Wert zurück, der dem Wert des gelesenen Bytes entspricht. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Setzt die Position des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [set_Capacity](./set_capacity/)(int) | Setzt die Kapazität des zugrunde liegenden Speicherpuffers. |
| [set_Position](./set_position/)(int64_t) override | Setzt die Position des Streams. |
| [SetLength](./setlength/)(int64_t) override | Setzt die Länge des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| virtual [ToArray](./toarray/)() | Gibt eine Kopie des zugrunde liegenden Speicherpuffers als Byte-Array zurück. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | Gibt das Array aus vorzeichenlosen Bytes zurück, aus dem dieser Stream erstellt wurde. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Schreibt den angegebenen unsigned 8‑Bit‑Integer‑Wert in den Stream. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | Schreibt den Inhalt des zugrunde liegenden Puffers in den angegebenen Stream. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared Pointer auf das eigene Objekt. |
## Siehe auch

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
