---
title: "System::Ref 메서드"
linktitle: "Ref"
second_title: "C++용 Aspose.Page"
description: "System::Ref 메서드. Ref(std::ref(DynamicWeakPtr))가 C++에서 작동하도록 보장하는 래퍼입니다."
type: docs
weight: 36600
url: /ko/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Ref(std::ref(DynamicWeakPtr))가 작동하도록 보장하는 래퍼.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 참조된 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 래퍼 | const std::reference_wrapper\<T\>\& | 언래핑을 위한 std 래퍼. |

### ReturnValue

std가 아니라 [System](../)::에 정의된 참조 타입입니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


[DynamicWeakPtr](../dynamicweakptr/) 객체에 대한 참조를 생성합니다. 함수 인수를 참조로 전달할 때 변환기에 의해 사용됩니다.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 가리키는 객체 타입. |
| trunkMode | 스마트 포인터 자체의 모드. |
| weakLeafs | SetTemplateWeakPtr 메서드를 호출해야 하는 템플릿 인수의 인덱스. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | 참조를 생성하기 위한 스마트 포인터. |

### ReturnValue

스마트 포인터 참조.

## 또 보기

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


객체에 대한 참조를 획득하기 위한 도우미 함수입니다. 할당 후에 [System::DynamicWeakPtr](../dynamicweakptr/)이 참조된 객체를 업데이트하도록 보장하는 데 사용됩니다.

```cpp
template<typename T> T & System::Ref(T &value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 참조를 생성할 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | T\& | 참조를 생성할 값. |

### ReturnValue

이 함수에 전달된 값에 대한 참조.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
