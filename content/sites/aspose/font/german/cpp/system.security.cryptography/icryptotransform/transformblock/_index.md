---
title: "System::Security::Cryptography::ICryptoTransform::TransformBlock Methode"
linktitle: "TransformBlock"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::ICryptoTransform::TransformBlock Methode. RTTI-Informationen in C++."
type: docs
weight: 300
url: /de/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


RTTI-Informationen.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## Hinweise


Verarbeitet einen Datenblock und kopiert die Daten in das Ausgabearray.
## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
