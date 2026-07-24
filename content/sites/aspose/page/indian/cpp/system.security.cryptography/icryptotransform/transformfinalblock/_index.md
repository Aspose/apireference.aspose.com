---
title: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock मेथड"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock मेथड। C++ में डेटा का अंतिम ब्लॉक प्रोसेस करता है और आउटपुट वैल्यू की गणना करता है।"
type: docs
weight: 400
url: /hi/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


डेटा के अंतिम ब्लॉक को प्रोसेस करता है और आउटपुट मान की गणना करता है।

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) से डेटा पढ़ने के लिए। |
| inputOffset | int | इनपुट बफ़र ऑफ़सेट। |
| inputCount | int | प्रोसेस करने के लिए बाइट्स की संख्या। |

### ReturnValue

पूरे इनपुट अनुक्रम के लिए आउटपुट की गणना की गई।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
