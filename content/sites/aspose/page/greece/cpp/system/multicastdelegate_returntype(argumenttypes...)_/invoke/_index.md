---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke μέθοδος"
linktitle: "invoke"
second_title: "Aspose.Page για C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke μέθοδος. Καλεί όλους τους αντιπροσώπους που είναι αυτή τη στιγμή στην συλλογή αντιπροσώπων. Οι αντιπρόσωποι καλούνται με την ίδια σειρά με την οποία προστέθηκαν στη συλλογή. Η μέθοδος μπλοκάρει ενώ οι αντιπρόσωποι εκτελούνται σε C++."
type: docs
weight: 1100
url: /el/cpp/system/multicastdelegate_returntype(argumenttypes...)_/invoke/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke method


Καλεί όλα τα delegates που είναι παρόντα αυτή τη στιγμή στη συλλογή delegates. Τα delegates καλούνται με την ίδια σειρά με την οποία προστέθηκαν στη συλλογή. Η μέθοδος μπλοκάρει ενώ τα delegates εκτελούνται.

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::invoke(ArgumentTypes... args) const
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| args | ArgumentTypes... | Ορίσματα προς μεταβίβαση στους αντιπροσώπους που θα κληθούν |

### ReturnValue

Τιμή επιστροφής του τελευταίου κληθέντος αντιπροσώπου

## Δείτε επίσης

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
