---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock μέθοδος"
linktitle: "TransformBlock"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock μέθοδος. Πληροφορίες RTTI σε C++."
type: docs
weight: 300
url: /el/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


Πληροφορίες RTTI.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## Παρατηρήσεις


Επεξεργάζεται μπλοκ δεδομένων και αντιγράφει τα δεδομένα στον πίνακα εξόδου.
## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
