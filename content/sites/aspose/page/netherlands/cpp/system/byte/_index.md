---
title: "System::Byte klasse"
linktitle: "Byte"
second_title: "Aspose.Page voor C++"
description: "System::Byte klasse. Bevat methoden om te werken met de unsigned 8‑bit‑integer in C++."
type: docs
weight: 1100
url: /nl/cpp/system/byte/
---
## Byte class


Bevat methoden om met de unsigned 8‑bit integer te werken.

```cpp
class Byte
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de equivalente 8‑bit unsigned integer. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de equivalente 8‑bit unsigned integer met behulp van de opgegeven opmaakinformatie. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Converteert de opgegeven string die de tekenreeksrepresentatie van een getal bevat naar het equivalente 8‑bit unsigned integer met behulp van de opgegeven opmaakinformatie en getalstijl. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | Converteert de opgegeven tekenreeks die de tekenreeksrepresentatie van een getal bevat naar de equivalente 8‑bit unsigned integer. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | Converteert de opgegeven string die de tekenreeksrepresentatie van een getal bevat naar het equivalente 8‑bit unsigned integer met behulp van de opgegeven opmaakinformatie en getalstijl. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | Grootst mogelijke waarde. |
| static constexpr [MinValue](./minvalue/) | Kleinste mogelijke waarde. |
## Opmerkingen



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

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
