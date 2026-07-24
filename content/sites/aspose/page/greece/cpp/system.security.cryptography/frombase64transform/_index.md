---
title: "System::Security::Cryptography::FromBase64Transform κλάση"
linktitle: "FromBase64Transform"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::FromBase64Transform κλάση. Μετατρέπει το αντικείμενο κλάσης CryptoStream από base 64. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1500
url: /el/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


Μετατρέπει το αντικείμενο κλάσης [CryptoStream](../cryptostream/) από base 64. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας operator new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clear](./clear/)() | Απελευθερώνει όλους τους πόρους. |
| [Dispose](./dispose/)() | Απελευθερώνει τους πόρους του λειτουργικού συστήματος που αποκτήθηκαν από το τρέχον αντικείμενο. |
| [FromBase64Transform](./frombase64transform/)() | Κατασκευαστής. |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | Κατασκευαστής. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν η τρέχουσα μετατροπή μπορεί να επαναχρησιμοποιηθεί. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Λαμβάνει μια τιμή που υποδεικνύει εάν μπορούν να μετατραπούν πολλαπλά μπλοκ. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Μέγεθος μπλοκ εισόδου. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Μέγεθος μπλοκ εξόδου. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | Καταστροφέας. |
## Δείτε επίσης

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
