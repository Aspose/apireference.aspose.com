---
title: "System::IO::BinaryWriter Klasse"
linktitle: "BinaryWriter"
second_title: "Aspose.Page für C++"
description: "System::IO::BinaryWriter Klasse. Stellt einen Writer dar, der Werte primitiver Typen in einen Bytestream schreibt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mittels operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.io/binarywriter/
---
## BinaryWriter class


Stellt einen Writer dar, der Werte primitiver Typen in einen Bytestream schreibt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mittels operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class BinaryWriter : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | Erstellt eine Instanz der [BinaryWriter](./) Klasse, die Daten in den angegebenen Stream unter Verwendung der angegebenen Kodierung schreibt. |
| [Close](./close/)() | Schließt das aktuelle [BinaryWriter](./) Objekt und den zugrunde liegenden Ausgabestream. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt genutzten Ressourcen frei und schließt den zugrunde liegenden Stream. |
| [Flush](./flush/)() | Leert den Ausgabestream. |
| [get_BaseStream](./get_basestream/)() | Gibt den Ausgabestream zurück. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Setzt die Position des Streams, der durch das aktuelle Objekt repräsentiert wird. |
| virtual [Write](./write/)(uint8_t) | Schreibt den angegebenen vorzeichenlosen 8-bit Ganzzahlwert in den Ausgabestream. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte-Array in den Ausgabestream. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Schreibt den angegebenen Teilbereich von UTF-16-Zeichen aus dem angegebenen Zeichen-Array in den Ausgabestream. |
| virtual [Write](./write/)(bool) | Schreibt ein einzelnes Byte mit dem Wert 0, wenn **value** 'true' ist, und 1, wenn **value** 'false' ist, in den Ausgabestream. |
| virtual [Write](./write/)(char16_t) | Schreibt den angegebenen 16-bit Breitzeichenwert in den Ausgabestream. |
| virtual [Write](./write/)(int16_t) | Schreibt den angegebenen 16-bit Ganzzahlwert in den Ausgabestream. |
| virtual [Write](./write/)(int) | Schreibt den angegebenen 32-bit Ganzzahlwert in den Ausgabestream. |
| virtual [Write](./write/)(int64_t) | Schreibt den angegebenen 64-bit Ganzzahlwert in den Ausgabestream. |
| virtual [Write](./write/)(uint16_t) | Schreibt den angegebenen vorzeichenlosen 16-bit Ganzzahlwert in den Ausgabestream. |
| virtual [Write](./write/)(uint32_t) | Schreibt den angegebenen vorzeichenlosen 32-bit Ganzzahlwert in den Ausgabestream. |
| virtual [Write](./write/)(uint64_t) | Schreibt den angegebenen vorzeichenlosen 64-bit Ganzzahlwert in den Ausgabestream. |
| virtual [Write](./write/)(float) | Schreibt den angegebenen einfachgenauen Gleitkommawert in den Ausgabestream. |
| virtual [Write](./write/)(double) | Schreibt den angegebenen doppeltgenauen Gleitkommawert in den Ausgabestream. |
| virtual [Write](./write/)(const Decimal\&) | Schreibt die Byte-Darstellung des angegebenen [Decimal](../../system/decimal/) Werts in den Ausgabestream. |
| virtual [Write](./write/)(const String\&) | Schreibt einen Längen-präfixierten String in der aktuellen Kodierung in den Ausgabestream. |
| virtual [Write](./write/)(const char_t *) | Schreibt einen Längen-präfixierten String in der aktuellen Kodierung in den Ausgabestream. |
| [~BinaryWriter](./~binarywriter/)() | Destruktor. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
