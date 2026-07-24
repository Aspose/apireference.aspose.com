---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock μέθοδος"
linktitle: "TransformBlock"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock μέθοδος. Επεξεργάζεται ένα μπλοκ δεδομένων και αντιγράφει τα δεδομένα στον πίνακα εξόδου σε C++."
type: docs
weight: 800
url: /el/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


Επεξεργάζεται μπλοκ δεδομένων και αντιγράφει τα δεδομένα στον πίνακα εξόδου.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Προσωρινή μνήμη](../../../system/buffer/) για ανάγνωση δεδομένων από. |
| inputOffset | int32_t | Μετατόπιση του buffer εισόδου. |
| inputCount | int32_t | Αριθμός byte προς επεξεργασία. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | Buffer εξόδου για αντιγραφή δεδομένων; nullptr για να μην γίνει αντιγραφή. |
| outputOffset | int32_t | Μετατόπιση buffer εξόδου. |

### ReturnValue

Αριθμός byte που γράφτηκαν.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
