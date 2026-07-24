---
title: "System::Net::Dns::BeginGetHostAddresses μέθοδος"
linktitle: "BeginGetHostAddresses"
second_title: "Aspose.Page για C++"
description: "System::Net::Dns::BeginGetHostAddresses μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία για τη δημιουργία ενός νέου IPHostEntry-class αντικειμένου χρησιμοποιώντας τη συγκεκριμένη συμβολοσειρά που περιέχει ένα όνομα κεντρικού υπολογιστή ή διεύθυνση IP σε C++."
type: docs
weight: 100
url: /el/cpp/system.net/dns/begingethostaddresses/
---
## Dns::BeginGetHostAddresses method


Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας τη καθορισμένη συμβολοσειρά που περιέχει όνομα κεντρικού υπολογιστή ή διεύθυνση IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostAddresses(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| hostNameOrAddress | String | Μια συμβολοσειρά που περιέχει ένα όνομα κεντρικού υπολογιστή ή διεύθυνση IP. |
| requestCallback | AsyncCallback | Μία κλήση επιστροφής που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| state | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας. |

### ReturnValue

Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει την εκκινημένη ασύγχρονη λειτουργία.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
