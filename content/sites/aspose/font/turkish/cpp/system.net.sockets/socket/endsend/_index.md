---
title: "System::Net::Sockets::Socket::EndSend metodu"
linktitle: "EndSend"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::EndSend yöntemi. Belirtilen asenkron gönderme işlemi C++'ta tamamlanana kadar bekler."
type: docs
weight: 1600
url: /tr/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


Belirtilen asenkron gönderme işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Asenkron bir gönderme işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


Belirtilen asenkron gönderme işlemi tamamlanana kadar bekler.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Asenkron bir gönderme işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi. |
| errorCode | SocketError\& | Gönderme işlemi başarısız olduğunda hata kodunun atanacağı çıktı parametresi. |

### ReturnValue

Gönderilen bayt sayısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
