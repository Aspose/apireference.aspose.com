---
title: "System::Net::Sockets::Socket::EndReceive metodu"
linktitle: "EndReceive"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::Socket::EndReceive yöntemi. Belirtilen eşzamanlı olmayan alma işlemi tamamlanana kadar bekler C++'ta."
type: docs
weight: 1500
url: /tr/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


Belirtilen asenkron alma işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Asenkron bir alma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Belirtilen asenkron alma işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Asenkron bir alma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi. |
| errorCode | SocketError\& | Alma işlemi başarısız olduğunda hata kodunun atanacağı çıkış parametresi. |

### ReturnValue

Alınan bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
