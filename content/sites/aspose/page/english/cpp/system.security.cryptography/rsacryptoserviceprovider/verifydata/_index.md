---
title: System::Security::Cryptography::RSACryptoServiceProvider::VerifyData method
linktitle: VerifyData
second_title: Aspose.Page for C++
description: 'System::Security::Cryptography::RSACryptoServiceProvider::VerifyData method. Checks data signature in C++.'
type: docs
weight: 1700
url: /cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


Checks data signature.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| Parameter | Type | Description |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) to check signature for. |
| halg | const SharedPtr\<Object\>\& | Hash algorithm to use. |
| signature | const ByteArrayPtr\& | Signature as received. |

### ReturnValue

True if signature is valid, false otherwise.

## See Also

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
