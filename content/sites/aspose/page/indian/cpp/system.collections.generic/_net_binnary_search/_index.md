---
title: "System::Collections::Generic::_net_binnary_search मेथड"
linktitle: "_net_binnary_search"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::_net_binnary_search मेथड। रैंडम एक्सेस कंटेनर में बाइनरी सर्च को लागू करता है। स्मार्ट पॉइंटर्स के लिए विशेषीकरण। C++ में System::Object::CompareTo मेथड का उपयोग करता है।"
type: docs
weight: 4900
url: /hi/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


रैंडम एक्सेस कंटेनर में बाइनरी सर्च को लागू करता है। स्मार्ट पॉइंटर्स के लिए विशेषीकरण। System::Object::CompareTo मेथड का उपयोग करता है।

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| पैरामीटर | विवरण |
| --- | --- |
| containerT | दो टेम्प्लेट आर्ग्यूमेंट्स वाले STL-शैली के कंटेनर टेम्प्लेट प्रकार: तत्व प्रकार और अलोकेटर प्रकार। |
| T | तत्व प्रकार। |
| Allocator | अलोकेटर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कंटेनर | const containterT\<T, Allocator\>\& | जिस कंटेनर में खोज करनी है। |
| सूचकांक | int | खोज सीमा की प्रारंभिक इंडेक्स। |
| count | int | खोज सीमा की लंबाई। |
| मान | T | खोजने के लिए मान। |

### ReturnValue

यदि मिला, तो अगले तत्व का सूचकांक; अन्यथा, उस सूचकांक का पूरक जहाँ खोज रुक गई।

## संबंधित देखें

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


रैंडम एक्सेस कंटेनर में बाइनरी सर्च लागू करता है। वैल्यू प्रकारों के लिए विशेषीकरण। CompareTo मेथड का उपयोग करता है।

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| पैरामीटर | विवरण |
| --- | --- |
| containerT | दो टेम्प्लेट आर्ग्यूमेंट्स वाले STL-शैली के कंटेनर टेम्प्लेट प्रकार: तत्व प्रकार और अलोकेटर प्रकार। |
| T | तत्व प्रकार। |
| Allocator | अलोकेटर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कंटेनर | const containterT\<T, Allocator\>\& | जिस कंटेनर में खोज करनी है। |
| सूचकांक | int | खोज सीमा की प्रारंभिक इंडेक्स। |
| count | int | खोज सीमा की लंबाई। |
| मान | T | खोजने के लिए मान। |

### ReturnValue

यदि मिला, तो अगले तत्व का सूचकांक; अन्यथा, उस सूचकांक का पूरक जहाँ खोज रुक गई।

## संबंधित देखें

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


रैंडम एक्सेस कंटेनर में बाइनरी सर्च लागू करता है। स्केलर प्रकारों के लिए विशेषीकरण। तत्वों की तुलना बड़े और छोटे ऑपरेटरों से करता है।

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| पैरामीटर | विवरण |
| --- | --- |
| containerT | दो टेम्प्लेट आर्ग्यूमेंट्स वाले STL-शैली के कंटेनर टेम्प्लेट प्रकार: तत्व प्रकार और अलोकेटर प्रकार। |
| T | तत्व प्रकार। |
| Allocator | अलोकेटर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कंटेनर | const containterT\<T, Allocator\>\& | जिस कंटेनर में खोज करनी है। |
| सूचकांक | int | खोज सीमा की प्रारंभिक इंडेक्स। |
| count | int | खोज सीमा की लंबाई। |
| मान | T | खोजने के लिए मान। |

### ReturnValue

यदि मिला, तो अगले तत्व का सूचकांक; अन्यथा, उस सूचकांक का पूरक जहाँ खोज रुक गई।

## संबंधित देखें

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


रैंडम एक्सेस कंटेनर में बाइनरी सर्च लागू करता है।

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| पैरामीटर | विवरण |
| --- | --- |
| containerT | दो टेम्प्लेट आर्ग्यूमेंट्स वाले STL-शैली के कंटेनर टेम्प्लेट प्रकार: तत्व प्रकार और अलोकेटर प्रकार। |
| T | तत्व प्रकार। |
| Allocator | अलोकेटर प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| कंटेनर | const containterT\<T, Allocator\>\& | जिस कंटेनर में खोज करनी है। |
| सूचकांक | int | खोज सीमा की प्रारंभिक इंडेक्स। |
| count | int | खोज सीमा की लंबाई। |
| मान | T | खोजने के लिए मान। |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) ऑब्जेक्ट। |

### ReturnValue

यदि मिला, तो अगले तत्व का सूचकांक; अन्यथा, उस सूचकांक का पूरक जहाँ खोज रुक गई।

## संबंधित देखें

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
