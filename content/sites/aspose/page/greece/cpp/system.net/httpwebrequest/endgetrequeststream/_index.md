---
title: "System::Net::HttpWebRequest::EndGetRequestStream μέθοδος"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page για C++"
description: "System::Net::HttpWebRequest::EndGetRequestStream μέθοδος. Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης ροής σε C++."
type: docs
weight: 600
url: /el/cpp/system.net/httpwebrequest/endgetrequeststream/
---
## HttpWebRequest::EndGetRequestStream method


Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία λήψης ροής.

```cpp
System::SharedPtr<IO::Stream> System::Net::HttpWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | Ένα αντικείμενο [IAsyncResult](../../../system/iasyncresult/) που αντιπροσωπεύει μια ασύγχρονη λειτουργία λήψης ροής. |

### ReturnValue

Η ροή για εγγραφή δεδομένων στον πόρο.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
