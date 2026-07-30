---
title: "System::Byte classe"
linktitle: "Byte"
second_title: "Aspose.Font per C++"
description: "System::Byte classe. Contiene metodi per lavorare con l'intero senza segno a 8 bit in C++."
type: docs
weight: 1100
url: /it/cpp/system/byte/
---
## Byte class


Contiene metodi per lavorare con l'intero senza segno a 8 bit.

```cpp
class Byte
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero senza segno a 8 bit equivalente. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero senza segno a 8 bit equivalente, utilizzando le informazioni di formattazione fornite. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero senza segno a 8 bit equivalente, utilizzando le informazioni di formattazione fornite e lo stile numerico. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero senza segno a 8 bit equivalente. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | Converte la stringa specificata contenente la rappresentazione testuale di un numero nell'intero senza segno a 8 bit equivalente, utilizzando le informazioni di formattazione fornite e lo stile numerico. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## Campi

| Campo | Descrizione |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | Il valore più grande possibile. |
| static constexpr [MinValue](./minvalue/) | Il valore più piccolo possibile. |
## Osservazioni



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

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
