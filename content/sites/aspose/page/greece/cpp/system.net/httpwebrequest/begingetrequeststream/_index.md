---
title: "System::Net::HttpWebRequest::BeginGetRequestStream μέθοδος"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page για C++"
description: "System::Net::HttpWebRequest::BeginGetRequestStream μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία για λήψη ροής για εγγραφή δεδομένων στον πόρο σε C++."
type: docs
weight: 400
url: /el/cpp/system.net/httpwebrequest/begingetrequeststream/
---
## HttpWebRequest::BeginGetRequestStream method


Ξεκινά μια ασύγχρονη λειτουργία για λήψη ροής για την εγγραφή δεδομένων στον πόρο.

```cpp
System::SharedPtr<IAsyncResult> System::Net::HttpWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| callback | AsyncCallback | Μία κλήση επιστροφής που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας. |

### ReturnValue

Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει την εκκινημένη ασύγχρονη λειτουργία.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
