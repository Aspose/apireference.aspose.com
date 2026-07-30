---
title: "System::Net::Sockets::Socket::EndReceive metodu"
linktitle: "EndReceive"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::EndReceive metodu. Belirtilen eşzamanlı alma işlemi C++'da tamamlanana kadar bekler."
type: docs
weight: 1500
url: /tr/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


Belirtilen asenkron alma işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | [IAsyncResult](../../../system/iasyncresult/) nesnesi, bir eşzamanlı alma işlemini temsil eder. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Belirtilen asenkron alma işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | [IAsyncResult](../../../system/iasyncresult/) nesnesi, bir eşzamanlı alma işlemini temsil eder. |
| errorCode | SocketError\& | Alma işlemi başarısız olduğunda hata kodunun atanacağı çıkış parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
