---
title: "System::ExplicitCast 메서드"
linktitle: "명시적변환"
second_title: "C++용 Aspose.Page"
description: "System::ExplicitCast 메서드. 명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. C++에서 소스 타입과 결과 타입이 동일할 때 사용됩니다."
type: docs
weight: 18500
url: /ko/cpp/system/explicitcast/
---
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 소스 타입과 결과 타입이 동일할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Enum [Base64FormattingOptions](../base64formattingoptions/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 간단한 생성자와 같은 캐스트가 필요할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 예외 래퍼에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 객체를 예외로 캐스팅할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 소스와 결과가 모두 스마트 포인터이며 결과 타입에 명시적인 [SmartPtr<...>](../smartptr/)가 없을 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 소스와 결과가 모두 스마트 포인터이며 결과 타입에 명시적인 [SmartPtr<...>](../smartptr/)가 있을 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 객체를 nullable로 언박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. nullable을 박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. nullable 객체를 언박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableUnboxing, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 열거형을 박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::EnumBoxing, SmartPtr<BoxedValueBase>> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 값 타입을 힙에 복사하여 스마트 포인터로 참조해야 할 때 사용됩니다 (인터페이스 타입으로 제네릭을 제한하고, 해당 인터페이스를 구현하는 구조체로 특수화된 경우).

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::HeapifyBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 값 타입에서 인터페이스를 가져올 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 일반적인 박싱에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. [System::String](../string/) 박싱에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::StringBoxing, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 인터페이스를 언박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxing, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 일반적인 언박싱에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Unboxing, Result> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. nullptr 캐스팅에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(const Source\&) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 배열 간 캐스팅에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::ExplicitCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::ExplicitCast(Source) method


명시적 캐스트를 사용하여 소스 타입을 결과 타입으로 변환합니다. 원시 포인터를 스마트 포인터로 캐스팅할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::RawPointer, typename CastResult<std::remove_pointer_t<Result>>::type> System::ExplicitCast(Source value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | Source | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
