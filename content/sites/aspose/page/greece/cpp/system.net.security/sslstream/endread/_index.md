---
title: "System::Net::Security::SslStream::EndRead μέθοδος"
linktitle: "EndRead"
second_title: "Aspose.Page για C++"
description: "System::Net::Security::SslStream::EndRead μέθοδος. Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία ανάγνωσης σε C++."
type: docs
weight: 700
url: /el/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία ανάγνωσης.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει μια ασύγχρονη λειτουργία ανάγνωσης |

### ReturnValue

Ο αριθμός των byte που διαβάστηκαν κατά τη λειτουργία ανάγνωσης που αντιπροσωπεύεται από **asyncResult**

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
