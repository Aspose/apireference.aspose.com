---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock method"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock मेथड। C++ में डेटा के अंतिम ब्लॉक को प्रोसेस करता है और हैश की गणना करता है।"
type: docs
weight: 900
url: /hi/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


डेटा के अंतिम ब्लॉक को प्रोसेस करता है और हैश की गणना करता है।

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) से डेटा पढ़ने के लिए। |
| inputOffset | int | इनपुट बफ़र ऑफ़सेट। |
| inputCount | int | प्रोसेस करने के लिए बाइट्स की संख्या। |

### ReturnValue

पूरे डेटा अनुक्रम के लिए गणना किया गया हैश।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
