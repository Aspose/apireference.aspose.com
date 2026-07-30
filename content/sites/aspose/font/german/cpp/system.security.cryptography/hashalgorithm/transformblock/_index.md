---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock method"
linktitle: "TransformBlock"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock method. Verarbeitet einen Datenblock und kopiert Daten in das Ausgabearray in C++."
type: docs
weight: 800
url: /de/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


Verarbeitet einen Datenblock und kopiert die Daten in das Ausgabearray.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) zum Lesen von Daten. |
| inputOffset | int | Versatz des Eingabepuffers. |
| inputCount | int | Anzahl der zu verarbeitenden Bytes. |
| outputBuffer | ArrayPtr\<uint8_t\> | Ausgabepuffer, in den Daten kopiert werden; nullptr, um kein Kopieren durchzuführen. |
| outputOffset | int | Versatz des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
