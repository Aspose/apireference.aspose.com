---
title: "System::PrintTo yöntemi"
linktitle: "PrintTo"
second_title: "Aspose.Font için C++"
description: "System::PrintTo yöntemi. Belirtilen nesnenin temsil ettiği değeri C++'da belirtilen çıktı akışına yazar."
type: docs
weight: 35400
url: /tr/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


Belirtilen nesnenin temsil ettiği değeri belirtilen çıktı akışına yazar.

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| d | const Decimal\& | Akışa yazdırılacak [Decimal](../decimal/) nesnesi |
| os | ::std::ostream * | Belirtilen nesnenin yazdırılacağı akış |

## Ayrıca Bakınız

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


Dizgiyi ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const System::String\& | yazdırmak için. |
| os | std::ostream * | hedef ostream. |

## Ayrıca Bakınız

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


Değeri ostream'a yazar. Çoğunlukla hata ayıklama için kullanılır.

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## Ayrıca Bakınız

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
