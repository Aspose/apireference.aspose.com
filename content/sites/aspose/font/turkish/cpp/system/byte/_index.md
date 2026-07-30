---
title: "System::Byte class"
linktitle: "Byte"
second_title: "Aspose.Font için C++"
description: "System::Byte sınıfı. C++'ta işaretsiz 8-bit tam sayı ile çalışmak için yöntemler içerir."
type: docs
weight: 1100
url: /tr/cpp/system/byte/
---
## Byte class


İşaretsiz 8-bit tam sayı ile çalışmak için yöntemler içerir.

```cpp
class Byte
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Belirtilen sayının dize temsilini içeren dizgeyi eşdeğer 8-bit işaretsiz tam sayıya dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Belirtilen sayının dize temsilini içeren dizgeyi, sağlanan biçimlendirme bilgilerini kullanarak eşdeğer 8-bit işaretsiz tam sayıya dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Belirtilen sayının dize temsilini içeren dizgeyi, sağlanan biçimlendirme bilgileri ve sayı stili kullanılarak eşdeğer 8-bit işaretsiz tam sayıya dönüştürür. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | Belirtilen sayının dize temsilini içeren dizgeyi eşdeğer 8-bit işaretsiz tam sayıya dönüştürür. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | Belirtilen sayının dize temsilini içeren dizgeyi, sağlanan biçimlendirme bilgileri ve sayı stili kullanılarak eşdeğer 8-bit işaretsiz tam sayıya dönüştürür. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | Alınabilecek en büyük değer. |
| static constexpr [MinValue](./minvalue/) | Alınabilecek en küçük değer. |
## Açıklamalar



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

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
