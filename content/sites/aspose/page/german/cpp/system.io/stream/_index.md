---
title: "System::IO::Stream Klasse"
linktitle: "Stream"
second_title: "Aspose.Page für C++"
description: "System::IO::Stream Klasse. Eine Basisklasse für verschiedene Stream‑Implementierungen. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2100
url: /de/cpp/system.io/stream/
---
## Stream class


Eine Basisklasse für verschiedene Stream‑Implementierungen. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Stream : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Startet eine asynchrone Leseoperation. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | Startet eine asynchrone Schreiboperation. |
| virtual [Close](./close/)() | Schließt den Stream. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | Kopiert Bytes in den angegebenen Stream. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | Kopiert Bytes in den angegebenen Stream, wobei die angegebene Puffergröße verwendet wird. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei und schließt den Stream. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | Wartet, bis die angegebene asynchrone Leseoperation abgeschlossen ist. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | Beendet eine asynchrone Schreiboperation. Wartet, bis die angegebene asynchrone Schreiboperation abgeschlossen ist. |
| virtual [Flush](./flush/)() | Leert die Puffer dieses Streams und schreibt alle gepufferten Daten in den zugrunde liegenden Speicher. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | Leert asynchron alle Puffer dieses Streams, bewirkt, dass gepufferte Daten in das zugrunde liegende Gerät geschrieben werden, und überwacht Abbruchanforderungen. |
| [FlushAsync](./flushasync/)() | Leert asynchron alle Puffer dieses Streams, bewirkt, dass gepufferte Daten in das zugrunde liegende Gerät geschrieben werden, und überwacht Abbruchanforderungen. |
| virtual [get_CanRead](./get_canread/)() const | Bestimmt, ob der Stream lesbar ist. |
| virtual [get_CanSeek](./get_canseek/)() const | Bestimmt, ob der Stream das Suchen unterstützt. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | Ermittelt einen Wert, der bestimmt, ob der aktuelle Stream zeitlich begrenzt werden kann. |
| virtual [get_CanWrite](./get_canwrite/)() const | Bestimmt, ob der Stream schreibbar ist. |
| virtual [get_Length](./get_length/)() const | Gibt die Länge des Streams in Bytes zurück. |
| virtual [get_Position](./get_position/)() const | Gibt die aktuelle Position des Streams zurück. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | Ermittelt einen Wert in Millisekunden, der bestimmt, wie lange der Stream versucht zu lesen, bevor ein Timeout eintritt. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | Ermittelt einen Wert in Millisekunden, der bestimmt, wie lange der Stream versucht zu schreiben, bevor ein Timeout eintritt. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte‑Array. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte‑Array. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Liest die angegebene Anzahl von Bytes aus dem Stream und schreibt sie in das angegebene Byte‑Array. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Liest asynchron eine Sequenz von Bytes aus dem aktuellen Stream, verschiebt die Position im Stream um die gelesene Anzahl von Bytes und überwacht Abbruchanforderungen. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Liest asynchron eine Sequenz von Bytes aus dem aktuellen Stream, verschiebt die Position im Stream um die gelesene Anzahl von Bytes und überwacht Abbruchanforderungen. |
| virtual [ReadByte](./readbyte/)() | Liest ein einzelnes Byte aus dem Stream und gibt einen 32‑Bit‑Ganzzahlwert zurück, der dem Wert des gelesenen Bytes entspricht. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | Setzt die Position des Streams, der durch das aktuelle Objekt repräsentiert wird. |
| virtual [set_Position](./set_position/)(int64_t) | Setzt die Position des Streams. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | Setzt einen Wert, der bestimmt, ob der aktuelle Stream ein Timeout auslösen kann. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | Setzt einen Wert in Millisekunden, der bestimmt, wie lange der Stream versucht zu lesen, bevor ein Timeout eintritt. |
| virtual [SetLength](./setlength/)(int64_t) | Setzt die Länge des Streams, der durch das aktuelle Objekt repräsentiert wird. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Stream. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | Schreibt asynchron eine Sequenz von Bytes in den aktuellen Stream, verschiebt die aktuelle Position in diesem Stream um die geschriebene Anzahl von Bytes und überwacht Abbruchanforderungen. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Schreibt asynchron eine Sequenz von Bytes in den aktuellen Stream, verschiebt die aktuelle Position in diesem Stream um die geschriebene Anzahl von Bytes und überwacht Abbruchanforderungen. |
| virtual [WriteByte](./writebyte/)(uint8_t) | Schreibt den angegebenen vorzeichenlosen 8‑Bit‑Ganzzahlwert in den Stream. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Null](./null/) | Ein Stream ohne zugrunde liegenden Speicher. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf diese Klasse. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
