---
title: "System::PrintTo method"
linktitle: "PrintTo"
second_title: "Aspose.Page untuk C++"
description: "System::PrintTo method. Menulis nilai yang direpresentasikan oleh objek yang ditentukan ke aliran output yang ditentukan dalam C++."
type: docs
weight: 35300
url: /id/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


Menulis nilai yang direpresentasikan oleh objek yang ditentukan ke aliran output yang ditentukan.

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| d | const Decimal\& | Objek [Decimal](../decimal/) untuk dicetak ke aliran |
| os | ::std::ostream * | Aliran untuk mencetak objek yang ditentukan |

## Lihat Juga

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## Lihat Juga

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## Lihat Juga

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## Lihat Juga

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Lihat Juga

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


Mencetak string ke ostream. Kebanyakan digunakan untuk debug.

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | const System::String\& | untuk mencetak. |
| os | std::ostream * | ostream target. |

## Lihat Juga

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## Lihat Juga

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## Lihat Juga

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## Lihat Juga

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


Mencetak nilai ke ostream. Kebanyakan digunakan untuk debug.

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## Lihat Juga

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
