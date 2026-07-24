---
title: "System::BitConverter class"
linktitle: "BitConverter"
second_title: "Aspose.Page untuk C++"
description: "System::BitConverter class. Berisi metode-metode yang melakukan konversi urutan byte ke tipe nilai dan sebaliknya. Ini adalah tipe statis tanpa layanan instansi. Anda tidak boleh membuat instance darinya dengan cara apapun dalam C++."
type: docs
weight: 500
url: /id/cpp/system/bitconverter/
---
## BitConverter class


Berisi metode yang melakukan konversi urutan byte ke tipe nilai dan sebaliknya. Ini adalah tipe statis tanpa layanan instance. Anda tidak boleh pernah membuat instance darinya dengan cara apapun.

```cpp
class BitConverter
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | Menunjukkan endianitas arsitektur saat ini. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | Mengembalikan nilai integer 64-bit yang representasi binernya sama dengan representasi biner dari nilai floating point double-precision yang ditentukan. |
| static [GetBytes](./getbytes/)(bool) | Mengonversi nilai boolean yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(char_t) | Mengonversi nilai char_t yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(int16_t) | Mengonversi nilai integer 16-bit yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(int) | Mengonversi nilai integer 32-bit yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(int64_t) | Mengonversi nilai integer 64-bit yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(uint16_t) | Mengonversi nilai integer tak bertanda 16-bit yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(uint32_t) | Mengonversi nilai integer tak bertanda 32-bit yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(uint64_t) | Mengonversi nilai integer tak bertanda 64-bit yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(float) | Mengonversi nilai floating-point presisi tunggal yang ditentukan menjadi array byte. |
| static [GetBytes](./getbytes/)(double) | Mengonversi nilai floating-point presisi ganda yang ditentukan menjadi array byte. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | Mengembalikan nilai floating point presisi ganda yang nilainya setara dengan value. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi satu byte dari array yang ditentukan mulai dari indeks yang ditentukan menjadi nilai boolean. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi satu byte dari array yang ditentukan mulai dari indeks yang ditentukan menjadi nilai boolean. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi dua byte dari array yang ditentukan mulai dari indeks yang ditentukan menjadi nilai char_t. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi dua byte dari array yang ditentukan mulai dari indeks yang ditentukan menjadi nilai char_t. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi delapan byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai floating point double-precision. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi delapan byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai floating point double-precision. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi dua byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer 16-bit. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi dua byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer 16-bit. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi empat byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer 32-bit. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi empat byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer 32-bit. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi delapan byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer 64-bit. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi delapan byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer 64-bit. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi empat byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai floating point single-precision. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi empat byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai floating point single-precision. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | Mengonversi semua nilai dari array byte yang ditentukan menjadi representasi string heksadesimal mereka. Huruf kapital/kecil yang digunakan dalam notasi heksadesimal serta pemisah yang disisipkan antara setiap pasangan byte berdekatan ditentukan melalui argumen yang bersangkutan. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | Mengonversi nilai-nilai dari array byte yang ditentukan menjadi representasi string heksadesimal mereka mulai pada indeks yang ditentukan. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | Mengonversi rentang nilai dari array byte yang ditentukan menjadi representasi string heksadesimal mereka. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi dua byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer tak bertanda 16-bit. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi dua byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer tak bertanda 16-bit. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi empat byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer tak bertanda 32-bit. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi empat byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer tak bertanda 32-bit. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Mengonversi delapan byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer tak bertanda 64-bit. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Mengonversi delapan byte dari array yang ditentukan mulai pada indeks yang ditentukan menjadi nilai integer tak bertanda 64-bit. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | Menunjukkan endianess dari arsitektur saat ini. true jika arsitektur menggunakan little endian, false jika tidak. |
## Catatan



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
  // Buat nilai untuk dicetak.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // Cetak nilai dan byte-nya.
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

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
