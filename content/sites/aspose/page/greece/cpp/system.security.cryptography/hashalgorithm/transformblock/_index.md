---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock μέθοδος"
linktitle: "TransformBlock"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock μέθοδος. Επεξεργάζεται μπλοκ δεδομένων και αντιγράφει τα δεδομένα σε πίνακα εξόδου σε C++."
type: docs
weight: 800
url: /el/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Επεξεργάζεται μπλοκ δεδομένων και αντιγράφει τα δεδομένα στον πίνακα εξόδου.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Προσωρινή μνήμη](../../../system/buffer/) για ανάγνωση δεδομένων από. |
| inputOffset | int | Μετατόπιση του buffer εισόδου. |
| inputCount | int | Αριθμός byte προς επεξεργασία. |
| outputBuffer | ArrayPtr\<uint8_t\> | Buffer εξόδου για αντιγραφή δεδομένων; nullptr για να μην γίνει αντιγραφή. |
| outputOffset | int | Μετατόπιση buffer εξόδου. |

### ReturnValue

Αριθμός byte που γράφτηκαν.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
