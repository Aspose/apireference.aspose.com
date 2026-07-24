---
title: "System::Net::Dns::BeginGetHostByName μέθοδος"
linktitle: "BeginGetHostByName"
second_title: "Aspose.Page για C++"
description: "System::Net::Dns::BeginGetHostByName μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία για τη δημιουργία μιας νέας IPHostEntry-class παρουσίασης χρησιμοποιώντας το καθορισμένο όνομα κεντρικού υπολογιστή σε C++."
type: docs
weight: 200
url: /el/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας το καθορισμένο όνομα κεντρικού υπολογιστή.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| hostName | String | Ένα όνομα κεντρικού υπολογιστή. |
| requestCallback | AsyncCallback | Μία κλήση επιστροφής που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| stateObject | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας. |

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
