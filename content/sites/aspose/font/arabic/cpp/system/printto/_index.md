---
title: "طريقة System::PrintTo"
linktitle: "PrintTo"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::PrintTo. تكتب القيمة التي يمثلها الكائن المحدد إلى تدفق الإخراج المحدد في C++."
type: docs
weight: 35400
url: /ar/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


تكتب القيمة التي يمثلها الكائن المحدد إلى تدفق الإخراج المحدد.

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| d | const Decimal\& | كائن [Decimal](../decimal/) للطباعة إلى التدفق |
| os | ::std::ostream * | التدفق الذي سيُطبع إليه الكائن المحدد |

## انظر أيضًا

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## انظر أيضًا

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## انظر أيضًا

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## انظر أيضًا

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


يطبع السلسلة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const System::String\& | للطباعة. |
| os | std::ostream * | ostream الهدف. |

## انظر أيضًا

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## انظر أيضًا

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## انظر أيضًا

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## انظر أيضًا

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


يطبع القيمة إلى ostream. يُستخدم غالبًا للتصحيح.

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## انظر أيضًا

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
