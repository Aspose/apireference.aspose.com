---
title: "System::Net::Sockets::NetworkStream::EndRead μέθοδος"
linktitle: "EndRead"
second_title: "Aspose.Page για C++"
description: "System::Net::Sockets::NetworkStream::EndRead μέθοδος. Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία ανάγνωσης σε C++."
type: docs
weight: 600
url: /el/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία ανάγνωσης.

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει μια ασύγχρονη λειτουργία ανάγνωσης |

### ReturnValue

Ο αριθμός των byte που διαβάστηκαν κατά τη λειτουργία ανάγνωσης που αντιπροσωπεύεται από **asyncResult**

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
