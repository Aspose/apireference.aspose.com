---
title: "System::IO::StreamWriter Klasse"
linktitle: "StreamWriter"
second_title: "Aspose.Font für C++"
description: "System::IO::StreamWriter Klasse. Stellt einen Writer dar, der Zeichen in einen Bytestream schreibt. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2300
url: /de/cpp/system.io/streamwriter/
---
## StreamWriter class


Stellt einen Writer dar, der Zeichen in einen Bytestream schreibt. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt den Stream und gibt erworbene Ressourcen frei. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei und schließt den zugrunde liegenden Stream. |
| [Flush](./flush/)() override | Spült den Inhalt des Puffers in den zugrunde liegenden Stream und spült anschließend den zugrunde liegenden Stream. |
| [get_AutoFlush](./get_autoflush/)() const | Gibt einen Wert zurück, der angibt, ob der [StreamWriter](./) die Daten bei jedem Aufruf der Methode [StreamWriter::Write](./write/) in den zugrunde liegenden Stream spült. |
| [get_BaseStream](./get_basestream/)() const | Gibt einen Shared Pointer auf ein Objekt zurück, das den zugrunde liegenden Stream repräsentiert. |
| [get_Encoding](./get_encoding/)() override | Gibt die aktuell verwendete Kodierung zurück. |
| [set_AutoFlush](./set_autoflush/)(bool) | Gibt einen Wert zurück, der festlegt, ob der [StreamWriter](./) die Daten bei jedem Aufruf der Methode [StreamWriter::Write](./write/) in den zugrunde liegenden Stream spülen soll. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | Konstruiert eine Instanz des [StreamWriter](./)-Objekts, das Zeichen in den angegebenen zugrunde liegenden Stream mit UTF-8-Kodierung und einem Puffer mit Standardgröße von 1024 Byte schreibt. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Konstruiert eine Instanz des [StreamWriter](./)-Objekts, das Zeichen in den angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer mit Standardgröße von 1024 Byte schreibt. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | Konstruiert eine Instanz des [StreamWriter](./)-Objekts, das Zeichen in den angegebenen zugrunde liegenden Stream mit der angegebenen Kodierung und einem Puffer der angegebenen Größe schreibt. Ein Parameter gibt an, ob der zugrunde liegende Stream geschlossen werden soll, wenn das [StreamWriter](./)-Objekt freigegeben wird. |
| [StreamWriter](./streamwriter/)(const String\&) | Konstruiert eine Instanz des [StreamWriter](./)-Objekts, das Zeichen in die angegebene Datei mit UTF-8-Kodierung und einem Puffer mit Standardgröße von 1024 Byte schreibt. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | Konstruiert eine Instanz des [StreamWriter](./)-Objekts, das Zeichen in die angegebene Datei mit der angegebenen Kodierung und einem Puffer mit Standardgröße von 1024 Byte schreibt. Ein Parameter gibt an, ob die Daten an die Datei angehängt oder die Datei überschrieben werden soll. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | Konstruiert eine Instanz des [StreamWriter](./)-Objekts, das Zeichen in die angegebene Datei mit der angegebenen Kodierung und Puffergröße schreibt. Ein Parameter gibt an, ob die Daten an die Datei angehängt oder die Datei überschrieben werden soll. |
| [Write](./write/)(char_t) override | Schreibt das angegebene Zeichen in den Stream. |
| [Write](./write/)(const String\&) override | Schreibt die angegebene Zeichenkette in den Stream. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Schreibt die Zeichenkettenrepräsentation des angegebenen Objekts in den Stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Schreibt alle Zeichen aus dem angegebenen Array in den Stream. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von UTF‑16‑Zeichen aus dem angegebenen Zeichenarray in den Stream. |
| [Write](./write/)(const char_t *) override | Schreibt die angegebene C‑Zeichenkette in den Stream. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | Schreibt die Zeichenkettenrepräsentation des angegebenen Objekts in den Stream. |
| [WriteLine](./writeline/)() override | Schreibt Zeilenabschlusszeichen in den Stream. |
| [WriteLine](./writeline/)(const String\&) override | Schreibt die angegebene Zeichenkette, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Schreibt die Zeichenkettenrepräsentation des angegebenen Objekts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Schreibt alle Zeichen aus dem angegebenen Array, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Schreibt den angegebenen Teilbereich von UTF-16-Zeichen aus dem angegebenen Zeichenarray, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| [WriteLine](./writeline/)(const char_t *) override | Schreibt die angegebene C‑Zeichenkette, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | Schreibt die Zeichenkettenrepräsentation des angegebenen Objekts, gefolgt von den Zeilenabschlusszeichen, in den Stream. |
| [~StreamWriter](./~streamwriter/)() | Destruktor. |
## Siehe auch

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
