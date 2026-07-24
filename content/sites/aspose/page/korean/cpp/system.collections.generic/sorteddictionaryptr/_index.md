---
title: "System::Collections::Generic::SortedDictionaryPtr 클래스"
linktitle: "SortedDictionaryPtr"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::SortedDictionaryPtr 클래스. 접근 연산자를 가진 정렬된 사전 포인터입니다. 이 유형은 다른 객체의 삭제를 관리하기 위한 포인터이며, 스택에 할당하고 C++에서 값으로 또는 const 참조로 함수에 전달해야 합니다."
type: docs
weight: 4100
url: /ko/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


정렬된 사전 포인터이며 접근 연산자를 제공합니다. 이 타입은 다른 객체의 삭제를 관리하는 포인터이며, 스택에 할당하고 값이나 const 레퍼런스로 함수에 전달해야 합니다.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | 접근자 함수. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | null 포인터를 생성합니다. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | 지정된 정렬 사전에 대한 포인터를 생성합니다. |
## 또 보기

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
