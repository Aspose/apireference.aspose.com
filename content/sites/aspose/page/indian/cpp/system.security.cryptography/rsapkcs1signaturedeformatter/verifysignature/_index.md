---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature मेथड"
linktitle: "VerifySignature"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature मेथड। C++ में डेटा हैश के सिग्नेचर को सत्यापित करता है।"
type: docs
weight: 400
url: /hi/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


डेटा हैश के हस्ताक्षर को सत्यापित करता है।

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | डेटा के लिए हैश गणना किया गया। |
| rgbSignature | System::ArrayPtr\<uint8_t\> | डेटा के लिए सिग्नेचर प्राप्त हुआ। |

### ReturnValue

यदि हस्ताक्षर वैध है तो true, अन्यथा false।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
