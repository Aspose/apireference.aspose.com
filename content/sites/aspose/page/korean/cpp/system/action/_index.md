---
title: "System::Action typedef"
linktitle: "동작"
second_title: "C++용 Aspose.Page"
description: "System::Action typedef. C++에서 반환값이 없는 메서드를 참조하는 대리자 타입입니다."
type: docs
weight: 9400
url: /ko/cpp/system/action/
---
## Action typedef


반환 값이 없는 메서드를 참조하는 대리자 유형.

```cpp
using System::Action =  MulticastDelegate<void(Args...)>
```

## 비고



```cpp
#include <system/action.h>

using namespace System;

// 전달된 문자열을 출력하는 함수.
void PrintString(const String &string)
{
  using namespace std;
  cout << string << endl;
}

int main()
{
  // Action의 인스턴스를 생성합니다.
  auto action = Action<String>(std::bind(&PrintString, std::placeholders::_1));

  // 액션을 호출합니다.
  action(u"Hello, world!");

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
