---
title: "System::PrintTo मेथड"
linktitle: "PrintTo"
second_title: "Aspose.Page C++ के लिए"
description: "System::PrintTo मेथड। निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को C++ में निर्दिष्ट आउटपुट स्ट्रीम पर लिखता है।"
type: docs
weight: 35300
url: /hi/cpp/system/printto/
---
## System::PrintTo(const Decimal\&, ::std::ostream *) method


निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को निर्दिष्ट आउटपुट स्ट्रीम पर लिखता है।

```cpp
void System::PrintTo(const Decimal &d, ::std::ostream *os)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| d | const Decimal\& | स्ट्रीम पर प्रिंट करने के लिए [Decimal](../decimal/) ऑब्जेक्ट |
| os | ::std::ostream * | निर्दिष्ट ऑब्जेक्ट को प्रिंट करने के लिए स्ट्रीम |

## संबंधित देखें

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Details_Exception\&, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
void System::PrintTo(const Details_Exception &exception, std::ostream *stream)
```

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const ExceptionWrapper\<T\>\&, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
template<typename T> void System::PrintTo(const ExceptionWrapper<T> &exception_wrapper, std::ostream *stream)
```

## संबंधित देखें

* Class [ExceptionWrapper](../exceptionwrapper/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Guid\&, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
void System::PrintTo(const Guid &value, std::ostream *stream)
```

## संबंधित देखें

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const Nullable\<T\>\&, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
template<typename T> void System::PrintTo(const Nullable<T> &value, std::ostream *stream)
```

## संबंधित देखें

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
template<typename T> std::enable_if_t<detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const SmartPtr\<T\>\&, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
template<typename T> std::enable_if_t<!detail::has_print_to_function<T>::value, void> System::PrintTo(const SmartPtr<T> &object_ptr, std::ostream *stream)
```

## संबंधित देखें

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::Object\&, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
void System::PrintTo(const System::Object &value, std::ostream *stream)
```

## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const System::String\&, std::ostream *) method


ostream पर स्ट्रिंग प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
void System::PrintTo(const System::String &value, std::ostream *os)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| मान | const System::String\& | प्रिंट करने के लिए। |
| os | std::ostream * | लक्षित ostream। |

## संबंधित देखें

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(const WeakPtr\<T\>\&, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
template<typename T> void System::PrintTo(const WeakPtr<T> &object_ptr, std::ostream *stream)
```

## संबंधित देखें

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTime, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
void System::PrintTo(DateTime value, std::ostream *stream)
```

## संबंधित देखें

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(DateTimeOffset, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
void System::PrintTo(DateTimeOffset value, std::ostream *stream)
```

## संबंधित देखें

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::PrintTo(TimeSpan, std::ostream *) method


ostream पर मान प्रिंट करता है। मुख्यतः डिबग के लिए उपयोग किया जाता है।

```cpp
void System::PrintTo(TimeSpan value, std::ostream *stream)
```

## संबंधित देखें

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
