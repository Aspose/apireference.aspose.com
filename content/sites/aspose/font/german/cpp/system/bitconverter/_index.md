---
title: "System::BitConverter Klasse"
linktitle: "BitConverter"
second_title: "Aspose.Font für C++"
description: "System::BitConverter Klasse. Enthält Methoden, die Konvertierungen einer Bytefolge zu einem Werttyp und umgekehrt durchführen. Es handelt sich um einen statischen Typ ohne Instanzdienste. Sie sollten unter keinen Umständen Instanzen davon in C++ erstellen."
type: docs
weight: 500
url: /de/cpp/system/bitconverter/
---
## BitConverter class


Enthält Methoden, die Konvertierungen einer Sequenz von Bytes zu einem Werttyp und umgekehrt durchführen. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class BitConverter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | Gibt die Endianness der aktuellen Architektur an. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | Gibt einen 64‑Bit‑Ganzzahlwert zurück, dessen Binärdarstellung der Binärdarstellung des angegebenen double‑Precision‑Gleitkommawerts entspricht. |
| static [GetBytes](./getbytes/)(bool) | Konvertiert den angegebenen booleschen Wert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(char_t) | Konvertiert den angegebenen char_t‑Wert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(int16_t) | Konvertiert den angegebenen 16‑Bit‑Ganzzahlwert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(int) | Konvertiert den angegebenen 32‑Bit‑Ganzzahlwert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(int64_t) | Konvertiert den angegebenen 64‑Bit‑Ganzzahlwert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(uint16_t) | Konvertiert den angegebenen vorzeichenlosen 16‑Bit‑Ganzzahlwert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(uint32_t) | Konvertiert den angegebenen vorzeichenlosen 32‑Bit‑Ganzzahlwert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(uint64_t) | Konvertiert den angegebenen vorzeichenlosen 64‑Bit‑Ganzzahlwert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(float) | Konvertiert den angegebenen single‑Precision‑Gleitkommawert in ein Byte‑Array. |
| static [GetBytes](./getbytes/)(double) | Konvertiert den angegebenen double‑Precision‑Gleitkommawert in ein Byte‑Array. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | Gibt einen double‑Precision‑Gleitkommawert zurück, dessen Wert dem Wert entspricht. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert ein Byte aus dem angegebenen Array, beginnend am angegebenen Index, in einen booleschen Wert. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert ein Byte aus dem angegebenen Array, beginnend am angegebenen Index, in einen booleschen Wert. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert zwei Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen char_t-Wert. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert zwei Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen char_t-Wert. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert acht Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen double-precision Gleitkommawert. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert acht Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen double-precision Gleitkommawert. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert zwei Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen 16-bit Integerwert. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert zwei Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen 16-bit Integerwert. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert vier Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen 32-bit Integerwert. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert vier Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen 32-bit Integerwert. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert acht Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen 64-bit Integerwert. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert acht Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen 64-bit Integerwert. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert vier Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen single-precision Gleitkommawert. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert vier Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen single-precision Gleitkommawert. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | Konvertiert alle Werte des angegebenen Byte-Arrays in deren hexadezimale Zeichenkettenrepräsentation. Groß-/Kleinschreibung der Buchstaben in der hexadezimalen Notation und das zwischen benachbarten Bytes eingefügte Trennzeichen werden über die entsprechenden Argumente festgelegt. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | Konvertiert Werte des angegebenen Byte-Arrays in deren hexadezimale Zeichenkettenrepräsentation, beginnend am angegebenen Index. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | Konvertiert einen Wertebereich des angegebenen Byte-Arrays in deren hexadezimale Zeichenkettenrepräsentation. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert zwei Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen vorzeichenlosen 16-bit Integerwert. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert zwei Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen vorzeichenlosen 16-bit Integerwert. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert vier Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen vorzeichenlosen 32-bit Integerwert. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert vier Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen vorzeichenlosen 32-bit Integerwert. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Konvertiert acht Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen vorzeichenlosen 64-bit Integerwert. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Konvertiert acht Bytes aus dem angegebenen Array, beginnend am angegebenen Index, in einen vorzeichenlosen 64-bit Integerwert. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | Gibt die Endianness der aktuellen Architektur an. true, wenn die Architektur little endian ist, sonst false. |
## Hinweise



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // Erstelle Werte zum Ausgeben.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // Gib den Wert und seine Bytes aus.
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
