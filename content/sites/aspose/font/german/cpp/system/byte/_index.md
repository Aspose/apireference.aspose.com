---
title: "System::Byte Klasse"
linktitle: "Byte"
second_title: "Aspose.Font für C++"
description: "System::Byte Klasse. Enthält Methoden zur Arbeit mit dem vorzeichenlosen 8‑Bit‑Integer in C++."
type: docs
weight: 1100
url: /de/cpp/system/byte/
---
## Byte class


Enthält Methoden zur Arbeit mit dem vorzeichenlosen 8‑Bit‑Integer.

```cpp
class Byte
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende vorzeichenlose 8‑Bit‑Integer. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende vorzeichenlose 8‑Bit‑Integer unter Verwendung der bereitgestellten Formatierungsinformationen. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende vorzeichenlose 8‑Bit‑Integer unter Verwendung der bereitgestellten Formatierungsinformationen und des Zahlenstils. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende vorzeichenlose 8‑Bit‑Integer. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende vorzeichenlose 8‑Bit‑Integer unter Verwendung der bereitgestellten Formatierungsinformationen und des Zahlenstils. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | Größtmöglicher Wert. |
| static constexpr [MinValue](./minvalue/) | Kleinstmöglicher Wert. |
## Hinweise



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

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
