---
title: "Κλάση System::Random"
linktitle: "Random"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Random. Αντιπροσωπεύει έναν ψευδο-τυχαίο γεννήτρια αριθμών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη System::SmartPtr και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 5200
url: /el/cpp/system/random/
---
## Random class


Αντιπροσωπεύει έναν ψευδο-τυχαίο γεννήτρια αριθμών. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../makeobject/). Ποτέ μην δημιουργείτε ένα στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς αυτό θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα ελέγχου. Πάντα να τυλίγετε αυτήν την κλάση σε δείκτη [System::SmartPtr](../smartptr/) και να χρησιμοποιείτε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
class Random : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [IsNull](./isnull/)() const | Πάντα επιστρέφει false. |
| virtual [Next](./next/)() | Επιστρέφει έναν μη-αρνητικό τυχαίο αριθμό μικρότερο από τη μέγιστη τιμή του int32. |
| virtual [Next](./next/)(int32_t) | Επιστρέφει έναν μη-αρνητικό τυχαίο αριθμό μικρότερο από το καθορισμένο μέγιστο. |
| virtual [Next](./next/)(int32_t, int32_t) | Επιστρέφει έναν τυχαίο αριθμό εντός του καθορισμένου εύρους. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | Γεμίζει τα στοιχεία του καθορισμένου πίνακα bytes με τυχαίους αριθμούς. |
| virtual [NextDouble](./nextdouble/)() | Επιστρέφει έναν τυχαίο αριθμό μεταξύ 0.0 και 1.0. |
| [Random](./random/)() | Αρχικοποιεί ένα νέο αντικείμενο, χρησιμοποιώντας μια προεπιλεγμένη τιμή σπόρου εξαρτημένη από το χρόνο. |
| [Random](./random/)(int32_t) | Αρχικοποιεί ένα νέο αντικείμενο της κλάσης [System.Random](./), χρησιμοποιώντας την καθορισμένη τιμή σπόρου. |
## Παρατηρήσεις



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // Λάβετε έναν τυχαίο αριθμό μήνα και εκτυπώστε τον.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // Γεμίστε τον πίνακα με τυχαίους αριθμούς.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // Εκτυπώστε τον πίνακα.
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## Δείτε επίσης

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
