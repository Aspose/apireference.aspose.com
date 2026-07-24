---
title: "System::Net::Sockets::Socket::IOControl metode"
linktitle: "IOControl"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::Socket::IOControl metode. Menetapkan mode operasi tingkat rendah untuk soket dalam C++."
type: docs
weight: 4000
url: /id/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Mengatur mode operasi tingkat rendah untuk socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ioControlCode | int32_t | Kode kontrol dari operasi yang akan dilakukan. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Array byte yang berisi data masukan. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Array byte yang berisi data keluaran. |

### ReturnValue

Jumlah byte dalam parameter **optionOutValue**.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


Mengatur mode operasi tingkat rendah untuk socket.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ioControlCode | IOControlCode | Kode kontrol dari operasi yang akan dilakukan. |
| optionInValue | System::ArrayPtr\<uint8_t\> | Array byte yang berisi data masukan. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | Array byte yang berisi data keluaran. |

### ReturnValue

Jumlah byte dalam parameter **optionOutValue**.

## Lihat Juga

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
