---
title: "System::Net::Sockets::Socket::IOControl methode"
linktitle: "IOControl"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket::IOControl methode. Stelt laag-niveau operationele modi in voor de socket in C++."
type: docs
weight: 4000
url: /nl/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Stelt low-level operationele modi voor de socket in.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ioControlCode | int32_t | De besturingscode van de uit te voeren bewerking. |
| optionInValue | System::ArrayPtr\<uint8_t\> | De byte-array die de invoergegevens bevat. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | De byte-array die de uitvoergegevens bevat. |

### ReturnValue

Het aantal bytes in de **optionOutValue** parameter.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Stelt low-level operationele modi voor de socket in.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ioControlCode | IOControlCode | De besturingscode van de uit te voeren bewerking. |
| optionInValue | System::ArrayPtr\<uint8_t\> | De byte-array die de invoergegevens bevat. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | De byte-array die de uitvoergegevens bevat. |

### ReturnValue

Het aantal bytes in de **optionOutValue** parameter.

## Zie ook

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
