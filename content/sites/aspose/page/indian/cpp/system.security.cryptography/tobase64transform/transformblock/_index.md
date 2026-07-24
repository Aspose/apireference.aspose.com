---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock विधि"
linktitle: "TransformBlock"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock विधि। डेटा के ब्लॉक को प्रोसेस करता है और C++ में डेटा को आउटपुट एरे में कॉपी करता है।"
type: docs
weight: 800
url: /hi/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


डेटा के ब्लॉक को प्रोसेस करता है और डेटा को आउटपुट एरे में कॉपी करता है।

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) से डेटा पढ़ने के लिए। |
| inputOffset | int32_t | इनपुट बफ़र ऑफ़सेट। |
| inputCount | int32_t | प्रोसेस करने के लिए बाइट्स की संख्या। |
| outputBuffer | System::ArrayPtr\<uint8_t\> | डेटा कॉपी करने के लिए आउटपुट बफ़र; कोई कॉपी नहीं करने के लिए nullptr। |
| outputOffset | int32_t | आउटपुट बफ़र ऑफ़सेट। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
