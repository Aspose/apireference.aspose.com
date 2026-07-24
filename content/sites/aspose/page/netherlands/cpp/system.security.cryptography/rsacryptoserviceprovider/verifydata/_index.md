---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData methode"
linktitle: "VerifyData"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData methode. Controleert de gegevenshandtekening in C++."
type: docs
weight: 1800
url: /nl/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


Controleert de gegevenshandtekening.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) om de handtekening voor te controleren. |
| halg | const SharedPtr\<Object\>\& | Hash-algoritme om te gebruiken. |
| handtekening | const ByteArrayPtr\& | Handtekening zoals ontvangen. |

### ReturnValue

True als de handtekening geldig is, false anders.

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
