---
title: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock Methode"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformFinalBlock Methode. Verarbeitet den letzten Datenblock und berechnet den Hash in C++."
type: docs
weight: 900
url: /de/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


Verarbeitet den letzten Datenblock und berechnet den Hash.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) zum Lesen von Daten. |
| inputOffset | int | Versatz des Eingabepuffers. |
| inputCount | int | Anzahl der zu verarbeitenden Bytes. |

### ReturnValue

Hash, der für die gesamte Datenfolge berechnet wurde.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
