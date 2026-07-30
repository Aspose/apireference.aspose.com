---
title: "System::PrintTo 方法"
linktitle: "PrintTo"
second_title: "Aspose.Font 适用于 C++"
description: "System::PrintTo 方法。将指定对象表示的值写入 C++ 中指定的输出流。"
type: docs
weight: 35400
url: /zh/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


将指定对象表示的值写入指定的输出流。

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| d | const Decimal\& | 要打印到流中的 [Decimal](../decimal/) 对象 |
| os | ::std::ostream * | 用于打印指定对象的流 |

## 另见

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## 另见

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## 另见

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


将字符串打印到 ostream。主要用于调试。

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | const System::String\& | 用于打印。 |
| os | std::ostream * | 目标 ostream。 |

## 另见

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## 另见

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## 另见

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## 另见

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


将值打印到 ostream。主要用于调试。

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## 另见

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
