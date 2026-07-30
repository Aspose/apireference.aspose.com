---
title: "System::Net::Sockets::Socket::BeginConnect metodu"
linktitle: "BeginConnect"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket::BeginConnect yöntemi. C++'ta eşzamansız bir bağlanma işlemi başlatır."
type: docs
weight: 700
url: /tr/cpp/system.net.sockets/socket/beginconnect/
---
## Socket::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Asenkron bir bağlanma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| host | Dize | Uzak ana bilgisayar adı. |
| bağlantı noktası | int32_t | Uzak ana bilgisayarın bağlantı noktası numarası. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir callback. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan, her asenkron bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan veri. |

### ReturnValue

Başlatılan eşzamansız bağlanma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Asenkron bir bağlanma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | Uzak ana bilgisayarın IP adresleri. |
| bağlantı noktası | int32_t | Uzak ana bilgisayarın bağlantı noktası numarası. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir callback. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan, her asenkron bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan veri. |

### ReturnValue

Başlatılan eşzamansız bağlanma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) method


Asenkron bir bağlanma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::SharedPtr<EndPoint> remoteEP, AsyncCallback callback, System::SharedPtr<Object> state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<EndPoint\> | Uzak uç nokta. |
| geri arama | AsyncCallback | İşlem tamamlandığında çağrılacak bir callback. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan, her asenkron bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan veri. |

### ReturnValue

Başlatılan eşzamansız bağlanma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [EndPoint](../../../system.net/endpoint/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


Asenkron bir bağlanma işlemi başlatır.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| adres | System::SharedPtr\<IPAddress\> | Uzak ana bilgisayar IP adresi. |
| bağlantı noktası | int32_t | Uzak ana bilgisayarın bağlantı noktası numarası. |
| requestCallback | AsyncCallback | İşlem tamamlandığında çağrılacak bir callback. |
| durum | System::SharedPtr\<Object\> | Kullanıcı tarafından sağlanan, her asenkron bağlanma işlemini benzersiz şekilde tanımlamak için kullanılan veri. |

### ReturnValue

Başlatılan eşzamansız bağlanma işlemini temsil eden bir [IAsyncResult](../../../system/iasyncresult/) nesnesi.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
