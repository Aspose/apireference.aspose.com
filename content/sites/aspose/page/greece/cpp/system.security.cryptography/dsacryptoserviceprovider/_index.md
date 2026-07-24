---
title: "System::Security::Cryptography::DSACryptoServiceProvider κλάση"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider κλάση. Αλγόριθμος DSA σε μορφή CSP. Αντικείμενα αυτής της κλάσης πρέπει να κατανεμηθούν μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1000
url: /el/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | Δημιουργήστε υπογραφή [DSA](../dsa/) για τα καθορισμένα δεδομένα. |
| [Dispose](./dispose/)() override | Απελευθερώνει τα δεδομένα που σχετίζονται με το αντικείμενο. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | Κατασκευαστής. Χρησιμοποιεί προεπιλεγμένες παραμέτρους. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | Κατασκευαστής. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Κατασκευαστής. Δεν έχει υλοποιηθεί. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | Κατασκευαστής. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Κατασκευαστής. Δεν έχει υλοποιηθεί. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Εξάγει blob με πληροφορίες για το κλειδί. Δεν έχει υλοποιηθεί. |
| [ExportParameters](./exportparameters/)(bool) override | Εξάγει παραμέτρους CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Λαμβάνει ένα αντικείμενο [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Ελέγχει τον αλγόριθμο ανταλλαγής κλειδιού που σχετίζεται με το αντικείμενο. |
| [get_KeySize](./get_keysize/)() override | Λαμβάνει το μέγεθος του κλειδιού. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Ελέγχει εάν το κλειδί είναι αποθηκευμένο στο αντικείμενο CSP. |
| [get_PublicOnly](./get_publiconly/)() const | Ελέγχει αν υπάρχει μόνο το δημόσιο κλειδί στο αντικείμενο CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Λαμβάνει τον αλγόριθμο υπογραφής που θα χρησιμοποιηθεί. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Ελέγχει εάν το κλειδί αποθηκεύεται στο αποθετήριο μηχανής αντί για το αποθετήριο χρήστη. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Εισάγει blob με πληροφορίες για το κλειδί. Δεν έχει υλοποιηθεί. |
| [ImportParameters](./importparameters/)(DSAParameters) override | Εισάγει όλες τις παραμέτρους από τη δομή δεδομένων. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Ορίζει εάν το κλειδί είναι αποθηκευμένο στο αντικείμενο CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Ορίζει εάν το κλειδί αποθηκεύεται στο αποθετήριο μηχανής αντί για το αποθετήριο χρήστη. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Πληροφορίες RTTI. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Πληροφορίες RTTI. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Πληροφορίες RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Ελέγχει την υπογραφή δεδομένων. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή των καθορισμένων δεδομένων είναι έγκυρη. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Επαληθεύει ότι η υπογραφή της καθορισμένης δυαδικής ροής είναι έγκυρη. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Ελέγχει την υπογραφή δεδομένων. |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | Επαληθεύστε την υπογραφή [DSA](../dsa/) για τα καθορισμένα δεδομένα. |
## Δείτε επίσης

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
