---
title: "System::Boolean κλάση"
linktitle: "Boolean"
second_title: "Aspose.Page για C++"
description: "System::Boolean κλάση. Κλάση που διατηρεί στατικά μέλη του τύπου System.Boolean .Net σε C++."
type: docs
weight: 600
url: /el/cpp/system/boolean/
---
## Boolean class


Κλάση που διατηρεί στατικά μέλη του τύπου [System.Boolean](./) .[Net](../../system.net/).

```cpp
class Boolean
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [Parse](./parse/)(const String\&) | Μετατρέπει τη συγκεκριμένη συμβολοσειρά σε τιμή τύπου bool. |
| static [TryParse](./tryparse/)(const String\&, bool\&) | Μετατρέπει τη συγκεκριμένη συμβολοσειρά σε τιμή τύπου bool. |
## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [FalseString](./falsestring/) | [String](../string/) αναπαράσταση της λογικής τιμής 'false'. |
| static [TrueString](./truestring/) | [String](../string/) αναπαράσταση της λογικής τιμής 'true'. |
## Παρατηρήσεις



```cpp
#include <system/boolean.h>

using namespace System;

int main()
{
  // Δημιουργήστε τη λογική μεταβλητή.
  bool isWeekend = false;

  // Αναλύστε τη συμβολοσειρά εισόδου και εκτυπώστε το αποτέλεσμα.
  if (Boolean::TryParse(u"True", isWeekend))
  {
    std::cout << "Is weekend: " << (isWeekend ? "Yes" : "No");
  }
  else
  {
    std::cerr << "Something went wrong" << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
Is weekend: Yes
*/
```

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
