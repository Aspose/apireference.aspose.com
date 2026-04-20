---
title: "طريقة System::GetHashCode"
linktitle: "احصل على رمز التجزئة"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::GetHashCode. تخصيص لـ std::thread::id؛ تُرجع رمز التجزئة لكائن الخيط المحدد في C++."
type: docs
weight: 21300
url: /ar/cpp/system/gethashcode/
---
## System::GetHashCode(const std::thread::id\&) method


تخصيص لـ std::thread::id؛ يُرجع رمز التجزئة لكائن الخيط المحدد.

```cpp
int System::GetHashCode(const std::thread::id &id)
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


يرجع رمز تجزئة للقيمة العددية المحددة.

```cpp
template<typename T> std::enable_if<std::is_scalar<T>::value, int>::type System::GetHashCode(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة التي تُولّد الدالة رمز التجزئة لها |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | القيمة لتوليد رمز التجزئة |

### ReturnValue

رمز التجزئة المولد للقيمة المحددة

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


يعيد رمز تجزئة للكيان المحدد.

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&System::IsSmartPtr<T>::value, int>::type System::GetHashCode(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الذي تولد له الدالة رمز التجزئة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | الـ [SmartPtr](../smartptr/) الذي يشير إلى الكائن لتوليد رمز التجزئة له |

### ReturnValue

رمز التجزئة المولد للكيان المحدد

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


يعيد رمز تجزئة للكيان المحدد الذي هو استثناء

```cpp
template<typename T> std::enable_if<System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الذي تولد له الدالة رمز التجزئة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | الـ [Exception](../exception/) المغلف الذي يحتوي على الكائن لتوليد رمز التجزئة له |

### ReturnValue

رمز التجزئة المولد للكيان المحدد

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::GetHashCode(const T\&) method


يعيد رمز تجزئة للكيان المحدد الذي ليس مؤشرًا ذكيًا ولا استثناءً

```cpp
template<typename T> std::enable_if<!std::is_scalar<T>::value &&!System::IsSmartPtr<T>::value &&!System::IsExceptionWrapper<T>::value, int>::type System::GetHashCode(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن الذي تولد له الدالة رمز التجزئة |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | إشارة ثابتة إلى الكائن لتوليد رمز التجزئة له |

### ReturnValue

رمز التجزئة المولد للكيان المحدد

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
