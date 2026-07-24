---
title: "System::ArraySegment 클래스"
linktitle: "ArraySegment"
second_title: "C++용 Aspose.Page"
description: "System::ArraySegment 클래스. 일차원 배열의 세그먼트를 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 사용하지 마세요."
type: docs
weight: 300
url: /ko/cpp/system/arraysegment/
---
## ArraySegment class


일차원 배열의 세그먼트를 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 사용하지 마세요.

```cpp
template<typename T>class ArraySegment : public System::Object
```


| 매개변수 | 설명 |
| --- | --- |
| T | 배열 세그먼트 요소의 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>) |  |
| [ArraySegment](./arraysegment/)(System::ArrayPtr\<T\>, int32_t, int32_t) |  |
| [ArraySegment](./arraysegment/)() |  |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(ArraySegment\<T\>) |  |
| [get_Array](./get_array/)() |  |
| [get_Count](./get_count/)() |  |
| [get_Offset](./get_offset/)() |  |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
## 비고



```cpp
#include <system/array_segment.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<ArraySegment<String>> &segment)
{
  for (auto i = segment->get_Offset(); i < segment->get_Offset() + segment->get_Count(); i++)
  {
    std::cout << segment->get_Array()[i] << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 배열을 생성하고 채웁니다.
  auto array = System::MakeObject<Array<String>>(3);
  array[0] = u"First";
  array[1] = u"Second";
  array[2] = u"Third";

  // 전체 배열을 포함하는 배열 세그먼트를 생성합니다.
  auto fullArray = MakeObject<ArraySegment<String>>(array);

  // 배열 세그먼트 항목을 출력합니다.
  Print(fullArray);

  // 배열 세그먼트를 생성합니다.
  auto segment = MakeObject<ArraySegment<String>>(array, 1, 2);

  // 배열 세그먼트 항목을 출력합니다.
  Print(segment);

  return 0;
}
/*
This code example produces the following output:
First Second Third
Second Third
*/
```

## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
