---
title: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock μέθοδος"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformFinalBlock μέθοδος. Επεξεργάζεται το τελευταίο μπλοκ δεδομένων και υπολογίζει την τιμή εξόδου σε C++."
type: docs
weight: 400
url: /el/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


Επεξεργάζεται το τελευταίο μπλοκ δεδομένων και υπολογίζει την τιμή εξόδου.

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Προσωρινή μνήμη](../../../system/buffer/) για ανάγνωση δεδομένων από. |
| inputOffset | int | Μετατόπιση του buffer εισόδου. |
| inputCount | int | Αριθμός byte προς επεξεργασία. |

### ReturnValue

Η έξοδος υπολογίστηκε για ολόκληρη τη σειρά εισόδου.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
