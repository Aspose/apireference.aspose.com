---
title: "System::Net::IPHostEntry κλάση"
linktitle: "IPHostEntry"
second_title: "Aspose.Page για C++"
description: "System::Net::IPHostEntry κλάση. Αντιπροσωπεύει πληροφορίες σχετικά με μια διεύθυνση κεντρικού υπολογιστή στο internet. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 2600
url: /el/cpp/system.net/iphostentry/
---
## IPHostEntry class


Αντιπροσωπεύει πληροφορίες σχετικά με μια διεύθυνση κεντρικού υπολογιστή στο internet. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα αντίτυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class IPHostEntry : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Λαμβάνει τη συλλογή των διευθύνσεων IP του κεντρικού υπολογιστή. |
| [get_Aliases](./get_aliases/)() | Λαμβάνει τη συλλογή των ψευδωνύμων του κεντρικού υπολογιστή. |
| [get_HostName](./get_hostname/)() const | Πληροφορίες RTTI. |
| [IPHostEntry](./iphostentry/)() | Δημιουργεί μια νέα παρουσία. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Ορίζει μια συλλογή διευθύνσεων IP του κεντρικού υπολογιστή. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Ορίζει μια συλλογή ψευδωνύμων του κεντρικού υπολογιστή. |
| [set_HostName](./set_hostname/)(String) | Ορίζει το όνομα του κεντρικού υπολογιστή. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
