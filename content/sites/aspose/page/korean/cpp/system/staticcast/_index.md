---
title: "System::StaticCast 메서드"
linktitle: "StaticCast"
second_title: "C++용 Aspose.Page"
description: "System::StaticCast 메서드. C++에서 포인터가 아닌 객체에 대해 정적 캐스트를 수행합니다."
type: docs
weight: 38500
url: /ko/cpp/system/staticcast/
---
## System::StaticCast(const TFrom\&) method


포인터가 아닌 객체에 대해 정적 캐스트를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_same<TFrom, System::String>::value &&!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&!std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 타입. |
| TFrom | 소스 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const TFrom\& | 소스 객체. |

### ReturnValue

캐스트가 허용되는 경우 캐스트 결과.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom\&) method


[Exception](../exception/) 객체에 대해 static cast를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast(const TFrom &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 [Exception](../exception/) 타입. |
| TFrom | 소스 [Exception](../exception/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const TFrom\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되는 경우 캐스트 결과.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(const TFrom *) method


산술 타입에 대한 특수화.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(const TFrom *value)
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\> const\&) method


[SmartPtr](../smartptr/) 객체에 대해 static cast를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast(SmartPtr<TFrom> const &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 포인티 타입. |
| TFrom | 소스 포인티 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되는 경우 캐스트 결과.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(SmartPtr\<TFrom\>) method


Objects를 [Exception](../exception/) 객체로 static cast를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast(SmartPtr<TFrom> obj) noexcept
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 [Exception](../exception/) 타입. |
| TFrom | [Object](../object/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | 소스 포인터. |

### ReturnValue

캐스트가 허용되는 경우 캐스트 결과.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(std::nullptr_t) method


null 객체에 대해 정적 캐스트를 수행합니다.

```cpp
template<typename TTo> CastResult<TTo>::type System::StaticCast(std::nullptr_t)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 포인티 타입. |

### ReturnValue

nullptr.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TFrom) method


산술 타입에 대한 특수화.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_arithmetic<TFrom>::value, TTo>::type System::StaticCast(TFrom value)
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(TTo) method


[String](../string/)에서 [String](../string/)로의 캐스트를 처리합니다.

```cpp
template<typename TTo> std::enable_if<std::is_same<TTo, System::String>::value, TTo>::type System::StaticCast(TTo value)
```

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCast(WeakPtr\<TFrom\> const\&) method


[WeakPtr](../weakptr/) 객체에 대해 static cast를 수행합니다.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast(WeakPtr<TFrom> const &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 포인티 타입. |
| TFrom | 소스 포인티 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | 소스 포인터. |

### ReturnValue

캐스트가 허용되는 경우 캐스트 결과.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
