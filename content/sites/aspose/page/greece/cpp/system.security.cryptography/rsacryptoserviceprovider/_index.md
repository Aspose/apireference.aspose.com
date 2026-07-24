---
title: "System::Security::Cryptography::RSACryptoServiceProvider κλάση"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider κλάση. Αλγόριθμος RSA σε μορφή CSP. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 3500
url: /el/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | Αποκρυπτογραφεί το μήνυμα. Δεν έχει υλοποιηθεί. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Αποκρυπτογραφεί τα εισερχόμενα δεδομένα χρησιμοποιώντας τη συγκεκριμένη λειτουργία γεμίσματος. |
| [Dispose](./dispose/)() override | Απελευθερώνει τα δεδομένα που σχετίζονται με το αντικείμενο. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | Κρυπτογραφεί το μήνυμα. Δεν έχει υλοποιηθεί. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Κρυπτογραφεί τα εισερχόμενα δεδομένα χρησιμοποιώντας τη συγκεκριμένη λειτουργία γεμίσματος. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Εξάγει blob με πληροφορίες για το κλειδί. Δεν έχει υλοποιηθεί. |
| [ExportParameters](./exportparameters/)(bool) override | Εξάγει παραμέτρους CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Λαμβάνει ένα αντικείμενο [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Ελέγχει τον αλγόριθμο ανταλλαγής κλειδιού που σχετίζεται με το αντικείμενο. |
| [get_KeySize](./get_keysize/)() override | Λαμβάνει το μέγεθος κλειδιού που χρησιμοποιείται από τον αλγόριθμο. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Ελέγχει εάν το κλειδί είναι αποθηκευμένο στο αντικείμενο CSP. |
| [get_PublicOnly](./get_publiconly/)() const | Ελέγχει αν υπάρχει μόνο το δημόσιο κλειδί στο αντικείμενο CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Αποκτά τον αλγόριθμο υπογραφής που σχετίζεται με το αντικείμενο CSP. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Ελέγχει εάν το κλειδί αποθηκεύεται στο αποθετήριο μηχανής αντί για το αποθετήριο χρήστη. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Εισάγει blob με πληροφορίες για το κλειδί. Δεν έχει υλοποιηθεί. |
| [ImportParameters](./importparameters/)(RSAParameters) override | Εισάγει παραμέτρους CSP. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | Πληροφορίες RTTI. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Κατασκευαστής. Δεν έχει υλοποιηθεί. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | Κατασκευαστής. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | Κατασκευαστής. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Κατασκευαστής. Δεν έχει υλοποιηθεί. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Ορίζει εάν το κλειδί είναι αποθηκευμένο στο αντικείμενο CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Ορίζει εάν το κλειδί αποθηκεύεται στο αποθετήριο μηχανής αντί για το αποθετήριο χρήστη. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | Υπολογίζει την υπογραφή για την καθορισμένη τιμή κατακερματισμού. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. Δεν έχει υλοποιηθεί. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | Ελέγχει την υπογραφή δεδομένων. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Ελέγχει την υπογραφή δεδομένων. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | Επιβεβαιώνει ότι η υπογραφή του καθορισμένου κατακερματισμού είναι έγκυρη. |
## Δείτε επίσης

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
