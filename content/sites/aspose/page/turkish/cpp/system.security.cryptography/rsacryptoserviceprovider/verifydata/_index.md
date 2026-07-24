---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData yöntemi"
linktitle: "VerifyData"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData yöntemi. Veri imzasını C++'ta kontrol eder."
type: docs
weight: 1800
url: /tr/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


Veri imzasını kontrol eder.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | İmzası kontrol edilecek [Data](../../../system.data/). |
| halg | const SharedPtr\<Object\>\& | Kullanılacak hash algoritması. |
| imza | const ByteArrayPtr\& | Alındığı gibi imza. |

### ReturnValue

İmza geçerliyse true, aksi takdirde false.

## Ayrıca Bakınız

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
