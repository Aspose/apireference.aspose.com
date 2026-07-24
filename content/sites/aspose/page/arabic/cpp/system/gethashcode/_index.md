---
title: "System::GetHashCode طريقة"
linktitle: "احصل_رمز_التجزئة"
second_title: "Aspose.Page لـ C++"
description: "System::GetHashCode طريقة. تخصيص لـ std::thread::id؛ يُرجع رمز التجزئة لكائن الخيط المحدد في C++."
type: docs
weight: 21200
url: /ar/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


تخصيص لـ std::thread::id؛ يُرجع رمز التجزئة لكائن الخيط المحدد.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


يُرجع رمز تجزئة للقيمة العددية المحددة.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة التي تولد الدالة رمز التجزئة لها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | القيمة التي يُولد لها رمز التجزئة |

### ReturnValue

رمز التجزئة المولد للقيمة المحددة

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


يرجع رمز تجزئة للكائن المحدد.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الذي تُولِّد الدالة رمز التجزئة له |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | الـ[SmartPtr](../smartptr/) الذي يشير إلى الكائن لتوليد رمز التجزئة له |

### ReturnValue

رمز التجزئة المُولَّد للكائن المحدد

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


يرجع رمز تجزئة للكائن المحدد الذي هو استثناء.

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الذي تُولِّد الدالة رمز التجزئة له |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | الـ[Exception](../exception/) المغلف الذي يحتوي على الكائن لتوليد رمز التجزئة له |

### ReturnValue

رمز التجزئة المُولَّد للكائن المحدد

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::GetHashCode(const T\&) method


يرجع رمز تجزئة للكائن المحدد الذي ليس مؤشرًا ذكيًا ولا استثناءً.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن الذي تُولِّد الدالة رمز التجزئة له |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const T\& | مرجع ثابت إلى الكائن لتوليد رمز التجزئة له |

### ReturnValue

رمز التجزئة المُولَّد للكائن المحدد

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
