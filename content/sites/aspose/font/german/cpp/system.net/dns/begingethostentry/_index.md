---
title: "System::Net::Dns::BeginGetHostEntry Methode"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Font für C++"
description: "System::Net::Dns::BeginGetHostEntry Methode. Startet einen asynchronen Vorgang, um eine neue IPHostEntry-class Instanz mit der angegebenen Zeichenkette, die einen Hostnamen oder eine IP-Adresse enthält, in C++ zu erstellen."
type: docs
weight: 300
url: /de/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mithilfe des angegebenen Strings zu erstellen, der einen Hostnamen oder eine IP-Adresse enthält.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| hostNameOrAddress | String | Die Zeichenkette, die einen Hostnamen oder eine IP-Adresse enthält. |
| requestCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| stateObject | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Operation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die gestartete asynchrone Operation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


Startet eine asynchrone Operation, um eine neue IPHostEntry-class-Instanz mit der angegebenen IP-Adresse zu erstellen.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| address | System::SharedPtr\<IPAddress\> | Die IP-Adresse. |
| requestCallback | AsyncCallback | Ein Rückruf, der aufgerufen wird, wenn der Vorgang abgeschlossen ist. |
| stateObject | System::SharedPtr\<Object\> | Vom Benutzer bereitgestellte Daten, die verwendet werden, um jede asynchrone Operation eindeutig zu identifizieren. |

### ReturnValue

Ein [IAsyncResult](../../../system/iasyncresult/)-Objekt, das die gestartete asynchrone Operation darstellt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
