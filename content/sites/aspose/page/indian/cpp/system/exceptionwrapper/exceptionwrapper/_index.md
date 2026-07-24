---
title: "System::ExceptionWrapper::ExceptionWrapper कंस्ट्रक्टर"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page C++ के लिए"
description: "System::ExceptionWrapper::ExceptionWrapper कंस्ट्रक्टर। वह कंस्ट्रक्टर जो पैरामीटर को Exception क्लास के कंस्ट्रक्टर्स तक अग्रेषित करता है और एक स्मार्ट पॉइंटर बनाता है जो C++ में नई Exception क्लास की इंस्टेंस को रखता है।"
type: docs
weight: 100
url: /hi/cpp/system/exceptionwrapper/exceptionwrapper/
---
## ExceptionWrapper::ExceptionWrapper(Args\&&...) constructor


पैरामीटर को [Exception](../../exception/) क्लास के कंस्ट्रक्टर्स तक अग्रेषित करने वाला कंस्ट्रक्टर और एक स्मार्ट पॉइंटर बनाता है जो नई [Exception](../../exception/) क्लास की इंस्टेंस को रखता है।

```cpp
template<typename ...,typename> System::ExceptionWrapper<T>::ExceptionWrapper(Args &&...args)
```

## संबंधित देखें

* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(const ExceptionPtr\&) constructor


पारित पॉइंटर को शामिल करने वाली [ExceptionWrapper](../) क्लास की एक इंस्टेंस बनाता है।

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(const ExceptionPtr &ptr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ptr | const ExceptionPtr\& | [Exception](../../exception/) क्लास की इंस्टेंस के लिए स्मार्ट पॉइंटर। |

## संबंधित देखें

* Typedef [ExceptionPtr](../../exceptionptr/)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(const ExceptionWrapper\&) constructor


कॉपी कंस्ट्रक्टर।

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(const ExceptionWrapper &other)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | const ExceptionWrapper\& | रैपर क्लास की अन्य इंस्टेंस जिसे कॉपी किया जाना चाहिए। |

## संबंधित देखें

* Class [ExceptionWrapper](../)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(ExceptionWrapper\&&) constructor


मूव कंस्ट्रक्टर।

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(ExceptionWrapper &&other) noexcept
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| अन्य | ExceptionWrapper\&& | मूव किए जाने वाले रैपर क्लास का अन्य इंस्टेंस। |

## संबंधित देखें

* Class [ExceptionWrapper](../)
* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ExceptionWrapper::ExceptionWrapper(std::nullptr_t) constructor


[ExceptionWrapper](../) क्लास की एक नल-इंस्टेंस बनाता है जो किसी भी एक्सेप्शन का प्रतिनिधित्व नहीं करती।

```cpp
System::ExceptionWrapper<T>::ExceptionWrapper(std::nullptr_t)
```

## संबंधित देखें

* Class [ExceptionWrapper](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
