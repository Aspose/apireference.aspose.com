---
title: "System::Net::FileWebRequest::BeginGetRequestStream μέθοδος"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Page για C++"
description: "System::Net::FileWebRequest::BeginGetRequestStream μέθοδος. Ξεκινά μια ασύγχρονη λειτουργία για λήψη ροής για εγγραφή δεδομένων στον πόρο σε C++."
type: docs
weight: 300
url: /el/cpp/system.net/filewebrequest/begingetrequeststream/
---
## FileWebRequest::BeginGetRequestStream method


Ξεκινά μια ασύγχρονη λειτουργία για λήψη ροής για την εγγραφή δεδομένων στον πόρο.

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
