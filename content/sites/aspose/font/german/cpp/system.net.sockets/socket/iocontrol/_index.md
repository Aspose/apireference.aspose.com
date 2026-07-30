---
title: "System::Net::Sockets::Socket::IOControl-Methode"
linktitle: "IOControl"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket::IOControl-Methode. Legt niedrigstufige Betriebsmodi für den Socket in C++ fest."
type: docs
weight: 4000
url: /de/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Legt niedrigstufige Betriebsmodi für den Socket fest.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ioControlCode | int32_t | Der Steuercode der auszuführenden Operation. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Das Byte-Array, das die Eingabedaten enthält. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Das Byte-Array, das die Ausgabedaten enthält. |

### ReturnValue

Die Anzahl der Bytes im Parameter **optionOutValue**.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Legt niedrigstufige Betriebsmodi für den Socket fest.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ioControlCode | IOControlCode | Der Steuercode der auszuführenden Operation. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Das Byte-Array, das die Eingabedaten enthält. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Das Byte-Array, das die Ausgabedaten enthält. |

### ReturnValue

Die Anzahl der Bytes im Parameter **optionOutValue**.

## Siehe auch

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
