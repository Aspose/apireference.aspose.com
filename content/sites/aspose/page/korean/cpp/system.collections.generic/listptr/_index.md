---
title: "System::Collections::Generic::ListPtr 클래스"
linktitle: "ListPtr"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::ListPtr 클래스. 접근 연산자를 가진 리스트 포인터. 이 타입은 다른 객체의 삭제를 관리하는 포인터입니다. 스택에 할당되어야 하며 C++에서 값으로 또는 const 레퍼런스로 함수에 전달되어야 합니다."
type: docs
weight: 3500
url: /ko/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | null 포인터를 초기화합니다. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | 지정된 리스트에 대한 포인터를 초기화합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | [List](../list/) 포인터가 null인지 확인합니다. |
| [operator[]](./operator[]/)(int) | 액세서. |
| [operator[]](./operator[]/)(int) const | 액세서. |
## 또 보기

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
