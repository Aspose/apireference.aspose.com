---
title: "System::Buffer::SetByte विधि"
linktitle: "SetByte"
second_title: "Aspose.Page C++ के लिए"
description: "System::Buffer::SetByte विधि। निर्दिष्ट टाइप्ड सरणी को कच्ची बाइट सरणी के रूप में व्याख्या करता है और निर्दिष्ट बाइट मान को निर्दिष्ट बाइट ऑफ़सेट पर C++ में सेट करता है।"
type: docs
weight: 400
url: /hi/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान सेट करता है।

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | सरणी के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const SharedPtr\<Array\<T\>\>\& | लक्षित सरणी |
| सूचकांक | int | सेट करने वाले बाइट का शून्य-आधारित ऑफ़सेट |
| मान | uint8_t | सेट करने के लिए बाइट मान |

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान सेट करता है।

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | सरणी के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const System::Details::ArrayView\<T\>\& | लक्षित सरणी दृश्य |
| सूचकांक | int | सेट करने वाले बाइट का शून्य-आधारित ऑफ़सेट |
| मान | uint8_t | सेट करने के लिए बाइट मान |

## संबंधित देखें

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान सेट करता है।

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | सरणी के तत्वों का प्रकार |
| N | स्टैक सरणी का आकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const System::Details::StackArray\<T, N\>\& | लक्षित स्टैक सरणी |
| सूचकांक | int | सेट करने वाले बाइट का शून्य-आधारित ऑफ़सेट |
| मान | uint8_t | सेट करने के लिए बाइट मान |

## संबंधित देखें

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
