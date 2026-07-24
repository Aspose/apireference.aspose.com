---
title: "System::Tuple 클래스"
linktitle: "Tuple"
second_title: "C++용 Aspose.Page"
description: "System::Tuple 클래스. 튜플 데이터 구조를 나타내는 클래스입니다. C++에서 최대 항목 수는 8개입니다."
type: docs
weight: 6400
url: /ko/cpp/system/tuple/
---
## Tuple class


튜플 데이터 구조를 나타내는 클래스입니다. 최대 항목 수는 8개입니다.

```cpp
template<typename ...>class Tuple : public System::Runtime::CompilerServices::ITuple
```


| 매개변수 | 설명 |
| --- | --- |
| 인수 | 튜플 요소 유형들. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 현재 객체와 지정된 객체가 동일한지 확인합니다. |
| [get_Item](./get_item/)() const | [Tuple](./) 객체의 구성 요소 값을 가져옵니다. |
| [Tuple](./tuple/)(Args...) | 튜플 객체를 생성합니다. |
## 비고



```cpp
#include "system/smart_ptr.h"
#include "system/tuple.h"
#include <iostream>

int main()
{
  const auto tuple = System::MakeObject<System::Tuple<int, int, int>>(32, 16, 128);

  std::cout <<
    "Item 1: " << tuple->get_Item<0>() << std::endl <<
    "Item 2: " << tuple->get_Item<1>() << std::endl <<
    "Item 3: " << tuple->get_Item<2>() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Item 1: 32
Item 2: 16
Item 3: 128
*/
```

## 또 보기

* Class [ITuple](../../system.runtime.compilerservices/ituple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
