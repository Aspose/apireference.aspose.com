---
title: "System::Byte 클래스"
linktitle: "Byte"
second_title: "C++용 Aspose.Page"
description: "System::Byte 클래스. C++에서 부호 없는 8비트 정수를 다루는 메서드를 포함합니다."
type: docs
weight: 1100
url: /ko/cpp/system/byte/
---
## Byte class


부호 없는 8비트 정수를 다루는 메서드를 포함합니다.

```cpp
class Byte
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Parse](./parse/)(const String\&) | 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 8비트 부호 없는 정수로 변환합니다. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 제공된 서식 정보를 사용하여 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 8비트 부호 없는 정수로 변환합니다. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | 제공된 서식 정보와 숫자 스타일을 사용하여 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 8비트 부호 없는 정수로 변환합니다. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, std::nullptr_t) |  |
| static [TryParse](./tryparse/)(const String\&, uint8_t\&) | 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 8비트 부호 없는 정수로 변환합니다. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) | 제공된 서식 정보와 숫자 스타일을 사용하여 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 8비트 부호 없는 정수로 변환합니다. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) |  |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) |  |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [MaxValue](./maxvalue/) | 가능한 가장 큰 값. |
| static constexpr [MinValue](./minvalue/) | 가능한 가장 작은 값. |
## 비고



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

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
