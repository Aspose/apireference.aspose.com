---
title: "System::ObjectExt::Is 메서드"
linktitle: "인가"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::Is 메서드. ''is'' 연산자 변환을 구현합니다. C++에서 문자열 리터럴에 대한 특수화."
type: docs
weight: 1000
url: /ko/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


'is' 연산자 변환을 구현합니다. 문자열 리터럴에 대한 특수화.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) 리터럴. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


'is' 연산자 변환을 구현합니다. 예외 래퍼 유형에 대한 특수화.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


'is' 연산자 변환을 구현합니다. [Nullable](../../nullable/) 타입에 대한 특수화.

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) 타입. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


'is' 연산자 변환을 구현합니다. 값 타입에 대한 특수화입니다.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const Object\&) method


'is' 연산자 변환을 구현합니다. 변환 불가능한 유형에 대한 특수화.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

타입이 변환 불가능하므로 항상 false를 반환합니다.

## 또 보기

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


'is' 연산자 변환을 구현합니다. nullable 유형에 대한 특수화.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


'is' 연산자 변환을 구현합니다. == 연산자가 정의된 boxable 유형에 대한 특수화.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


'is' 연산자 변환을 구현합니다. == 연산자가 정의되지 않은 boxable 유형에 대한 특수화.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


'is' 연산자 변환을 구현합니다. 포인터 타입에 대한 특수화입니다.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


'is' 연산자 변환을 구현합니다. enum 유형에 대한 특수화.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |
| U | 가리키는 객체의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


'is' 연산자 변환을 구현합니다. 인터페이스에 박싱된 값 유형에 대한 특수화.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |
| V | 가리키는 객체의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const T\&) method


'is' 연산자 변환을 구현합니다. 박싱 가능한(값) 타입에 대한 특수화이며, 정확히 말하면 그 타입들입니다.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. 무시됨. |

### ReturnValue

항상 true

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' 연산자 변환을 구현합니다. 'final' 클래스를 위해 최적화된 포인터 타입에 대한 특수화입니다.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |
| U | 테스트된 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const U\&) method


'is' 연산자 변환을 구현합니다. 포인터 타입에 대한 특수화입니다.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |
| U | 테스트된 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


'is' 연산자 변환을 구현합니다. enum 유형과 약한 포인터에 대한 특수화.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |
| U | 가리키는 객체의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/)를 사용하여 'is' 연산자를 테스트합니다. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Is(int32_t) method


'is' 연산자 변환을 구현합니다. 정수 리터럴에 대한 특수화.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | int32_t | 정수 리터럴. |

### ReturnValue

'is'가 true를 반환하면 true, 그렇지 않으면 false.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
