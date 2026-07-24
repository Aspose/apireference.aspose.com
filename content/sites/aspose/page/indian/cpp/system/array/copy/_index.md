---
title: "System::Array::Copy method"
linktitle: "कॉपी"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::Copy method. स्रोत एरे से गंतव्य एरे में निर्दिष्ट संख्या में तत्वों को C++ में कॉपी करता है।"
type: docs
weight: 4900
url: /hi/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


निर्दिष्ट संख्या में तत्वों को स्रोत एरे से गंतव्य एरे में कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | स्रोत ऐरे |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्रोत ऐरे में तत्वों का प्रकार |
| DstType | गंतव्य ऐरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | स्रोत ऐरे |
| srcIndex | int64_t | स्रोत ऐरे में वह इंडेक्स जो कॉपी करने वाले आइटम्स की रेंज की शुरुआत दर्शाता है |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| dstIndex | int64_t | गंतव्य ऐरे में वह इंडेक्स जहाँ कॉपी किए गए आइटम्स को डालना शुरू किया जाता है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे व्यू में निर्दिष्ट स्थिति तक कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्रोत ऐरे में तत्वों का प्रकार |
| DstType | गंतव्य एरे व्यू में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | स्रोत ऐरे |
| srcIndex | int64_t | स्रोत ऐरे में वह इंडेक्स जो कॉपी करने वाले आइटम्स की रेंज की शुरुआत दर्शाता है |
| dstArray | System::Details::ArrayView\<DstType\> | गंतव्य एरे व्यू |
| dstIndex | int64_t | गंतव्य एरे व्यू में वह सूचकांक जहाँ से कॉपी किए गए आइटम डालना शुरू करना है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को स्टैक पर गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है।

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्रोत ऐरे में तत्वों का प्रकार |
| DstType | स्टैक पर गंतव्य एरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | स्रोत ऐरे |
| srcIndex | int64_t | स्रोत ऐरे में वह इंडेक्स जो कॉपी करने वाले आइटम्स की रेंज की शुरुआत दर्शाता है |
| dstArray | System::Details::StackArray\<DstType, N\>\& | स्टैक पर गंतव्य एरे |
| dstIndex | int64_t | स्टैक पर गंतव्य एरे में वह सूचकांक जहाँ से कॉपी किए गए आइटम डालना शुरू करना है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


निर्दिष्ट संख्या में तत्वों को स्रोत एरे से गंतव्य एरे व्यू में कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | स्रोत ऐरे |
| dstArray | System::Details::ArrayView\<DstType\> | गंतव्य एरे व्यू |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


स्रोत एरे से स्टैक पर गंतव्य एरे में निर्दिष्ट संख्या में तत्वों को कॉपी करता है।

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | स्रोत ऐरे |
| dstArray | System::Details::StackArray\<DstType, N\>\& | स्टैक पर गंतव्य एरे |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


स्रोत एरे व्यू से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को स्टैक पर गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है।

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्टैक पर स्रोत एरे में तत्वों का प्रकार |
| DstType | स्टैक पर गंतव्य एरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | स्रोत एरे व्यू |
| srcIndex | int64_t | स्रोत एरे व्यू में वह सूचकांक जो कॉपी करने वाले आइटम की रेंज की शुरुआत को दर्शाता है |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | स्टैक पर गंतव्य एरे |
| dstIndex | int64_t | स्टैक पर गंतव्य एरे में वह सूचकांक जहाँ से कॉपी किए गए आइटम डालना शुरू करना है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


निर्दिष्ट संख्या में तत्वों को स्रोत एरे व्यू से गंतव्य एरे में कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | स्रोत एरे व्यू |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


स्रोत एरे व्यू से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्रोत एरे दृश्य में तत्वों का प्रकार |
| DstType | गंतव्य ऐरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | स्रोत एरे व्यू |
| srcIndex | int64_t | स्रोत एरे व्यू में वह सूचकांक जो कॉपी करने वाले आइटम की रेंज की शुरुआत को दर्शाता है |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| dstIndex | int64_t | गंतव्य ऐरे में वह इंडेक्स जहाँ कॉपी किए गए आइटम्स को डालना शुरू किया जाता है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


स्रोत एरे व्यू से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे व्यू में निर्दिष्ट स्थिति तक कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्रोत एरे दृश्य में तत्वों का प्रकार |
| DstType | गंतव्य एरे व्यू में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | स्रोत एरे व्यू |
| srcIndex | int64_t | स्रोत एरे व्यू में वह सूचकांक जो कॉपी करने वाले आइटम की रेंज की शुरुआत को दर्शाता है |
| dstArray | System::Details::ArrayView\<DstType\> | गंतव्य एरे व्यू |
| dstIndex | int64_t | गंतव्य एरे व्यू में वह सूचकांक जहाँ से कॉपी किए गए आइटम डालना शुरू करना है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


निर्दिष्ट संख्या में तत्वों को स्रोत एरे व्यू से गंतव्य एरे व्यू में कॉपी करता है।

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | स्रोत एरे व्यू |
| dstArray | System::Details::ArrayView\<DstType\> | गंतव्य एरे व्यू |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


स्टैक पर स्रोत एरे से गंतव्य एरे में निर्दिष्ट संख्या में तत्वों को कॉपी करता है।

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | स्टैक पर स्रोत एरे |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


स्टैक पर स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है।

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्टैक पर स्रोत एरे में तत्वों का प्रकार |
| DstType | गंतव्य ऐरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | स्टैक पर स्रोत एरे |
| srcIndex | int64_t | स्टैक पर स्रोत एरे में वह सूचकांक जो कॉपी करने वाले आइटमों की रेंज की शुरुआत दर्शाता है |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| dstIndex | int64_t | गंतव्य ऐरे में वह इंडेक्स जहाँ कॉपी किए गए आइटम्स को डालना शुरू किया जाता है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


स्टैक पर स्रोत एरे से निर्दिष्ट इंडेक्स से शुरू होकर निर्दिष्ट संख्या में तत्वों को स्टैक पर गंतव्य एरे में निर्दिष्ट स्थिति तक कॉपी करता है।

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| पैरामीटर | विवरण |
| --- | --- |
| SrcType | स्टैक पर स्रोत एरे में तत्वों का प्रकार |
| DstType | स्टैक पर गंतव्य एरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | स्टैक पर स्रोत एरे |
| srcIndex | int64_t | स्टैक पर स्रोत एरे में वह सूचकांक जो कॉपी करने वाले आइटमों की रेंज की शुरुआत दर्शाता है |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | स्टैक पर गंतव्य एरे |
| dstIndex | int64_t | स्टैक पर गंतव्य एरे में वह सूचकांक जहाँ से कॉपी किए गए आइटम डालना शुरू करना है |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


स्टैक पर स्रोत एरे से स्टैक पर गंतव्य एरे में निर्दिष्ट संख्या में तत्वों को कॉपी करता है।

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | स्टैक पर स्रोत एरे |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | स्टैक पर गंतव्य एरे |
| count | int64_t | कॉपी करने वाले तत्वों की संख्या |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
