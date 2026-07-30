---
title: "System::IO::BinaryReader Klasse"
linktitle: "BinaryReader"
second_title: "Aspose.Font für C++"
description: "System::IO::BinaryReader Klasse. Stellt einen Leser dar, der primitive Datentypen als Binärdaten in einer bestimmten Kodierung liest. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 800
url: /de/cpp/system.io/binaryreader/
---
## BinaryReader class


Stellt einen Leser dar, der primitive Datentypen als Binärdaten in einer bestimmten Kodierung liest. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class BinaryReader : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | Konstruiert eine Instanz der [BinaryReader](./) Klasse, die Daten aus dem angegebenen Stream mit UTF-8-Kodierung liest. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Konstruiert eine Instanz der [BinaryReader](./) Klasse, die Daten aus dem angegebenen Stream mit der angegebenen Kodierung liest. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | Konstruiert eine Instanz der [BinaryReader](./) Klasse, die Daten aus dem angegebenen Stream mit der angegebenen Kodierung liest. |
| virtual [Close](./close/)() | Schließt das aktuelle [BinaryReader](./) Objekt und den zugrunde liegenden Eingabestream. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei und schließt den zugrunde liegenden Stream. |
| virtual [get_BaseStream](./get_basestream/)() | Gibt den Eingabestream zurück. |
| virtual [PeekChar](./peekchar/)() | Liest ein einzelnes Zeichen aus dem Eingabestream, ohne den Lesekursor des Streams zu verändern. |
| virtual [Read](./read/)() | Liest ein einzelnes Zeichen aus dem Eingabestream. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | Liest die angegebene Anzahl von Bytes aus dem Eingabestream und schreibt sie in das angegebene Byte-Array. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Liest die angegebene Anzahl von Zeichen aus dem Eingabestream, konvertiert sie in UTF-16-Kodierung und schreibt die resultierenden UTF-16-Zeichen in das angegebene Zeichen-Array, beginnend an der angegebenen Position. |
| virtual [ReadBoolean](./readboolean/)() | Liest ein einzelnes Byte aus dem Eingabestream und gibt dessen boolesche Darstellung zurück. |
| virtual [ReadByte](./readbyte/)() | Liest ein einzelnes Byte aus dem Eingabestream. |
| virtual [ReadBytes](./readbytes/)(int) | Liest die angegebene Anzahl von Bytes aus dem Eingabestream. |
| virtual [ReadChar](./readchar/)() | Liest ein einzelnes Zeichen aus dem Eingabestream. |
| virtual [ReadChars](./readchars/)(int) | Liest die angegebene Anzahl von Zeichen aus dem Eingabestream und gibt sie in UTF-16-Kodierung zurück. |
| virtual [ReadDecimal](./readdecimal/)() | NICHT IMPLEMENTIERT. |
| virtual [ReadDouble](./readdouble/)() | Liest 8 Bytes aus dem Eingabestream und gibt sie als double‑Präzisions‑Gleitkommawert zurück. |
| virtual [ReadInt16](./readint16/)() | Liest 2 Bytes aus dem Eingabestream und gibt sie als 16‑Bit‑Ganzzahlwert zurück. |
| virtual [ReadInt32](./readint32/)() | Liest 4 Bytes aus dem Eingabestream und gibt sie als 32‑Bit‑Ganzzahlwert zurück. |
| virtual [ReadInt64](./readint64/)() | Liest 8 Bytes aus dem Eingabestream und gibt sie als 64‑Bit‑Ganzzahlwert zurück. |
| virtual [ReadSByte](./readsbyte/)() | Liest ein einzelnes Byte aus dem Eingabestream und gibt es als vorzeichenbehafteten 8‑Bit‑Ganzzahlwert zurück. |
| virtual [ReadSingle](./readsingle/)() | Liest 4 Bytes aus dem Eingabestream und gibt sie als single‑Präzisions‑Gleitkommawert zurück. |
| virtual [ReadString](./readstring/)() | Liest einen String aus dem aktuellen Stream. Der String ist mit der Länge vorangestellt, die als Integer sieben Bits gleichzeitig codiert wird. |
| virtual [ReadUInt16](./readuint16/)() | Liest 2 Bytes aus dem Eingabestream und gibt sie als unsigned 16‑Bit‑Integer‑Wert zurück. |
| virtual [ReadUInt32](./readuint32/)() | Liest 4 Bytes aus dem Eingabestream und gibt sie als unsigned 32‑Bit‑Integer‑Wert zurück. |
| virtual [ReadUInt64](./readuint64/)() | Liest 8 Bytes aus dem Eingabestream und gibt sie als unsigned 64‑Bit‑Integer‑Wert zurück. |
| virtual [~BinaryReader](./~binaryreader/)() | Destruktor. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
