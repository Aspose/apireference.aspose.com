---
title: "System::IO::BufferedStream Klasse"
linktitle: "BufferedStream"
second_title: "Aspose.Font für C++"
description: "System::IO::BufferedStream Klasse. Fügt eine Pufferungsschicht über einem anderen Stream hinzu. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Pointer ein und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.io/bufferedstream/
---
## BufferedStream class


Fügt eine Pufferungsschicht über einem anderen Stream hinzu. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Pointer ein und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

```cpp
class BufferedStream : public System::IO::Stream
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | Konstruiert ein [BufferedStream](./)-Objekt, das den angegebenen Stream umschließt und einen 4096 Byte langen Puffer verwendet. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | Konstruiert ein [BufferedStream](./)-Objekt, das den angegebenen Stream umschließt und einen Puffer der angegebenen Größe verwendet. |
| [Flush](./flush/)() override | Schreibt den Inhalt des Puffers in den zugrunde liegenden Stream. |
| [get_CanRead](./get_canread/)() const override | Bestimmt, ob der Stream lesbar ist. |
| [get_CanSeek](./get_canseek/)() const override | Bestimmt, ob der Stream das Suchen unterstützt. |
| [get_CanWrite](./get_canwrite/)() const override | Bestimmt, ob der Stream beschreibbar ist. |
| [get_Length](./get_length/)() const override | Gibt die Länge des Streams zurück. |
| [get_Position](./get_position/)() const override | Gibt die aktuelle Position des Streams zurück. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem zugrunde liegenden Stream und schreibt sie in das angegebene Byte‑Array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem zugrunde liegenden Stream und schreibt sie in das angegebene Byte‑Array. |
| [ReadByte](./readbyte/)() override | Liest ein einzelnes Byte aus dem zugrunde liegenden Stream und gibt einen 32‑Bit‑Ganzzahlwert zurück, der dem Wert des gelesenen Bytes entspricht. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Setzt die Position des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [set_Position](./set_position/)(int64_t) override | Leert den Puffer in den zugrunde liegenden Stream und setzt anschließend die Position des Streams. |
| [SetLength](./setlength/)(int64_t) override | Setzt die Länge des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den zugrunde liegenden Stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den zugrunde liegenden Stream. |
| [WriteByte](./writebyte/)(uint8_t) override | Schreibt den angegebenen vorzeichenlosen 8‑Bit‑Ganzzahlwert in den zugrunde liegenden Stream. |
| virtual [~BufferedStream](./~bufferedstream/)() | Destruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](../stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Siehe auch

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
