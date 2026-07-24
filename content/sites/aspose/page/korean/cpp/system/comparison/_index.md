---
title: "System::Comparison 클래스"
linktitle: "Comparison"
second_title: "C++용 Aspose.Page"
description: "System::Comparison 클래스. 동일한 타입의 두 객체를 비교하는 메서드에 대한 포인터를 나타냅니다. 이 타입은 스택에 할당하고 값이나 레퍼런스로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 1300
url: /ko/cpp/system/comparison/
---
## Comparison class


동일한 타입의 두 객체를 비교하는 메서드에 대한 포인터를 나타냅니다. 이 타입은 스택에 할당하고 값이나 레퍼런스로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 절대 사용하지 마세요.

```cpp
template<typename T>class Comparison : public System::MulticastDelegate<int(T, T)>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 메서드가 비교하는 객체들의 타입 |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Comparison](./comparison/)(Y) | 지정된 호출 가능한 엔터티에 대한 포인터를 나타내는 [Comparison](./) 대리자 인스턴스를 생성합니다. |
| [operator()](./operator()/)(T, T) | 현재 객체가 가리키는 호출 가능한 객체를 실행합니다. |
## 비고



```cpp
#include "system/comparison.h"
#include "system/console.h"
#include "system/exceptions.h"
#include "system/string.h"
#include <algorithm>
#include <initializer_list>
#include <vector>

using namespace System;

// 동적 배열을 나타내는 템플릿 클래스.
template <typename T>
class MyArray
{
  // 배열 데이터를 저장하는 데 사용됩니다.
  std::vector<T> m_data;

public:
  // 우리의 동적 배열 새 인스턴스를 생성합니다.
  MyArray(const std::initializer_list<T>& source) : m_data(source) {};

  // 배열 데이터를 정렬하는 데 사용됩니다. 이 메서드는 해당 클래스의 인스턴스를 받아들입니다.
  // 'System::Comparison' 템플릿 클래스.
  void Sort(Comparison<T> comparison)
  {
    if (comparison.IsNull())
    {
      throw ArgumentNullException(u"comparison");
    }
    std::sort(m_data.begin(), m_data.end(), comparison);
  }

  // 동적 배열이 저장하는 요소 수를 반환합니다.
  size_t get_Size()
  {
    return m_data.size();
  }

  // 지정된 인덱스에서 요소를 가져오는 데 사용됩니다.
  T& operator[](int index)
  {
    if (index < 0 || index >= m_data.size())
    {
      throw IndexOutOfRangeException(u"index");
    }
    return m_data[index];
  }
};

int main() {
  // 지정된 요소로 MyArray 클래스의 인스턴스를 생성합니다.
  MyArray<String> arr = {u"a", u"e", u"c", u"b", u"d"};

  // 동적 배열의 요소를 오름차순으로 정렬합니다.
  arr.Sort([](const String &a, const String &b) -> int
  {
    return String::Compare(a, b);
  });

  // 동적 배열의 요소를 출력합니다.
  for (auto i = 0; i < arr.get_Size(); ++i)
  {
    Console::WriteLine(arr[i]);
  }

  return 0;
}
/*
This code example produces the following output:
a
b
c
d
e
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
