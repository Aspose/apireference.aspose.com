---
title: "System::StaticCastArray 메서드"
linktitle: "StaticCastArray"
second_title: "C++용 Aspose.Page"
description: "System::StaticCastArray 메서드. 지정된 배열의 요소들을 다른 유형으로 캐스팅합니다. From이 C++에서 SmartPtr 객체인 경우에 대한 오버라이드."
type: docs
weight: 39800
url: /ko/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


지정된 배열의 요소들을 다른 유형으로 캐스팅합니다. From이 [SmartPtr](../smartptr/) 객체인 경우에 대한 오버라이드.

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| 매개변수 | 설명 |
| --- | --- |
| 대상 | 지정된 배열의 요소들을 캐스팅할 유형 |
| From | 캐스팅할 배열 요소들의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | 캐스팅할 요소들을 포함하는 배열에 대한 공유 포인터 |

### ReturnValue

새 배열에 대한 포인터이며, 이 배열은 **To** 유형의 요소들을 포함하고 **from**의 요소와 동등합니다.

## Deprecated
하위 호환성을 위해 추가되었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


지정된 배열의 요소들을 다른 유형으로 캐스팅합니다. From이 Boxable이고 To가 [Object](../object/)[].

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| 매개변수 | 설명 |
| --- | --- |
| 대상 | 지정된 배열의 요소들을 캐스팅할 유형 |
| From | 캐스팅할 배열 요소들의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | 캐스팅할 요소들을 포함하는 배열에 대한 공유 포인터 |

### ReturnValue

새 배열에 대한 포인터이며, 이 배열은 **To** 유형의 요소들을 포함하고 **from**의 요소와 동등합니다.

## Deprecated
하위 호환성을 위해 추가되었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
