---
title: "System::Security::Cryptography::DSA::VerifySignature मेथड"
linktitle: "VerifySignature"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::DSA::VerifySignature मेथड। C++ में निर्दिष्ट डेटा के लिए DSA सिग्नेचर को वेरिफ़ाई करता है।"
type: docs
weight: 800
url: /hi/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


निर्दिष्ट डेटा के लिए [DSA](../) सिग्नेचर को वेरिफ़ाई करें।

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) **rgb_signature** के साथ हस्ताक्षरित। |
| rgb_signature | ByteArrayPtr | [DSA](../) सिग्नेचर। |

### ReturnValue

true - यदि **rgb_signature** [DSA](../) सिग्नेचर से मेल खाता है जो **rgb_hash** पर गणना किया गया है, अन्यथा - false।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
