---
title: "System::IO::FileStream Klasse"
linktitle: "FileStream"
second_title: "Aspose.Font für C++"
description: "System::IO::FileStream class. Stellt einen Dateistream dar, der synchrones und asynchrones Lesen und Schreiben unterstützt. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1500
url: /de/cpp/system.io/filestream/
---
## FileStream class


Stellt einen Dateistream dar, der synchrones und asynchrones Lesen und Schreiben unterstützt. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class FileStream : public System::IO::Stream
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt das aktuelle [FileStream](./)-Objekt. |
| [FileStream](./filestream/)(const String\&, FileMode) | Konstruiert eine neue Instanz der [FileStream](./)-Klasse und initialisiert sie mit den angegebenen Parametern. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | Konstruiert eine neue Instanz der [FileStream](./)-Klasse und initialisiert sie mit den angegebenen Parametern. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | Konstruiert eine neue Instanz der [FileStream](./)-Klasse und initialisiert sie mit den angegebenen Parametern. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | Leert die Puffer dieses Streams und schreibt alle gepufferten Daten in die zugrunde liegende Datei. |
| [Flush](./flush/)(bool) | Leert die Puffer dieses Streams und schreibt alle gepufferten Daten in die zugrunde liegende Datei. Synonym für die Methode [Flush()](./flush/). |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | Löscht asynchron alle Puffer für diesen Stream, sorgt dafür, dass gepufferte Daten in das zugrunde liegende Gerät geschrieben werden, und überwacht Abbruchanforderungen. |
| [get_CanRead](./get_canread/)() const override | Bestimmt, ob der Stream lesbar ist. |
| [get_CanSeek](./get_canseek/)() const override | Bestimmt, ob der Stream das Suchen unterstützt. |
| [get_CanWrite](./get_canwrite/)() const override | Bestimmt, ob der Stream beschreibbar ist. |
| [get_Length](./get_length/)() const override | Gibt die Länge des Streams in Bytes zurück. |
| [get_Name](./get_name/)() const | Gibt den Namen der Datei zurück, die vom aktuellen [FileStream](./)-Objekt gekapselt wird. |
| [get_Position](./get_position/)() const override | Gibt die aktuelle Position des Streams zurück. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte-Array. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Liest asynchron eine Sequenz von Bytes aus dem aktuellen Stream, verschiebt die Position im Stream um die gelesene Anzahl von Bytes und überwacht Abbruchanforderungen. |
| [ReadByte](./readbyte/)() override | Liest ein einzelnes Byte aus dem Stream und gibt einen 32‑Bit‑Integer‑Wert zurück, der dem Wert des gelesenen Bytes entspricht. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | Setzt die Position des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [set_Position](./set_position/)(int64_t) override | Spült den Stream und setzt anschließend die Position des Streams. |
| [SetLength](./setlength/)(int64_t) override | Setzt die Länge des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Stream. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | Schreibt asynchron eine Sequenz von Bytes in den aktuellen Stream, verschiebt die aktuelle Position in diesem Stream um die geschriebene Anzahl von Bytes und überwacht Abbruchanforderungen. |
| [WriteByte](./writebyte/)(uint8_t) override | Schreibt den angegebenen unsigned 8‑Bit‑Integer‑Wert in den Stream. |
| [~FileStream](./~filestream/)() | Destruktor. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | Standardwert für die Anzahl der während Lese- und Schreibvorgängen gepufferten Bytes. |
| static [Null](../stream/null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Siehe auch

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
