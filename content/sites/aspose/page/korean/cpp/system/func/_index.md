---
title: "System::Func class"
linktitle: "Func"
second_title: "C++용 Aspose.Page"
description: "System::Func class. 함수 대리자. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. C++에서 이 유형의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마십시오."
type: docs
weight: 2800
url: /ko/cpp/system/func/
---
## Func class


함수 대리자. 이 유형은 스택에 할당하고 값 또는 참조로 함수에 전달해야 합니다. 이 유형의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 절대 사용하지 마십시오.

```cpp
template<typename...>class Func : public System::MulticastDelegate<::System::Detail::FuncArgsReorderer<void(), Args...>::type>
```


| 매개변수 | 설명 |
| --- | --- |
| 인수 | 인수 호출 후, 필수 반환 유형을 지정합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Func](./func/)() | null-Func를 생성하는 기본 생성자입니다. |
| [Func](./func/)(T\&&) | [Func](./) 객체를 생성하고 값을 (실제 콜백이든 nullptr이든) 할당하는 생성자입니다. |
| [Func](./func/)(const Func\&) | 복사 생성자. |
| [Func](./func/)(Func\&&) | 이동 생성자. |
| [operator=](./operator=/)(const Func\&) | 복사 할당. |
| [operator=](./operator=/)(Func\&&) | 이동 할당. |
| [~Func](./~func/)() | 소멸자. |
## 비고



```cpp
#include "system/func.h"
#include <iostream>

// 이 함수는 매개변수로 System::Func 대리자의 인스턴스를 받습니다.
void Print(int x, const System::Func<int, int> &func)
{
  std::cout << func(x) << std::endl;
}

int main()
{
  // System::Func 대리자의 인스턴스를 생성합니다.
  auto func = static_cast<System::Func<int, int>>([](int x) -> int
  {
    return x * x;
  });

  // 생성된 인스턴스를 함수 인수로 전달합니다.
  Print(1, func);
  Print(2, func);
  Print(3, func);

  return 0;
}
/*
This code example produces the following output:
1
4
9
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
