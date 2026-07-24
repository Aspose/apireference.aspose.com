---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature मेथड"
linktitle: "VerifySignature"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature मेथड। निर्दिष्ट डेटा के लिए C++ में DSA हस्ताक्षर को सत्यापित करता है।"
type: docs
weight: 1900
url: /hi/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


निर्दिष्ट डेटा के लिए [DSA](../../dsa/) हस्ताक्षर को सत्यापित करें।

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) **rgb_signature** के साथ हस्ताक्षरित। |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) हस्ताक्षर। |

### ReturnValue

true - यदि **rgb_signature** **rgb_hash** पर गणना किए गए [DSA](../../dsa/) हस्ताक्षर से मेल खाता है, अन्यथा - false।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
