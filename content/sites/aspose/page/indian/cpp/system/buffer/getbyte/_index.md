---
title: "System::Buffer::GetByte मेथड"
linktitle: "GetByte"
second_title: "Aspose.Page C++ के लिए"
description: "System::Buffer::GetByte मेथड। निर्दिष्ट टाइप्ड एरे को एक कच्चे बाइट एरे के रूप में व्याख्या करता है और C++ में निर्दिष्ट बाइट ऑफसेट पर बाइट मान को पुनः प्राप्त करता है।"
type: docs
weight: 300
url: /hi/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान प्राप्त करता है।

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | सरणी के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const SharedPtr\<Array\<T\>\>\& | लक्षित सरणी |
| सूचकांक | int | बाइट को पुनः प्राप्त करने के लिए शून्य-आधारित ऑफसेट |

### ReturnValue

निर्दिष्ट इंडेक्स पर बाइट मान

## संबंधित देखें

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान प्राप्त करता है।

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | एरे व्यू के तत्वों का प्रकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const System::Details::ArrayView\<T\>\& | लक्षित सरणी दृश्य |
| सूचकांक | int | बाइट को पुनः प्राप्त करने के लिए शून्य-आधारित ऑफसेट |

### ReturnValue

निर्दिष्ट इंडेक्स पर बाइट मान

## संबंधित देखें

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


निर्दिष्ट टाइप्ड एरे को कच्चे बाइट एरे के रूप में व्याख्या करता है और निर्दिष्ट बाइट ऑफसेट पर बाइट मान प्राप्त करता है।

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| पैरामीटर | विवरण |
| --- | --- |
| T | स्टैक एरे के तत्वों का प्रकार |
| N | स्टैक सरणी का आकार |

| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| ऐरे | const System::Details::StackArray\<T, N\>\& | लक्षित स्टैक सरणी |
| सूचकांक | int | बाइट को पुनः प्राप्त करने के लिए शून्य-आधारित ऑफसेट |

### ReturnValue

निर्दिष्ट इंडेक्स पर बाइट मान

## संबंधित देखें

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
