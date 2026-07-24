---
title: "System::Security::Cryptography::ToBase64Transform::TransformFinalBlock विधि"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ToBase64Transform::TransformFinalBlock विधि। डेटा के अंतिम ब्लॉक को प्रोसेस करता है और C++ में आउटपुट मान की गणना करता है।"
type: docs
weight: 900
url: /hi/cpp/system.security.cryptography/tobase64transform/transformfinalblock/
---
## ToBase64Transform::TransformFinalBlock method


डेटा के अंतिम ब्लॉक को प्रोसेस करता है और आउटपुट मान की गणना करता है।

```cpp
System::ArrayPtr<uint8_t> System::Security::Cryptography::ToBase64Transform::TransformFinalBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) से डेटा पढ़ने के लिए। |
| inputOffset | int32_t | इनपुट बफ़र ऑफ़सेट। |
| inputCount | int32_t | प्रोसेस करने के लिए बाइट्स की संख्या। |

### ReturnValue

पूरे इनपुट अनुक्रम के लिए आउटपुट की गणना की गई।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
