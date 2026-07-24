---
title: "System::Net::Security::SslStream::EndRead methode"
linktitle: "EndRead"
second_title: "Aspose.Page voor C++"
description: "System::Net::Security::SslStream::EndRead methode. Wacht tot de opgegeven asynchrone leesbewerking voltooid is in C++."
type: docs
weight: 700
url: /nl/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Wacht tot de opgegeven asynchrone leesbewerking is voltooid.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Een [IAsyncResult](../../../system/iasyncresult/) object dat een asynchrone leesbewerking vertegenwoordigt |

### ReturnValue

Het aantal bytes dat is gelezen tijdens de leesbewerking die wordt vertegenwoordigd door **asyncResult**

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
