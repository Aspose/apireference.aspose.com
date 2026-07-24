---
title: "System::Random 클래스"
linktitle: "Random"
second_title: "C++용 Aspose.Page"
description: "System::Random 클래스. 의사 난수 생성기를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 5200
url: /ko/cpp/system/random/
---
## Random class


의사 난수 생성기를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수 인수로 전달하십시오.

```cpp
class Random : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [IsNull](./isnull/)() const | 항상 false를 반환합니다. |
| virtual [Next](./next/)() | int32 최대값보다 작은 음수가 아닌 난수를 반환합니다. |
| virtual [Next](./next/)(int32_t) | 지정된 최대값보다 작은 음수가 아닌 난수를 반환합니다. |
| virtual [Next](./next/)(int32_t, int32_t) | 지정된 범위 내에서 난수를 반환합니다. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | 지정된 바이트 배열의 요소들을 난수로 채웁니다. |
| virtual [NextDouble](./nextdouble/)() | 0.0과 1.0 사이의 난수를 반환합니다. |
| [Random](./random/)() | 시간에 따라 달라지는 기본 시드 값을 사용하여 새 인스턴스를 초기화합니다. |
| [Random](./random/)(int32_t) | 지정된 시드 값을 사용하여 [System.Random](./) 클래스의 새 인스턴스를 초기화합니다. |
## 비고



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // 무작위 월 번호를 얻어 출력합니다.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // 배열을 난수로 채웁니다.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // 배열을 출력합니다.
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
