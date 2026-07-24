---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method"
linktitle: "operator()"
second_title: "Aspose.Page για C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method. Καλεί όλους τους αντιπροσώπους που είναι αυτή τη στιγμή στην συλλογή των αντιπροσώπων. Οι αντιπρόσωποι καλούνται με την ίδια σειρά με την οποία προστέθηκαν στη συλλογή. Ο τελεστής μπλοκάρει ενώ οι αντιπρόσωποι εκτελούνται σε C++."
type: docs
weight: 1400
url: /el/cpp/system/multicastdelegate_returntype(argumenttypes...)_/operator()/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method


Καλεί όλα τα delegates που είναι παρόντα στη συλλογή των delegates. Τα delegates καλούνται με την ίδια σειρά με την οποία προστέθηκαν στη συλλογή. Ο τελεστής μπλοκάρει ενώ τα delegates εκτελούνται.

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::operator()(ArgumentTypes... args) const
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
