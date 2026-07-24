---
title: "System::AsCast 메서드"
linktitle: "AsCast"
second_title: "C++용 Aspose.Page"
description: "System::AsCast 메서드. ''as'' 연산자 캐스트를 사용하여 소스 유형을 결과 유형으로 변환합니다. C++에서 간단한 생성자와 같은 캐스트가 필요할 때 사용됩니다."
type: docs
weight: 13500
url: /ko/cpp/system/ascast/
---
## System::AsCast(const Source\&) method


'as' 연산자 캐스트를 사용하여 소스 유형을 결과 유형으로 변환합니다. 간단한 생성자와 같은 캐스트가 필요할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Static, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 소스와 결과 유형이 동일할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::None, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 예외 래퍼에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Exception, Result> System::AsCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과. 변환이 없을 경우 nullptr를 반환합니다.

## 또 보기

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 객체를 예외로 캐스팅할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::ObjectToException, Result> System::AsCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과. 변환이 없을 경우 nullptr를 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 소스와 결과가 모두 스마트 포인터일 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Pointer, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과. 변환이 없을 경우 nullptr를 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 소스와 결과가 모두 스마트 포인터이며 결과 유형에 명시적인 [SmartPtr<...>](../smartptr/)가 포함된 경우에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::PointerToPointer, Result> System::AsCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과. 변환이 없을 경우 nullptr를 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 객체를 nullable로 언박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToNullable, Result> System::AsCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과. 변환이 없을 경우 빈 nullable를 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 객체가 아닌 유형으로의 잘못된 언박싱입니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceUnboxingToNullable, Result> System::AsCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

항상 null을 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


객체가 아닌 유형으로의 잘못된 언박싱입니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InvalidUnboxing, Result> System::AsCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

항상 null을 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. nullable 객체를 박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::NullableBoxing, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 일반 객체를 박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::InterfaceBoxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 일반 객체를 박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Boxing, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 문자열을 언박싱할 때 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::UnboxingToString, Result> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. nullptr 캐스팅에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Null, typename CastResult<Result>::type> System::AsCast(const Source &value)
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
## System::AsCast(const Source\&) method


소스 유형을 'as' 연산자 캐스트를 사용하여 결과 유형으로 변환합니다. 배열 간 캐스팅에 사용됩니다.

```cpp
template<typename Result,typename Source> std::enable_if_t<Details::CastType<Source, Result>::Array, typename CastResult<Result>::type> System::AsCast(const Source &value)
```


| 매개변수 | 설명 |
| --- | --- |
| 소스 | 소스 유형. |
| Result | 결과 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Source\& | [Object](../object/) 캐스팅용. |

### ReturnValue

캐스팅 결과. 배열 요소 중 어느 하나라도 변환이 없을 경우 nullptr를 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
