---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData मेथड"
linktitle: "VerifyData"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData मेथड। C++ में डेटा हस्ताक्षर की जाँच करता है।"
type: docs
weight: 1800
url: /hi/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


डेटा हस्ताक्षर जाँचता है।

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) के लिए हस्ताक्षर जाँचने हेतु। |
| halg | const SharedPtr\<Object\>\& | उपयोग करने के लिए हैश एल्गोरिद्म। |
| हस्ताक्षर | const ByteArrayPtr\& | प्राप्त जैसा हस्ताक्षर। |

### ReturnValue

यदि हस्ताक्षर वैध है तो true, अन्यथा false।

## संबंधित देखें

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
