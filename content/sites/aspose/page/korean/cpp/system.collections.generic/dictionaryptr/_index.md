---
title: "System::Collections::Generic::DictionaryPtr 클래스"
linktitle: "DictionaryPtr"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::DictionaryPtr 클래스. 연산자 오버로드를 지원하는 사전 포인터 클래스입니다. 이 유형은 다른 객체의 삭제를 관리하는 포인터이며, C++에서 스택에 할당하고 값 또는 const 레퍼런스로 함수에 전달해야 합니다."
type: docs
weight: 1300
url: /ko/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 키 유형. |
| V | 값 형식. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | null 포인터를 초기화합니다. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | 포인터 유형을 변환합니다. |
| [operator[]](./operator[]/)(const X\&) const | 키 유형 변환을 수행하기 위한 접근 연산자입니다. |
| [operator[]](./operator[]/)(const T\&) const | 접근 연산자. |

## 또 보기

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
