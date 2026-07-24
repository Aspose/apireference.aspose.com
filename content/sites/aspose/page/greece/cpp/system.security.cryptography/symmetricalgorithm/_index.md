---
title: "Κλάση System::Security::Cryptography::SymmetricAlgorithm"
linktitle: "SymmetricAlgorithm"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Security::Cryptography::SymmetricAlgorithm. Αλγόριθμος συμμετρικός που χρησιμοποιεί το ίδιο κλειδί για κρυπτογράφηση και αποκρυπτογράφηση, κλάση βάσης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 4900
url: /el/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


Αλγόριθμος συμμετρικός που χρησιμοποιεί το ίδιο κλειδί για κρυπτογράφηση και αποκρυπτογράφηση, κλάση βάσης. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο μέσω της συνάρτησης [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα προκαλέσει σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάσετε σε συναρτήσεις ως όρισμα.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Create](./create/)(const String\&) | Δημιουργεί ένα στιγμιότυπο αλγορίθμου. |
| virtual [CreateDecryptor](./createdecryptor/)() | Δημιουργεί αποκρυπτογράφο με παραμέτρους που σχετίζονται με το αντικείμενο αλγορίθμου. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Δημιουργεί αποκρυπτογράφο με ρητές παραμέτρους. |
| virtual [CreateEncryptor](./createencryptor/)() | Δημιουργεί κρυπτογράφο με παραμέτρους που σχετίζονται με το αντικείμενο αλγορίθμου. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Δημιουργεί κρυπτογράφο με ρητές παραμέτρους. |
| virtual [GenerateIV](./generateiv/)() | Δημιουργεί τυχαία αρχική τιμή για τον αλγόριθμο. Αντικαθιστά την υπάρχουσα (αν υπάρχει). |
| virtual [GenerateKey](./generatekey/)() | Δημιουργεί τυχαίο κλειδί για τον αλγόριθμο. Αντικαθιστά το υπάρχον (αν υπάρχει). |
| virtual [get_BlockSize](./get_blocksize/)() | Λαμβάνει το μέγεθος μπλοκ της κρυπτογραφικής λειτουργίας. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | Λαμβάνει το μέγεθος ανάδρασης της κρυπτογραφικής λειτουργίας. |
| virtual [get_IV](./get_iv/)() | Λαμβάνει την αρχική τιμή της κρυπτογραφικής λειτουργίας. Δημιουργεί νέα εάν δεν έχει δημιουργηθεί ακόμη. |
| virtual [get_Key](./get_key/)() | Λαμβάνει το κλειδί της κρυπτογραφικής λειτουργίας. Δημιουργεί νέο εάν δεν έχει δημιουργηθεί ακόμη. |
| virtual [get_KeySize](./get_keysize/)() | Λαμβάνει το μέγεθος κλειδιού της κρυπτογραφικής λειτουργίας. |
| virtual [get_Mode](./get_mode/)() | Λαμβάνει τη λειτουργία της κρυπτογραφικής λειτουργίας. |
| virtual [get_Padding](./get_padding/)() | Λαμβάνει τη συμπλήρωση της κρυπτογραφικής λειτουργίας. |
| virtual [set_BlockSize](./set_blocksize/)(int) | Ορίζει το μέγεθος μπλοκ της κρυπτογραφικής λειτουργίας. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | Ορίζει το μέγεθος ανάδρασης της κρυπτογραφικής λειτουργίας. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | Ορίζει την αρχική τιμή της κρυπτογραφικής λειτουργίας. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | Ορίζει το κλειδί της κρυπτογραφικής λειτουργίας. |
| virtual [set_KeySize](./set_keysize/)(int) | Ορίζει το μέγεθος κλειδιού της κρυπτογραφικής λειτουργίας. |
| virtual [set_Mode](./set_mode/)(CipherMode) | Ορίζει τη λειτουργία της κρυπτογραφικής λειτουργίας. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | Ορίζει το padding της κρυπτογραφικής λειτουργίας. |
| [ValidKeySize](./validkeysize/)(int) | Ελέγχει αν το μέγεθος του κλειδιού είναι έγκυρο. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
