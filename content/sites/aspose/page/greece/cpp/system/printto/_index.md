---
title: "System::PrintTo method"
linktitle: "PrintTo"
second_title: "Aspose.Page για C++"
description: "System::PrintTo method. Γράφει την τιμή που αντιπροσωπεύεται από το συγκεκριμένο αντικείμενο στην καθορισμένη ροή εξόδου σε C++."
type: docs
weight: 35300
url: /el/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


Γράφει την τιμή που αντιπροσωπεύεται από το συγκεκριμένο αντικείμενο στην καθορισμένη ροή εξόδου.

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| d | const Decimal\& | Το αντικείμενο [Decimal](../decimal/) για εκτύπωση στην ροή |
| os | ::std::ostream * | Η ροή για εκτύπωση του συγκεκριμένου αντικειμένου |

## Δείτε επίσης

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## Δείτε επίσης

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## Δείτε επίσης

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## Δείτε επίσης

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## Δείτε επίσης

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## Δείτε επίσης

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


Εκτυπώνει τη συμβολοσειρά στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| τιμή | const System::String\& | για εκτύπωση. |
| os | std::ostream * | στόχος ostream. |

## Δείτε επίσης

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## Δείτε επίσης

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## Δείτε επίσης

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## Δείτε επίσης

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


Εκτυπώνει την τιμή στο ostream. Χρησιμοποιείται κυρίως για αποσφαλμάτωση.

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## Δείτε επίσης

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
