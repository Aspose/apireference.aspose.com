---
title: "System::Net::Dns::BeginGetHostEntry μέθοδος"
linktitle: "BeginGetHostEntry"
second_title: "Aspose.Page για C++"
description: "System::Net::Dns::BeginGetHostEntry μέθοδος. Εκκινεί μια ασύγχρονη λειτουργία για τη δημιουργία ενός νέου αντικειμένου της IPHostEntry-class χρησιμοποιώντας τη συγκεκριμένη συμβολοσειρά που περιέχει ένα όνομα κεντρικού υπολογιστή ή διεύθυνση IP σε C++."
type: docs
weight: 300
url: /el/cpp/system.net/dns/begingethostentry/
---
## Dns::BeginGetHostEntry(String, AsyncCallback, System::SharedPtr\<Object\>) method


Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας τη καθορισμένη συμβολοσειρά που περιέχει όνομα κεντρικού υπολογιστή ή διεύθυνση IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(String hostNameOrAddress, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| hostNameOrAddress | String | Η συμβολοσειρά που περιέχει ένα όνομα κεντρικού υπολογιστή ή διεύθυνση IP. |
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
## Dns::BeginGetHostEntry(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) method


Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας την καθορισμένη διεύθυνση IP.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostEntry(System::SharedPtr<IPAddress> address, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| διεύθυνση | System::SharedPtr\<IPAddress\> | Η διεύθυνση IP. |
| requestCallback | AsyncCallback | Μία κλήση επιστροφής που θα κληθεί όταν ολοκληρωθεί η λειτουργία. |
| stateObject | System::SharedPtr\<Object\> | Δεδομένα που παρέχονται από τον χρήστη και χρησιμοποιούνται για την μοναδική ταυτοποίηση κάθε ασύγχρονης λειτουργίας. |

### ReturnValue

Ένα [IAsyncResult](../../../system/iasyncresult/) αντικείμενο που αντιπροσωπεύει την εκκινημένη ασύγχρονη λειτουργία.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
