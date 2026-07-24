---
title: "System::Buffer::BlockCopy विधि"
linktitle: "BlockCopy"
second_title: "Aspose.Page C++ के लिए"
description: "System::Buffer::BlockCopy विधि। दो निर्दिष्ट टाइप्ड एरे को बाइट्स के कच्चे एरे के रूप में व्याख्या करता है और C++ में एक से दूसरे में डेटा कॉपी करता है।"
type: docs
weight: 100
url: /hi/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है।

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| पैरामीटर | विवरण |
| --- | --- |
| TSrc | स्रोत एरे के तत्वों का प्रकार |
| TDst | गंतव्य एरे के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | स्रोत एरे |
| srcOffset | int | स्रोत एरे में वह बाइट ऑफसेट जहाँ कॉपी शुरू होती है |
| dst | const SharedPtr\<Array\<TDst\>\>\& | गंतव्य एरे |
| dstOffset | int | गंतव्य एरे में वह बाइट ऑफसेट जहाँ डेटा डालना शुरू किया जाता है |
| count | int | कॉपी करने के लिए बाइट्स की संख्या |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है।

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| पैरामीटर | विवरण |
| --- | --- |
| TSrc | स्रोत एरे के तत्वों का प्रकार |
| TDst | गंतव्य एरे व्यू के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | स्रोत एरे |
| srcOffset | int | स्रोत एरे में वह बाइट ऑफसेट जहाँ कॉपी शुरू होती है |
| dst | const System::Details::ArrayView\<TDst\>\& | गंतव्य एरे व्यू |
| dstOffset | int | गंतव्य एरे व्यू में वह बाइट ऑफसेट जहाँ डेटा डालना शुरू किया जाता है |
| count | int | कॉपी करने के लिए बाइट्स की संख्या |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है।

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| पैरामीटर | विवरण |
| --- | --- |
| TSrc | स्रोत एरे के तत्वों का प्रकार |
| TDst | गंतव्य स्टैक एरे के तत्वों का प्रकार |
| ND | गंतव्य स्टैक एरे का आकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | स्रोत एरे |
| srcOffset | int | स्रोत एरे में वह बाइट ऑफसेट जहाँ कॉपी शुरू होती है |
| dst | const System::Details::StackArray\<TDst, ND\>\& | गंतव्य स्टैक एरे |
| dstOffset | int | गंतव्य स्टैक एरे में वह बाइट ऑफसेट जहाँ डेटा डालना शुरू किया जाता है |
| count | int | कॉपी करने के लिए बाइट्स की संख्या |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है।

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| पैरामीटर | विवरण |
| --- | --- |
| TSrc | स्रोत एरे व्यू के तत्वों का प्रकार |
| TDst | गंतव्य एरे के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | स्रोत एरे व्यू |
| srcOffset | int | स्रोत एरे व्यू में वह बाइट ऑफसेट जहाँ कॉपी शुरू होती है |
| dst | const SharedPtr\<Array\<TDst\>\>\& | गंतव्य एरे |
| dstOffset | int | गंतव्य एरे में वह बाइट ऑफसेट जहाँ डेटा डालना शुरू किया जाता है |
| count | int | कॉपी करने के लिए बाइट्स की संख्या |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है।

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| पैरामीटर | विवरण |
| --- | --- |
| TSrc | स्रोत एरे व्यू के तत्वों का प्रकार |
| TDst | गंतव्य एरे व्यू के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | स्रोत एरे व्यू |
| srcOffset | int | स्रोत एरे व्यू में वह बाइट ऑफसेट जहाँ कॉपी शुरू होती है |
| dst | const System::Details::ArrayView\<TDst\>\& | गंतव्य एरे व्यू |
| dstOffset | int | गंतव्य एरे व्यू में वह बाइट ऑफसेट जहाँ डेटा डालना शुरू किया जाता है |
| count | int | कॉपी करने के लिए बाइट्स की संख्या |

## संबंधित देखें

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है।

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| पैरामीटर | विवरण |
| --- | --- |
| TSrc | स्रोत स्टैक एरे के तत्वों का प्रकार |
| NS | स्रोत स्टैक एरे का आकार |
| TDst | गंतव्य एरे के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | स्रोत स्टैक एरे |
| srcOffset | int | स्रोत स्टैक एरे में वह बाइट ऑफसेट जहाँ कॉपी शुरू होती है |
| dst | const SharedPtr\<Array\<TDst\>\>\& | गंतव्य एरे |
| dstOffset | int | गंतव्य एरे में वह बाइट ऑफसेट जहाँ डेटा डालना शुरू किया जाता है |
| count | int | कॉपी करने के लिए बाइट्स की संख्या |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


दो निर्दिष्ट टाइप्ड एरेज़ को कच्चे बाइट एरेज़ के रूप में व्याख्या करता है और उनके बीच डेटा कॉपी करता है।

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| पैरामीटर | विवरण |
| --- | --- |
| TSrc | स्रोत स्टैक एरे के तत्वों का प्रकार |
| NS | स्रोत स्टैक एरे का आकार |
| TDst | गंतव्य स्टैक एरे के तत्वों का प्रकार |
| ND | गंतव्य स्टैक एरे का आकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | स्रोत स्टैक एरे |
| srcOffset | int | स्रोत स्टैक एरे में वह बाइट ऑफसेट जहाँ कॉपी शुरू होती है |
| dst | const System::Details::StackArray\<TDst, ND\>\& | गंतव्य स्टैक एरे |
| dstOffset | int | गंतव्य स्टैक एरे में वह बाइट ऑफसेट जहाँ डेटा डालना शुरू किया जाता है |
| count | int | कॉपी करने के लिए बाइट्स की संख्या |

## संबंधित देखें

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


निर्दिष्ट संख्या में बाइट्स को स्रोत बफ़र से गंतव्य बफ़र में कॉपी करता है।

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| src | const uint8_t * | स्रोत बफ़र का पॉइंटर |
| srcOffset | int | स्रोत बफ़र में वह बाइट ऑफसेट जहाँ कॉपी शुरू होती है |
| dst | uint8_t * | गंतव्य बफ़र का पॉइंटर |
| dstOffset | int | गंतव्य बफ़र में वह बाइट ऑफसेट जहाँ डेटा डालना शुरू किया जाता है |
| count | int | कॉपी करने के लिए बाइट्स की संख्या |

## संबंधित देखें

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
