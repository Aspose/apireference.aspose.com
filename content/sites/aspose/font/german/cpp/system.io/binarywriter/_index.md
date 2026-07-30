---
title: "System::IO::BinaryWriter Klasse"
linktitle: "BinaryWriter"
second_title: "Aspose.Font für C++"
description: "System::IO::BinaryWriter Klasse. Stellt einen Writer dar, der Werte primitiver Typen in einen Bytestream schreibt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.io/binarywriter/
---
## BinaryWriter class


Stellt einen Writer dar, der Werte primitiver Typen in einen Bytestream schreibt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class BinaryWriter : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | Konstruiert eine Instanz der Klasse [BinaryWriter](./), die Daten in den angegebenen Stream unter Verwendung der angegebenen Kodierung schreibt. |
| [Close](./close/)() | Schließt das aktuelle [BinaryWriter](./) Objekt und den zugrunde liegenden Ausgabestream. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei und schließt den zugrunde liegenden Stream. |
| [Flush](./flush/)() | Spült den Ausgabestream. |
| [get_BaseStream](./get_basestream/)() | Gibt den Ausgabestream zurück. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Setzt die Position des Streams, die durch das aktuelle Objekt repräsentiert wird. |
| virtual [Write](./write/)(uint8_t) | Schreibt den angegebenen unsigned 8‑Bit‑Integer‑Wert in den Ausgabestream. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Schreibt den angegebenen Teilbereich von Bytes aus dem angegebenen Byte‑Array in den Ausgabestream. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Schreibt den angegebenen Teilbereich von UTF‑16‑Zeichen aus dem angegebenen Zeichenarray in den Ausgabestream. |
| virtual [Write](./write/)(bool) | Schreibt ein einzelnes Byte mit dem Wert 0, wenn **value** 'true' ist, und 1, wenn **value** 'false' ist, in den Ausgabestream. |
| virtual [Write](./write/)(char16_t) | Schreibt den angegebenen 16‑Bit‑Wide‑Character‑Wert in den Ausgabestream. |
| virtual [Write](./write/)(int16_t) | Schreibt den angegebenen 16‑Bit‑Integer‑Wert in den Ausgabestream. |
| virtual [Write](./write/)(int) | Schreibt den angegebenen 32‑Bit‑Integer‑Wert in den Ausgabestream. |
| virtual [Write](./write/)(int64_t) | Schreibt den angegebenen 64‑Bit‑Integer‑Wert in den Ausgabestream. |
| virtual [Write](./write/)(uint16_t) | Schreibt den angegebenen vorzeichenlosen 16‑Bit‑Integer‑Wert in den Ausgabestream. |
| virtual [Write](./write/)(uint32_t) | Schreibt den angegebenen vorzeichenlosen 32‑Bit‑Integer‑Wert in den Ausgabestream. |
| virtual [Write](./write/)(uint64_t) | Schreibt den angegebenen vorzeichenlosen 64‑Bit‑Integer‑Wert in den Ausgabestream. |
| virtual [Write](./write/)(float) | Schreibt den angegebenen Gleitkommawert einfacher Genauigkeit in den Ausgabestream. |
| virtual [Write](./write/)(double) | Schreibt den angegebenen Gleitkommawert doppelter Genauigkeit in den Ausgabestream. |
| virtual [Write](./write/)(const Decimal\&) | Schreibt die Byte‑Darstellung des angegebenen [Decimal](../../system/decimal/) Werts in den Ausgabestream. |
| virtual [Write](./write/)(const String\&) | Schreibt einen Längen‑vorangestellten String in der aktuellen Kodierung in den Ausgabestream. |
| virtual [Write](./write/)(const char_t *) | Schreibt einen Längen‑vorangestellten String in der aktuellen Kodierung in den Ausgabestream. |
| [~BinaryWriter](./~binarywriter/)() | Destruktor. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
