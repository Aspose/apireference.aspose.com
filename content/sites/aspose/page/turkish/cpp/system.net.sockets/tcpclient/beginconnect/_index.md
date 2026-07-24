---
title: "System::Net::Sockets::TcpClient::BeginConnect metodu"
linktitle: "BeginConnect"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::TcpClient::BeginConnect metodu. C++'da asenkron bir bağlanma işlemi başlatır."
type: docs
weight: 300
url: /tr/cpp/system.net.sockets/tcpclient/beginconnect/
---
## TcpClient::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Asenkron bir bağlanma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ana bilgisayar | String | Uzak bir ana bilgisayar adı. |
| bağlantı noktası | int32_t | Uzak ana bilgisayarın bir bağlantı noktası. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| durum | System::SharedPtr\<Object\> | Her eşzamanlı bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan, kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan eşzamanlı olmayan bağlanma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Asenkron bir bağlanma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| adresler | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | Uzak bir ana bilgisayarın IP adresleri. |
| bağlantı noktası | int32_t | Uzak ana bilgisayarın bir bağlantı noktası. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| durum | System::SharedPtr\<Object\> | Her eşzamanlı bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan, kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan eşzamanlı olmayan bağlanma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Asenkron bir bağlanma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| adres | System::SharedPtr\<IPAddress\> | Uzak bir ana bilgisayarın IP adresi. |
| bağlantı noktası | int32_t | Uzak ana bilgisayarın bir bağlantı noktası. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir geri çağırma. |
| durum | System::SharedPtr\<Object\> | Her eşzamanlı bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan, kullanıcı tarafından sağlanan veri. |

### ReturnValue

Başlatılan eşzamanlı olmayan bağlanma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
