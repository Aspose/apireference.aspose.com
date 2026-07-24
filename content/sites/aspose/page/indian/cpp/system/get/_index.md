---
title: "System::Get विधि"
linktitle: "प्राप्तकरें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Get विधि. ट्यूपल के N-वें तत्व को प्राप्त करने का फ़ंक्शन। C++ में बेस ऑब्जेक्ट के लिए ओवरलोड।"
type: docs
weight: 20700
url: /hi/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


ट्यूपल के N-वें तत्व को प्राप्त करने का फ़ंक्शन। बेस ऑब्जेक्ट के लिए ओवरलोड।

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| पैरामीटर | विवरण |
| --- | --- |
| N | तत्व सूचकांक। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऑब्जेक्ट | const SharedPtr\<Object\>\& | निरीक्षण के लिए ऑब्जेक्ट। |

### ReturnValue

N-वें ट्यूपल तत्व का मान ऑब्जेक्ट में कास्ट किया गया।

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


ट्यूपल के N-वें तत्व को प्राप्त करने का फ़ंक्शन। साझा पॉइंटर्स के लिए ओवरलोड।

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| पैरामीटर | विवरण |
| --- | --- |
| N | तत्व सूचकांक। |
| T | निरीक्षित ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऑब्जेक्ट | const SharedPtr\<T\>\& | निरीक्षण के लिए ऑब्जेक्ट। |

### ReturnValue

N-वें ट्यूपल तत्व का मान।

## संबंधित देखें

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const T\&) method


ट्यूपल के N-वें तत्व को प्राप्त करने का फ़ंक्शन। Deconstruct विधि वाले ऑब्जेक्ट्स के लिए ओवरलोड।

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| पैरामीटर | विवरण |
| --- | --- |
| N | तत्व सूचकांक। |
| T | निरीक्षित ऑब्जेक्ट का प्रकार। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऑब्जेक्ट | const T\& | निरीक्षण के लिए ऑब्जेक्ट। |

### ReturnValue

N-वें ट्यूपल तत्व का मान।

## संबंधित देखें

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


मान ट्यूपल का N-वा तत्व प्राप्त करता है।

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| पैरामीटर | विवरण |
| --- | --- |
| N | तत्व सूचकांक। |
| आर्ग्युमेंट्स | ट्यूपल तत्व। |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ट्यूपल | const ValueTuple\<Args...\>\& | ट्यूपल से तत्व प्राप्त करने के लिए। |

### ReturnValue

N-वें ट्यूपल तत्व का मान।

## संबंधित देखें

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
