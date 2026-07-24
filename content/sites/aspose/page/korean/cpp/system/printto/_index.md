---
title: "System::PrintTo method"
linktitle: "PrintTo"
second_title: "C++용 Aspose.Page"
description: "System::PrintTo method. 지정된 객체가 나타내는 값을 C++의 지정된 출력 스트림에 씁니다."
type: docs
weight: 35300
url: /ko/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


지정된 객체가 나타내는 값을 지정된 출력 스트림에 씁니다.

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| d | const Decimal\& | 스트림에 출력할 [Decimal](../decimal/) 객체 |
| os | ::std::ostream * | 지정된 객체를 출력할 스트림 |

## 또 보기

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## 또 보기

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## 또 보기

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


문자열을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const System::String\& | 출력하기 위해. |
| os | std::ostream * | 대상 ostream. |

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## 또 보기

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## 또 보기

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## 또 보기

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


값을 ostream에 출력합니다. 주로 디버그에 사용됩니다.

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## 또 보기

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
