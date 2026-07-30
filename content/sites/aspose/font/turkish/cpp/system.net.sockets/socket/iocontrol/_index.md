---
title: "System::Net::Sockets::Socket::IOControl yöntemi"
linktitle: "IOControl"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::IOControl yöntemi. C++'ta soket için düşük seviyeli çalışma modlarını ayarlar."
type: docs
weight: 4000
url: /tr/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Soket için düşük seviyeli çalışma modlarını ayarlar.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ioControlCode | int32_t | Gerçekleştirilecek işlemin kontrol kodu. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Giriş verilerini içeren bayt dizisi. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Çıktı verilerini içeren bayt dizisi. |

### ReturnValue

**optionOutValue** parametresindeki bayt sayısı.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Soket için düşük seviyeli çalışma modlarını ayarlar.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ioControlCode | IOControlCode | Gerçekleştirilecek işlemin kontrol kodu. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Giriş verilerini içeren bayt dizisi. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Çıktı verilerini içeren bayt dizisi. |

### ReturnValue

**optionOutValue** parametresindeki bayt sayısı.

## Ayrıca Bakınız

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
