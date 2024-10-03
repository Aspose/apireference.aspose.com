---
title: System::Net::Dns::EndGetHostEntry method
linktitle: EndGetHostEntry
second_title: Aspose.Page for C++
description: 'System::Net::Dns::EndGetHostEntry method. Waits until the specified asynchronous operation to create a new IPHostEntry-class instance completes in C++.'
type: docs
weight: 1000
url: /cpp/system.net/dns/endgethostentry/
---
## Dns::EndGetHostEntry method


Waits until the specified asynchronous operation to create a new IPHostEntry-class instance completes.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostEntry(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Description |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | An [IAsyncResult](../../../system/iasyncresult/) object that represents an asynchronous operation. |

### ReturnValue

A newly created IPHostEntry-class instance.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
