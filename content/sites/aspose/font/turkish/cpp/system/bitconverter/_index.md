---
title: "System::BitConverter sınıfı"
linktitle: "BitConverter"
second_title: "Aspose.Font için C++"
description: "System::BitConverter sınıfı. Bayt dizisini bir değer tipine ve tersine dönüştüren yöntemler içerir. Bu, örnek hizmeti olmayan statik bir tiptir. C++'da hiçbir şekilde ondan örnek oluşturulmamalıdır."
type: docs
weight: 500
url: /tr/cpp/system/bitconverter/
---
## BitConverter class


Bayt dizisini bir değer tipine ve tersine dönüştüren yöntemler içerir. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmamalısınız.

```cpp
class BitConverter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | Mevcut mimarinin endianness'ini gösterir. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | Belirtilen çift duyarlıklı kayan nokta değerinin ikili temsiline eşit ikili temsile sahip 64-bit tam sayı değerini döndürür. |
| static [GetBytes](./getbytes/)(bool) | Belirtilen boolean değeri bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(char_t) | Belirtilen char_t değerini bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(int16_t) | Belirtilen 16-bit tam sayı değerini bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(int) | Belirtilen 32-bit tam sayı değerini bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(int64_t) | Belirtilen 64-bit tam sayı değerini bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(uint16_t) | Belirtilen işaretsiz 16-bit tam sayı değerini bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(uint32_t) | Belirtilen işaretsiz 32-bit tam sayı değerini bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(uint64_t) | Belirtilen işaretsiz 64-bit tam sayı değerini bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(float) | Belirtilen tek duyarlıklı kayan nokta değerini bayt dizisine dönüştürür. |
| static [GetBytes](./getbytes/)(double) | Belirtilen çift duyarlıklı kayan nokta değerini bayt dizisine dönüştürür. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | Değeri, verilen değere eşdeğer olan çift duyarlıklı kayan nokta değerini döndürür. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan bir baytı, boolean değere dönüştürür. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan bir baytı, boolean değere dönüştürür. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan iki baytı, char_t değerine dönüştürür. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan iki baytı, char_t değerine dönüştürür. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan sekiz baytı, çift duyarlıklı kayan nokta değerine dönüştürür. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan sekiz baytı, çift duyarlıklı kayan nokta değerine dönüştürür. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan iki baytı, 16-bit tam sayı değerine dönüştürür. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan iki baytı, 16-bit tam sayı değerine dönüştürür. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan dört baytı, 32-bit tam sayı değerine dönüştürür. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan dört baytı, 32-bit tam sayı değerine dönüştürür. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan sekiz baytı, 64-bit tam sayı değerine dönüştürür. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan sekiz baytı, 64-bit tam sayı değerine dönüştürür. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan dört baytı, tek duyarlıklı kayan nokta değerine dönüştürür. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan dört baytı, tek duyarlıklı kayan nokta değerine dönüştürür. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | Belirtilen bayt dizisinin tüm değerlerini, onaltılık dize temsiline dönüştürür. Onaltılık gösterimde kullanılacak harflerin büyük/küçük olması ve komşu bayt çiftleri arasına eklenecek ayırıcı, ilgili argümanlarla belirtilir. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | Belirtilen bayt dizisinin değerlerini, belirtilen indeksden başlayarak onaltılık dize temsiline dönüştürür. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | Belirtilen bayt dizisinin bir değer aralığını, onaltılık dize temsiline dönüştürür. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan iki baytı, işaretsiz 16-bit tam sayı değerine dönüştürür. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan iki baytı, işaretsiz 16-bit tam sayı değerine dönüştürür. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan dört baytı, işaretsiz 32-bit tam sayı değerine dönüştürür. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan dört baytı, işaretsiz 32-bit tam sayı değerine dönüştürür. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan sekiz baytı, işaretsiz 64-bit tam sayı değerine dönüştürür. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | Belirtilen dizinin belirtilen indeksinden başlayan sekiz baytı, işaretsiz 64-bit tam sayı değerine dönüştürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | Mevcut mimarinin uçbirim düzenini gösterir. Mimari küçük uçlu (little endian) ise true, aksi takdirde false döner. |
## Açıklamalar



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
  // Yazdırılacak değerleri oluştur.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // Değeri ve baytlarını yazdır.
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

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
