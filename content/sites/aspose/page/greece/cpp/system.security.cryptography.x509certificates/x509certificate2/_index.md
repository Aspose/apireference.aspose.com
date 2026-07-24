---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 κλάση"
linktitle: "X509Certificate2"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 κλάση. Αντιπροσωπεύει πιστοποιητικό X509. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε στις συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 400
url: /el/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


Αντιπροσωπεύει πιστοποιητικό X509. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε στις συναρτήσεις ως όρισμα.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Archived](./get_archived/)() const | Λαμβάνει μια τιμή που υποδεικνύει ότι το πιστοποιητικό είναι αρχειοθετημένο. |
| [get_Extensions](./get_extensions/)() const | Λαμβάνει τη συλλογή των αντικειμένων επέκτασης που σχετίζονται με το πιστοποιητικό. |
| [get_FriendlyName](./get_friendlyname/)() const | Λαμβάνει το φιλικό όνομα του πιστοποιητικού. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | Ελέγχει αν το πιστοποιητικό έχει ιδιωτικό κλειδί. |
| [get_IssuerName](./get_issuername/)() const | Λαμβάνει το όνομα του φορέα που εξέδωσε το πιστοποιητικό. |
| [get_NotAfter](./get_notafter/)() const | Λαμβάνει την τοπική ημερομηνία και ώρα μετά την οποία το πιστοποιητικό δεν ισχύει πια. |
| [get_NotBefore](./get_notbefore/)() const | Λαμβάνει την τοπική ημερομηνία και ώρα από την οποία το πιστοποιητικό γίνεται έγκυρο. |
| [get_PrivateKey](./get_privatekey/)() const | Λαμβάνει το ιδιωτικό κλειδί που σχετίζεται με το πιστοποιητικό. |
| [get_PublicKey](./get_publickey/)() const | Λαμβάνει ένα αντικείμενο [PublicKey](../publickey/) του πιστοποιητικού. |
| [get_RawData](./get_rawdata/)() const | Λαμβάνει τα ακατέργαστα δεδομένα του πιστοποιητικού. |
| [get_SerialNumber](./get_serialnumber/)() const | Λαμβάνει τον σειριακό αριθμό ενός πιστοποιητικού. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | Λαμβάνει τον αλγόριθμο που χρησιμοποιείται για τη δημιουργία της υπογραφής ενός πιστοποιητικού. |
| [get_SubjectName](./get_subjectname/)() const | Λαμβάνει το όνομα του υποκειμένου από ένα πιστοποιητικό. |
| [get_Thumbprint](./get_thumbprint/)() const | Λαμβάνει το αποτύπωμα του πιστοποιητικού. |
| [get_Version](./get_version/)() const | Λαμβάνει την έκδοση μορφής του πιστοποιητικού. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | Λαμβάνει τον τύπο του πιστοποιητικού που περιέχεται στον καθορισμένο πίνακα byte. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | Λαμβάνει τον τύπο του πιστοποιητικού που περιέχεται στο καθορισμένο αρχείο. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | Λαμβάνει το ιδιωτικό κλειδί [RSA](../../system.security.cryptography/rsa/);. |
| [GetDSAPublicKey](./getdsapublickey/)() const | Λαμβάνει το δημόσιο κλειδί [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | Λαμβάνει το ιδιωτικό κλειδί [RSA](../../system.security.cryptography/rsa/);. |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | Λαμβάνει το δημόσιο κλειδί [RSA](../../system.security.cryptography/rsa/). |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | Λαμβάνει το όνομα του υποκειμένου ή του εκδότη από το πιστοποιητικό. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | Λαμβάνει το ιδιωτικό κλειδί [RSA](../../system.security.cryptography/rsa/);. |
| [GetRSAPublicKey](./getrsapublickey/)() const | Λαμβάνει το δημόσιο κλειδί [RSA](../../system.security.cryptography/rsa/). |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Εισάγει πληροφορίες από το καθορισμένο αρχείο πιστοποιητικού. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | Εισάγει πληροφορίες από το καθορισμένο αρχείο πιστοποιητικού. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | Εισάγει πληροφορίες από τα καθορισμένα δεδομένα πιστοποιητικού. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | Εισάγει πληροφορίες από τα καθορισμένα δεδομένα πιστοποιητικού. |
| [Import](./import/)(const String\&) override | Εισάγει πληροφορίες από το καθορισμένο αρχείο πιστοποιητικού. |
| [Import](./import/)(const ByteArrayPtr\&) override | Εισάγει πληροφορίες από τα καθορισμένα δεδομένα πιστοποιητικού. |
| [Reset](./reset/)() override | Επαναφέρει την κατάσταση του πιστοποιητικού. |
| [set_Archived](./set_archived/)(bool) const | Ορίζει μια τιμή που υποδεικνύει ότι το πιστοποιητικό είναι αρχειοθετημένο. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | Ορίζει το φιλικό όνομα του πιστοποιητικού. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | Ορίζει ή διαγράφει το ιδιωτικό κλειδί που σχετίζεται με το πιστοποιητικό. |
| [ToString](./tostring/)(bool) const override | Επιστρέφει τις πληροφορίες του πιστοποιητικού σε μορφή κειμένου. |
| [ToString](./tostring/)() const override | Επιστρέφει τις πληροφορίες του πιστοποιητικού σε μορφή κειμένου. |
| [Verify](./verify/)() const | Επαληθεύει την αλυσίδα του πιστοποιητικού. |
| [X509Certificate2](./x509certificate2/)() | Δημιουργεί ένα κενό [X509Certificate2](./). |
| [X509Certificate2](./x509certificate2/)(const String\&) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Κατασκευαστής. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Κατασκευαστής. |
## Δείτε επίσης

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
