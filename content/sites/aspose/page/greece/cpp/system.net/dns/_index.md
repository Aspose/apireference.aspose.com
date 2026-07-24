---
title: "System::Net::Dns κλάση"
linktitle: "Dns"
second_title: "Aspose.Page για C++"
description: "System::Net::Dns κλάση. Παρέχει μεθόδους για εργασία με DNS σε C++."
type: docs
weight: 700
url: /el/cpp/system.net/dns/
---
## Dns class


Παρέχει μεθόδους για εργασία με DNS.

```cpp
class Dns : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας τη καθορισμένη συμβολοσειρά που περιέχει όνομα κεντρικού υπολογιστή ή διεύθυνση IP. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας το καθορισμένο όνομα κεντρικού υπολογιστή. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας τη καθορισμένη συμβολοσειρά που περιέχει όνομα κεντρικού υπολογιστή ή διεύθυνση IP. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας την καθορισμένη διεύθυνση IP. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Ξεκινά μια ασύγχρονη λειτουργία για δημιουργία ενός νέου αντικειμένου IPHostEntry-class χρησιμοποιώντας το καθορισμένο όνομα κεντρικού υπολογιστή. |
| [Dns](./dns/)() | Ο διαγραμμένος προεπιλεγμένος κατασκευαστής. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία δημιουργίας ενός νέου αντικειμένου IPHostEntry-class. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία δημιουργίας ενός νέου αντικειμένου IPHostEntry-class. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία δημιουργίας ενός νέου αντικειμένου IPHostEntry-class. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | Περιμένει μέχρι να ολοκληρωθεί η καθορισμένη ασύγχρονη λειτουργία δημιουργίας ενός νέου αντικειμένου IPHostEntry-class. |
| static [GetHostAddresses](./gethostaddresses/)(String) | Επιστρέφει μια συλλογή από διευθύνσεις IP του καθορισμένου ονόματος κεντρικού υπολογιστή ή της διεύθυνσης IP. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | Δημιουργεί ένα νέο αντικείμενο IPHostEntry-class χρησιμοποιώντας την καθορισμένη αναπαράσταση συμβολοσειράς μιας διεύθυνσης IP. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | Δημιουργεί ένα νέο αντικείμενο IPHostEntry-class χρησιμοποιώντας την καθορισμένη διεύθυνση IP. |
| static [GetHostByName](./gethostbyname/)(String) | Πληροφορίες RTTI. |
| static [GetHostEntry](./gethostentry/)(String) | Δημιουργεί ένα νέο αντικείμενο IPHostEntry-class χρησιμοποιώντας την καθορισμένη συμβολοσειρά που περιέχει όνομα κεντρικού υπολογιστή ή διεύθυνση IP. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | Δημιουργεί ένα νέο αντικείμενο IPHostEntry-class χρησιμοποιώντας την καθορισμένη διεύθυνση IP. |
| static [GetHostName](./gethostname/)() | Επιστρέφει το όνομα κεντρικού υπολογιστή του τοπικού μηχανήματος. |
| static [Resolve](./resolve/)(String) | Δημιουργεί ένα νέο αντικείμενο IPHostEntry-class χρησιμοποιώντας το καθορισμένο όνομα κεντρικού υπολογιστή. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
