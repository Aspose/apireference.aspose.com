---
title: "System::Net::Sockets::Socket::IOControl méthode"
linktitle: "IOControl"
second_title: "Aspose.Font pour C++"
description: "System::Net::Sockets::Socket::IOControl méthode. Définit les modes de fonctionnement bas niveau pour le socket en C++."
type: docs
weight: 4000
url: /fr/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Définit les modes de fonctionnement bas niveau pour le socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ioControlCode | int32_t | Le code de contrôle de l'opération à effectuer. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Le tableau d'octets qui contient les données d'entrée. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Le tableau d'octets qui contient les données de sortie. |

### ReturnValue

Le nombre d'octets dans le paramètre **optionOutValue**.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Définit les modes de fonctionnement bas niveau pour le socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ioControlCode | IOControlCode | Le code de contrôle de l'opération à effectuer. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Le tableau d'octets qui contient les données d'entrée. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Le tableau d'octets qui contient les données de sortie. |

### ReturnValue

Le nombre d'octets dans le paramètre **optionOutValue**.

## Voir aussi

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
