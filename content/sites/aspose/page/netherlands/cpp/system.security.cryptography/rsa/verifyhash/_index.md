---
title: "System::Security::Cryptography::RSA::VerifyHash method"
linktitle: "VerifyHash"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSA::VerifyHash method. Verifieert dat de handtekening van de opgegeven hash geldig is in C++."
type: docs
weight: 1400
url: /nl/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


Verifieert dat de handtekening van de gespecificeerde hash geldig is.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| hash | ByteArrayPtr | Hashwaarde van de ondertekende gegevens. |
| handtekening | ByteArrayPtr | Handtekeninggegevens. |
| hash_algorithm | const HashAlgorithmName\& | Hash-algoritme. |
| opvulling | SharedPtr\\<RSASignaturePadding\\> | Opvulmodus. return true als de handtekening geldig is, anders - false. |

## Zie ook

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
