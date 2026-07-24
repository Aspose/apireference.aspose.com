---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock method"
linktitle: "TransformBlock"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock method. C++ में डेटा के ब्लॉक को प्रोसेस करता है और डेटा को आउटपुट एरे में कॉपी करता है।"
type: docs
weight: 800
url: /hi/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


डेटा के ब्लॉक को प्रोसेस करता है और डेटा को आउटपुट एरे में कॉपी करता है।

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) से डेटा पढ़ने के लिए। |
| inputOffset | int | इनपुट बफ़र ऑफ़सेट। |
| inputCount | int | प्रोसेस करने के लिए बाइट्स की संख्या। |
| outputBuffer | ArrayPtr\<uint8_t\> | डेटा कॉपी करने के लिए आउटपुट बफ़र; कोई कॉपी नहीं करने के लिए nullptr। |
| outputOffset | int | आउटपुट बफ़र ऑफ़सेट। |

### ReturnValue

लिखे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
