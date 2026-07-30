---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock Methode"
linktitle: "TransformBlock"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock Methode. Verarbeitet einen Datenblock und kopiert die Daten in das Ausgabearray in C++."
type: docs
weight: 800
url: /de/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


Verarbeitet einen Datenblock und kopiert die Daten in das Ausgabearray.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) zum Lesen von Daten. |
| inputOffset | int32_t | Versatz des Eingabepuffers. |
| inputCount | int32_t | Anzahl der zu verarbeitenden Bytes. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | Ausgabepuffer, in den Daten kopiert werden; nullptr, um kein Kopieren durchzuführen. |
| outputOffset | int32_t | Versatz des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
