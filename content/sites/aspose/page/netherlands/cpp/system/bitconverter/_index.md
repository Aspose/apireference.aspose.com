---
title: "System::BitConverter class"
linktitle: "BitConverter"
second_title: "Aspose.Page voor C++"
description: "System::BitConverter class. Bevat methoden die conversies uitvoeren van een reeks bytes naar een waardetype en omgekeerd. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken in C++."
type: docs
weight: 500
url: /nl/cpp/system/bitconverter/
---
## BitConverter class


Bevat methoden die conversies uitvoeren van een reeks bytes naar een waardetype en omgekeerd. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken.

```cpp
class BitConverter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | Geeft de endian‑volgorde van de huidige architectuur aan. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | Retourneert een 64‑bit geheel getal waarvan de binaire representatie gelijk is aan de binaire representatie van de opgegeven double‑precisie floating‑point‑waarde. |
| static [GetBytes](./getbytes/)(bool) | Converteert de opgegeven booleaanse waarde naar een byte‑array. |
| static [GetBytes](./getbytes/)(char_t) | Converteert de opgegeven char_t‑waarde naar een byte‑array. |
| static [GetBytes](./getbytes/)(int16_t) | Converteert de opgegeven 16‑bit gehele getalwaarde naar een byte‑array. |
| static [GetBytes](./getbytes/)(int) | Converteert de opgegeven 32‑bit gehele getalwaarde naar een byte‑array. |
| static [GetBytes](./getbytes/)(int64_t) | Converteert de opgegeven 64‑bit gehele getalwaarde naar een byte‑array. |
| static [GetBytes](./getbytes/)(uint16_t) | Converteert de opgegeven unsigned 16-bit integerwaarde naar een array van bytes. |
| static [GetBytes](./getbytes/)(uint32_t) | Converteert de opgegeven unsigned 32-bit integerwaarde naar een array van bytes. |
| static [GetBytes](./getbytes/)(uint64_t) | Converteert de opgegeven unsigned 64-bit integerwaarde naar een array van bytes. |
| static [GetBytes](./getbytes/)(float) | Converteert de opgegeven single-precision floating-pointwaarde naar een array van bytes. |
| static [GetBytes](./getbytes/)(double) | Converteert de opgegeven double-precision floating-pointwaarde naar een array van bytes. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | Retourneert een double-precision floating-pointwaarde waarvan de waarde gelijk is aan value. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert één byte uit de opgegeven array, beginnend op de opgegeven index, naar een booleanwaarde. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert één byte uit de opgegeven array, beginnend op de opgegeven index, naar een booleanwaarde. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert twee bytes uit de opgegeven array, beginnend op de opgegeven index, naar een char_t-waarde. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert twee bytes uit de opgegeven array, beginnend op de opgegeven index, naar een char_t-waarde. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert acht bytes uit de opgegeven array, beginnend op de opgegeven index, naar een double-precision floating-pointwaarde. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert acht bytes uit de opgegeven array, beginnend op de opgegeven index, naar een double-precision floating-pointwaarde. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert twee bytes uit de opgegeven array, beginnend op de opgegeven index, naar een 16-bit integerwaarde. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert twee bytes uit de opgegeven array, beginnend op de opgegeven index, naar een 16-bit integerwaarde. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert vier bytes uit de opgegeven array, beginnend op de opgegeven index, naar een 32-bit integerwaarde. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert vier bytes uit de opgegeven array, beginnend op de opgegeven index, naar een 32-bit integerwaarde. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert acht bytes uit de opgegeven array, beginnend op de opgegeven index, naar een 64-bit integerwaarde. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert acht bytes uit de opgegeven array, beginnend op de opgegeven index, naar een 64-bit integerwaarde. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert vier bytes uit de opgegeven array, beginnend op de opgegeven index, naar een single-precision floating-pointwaarde. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert vier bytes uit de opgegeven array, beginnend op de opgegeven index, naar een single-precision floating-pointwaarde. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | Converteert alle waarden van de opgegeven byte-array naar hun hexadecimale tekenreeksrepresentatie. Hoofdlettergebruik voor letters in de hexadecimale notatie en de scheidingsteken dat tussen elk paar aangrenzende bytes wordt ingevoegd, worden gespecificeerd via de overeenkomstige argumenten. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | Converteert waarden van de opgegeven byte-array naar hun hexadecimale tekenreeksrepresentatie, beginnend op de opgegeven index. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | Converteert een bereik van waarden van de opgegeven byte-array naar hun hexadecimale tekenreeksrepresentatie. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert twee bytes uit de opgegeven array, beginnend op de opgegeven index, naar een unsigned 16-bit integerwaarde. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert twee bytes uit de opgegeven array, beginnend op de opgegeven index, naar een unsigned 16-bit integerwaarde. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert vier bytes uit de opgegeven array, beginnend op de opgegeven index, naar een unsigned 32-bit integerwaarde. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert vier bytes uit de opgegeven array, beginnend op de opgegeven index, naar een unsigned 32-bit integerwaarde. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Converteert acht bytes uit de opgegeven array, beginnend op de opgegeven index, naar een unsigned 64-bit integerwaarde. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Converteert acht bytes uit de opgegeven array, beginnend op de opgegeven index, naar een unsigned 64-bit integerwaarde. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | Geeft de endian-orde van de huidige architectuur aan. true als de architectuur little endian is, anders false. |
## Opmerkingen



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
  // Maak waarden aan om af te drukken.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // Druk de waarde en zijn bytes af.
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

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
