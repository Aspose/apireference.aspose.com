---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash metod"
linktitle: "VerifyHash"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash metod. Kontrollerar datasignatur i C++."
type: docs
weight: 1800
url: /sv/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


Kontrollerar datasignatur.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash beräknad för mottagen data. |
| str | const String\& | Namn på hash-algoritm som används. |
| rgb_signature | const ByteArrayPtr\& | Signatur som mottagits. |

### ReturnValue

Sant om signaturen är giltig, falskt annars.

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
