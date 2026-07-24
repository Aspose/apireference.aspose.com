---
title: "System::Array::CopyTo मेथड"
linktitle: "CopyTo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Array::CopyTo मेथड। वर्तमान ऐरे के सभी तत्वों को निर्दिष्ट गंतव्य ऐरे में कॉपी करता है। तत्वों को C++ में arrayIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके गंतव्य ऐरे में डाला जाता है।"
type: docs
weight: 900
url: /hi/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


वर्तमान एरे के सभी तत्वों को निर्दिष्ट गंतव्य एरे में कॉपी करता है। तत्वों को गंतव्य एरे में arrayIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है।

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | गंतव्य ऐरे |
| arrayIndex | int | गंतव्य ऐरे में वह इंडेक्स जहाँ कॉपी किए गए आइटम्स को डालना शुरू किया जाता है |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


वर्तमान एरे के सभी तत्वों को निर्दिष्ट गंतव्य एरे में कॉपी करता है। तत्वों को गंतव्य एरे में dstIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है।

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| पैरामीटर | विवरण |
| --- | --- |
| DstType | गंतव्य ऐरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| dstIndex | int64_t | गंतव्य ऐरे में वह इंडेक्स जहाँ कॉपी किए गए आइटम्स को डालना शुरू किया जाता है |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


निर्दिष्ट स्थिति से शुरू करके वर्तमान एरे से निर्दिष्ट संख्या में तत्वों को निर्दिष्ट गंतव्य एरे में कॉपी करता है। तत्वों को गंतव्य एरे में dstIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है।

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| पैरामीटर | विवरण |
| --- | --- |
| DstType | गंतव्य ऐरे में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | गंतव्य ऐरे |
| srcIndex | int64_t | स्रोत ऐरे में वह इंडेक्स जहाँ से आइटम्स को कॉपी करना शुरू किया जाता है |
| dstIndex | int64_t | गंतव्य ऐरे में वह इंडेक्स जहाँ कॉपी किए गए आइटम्स को डालना शुरू किया जाता है |
| count | int64_t | कॉपी करने के लिए तत्वों की संख्या |

## संबंधित देखें

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


वर्तमान एरे के सभी तत्वों को निर्दिष्ट गंतव्य एरे व्यू में कॉपी करता है। तत्वों को गंतव्य एरे व्यू में dstIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है।

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| पैरामीटर | विवरण |
| --- | --- |
| DstType | गंतव्य एरे व्यू में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | गंतव्य एरे व्यू |
| dstIndex | int64_t | गंतव्य एरे व्यू में वह सूचकांक जहाँ से कॉपी किए गए आइटम डालना शुरू करना है |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


निर्दिष्ट स्थिति से शुरू करके वर्तमान एरे से निर्दिष्ट संख्या में तत्वों को निर्दिष्ट गंतव्य एरे व्यू में कॉपी करता है। तत्वों को गंतव्य एरे व्यू में dstIndex तर्क द्वारा निर्दिष्ट इंडेक्स से शुरू करके डाला जाता है।

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| पैरामीटर | विवरण |
| --- | --- |
| DstType | गंतव्य एरे व्यू में तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | गंतव्य एरे व्यू |
| srcIndex | int64_t | स्रोत ऐरे में वह इंडेक्स जहाँ से आइटम्स को कॉपी करना शुरू किया जाता है |
| dstIndex | int64_t | गंतव्य एरे व्यू में वह सूचकांक जहाँ से कॉपी किए गए आइटम डालना शुरू करना है |
| count | int64_t | कॉपी करने के लिए तत्वों की संख्या |

## संबंधित देखें

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
