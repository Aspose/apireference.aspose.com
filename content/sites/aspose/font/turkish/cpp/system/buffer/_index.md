---
title: "System::Buffer sınıfı"
linktitle: "Buffer"
second_title: "Aspose.Font için C++"
description: "System::Buffer sınıfı. Ham bayt dizilerini işleyen yöntemler içerir. Bu, örnek hizmeti olmayan statik bir türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmamalısınız."
type: docs
weight: 1000
url: /tr/cpp/system/buffer/
---
## Buffer class


Ham bayt dizilerini işleyen yöntemler içerir. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmamalısınız.

```cpp
class Buffer
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | Belirtilen sayıda baytı kaynak tampondan hedef tamponuna kopyalar. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve birinden diğerine veri kopyalar. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve birinden diğerine veri kopyalar. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve birinden diğerine veri kopyalar. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve birinden diğerine veri kopyalar. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve birinden diğerine veri kopyalar. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve birinden diğerine veri kopyalar. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | İki belirtilen tipli diziyi ham bayt dizileri olarak yorumlar ve birinden diğerine veri kopyalar. |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | Belirtilen dizinin tüm elemanları tarafından kullanılan bayt sayısını belirler. |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | Belirtilen dizinin tüm elemanları tarafından kullanılan bayt sayısını belirler. |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | Belirtilen dizinin tüm elemanları tarafından kullanılan bayt sayısını belirler. |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri alınır. |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri alınır. |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri alınır. |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri ayarlanır. |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri ayarlanır. |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri ayarlanır. |
## Açıklamalar



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
  // Diziyi oluştur ve doldur.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // Dizi öğelerini yazdır.
  Print(first, SIZE);

  // İlk dizinin bir kısmını içeren bir dizi oluştur.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // İkinci dizinin öğelerini yazdır.
  Print(second, SIZE / 2);

  // 0. indeksteki öğenin değerini ayarla ve dizi öğelerini yazdır.
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

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
