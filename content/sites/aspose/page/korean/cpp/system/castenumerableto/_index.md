---
title: "System::CastEnumerableTo 메서드"
linktitle: "CastEnumerableTo"
second_title: "C++용 Aspose.Page"
description: "System::CastEnumerableTo 메서드. 지정된 enumerable 객체의 요소들을 다른 타입으로 명시적 캐스팅을 C++에서 수행합니다."
type: docs
weight: 15500
url: /ko/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


지정된 enumerable 객체의 요소들을 다른 타입으로 명시적 캐스팅합니다.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| 대상 | enumerable 객체의 요소들을 정적으로 캐스팅할 타입 |
| From | enumerable 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 열거형 | const From\& | 캐스팅할 요소를 포함하는 Enumerable 객체 |

### ReturnValue

새 컬렉션에 대한 포인터이며, **To** 유형의 요소를 포함하고 **enumerable**의 요소와 동등합니다.

## 또 보기

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


지정된 enumerable 객체의 요소들을 다른 타입으로 명시적 캐스팅합니다.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| 매개변수 | 설명 |
| --- | --- |
| 대상 | enumerable 객체의 요소들을 정적으로 캐스팅할 타입 |
| From | enumerable 객체의 타입 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 열거형 | const From\& | 정의된 get_Count 메서드를 가진 Enumerable 객체의 상속자이며, 캐스팅할 요소를 포함합니다. |

### ReturnValue

새 컬렉션에 대한 포인터이며, **To** 유형의 요소를 포함하고 **enumerable**의 요소와 동등합니다.

## 또 보기

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
