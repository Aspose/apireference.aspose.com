---
title: "System::Net::WebRequest::BeginGetResponse μέθοδος"
linktitle: "BeginGetResponse"
second_title: "Aspose.Page για C++"
description: "System::Net::WebRequest::BeginGetResponse μέθοδος. Εκκινεί ένα ασύγχρονο αίτημα για τον πόρο σε C++."
type: docs
weight: 1100
url: /el/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


Ξεκινά ένα ασύγχρονο αίτημα για τον πόρο.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
