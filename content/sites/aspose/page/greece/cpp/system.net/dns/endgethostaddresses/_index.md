---
title: "System::Net::Dns::EndGetHostAddresses μέθοδος"
linktitle: "EndGetHostAddresses"
second_title: "Aspose.Page για C++"
description: "System::Net::Dns::EndGetHostAddresses μέθοδος. Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία για τη δημιουργία μιας νέας IPHostEntry-class παρουσίασης σε C++."
type: docs
weight: 500
url: /el/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία δημιουργίας ενός νέου αντικειμένου IPHostEntry-class.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει μια ασύγχρονη λειτουργία. |

### ReturnValue

Μια νεοδημιουργημένη παρουσία της IPHostEntry-class.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
