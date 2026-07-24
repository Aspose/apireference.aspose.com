---
title: "System::Net::Sockets::NetworkStream::EndRead methode"
linktitle: "EndRead"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::NetworkStream::EndRead methode. Wacht totdat de opgegeven asynchrone leesbewerking voltooid is in C++."
type: docs
weight: 600
url: /nl/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


Wacht tot de opgegeven asynchrone leesbewerking is voltooid.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Een [IAsyncResult](../../../system/iasyncresult/) object dat een asynchrone leesbewerking vertegenwoordigt |

### ReturnValue

Het aantal bytes dat is gelezen tijdens de leesbewerking die wordt vertegenwoordigd door **asyncResult**

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
