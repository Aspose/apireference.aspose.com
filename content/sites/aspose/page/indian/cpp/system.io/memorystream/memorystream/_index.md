---
title: "System::IO::MemoryStream::MemoryStream कंस्ट्रक्टर"
linktitle: "MemoryStream"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::MemoryStream::MemoryStream कंस्ट्रक्टर. C++ में प्रारंभिक क्षमता 0 के साथ MemoryStream क्लास का नया इंस्टेंस बनाता है."
type: docs
weight: 100
url: /hi/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


नया इंस्टेंस बनाता है [MemoryStream](../) क्लास का, जिसकी प्रारंभिक क्षमता 0 है.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## संबंधित देखें

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


नया इंस्टेंस बनाता है [MemoryStream](../) क्लास का, जो एक मेमोरी स्ट्रीम का प्रतिनिधित्व करता है जो निर्दिष्ट मेमोरी बफ़र से जुड़ा होता है। एक पैरामीटर यह निर्दिष्ट करता है कि स्ट्रीम लिखने योग्य है या नहीं.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सामग्री | const ArrayPtr\<uint8_t\>\& | एक बाइट एरे जिसे मेमोरी बफ़र के रूप में उपयोग किया जाएगा, जिस पर बनायी गयी ऑब्जेक्ट की स्ट्रीम आधारित होगी |
| लिखने योग्य | bool | निर्दिष्ट करता है कि स्ट्रीम लिखने योग्य होनी चाहिए या नहीं |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


नया इंस्टेंस बनाता है [MemoryStream](../) क्लास का, जो एक मेमोरी स्ट्रीम का प्रतिनिधित्व करता है जो निर्दिष्ट मेमोरी बफ़र के एक खंड से जुड़ा है, जो निर्दिष्ट इंडेक्स से शुरू होता है और निर्दिष्ट संख्या में तत्वों को शामिल करता है। पैरामीटर यह निर्दिष्ट करता है कि स्ट्रीम लिखने योग्य है और क्या GetBytes() मेथड को कॉल किया जा सकता है.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| सामग्री | const ArrayPtr\<uint8_t\>\& | एक बाइट एरे जिसका एक खंड मेमोरी बफ़र के रूप में उपयोग किया जाएगा, जिस पर बनायी गयी ऑब्जेक्ट की स्ट्रीम आधारित होगी |
| सूचकांक | int | **content** में उस तत्व का 0-आधारित इंडेक्स जहाँ से खंड शुरू होता है |
| count | int | सेगमेंट में शामिल **content** के तत्वों की संख्या |
| लिखने योग्य | bool | निर्दिष्ट करता है कि स्ट्रीम लिखने योग्य होनी चाहिए या नहीं |
| publiclyVisible | bool | निर्दिष्ट करता है कि अंतर्निहित मेमोरी बफ़र को GetByte() मेथड के कॉलर के लिए उपलब्ध कराया जाना चाहिए या नहीं |

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


नया इंस्टेंस बनाता है [MemoryStream](../) क्लास का, जो निर्दिष्ट आकार के मेमोरी बफ़र पर आधारित एक स्ट्रीम का प्रतिनिधित्व करता है.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| capacity_ | int | बनाए जा रहे ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम से जुड़े मेमोरी बफ़र का आकार बाइट्स में |

## संबंधित देखें

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
