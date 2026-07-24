---
title: "System::IO::MemoryStream::TryGetBuffer मेथड"
linktitle: "TryGetBuffer"
second_title: "Aspose.Page C++ के लिए"
description: "System::IO::MemoryStream::TryGetBuffer मेथड। C++ में इस स्ट्रीम के निर्माण के लिए उपयोग किए गए अनसाइन्ड बाइट्स की एरे लौटाता है।"
type: docs
weight: 1800
url: /hi/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


उस अनसाइनड बाइट्स की एरे लौटाता है जिससे यह स्ट्रीम बनाई गई थी।

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | ArraySegment\<uint8_t\>\& | बाइट एरे - आउट पैरामीटर। जब यह मेथड true लौटाता है, तो वह बाइट एरे सेगमेंट जिसमें से यह स्ट्रीम बनाया गया था; जब यह मेथड false लौटाता है, तो यह पैरामीटर डिफ़ॉल्ट पर सेट हो जाता है। |

### ReturnValue

यदि रूपांतरण सफल हुआ तो True।

## संबंधित देखें

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
