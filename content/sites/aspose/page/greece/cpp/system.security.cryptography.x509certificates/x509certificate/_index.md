---
title: "System::Security::Cryptography::X509Certificates::X509Certificate κλάση"
linktitle: "X509Certificate"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate κλάση. Πιστοποιητικό X.509 v.3. Τα κρυπτογραφημένα πιστοποιητικά δεν υποστηρίζονται. Μόνο η σημαία X509KeyStorageFlags::DefaultKeySet υποστηρίζεται. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject() function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr pointer και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 300
url: /el/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


Πιστοποιητικό X.509 v.3. Τα κρυπτογραφημένα πιστοποιητικά δεν υποστηρίζονται. Μόνο η σημαία [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) υποστηρίζεται. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/) function. Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) pointer και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | Δημιουργεί πιστοποιητικό από το καθορισμένο αρχείο PKCS7. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | Δημιουργεί πιστοποιητικό από το καθορισμένο υπογεγραμμένο αρχείο. |
| [Dispose](./dispose/)() override | Δεν κάνει τίποτα. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Συγκρίνει δύο πιστοποιητικά. |
| virtual [Export](./export/)(X509ContentType) const | Εξάγει το τρέχον αντικείμενο σε έναν πίνακα byte χρησιμοποιώντας το καθορισμένο μορφότυπο. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | Εξάγει το τρέχον αντικείμενο σε έναν πίνακα byte χρησιμοποιώντας το καθορισμένο μορφότυπο. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | Εξάγει το τρέχον αντικείμενο σε έναν πίνακα byte χρησιμοποιώντας το καθορισμένο μορφότυπο. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| [get_Handle](./get_handle/)() const | Λαμβάνει έναν δείκτη στο πλαίσιο πιστοποιητικού του Microsoft Cryptographic API. |
| [get_Issuer](./get_issuer/)() const | Λαμβάνει το όνομα της αρχής πιστοποίησης που εξέδωσε το πιστοποιητικό X.509v3. |
| [get_Subject](./get_subject/)() const | Λαμβάνει το διακριτικό όνομα του υποκειμένου από το πιστοποιητικό. |
| virtual [GetCertHash](./getcerthash/)() const | Λαμβάνει το hash για το τρέχον αντικείμενο ως πίνακα byte. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | Λαμβάνει το hash για το τρέχον αντικείμενο ως πίνακα byte. |
| virtual [GetCertHashString](./getcerthashstring/)() const | Λαμβάνει το hash [SHA1](../../system.security.cryptography/sha1/) για το τρέχον αντικείμενο ως δεκαεξαδική συμβολοσειρά. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | Λαμβάνει το hash [SHA1](../../system.security.cryptography/sha1/) για το τρέχον αντικείμενο ως δεκαεξαδική συμβολοσειρά. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | Λαμβάνει την ημερομηνία ισχύος του τρέχοντος πιστοποιητικού. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | Λαμβάνει την ημερομηνία λήξης του τρέχοντος πιστοποιητικού. |
| virtual [GetFormat](./getformat/)() const | Λαμβάνει το όνομα του μορφότυπου του πιστοποιητικού. |
| [GetHashCode](./gethashcode/)() const override | Λαμβάνει τον κωδικό hash του πιστοποιητικού. |
| virtual [GetIssuerName](./getissuername/)() const | Λαμβάνει το όνομα της αρχής πιστοποίησης που εξέδωσε το τρέχον πιστοποιητικό. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | Λαμβάνει τις πληροφορίες κλειδιού για το τρέχον πιστοποιητικό ως συμβολοσειρά. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | Λαμβάνει τις πληροφορίες κλειδιού για το τρέχον πιστοποιητικό ως πίνακα byte. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | Λαμβάνει τις πληροφορίες κλειδιού για το τρέχον πιστοποιητικό ως δεκαεξαδική συμβολοσειρά. |
| virtual [GetName](./getname/)() const | Λαμβάνει το όνομα του κύριου στον οποίο εκδόθηκε το τρέχον πιστοποιητικό. |
| virtual [GetPublicKey](./getpublickey/)() const | Λαμβάνει το δημόσιο κλειδί από το πιστοποιητικό ως πίνακα byte. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | Λαμβάνει το δημόσιο κλειδί από το πιστοποιητικό ως δεκαεξαδική συμβολοσειρά. |
| virtual [GetRawCertData](./getrawcertdata/)() const | Λαμβάνει τα ακατέργαστα δεδομένα από το πιστοποιητικό ως πίνακα byte. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | Λαμβάνει τα ακατέργαστα δεδομένα από το πιστοποιητικό ως δεκαεξαδική συμβολοσειρά. |
| virtual [GetSerialNumber](./getserialnumber/)() const | Λαμβάνει τον αριθμό σειράς από το πιστοποιητικό ως πίνακα byte. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | Λαμβάνει τον αριθμό σειράς από το πιστοποιητικό ως δεκαεξαδική συμβολοσειρά. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Εισάγει πληροφορίες από το καθορισμένο αρχείο πιστοποιητικού. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | Εισάγει πληροφορίες από το καθορισμένο αρχείο πιστοποιητικού. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Εισάγει πληροφορίες από τα καθορισμένα δεδομένα πιστοποιητικού. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Εισάγει πληροφορίες από τα καθορισμένα δεδομένα πιστοποιητικού. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| virtual [Import](./import/)(const String\&) | Εισάγει πληροφορίες από το καθορισμένο αρχείο πιστοποιητικού. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | Εισάγει πληροφορίες από τα καθορισμένα δεδομένα πιστοποιητικού. ΔΕΝ ΥΛΟΠΟΙΕΙΤΑΙ. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | Επαναφέρει την κατάσταση του πιστοποιητικού. |
| virtual [ToString](./tostring/)(bool) const | Επιστρέφει τις πληροφορίες του πιστοποιητικού σε μορφή κειμένου. |
| [ToString](./tostring/)() const override | Επιστρέφει τις πληροφορίες του πιστοποιητικού σε μορφή κειμένου. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const String\&) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | Κατασκευαστής. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | Κατασκευαστής. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [Ptr](./ptr/) | Τύπος δείκτη. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
