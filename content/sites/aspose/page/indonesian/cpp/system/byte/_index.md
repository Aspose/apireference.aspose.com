---
title: "Kelas System::Byte"
linktitle: "Byte"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Byte. Berisi metode untuk bekerja dengan integer 8-bit tak bertanda dalam C++."
type: docs
weight: 1100
url: /id/cpp/system/byte/
---
## Byte class


Berisi metode untuk bekerja dengan integer tak bertanda 8-bit.

```cpp
class Byte
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer 8-bit tak bertanda yang setara. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer 8-bit tak bertanda yang setara menggunakan informasi format yang diberikan. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer 8-bit tak bertanda yang setara menggunakan informasi format yang diberikan dan gaya angka. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer 8-bit tak bertanda yang setara. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi integer 8-bit tak bertanda yang setara menggunakan informasi format yang diberikan dan gaya angka. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | Nilai terbesar yang mungkin. |
| static constexpr [MinValue](./minvalue/) | Nilai terkecil yang mungkin. |
## Catatan



```cpp
#include <system/byte.h>

using namespace System;

int main()
{
  auto b1 = Byte::Parse(u"123");
  std::cout << static_cast<uint32_t>(b1) << std::endl;

  try
  {
    auto b2 = Byte::Parse(u"345");
    std::cout << static_cast<uint32_t>(b2) << std::endl;
  }
  catch (const OverflowException &ex)
  {
    std::cerr << ex.what() << std::endl;
  }

  uint8_t b3 = 0;
  if (Byte::TryParse(u"10", b3))
  {
    std::cout << static_cast<uint32_t>(b3) << std::endl;
  }
  else
  {
    std::cerr << "Something went wrong." << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
123
System::OverflowException: Value was either too large or too small for an UInt8
10
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
