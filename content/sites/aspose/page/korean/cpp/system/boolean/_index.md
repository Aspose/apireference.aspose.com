---
title: "System::Boolean 클래스"
linktitle: "Boolean"
second_title: "C++용 Aspose.Page"
description: "System::Boolean 클래스. C++에서 System.Boolean .Net 타입의 정적 멤버를 보유하는 클래스."
type: docs
weight: 600
url: /ko/cpp/system/boolean/
---
## Boolean class


[System.Boolean](./) .[Net](../../system.net/) 타입의 정적 멤버를 보유하는 클래스.

```cpp
class Boolean
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Parse](./parse/)(const String\&) | 지정된 문자열을 bool 타입 값으로 변환합니다. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | 지정된 문자열을 bool 타입 값으로 변환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [FalseString](./falsestring/) | 불리언 값 'false'의 [String](../string/) 표현. |
| static [TrueString](./truestring/) | 불리언 값 'true'의 [String](../string/) 표현. |
## 비고



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // 불리언 변수를 생성합니다.
  bool isWeekend = false;

  // 입력 문자열을 파싱하고 결과를 출력합니다.
  if (Boolean::TryParse(u"True", isWeekend))
  {
    std::cout << "Is weekend: " << (isWeekend ? "Yes" : "No");
  }
  else
  {
    std::cerr << "Something went wrong" << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
Is weekend: Yes
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
