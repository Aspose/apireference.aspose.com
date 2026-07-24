---
title: "System::Security::Cryptography::RSA::SignHash-metoden"
linktitle: "SignHash"
second_title: "Aspose.Page för C++"
description: "System::Security::Cryptography::RSA::SignHash-metoden. Beräknar signaturen för det angivna hash-värdet i C++."
type: docs
weight: 1100
url: /sv/cpp/system.security.cryptography/rsa/signhash/
---
## RSA::SignHash method


Beräknar signaturen för det angivna hashvärdet.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::RSA::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| hash | ByteArrayPtr | Hash-värde. |
| hash_algorithm | HashAlgorithmName | Hash-algoritm. |
| padding | SharedPtr\<RSASignaturePadding\> | Padding-läge. returnerar [RSA](../)-signatur för det angivna hash-värdet. |

## Se även

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
