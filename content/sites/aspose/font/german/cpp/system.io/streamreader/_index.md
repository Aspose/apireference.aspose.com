---
title: "System::IO::StreamReader‑Klasse"
linktitle: "StreamReader"
second_title: "Aspose.Font für C++"
description: "System::IO::StreamReader‑Klasse. Stellt einen Leser dar, der Zeichen aus einem Bytestrom liest. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2200
url: /de/cpp/system.io/streamreader/
---
## StreamReader class


Stellt einen Leser dar, der Zeichen aus einem Bytestrom liest. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StreamReader : public System::IO::TextReader
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt die aktuellen und zugrunde liegenden Streams. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei und schließt den zugrunde liegenden Stream. |
| [get_BaseStream](./get_basestream/)() const | Gibt einen Shared Pointer auf ein Objekt zurück, das den zugrunde liegenden Stream repräsentiert. |
| [get_CurrentEncoding](./get_currentencoding/)() | Gibt die aktuell verwendete Kodierung zurück. |
| [get_EndOfStream](./get_endofstream/)() | Gibt einen Wert zurück, der angibt, ob das Ende des Streams erreicht wurde. |
| [Peek](./peek/)() override | Liest ein einzelnes Zeichen aus dem Stream, ohne den Lesekursor des Streams zu verändern. |
| [Read](./read/)() override | Liest ein einzelnes Zeichen aus dem Stream. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Liest die angegebene Anzahl von Zeichen aus dem Stream, konvertiert sie in die UTF‑16‑Kodierung und schreibt die resultierenden UTF‑16‑Zeichen in das angegebene Zeichenarray, beginnend an der angegebenen Position. |
| [ReadLine](./readline/)() override | Liest Zeichen aus dem Stream bis zum Ende der aktuellen Zeile. |
| [ReadToEnd](./readtoend/)() override | Liest Zeichen aus dem Stream bis zum Ende des Streams. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit UTF‑8‑Kodierung und einem Puffer mit Standardgröße von 1024 Byte liest. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit UTF‑8‑Kodierung und einem Puffer mit Standardgröße von 1024 Byte liest. Ein Parameter gibt an, ob die Erkennung von Byte‑Order‑Markierungen aktiviert werden soll. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer mit Standardgröße von 1024 Byte liest. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer mit Standardgröße von 1024 Byte liest. Ein Parameter gibt an, ob die Erkennung von Byte‑Order‑Markierungen aktiviert werden soll. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer der angegebenen Größe liest. Ein Parameter gibt an, ob die Erkennung von Byte‑Order‑Markierungen aktiviert werden soll. |
| [StreamReader](./streamreader/)(const System::String\&) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus der angegebenen Datei mit UTF‑8‑Kodierung und einem Puffer mit Standardgröße von 4096 Byte liest. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus der angegebenen Datei mit UTF‑8‑Kodierung und einem Puffer mit Standardgröße von 4096 Byte liest. Ein Parameter gibt an, ob die Erkennung von Byte‑Order‑Markierungen aktiviert werden soll. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus der angegebenen Datei mit der angegebenen Kodierung und einem Puffer mit Standardgröße von 4096 Byte liest. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus dem angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer mit Standardgröße von 4096 Byte liest. Ein Parameter gibt an, ob die Erkennung von Byte‑Order‑Markierungen aktiviert werden soll. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | Erstellt eine Instanz des [StreamReader](./)-Objekts, das Zeichen aus der angegebenen Datei mit der angegebenen Kodierung und einem Puffer der angegebenen Größe liest. Ein Parameter gibt an, ob die Erkennung von Byte‑Order‑Markierungen aktiviert werden soll. |
| [~StreamReader](./~streamreader/)() | Destruktor. |
## Siehe auch

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
