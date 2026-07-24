---
title: "System::DynamicCast 메서드"
linktitle: "DynamicCast"
second_title: "C++용 Aspose.Page"
description: "System::DynamicCast 메서드. C++에서 Exception 객체에 대해 동적 캐스트를 수행합니다."
type: docs
weight: 16900
url: /ko/cpp/system/dynamiccast/
---
## System::DynamicCast(const TFrom\&) method


[Exception](../exception/) 객체에 대해 동적 캐스트를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast(const TFrom &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\> const\&) method


동적 캐스트를 [SmartPtr](../smartptr/) 객체에 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!std::is_enum<TTo>::value &&!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast(SmartPtr<TFrom> const &obj)
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
## System::DynamicCast(SmartPtr\<TFrom\>) method


캐스트를 통해 박싱된 열거형을 언박싱합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_enum<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 열거형 타입. |
| TFrom | 소스 포인티 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | 데이터를 언박싱할 객체에 대한 포인터. |

### ReturnValue

언박싱된 열거형 값.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(SmartPtr\<TFrom\>) method


객체를 [Exception](../exception/) 객체로 동적 캐스트합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast(SmartPtr<TFrom> obj)
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
## System::DynamicCast(std::nullptr_t) method


null 객체에 대한 동적 캐스트를 수행합니다.

```cpp
template<typename TTo> CastResult<TTo>::type System::DynamicCast(std::nullptr_t) noexcept
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
## System::DynamicCast(TFrom\&) method


포인터가 아닌 객체에 대해 동적 캐스트를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TFrom>::value &&!IsSmartPtr<TFrom>::value &&std::is_convertible<TTo, TFrom>::value, TTo>::type System::DynamicCast(TFrom &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 타입. |
| TFrom | 소스 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | TFrom\& | 소스 객체. |

### ReturnValue

캐스트 결과.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::DynamicCast(TFrom) method


IntPtr에서 포인터로 동적 캐스트를 수행합니다.

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_pointer<TTo>::value &&std::is_same<IntPtr, TFrom>::value, TTo>::type System::DynamicCast(TFrom value) noexcept
```


| 매개변수 | 설명 |
| --- | --- |
| TTo | 대상 타입. |
| TFrom | 소스 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | TFrom | 원본 IntPtr 값. |

### ReturnValue

캐스트 결과.

## Deprecated
하위 호환성을 위해 남겨두었습니다. 대신 ExplicitCast를 사용하십시오.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
