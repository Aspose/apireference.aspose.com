---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash मेथड"
linktitle: "VerifyHash"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash मेथड। C++ में डेटा सिग्नेचर की जाँच करता है।"
type: docs
weight: 1800
url: /hi/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


डेटा हस्ताक्षर जाँचता है।

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | प्राप्त डेटा के लिए गणना किया गया हैश। |
| str | const String\& | उपयोग किए गए हैश एल्गोरिदम का नाम। |
| rgb_signature | const ByteArrayPtr\& | प्राप्त जैसा हस्ताक्षर। |

### ReturnValue

यदि हस्ताक्षर वैध है तो true, अन्यथा false।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
