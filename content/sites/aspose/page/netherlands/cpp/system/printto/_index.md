---
title: "System::PrintTo method"
linktitle: "PrintTo"
second_title: "Aspose.Page voor C++"
description: "System::PrintTo method. Schrijft de waarde die wordt weergegeven door het opgegeven object naar de opgegeven outputstream in C++."
type: docs
weight: 35300
url: /nl/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


Schrijft de waarde die wordt weergegeven door het opgegeven object naar de opgegeven outputstream.

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| d | const Decimal\& | Het [Decimal](../decimal/) object om naar de stream te printen |
| os | ::std::ostream * | De stream om het opgegeven object te printen. |

## Zie ook

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## Zie ook

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## Zie ook

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Zie ook

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## Zie ook

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


Printt string naar ostream. Meestal gebruikt voor debug.

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const System::String\& | om te printen. |
| os | std::ostream * | doel ostream. |

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## Zie ook

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## Zie ook

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## Zie ook

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


Printt waarde naar ostream. Meestal gebruikt voor debug.

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## Zie ook

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
