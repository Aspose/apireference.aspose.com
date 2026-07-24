---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock μέθοδος"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock μέθοδος. Επεξεργάζεται το τελευταίο μπλοκ δεδομένων και υπολογίζει το κατακερματισμό σε C++."
type: docs
weight: 900
url: /el/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Επεξεργάζεται το τελευταίο μπλοκ δεδομένων και υπολογίζει το κατακερματισμό.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Προσωρινή μνήμη](../../../system/buffer/) για ανάγνωση δεδομένων από. |
| inputOffset | int | Μετατόπιση του buffer εισόδου. |
| inputCount | int | Αριθμός byte προς επεξεργασία. |

### ReturnValue

Κατακερματισμός υπολογισμένος για ολόκληρη τη σειρά δεδομένων.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
