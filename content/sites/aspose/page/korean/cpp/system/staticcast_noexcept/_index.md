---
title: "System::StaticCast_noexcept 메서드"
linktitle: "StaticCast_noexcept"
second_title: "C++용 Aspose.Page"
description: "System::StaticCast_noexcept 메서드. C++에서 Exception 객체에 대해 static cast를 수행합니다."
type: docs
weight: 39400
url: /ko/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


[Exception](../exception/) 객체에 대해 static cast를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 [Exception](../exception/) 타입. |
| TFrom | 소스 [Exception](../exception/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const TFrom\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되면 결과를 반환하고, 그렇지 않으면 nullptr를 반환합니다.

## Deprecated
이전 호환성을 위해 남겨두었습니다. 대신 AsCast를 사용하십시오.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) 객체에 대해 static cast를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 포인티 타입. |
| TFrom | 소스 포인티 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되면 결과를 반환하고, 그렇지 않으면 nullptr를 반환합니다.

## Deprecated
이전 호환성을 위해 남겨두었습니다. 대신 AsCast를 사용하십시오.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Objects를 [Exception](../exception/) 객체로 static cast를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 [Exception](../exception/) 타입. |
| TFrom | [Object](../object/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | 소스 포인터. |

### ReturnValue

캐스트가 허용되면 결과를 반환하고, 그렇지 않으면 nullptr를 반환합니다.

## Deprecated
이전 호환성을 위해 남겨두었습니다. 대신 AsCast를 사용하십시오.

## 또 보기

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


[WeakPtr](../weakptr/) 객체에 대해 static cast를 수행합니다.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 포인티 타입. |
| TFrom | 소스 포인티 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되면 결과를 반환하고, 그렇지 않으면 nullptr를 반환합니다.

## Deprecated
이전 호환성을 위해 남겨두었습니다. 대신 AsCast를 사용하십시오.

## 또 보기

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
