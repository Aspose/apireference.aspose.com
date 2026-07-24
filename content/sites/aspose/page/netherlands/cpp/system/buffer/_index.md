---
title: "System::Buffer klasse"
linktitle: "Buffer"
second_title: "Aspose.Page voor C++"
description: "System::Buffer klasse. Bevat methoden die ruwe byte-arrays manipuleren. Dit is een statisch type zonder instantie-services. Je mag onder geen enkele omstandigheid een instantie ervan maken in C++."
type: docs
weight: 1000
url: /nl/cpp/system/buffer/
---
## Buffer class


Bevat methoden die ruwe byte‑arrays manipuleren. Dit is een statisch type zonder instantie‑services. Je mag nooit op welke manier dan ook instanties ervan maken.

```cpp
class Buffer
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | Kopieert een opgegeven aantal bytes van de bronbuffer naar de doelbuffer. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interpreteert twee opgegeven getypeerde arrays als ruwe byte-arrays en kopieert gegevens van de ene naar de andere. |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | Bepaalt het aantal bytes dat door alle elementen van de opgegeven array wordt ingenomen. |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | Bepaalt het aantal bytes dat door alle elementen van de opgegeven array wordt ingenomen. |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | Bepaalt het aantal bytes dat door alle elementen van de opgegeven array wordt ingenomen. |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | Interpreteert de opgegeven getypeerde array als een ruwe byte-array en haalt de byte-waarde op op de opgegeven byte-offset. |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | Interpreteert de opgegeven getypeerde array als een ruwe byte-array en haalt de byte-waarde op op de opgegeven byte-offset. |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | Interpreteert de opgegeven getypeerde array als een ruwe byte-array en haalt de byte-waarde op op de opgegeven byte-offset. |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | Interpreteert de opgegeven getypeerde array als een ruwe byte-array en zet de opgegeven byte-waarde op de opgegeven byte-offset. |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | Interpreteert de opgegeven getypeerde array als een ruwe byte-array en zet de opgegeven byte-waarde op de opgegeven byte-offset. |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | Interpreteert de opgegeven getypeerde array als een ruwe byte-array en zet de opgegeven byte-waarde op de opgegeven byte-offset. |
## Opmerkingen



```cpp
#include <system/buffer.h>

using namespace System;

void Print(const SmartPtr<Array<uint8_t>> &source, int size)
{
  for (auto i = 0; i < size; i++)
  {
    std::cout << static_cast<int>(source[i]) << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Maak en vul de array.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // Print de array-items.
  Print(first, SIZE);

  // Maak een array die een deel van de eerste bevat.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // Print de items van de tweede array.
  Print(second, SIZE / 2);

  // Stel de waarde van het item op index 0 in en print de array-items.
  Buffer::SetByte(second, 0, 128);
  Print(second, SIZE / 2);

  return 0;
}
/*
This code example produces the following output:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
16 18 20 22 24 26 28 30
128 18 20 22 24 26 28 30
*/
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
