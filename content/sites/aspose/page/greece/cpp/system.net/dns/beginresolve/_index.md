---
title: "System::Net::Dns::BeginResolve μέθοδος"
linktitle: "BeginResolve"
second_title: "Aspose.Page για C++"
description: "System::Net::Dns::BeginResolve μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία για τη δημιουργία ενός νέου αντικειμένου της IPHostEntry-class χρησιμοποιώντας το καθορισμένο όνομα κεντρικού υπολογιστή σε C++."
type: docs
weight: 400
url: /el/cpp/system.net/dns/beginresolve/
---
## Dns::BeginResolve method


Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας το καθορισμένο όνομα κεντρικού υπολογιστή.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginResolve(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| hostName | String | Ένα όνομα κεντρικού υπολογιστή που χρησιμοποιείται για τη δημιουργία ενός νέου αντικειμένου της κλάσης [IPHostEntry](../../iphostentry/). |
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
