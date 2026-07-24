---
title: "System::Net::Sockets::Socket::IOControl μέθοδος"
linktitle: "IOControl"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::Socket::IOControl μέθοδος. Ορίζει λειτουργικές λειτουργίες χαμηλού επιπέδου για το socket σε C++."
type: docs
weight: 4000
url: /el/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Ορίζει λειτουργίες χαμηλού επιπέδου για την υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ioControlCode | int32_t | Ο κωδικός ελέγχου της λειτουργίας που θα εκτελεστεί. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte που περιέχει τα δεδομένα εισόδου. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte που περιέχει τα δεδομένα εξόδου. |

### ReturnValue

Ο αριθμός των byte στην παράμετρο **optionOutValue**.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Ορίζει λειτουργίες χαμηλού επιπέδου για την υποδοχή.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| ioControlCode | IOControlCode | Ο κωδικός ελέγχου της λειτουργίας που θα εκτελεστεί. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte που περιέχει τα δεδομένα εισόδου. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Ο πίνακας byte που περιέχει τα δεδομένα εξόδου. |

### ReturnValue

Ο αριθμός των byte στην παράμετρο **optionOutValue**.

## Δείτε επίσης

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
