---
title: "System::Net::Sockets::NetworkStream::Seek method"
linktitle: "Seek"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::NetworkStream::Seek method. C++ में वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है।"
type: docs
weight: 2000
url: /hi/cpp/system.net.sockets/networkstream/seek/
---
## NetworkStream::Seek method


वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए स्ट्रीम की स्थिति सेट करता है।

```cpp
int64_t System::Net::Sockets::NetworkStream::Seek(int64_t offset, IO::SeekOrigin origin) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| offset | int64_t | बाइट ऑफ़सेट जो **origin** द्वारा निर्दिष्ट स्थिति के सापेक्ष है। |
| origin | IO::SeekOrigin | उस स्थिति को निर्दिष्ट करता है जिससे और दिशा को जहाँ की ओर ऑफ़सेट की गणना की जाती है। |

### ReturnValue

स्ट्रीम की नई स्थिति।

## संबंधित देखें

* Enum [SeekOrigin](../../../system.io/seekorigin/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
