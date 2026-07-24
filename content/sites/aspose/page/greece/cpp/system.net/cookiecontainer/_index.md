---
title: "System::Net::CookieContainer κλάση"
linktitle: "CookieContainer"
second_title: "Aspose.Page για C++"
description: "System::Net::CookieContainer κλάση. Παρέχει έναν χώρο αποθήκευσης για τις στιγμές της κλάσης CookieCollection. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.net/cookiecontainer/
---
## CookieContainer class


Παρέχει έναν χώρο αποθήκευσης για τις στιγμές της κλάσης CookieCollection. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class CookieContainer : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | Προσθέτει ένα cookie στη συλλογή. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | Προσθέτει ένα cookie στη συλλογή. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Αντιγράφει cookies από τη συγκεκριμένη συλλογή στην τρέχουσα. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | Προσθέτει ένα cookie για το καθορισμένο URI. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | Αντιγράφει τα cookies από τη συγκεκριμένη συλλογή για το καθορισμένο URI στη τρέχουσα συλλογή. |
| [CookieContainer](./cookiecontainer/)() | Δημιουργεί μια νέα παρουσία. |
| [CookieContainer](./cookiecontainer/)(int32_t) | Δημιουργεί μια νέα παρουσία. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | Δημιουργεί μια νέα παρουσία. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | Αντιγράφει τα cookies από την καθορισμένη κεφαλίδα HTTP για το καθορισμένο URI. |
| [get_Capacity](./get_capacity/)() | Λαμβάνει τη χωρητικότητα της συλλογής. |
| [get_Count](./get_count/)() | Επιστρέφει τον αριθμό των στοιχείων της συλλογής. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | Λαμβάνει το μέγιστο μέγεθος του cookie. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | Λαμβάνει τη χωρητικότητα της συλλογής ανά τομέα. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | Επιστρέφει μια κεφαλίδα HTTP που περιέχει cookies που σχετίζονται με το καθορισμένο URI. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | Επιστρέφει μια κεφαλίδα HTTP που περιέχει cookies που σχετίζονται με το καθορισμένο URI. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | Επιστρέφει μια συλλογή από cookies που σχετίζονται με το καθορισμένο URI. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | Επιστρέφει μια συλλογή από cookies που σχετίζονται με το καθορισμένο URI. |
| [IsLocalDomain](./islocaldomain/)(String) | Ελέγχει εάν ο καθορισμένος τομέας είναι localhost. |
| [set_Capacity](./set_capacity/)(int32_t) | Ορίζει τη χωρητικότητα της συλλογής. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | Ορίζει το μέγιστο μέγεθος του cookie. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | Ορίζει τη χωρητικότητα της συλλογής ανά τομέα. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | Αντιγράφει τα cookies από την καθορισμένη κεφαλίδα στη συλλογή και τα συσχετίζει με το καθορισμένο URI. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | Το μέγιστο μέγεθος του cookie. |
| static [DefaultCookieLimit](./defaultcookielimit/) | Πληροφορίες RTTI. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | Ο μέγιστος αριθμός στοιχείων της συλλογής ανά τομέα. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
