---
title: "System::Data::SqlClient::SqlConnectionStringBuilder class"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Page για C++"
description: "System::Data::SqlClient::SqlConnectionStringBuilder class. Κατασκευαστής σύνδεσης βασισμένος σε SQL. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 100
url: /el/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


Κατασκευαστής σύνδεσης βασισμένος σε SQL. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | Λαμβάνει την πηγή δεδομένων (π.χ. όνομα κεντρικού υπολογιστή και θύρα). |
| [get_Encrypt](./get_encrypt/)() const | Ελέγχει εάν η κρυπτογράφηση είναι ενεργοποιημένη στη γραμμή. |
| [get_InitialCatalog](./get_initialcatalog/)() const | Λαμβάνει το όνομα της βάσης δεδομένων που σχετίζεται με τη σύνδεση. |
| [get_NetworkLibrary](./get_networklibrary/)() const | Λαμβάνει το όνομα της χρησιμοποιούμενης βιβλιοθήκης δικτύου. |
| [get_Password](./get_password/)() const | Λαμβάνει τον κωδικό πρόσβασης που χρησιμοποιείται για τη σύνδεση στη βάση δεδομένων. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | Ελέγχει εάν η σύνδεση είναι προστατευμένη χρησιμοποιώντας πιστοποιητικό εμπιστοσύνης διακομιστή. |
| [get_UserID](./get_userid/)() const | Λαμβάνει το αναγνωριστικό χρήστη που χρησιμοποιείται για τη σύνδεση. |
| [idx_get](./idx_get/)(String) override | Πληροφορίες RTTI. |
| [idx_set](./idx_set/)(String, Object::ptr) override | Ορίζει το αντικείμενο με κλειδί. |
| [set_DataSource](./set_datasource/)(const String\&) | Λαμβάνει την πηγή δεδομένων (π.χ. όνομα κεντρικού υπολογιστή και θύρα). |
| [set_Encrypt](./set_encrypt/)(bool) | Ενεργοποιεί ή απενεργοποιεί την κρυπτογράφηση. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | Ορίζει το όνομα της βάσης δεδομένων που σχετίζεται με τη σύνδεση. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | Επιλέγει τη βιβλιοθήκη δικτύου που θα χρησιμοποιηθεί. |
| [set_Password](./set_password/)(const String\&) | Ορίζει τον κωδικό πρόσβασης που θα χρησιμοποιηθεί για τη σύνδεση στη βάση δεδομένων. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | Καθορίζει εάν η σύνδεση προστατεύεται χρησιμοποιώντας πιστοποιητικό εμπιστοσύνης του διακομιστή. |
| [set_UserID](./set_userid/)(const String\&) | Ορίζει το αναγνωριστικό χρήστη που θα χρησιμοποιηθεί για τη σύνδεση. |
## Δείτε επίσης

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Page for C++](../../)
