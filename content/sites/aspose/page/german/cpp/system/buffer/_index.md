---
title: "System::Buffer-Klasse"
linktitle: "Puffer"
second_title: "Aspose.Page für C++"
description: "System::Buffer Klasse. Enthält Methoden, die rohe Byte-Arrays manipulieren. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise in C++ erstellen."
type: docs
weight: 1000
url: /de/cpp/system/buffer/
---
## Buffer class


Enthält Methoden, die rohe Byte‑Arrays manipulieren. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class Buffer
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | Kopiert eine angegebene Anzahl von Bytes vom Quellpuffer zum Zielpuffer. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Interpretiert zwei angegebene typisierte Arrays als rohe Byte-Arrays und kopiert Daten von einem zum anderen. |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | Bestimmt die Anzahl der Bytes, die von allen Elementen des angegebenen Arrays belegt werden. |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | Bestimmt die Anzahl der Bytes, die von allen Elementen des angegebenen Arrays belegt werden. |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | Bestimmt die Anzahl der Bytes, die von allen Elementen des angegebenen Arrays belegt werden. |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | Interpretiert das angegebene typisierte Array als rohes Byte-Array und ruft den Byte-Wert an dem angegebenen Byte-Offset ab. |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | Interpretiert das angegebene typisierte Array als rohes Byte-Array und ruft den Byte-Wert an dem angegebenen Byte-Offset ab. |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | Interpretiert das angegebene typisierte Array als rohes Byte-Array und ruft den Byte-Wert an dem angegebenen Byte-Offset ab. |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | Interpretiert das angegebene typisierte Array als rohes Byte-Array und setzt den angegebenen Byte-Wert am angegebenen Byte-Offset. |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | Interpretiert das angegebene typisierte Array als rohes Byte-Array und setzt den angegebenen Byte-Wert am angegebenen Byte-Offset. |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | Interpretiert das angegebene typisierte Array als rohes Byte-Array und setzt den angegebenen Byte-Wert am angegebenen Byte-Offset. |
## Hinweise



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
  // Erstelle und fülle das Array.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // Gib die Array-Elemente aus.
  Print(first, SIZE);

  // Erstelle ein Array, das einen Teil des ersten enthält.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // Gib die Elemente des zweiten Arrays aus.
  Print(second, SIZE / 2);

  // Setze den Wert des Elements bei Index 0 und gib die Array-Elemente aus.
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

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
