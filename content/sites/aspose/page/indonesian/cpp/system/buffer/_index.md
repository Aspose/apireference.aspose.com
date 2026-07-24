---
title: "kelas System::Buffer"
linktitle: "Buffer"
second_title: "Aspose.Page untuk C++"
description: "System::Buffer class. Berisi metode yang memanipulasi array byte mentah. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun di C++."
type: docs
weight: 1000
url: /id/cpp/system/buffer/
---
## Buffer class


Berisi metode yang memanipulasi array byte mentah. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun.

```cpp
class Buffer
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | Menyalin sejumlah byte yang ditentukan dari buffer sumber ke buffer tujuan. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | Menginterpretasikan dua array bertipe yang ditentukan sebagai array byte mentah dan menyalin data dari salah satunya ke yang lain. |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | Menentukan jumlah byte yang ditempati oleh semua elemen dalam array yang ditentukan. |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | Menentukan jumlah byte yang ditempati oleh semua elemen dalam array yang ditentukan. |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | Menentukan jumlah byte yang ditempati oleh semua elemen dalam array yang ditentukan. |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan mengambil nilai byte pada offset byte yang ditentukan. |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan mengambil nilai byte pada offset byte yang ditentukan. |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan mengambil nilai byte pada offset byte yang ditentukan. |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan menetapkan nilai byte yang ditentukan pada offset byte yang ditentukan. |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan menetapkan nilai byte yang ditentukan pada offset byte yang ditentukan. |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan menetapkan nilai byte yang ditentukan pada offset byte yang ditentukan. |
## Catatan



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
  // Buat dan isi array.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // Cetak item array.
  Print(first, SIZE);

  // Buat array yang berisi bagian dari yang pertama.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // Cetak item array kedua.
  Print(second, SIZE / 2);

  // Setel nilai item pada indeks 0 dan cetak item array.
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

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
