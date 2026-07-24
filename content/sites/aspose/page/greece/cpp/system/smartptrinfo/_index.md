---
title: "System::SmartPtrInfo class"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page για C++"
description: "System::SmartPtrInfo class. Κλάση υπηρεσίας για δοκιμή και τροποποίηση του περιεχομένου του SmartPtr''s χωρίς γνώση του τελικού τύπου. Χρησιμοποιείται για συλλογή απορριμμάτων και ανίχνευση κυκλικών αναφορών κ.λπ. Σκεφτείτε το ως ''pointer to pointer''. Δεν μπορούμε να χρησιμοποιήσουμε τον basetype του SmartPtr''s επειδή δεν υπάρχει· αντίθετα, χρησιμοποιούμε αυτή τη ''info'' κλάση σε C++."
type: docs
weight: 5600
url: /el/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Κλάση υπηρεσίας για δοκιμή και τροποποίηση του περιεχομένου του [SmartPtr](../smartptr/)'s χωρίς γνώση του τελικού τύπου. Χρησιμοποιείται για συλλογή απορριμμάτων και ανίχνευση κυκλικών αναφορών κ.λπ. Σκεφτείτε το ως 'pointer to pointer'. Δεν μπορούμε να χρησιμοποιήσουμε τον basetype του [SmartPtr](../smartptr/)'s επειδή δεν υπάρχει· αντίθετα, χρησιμοποιούμε αυτήν την 'info' κλάση.

```cpp
class SmartPtrInfo
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Λαμβάνει το ακατέργαστο αντικείμενο στο οποίο δείχνει ο δείκτης αναφοράς. |
| [getObject](./getobject/)() const | Λαμβάνει το αντικείμενο στο οποίο δείχνει ο δείκτης αναφοράς. |
| [getOwned](./getowned/)() const | Λαμβάνει τον δείκτη που ανήκει στο αντικείμενο. |
| [operator bool](./operatorbool/)() const | Ελέγχει αν το αντικείμενο info δείχνει σε μη-μηδενικό δείκτη. |
| [operator!](./operator!/)() const | Ελέγχει αν το αντικείμενο info δεν δείχνει σε μη-μηδενικό δείκτη. |
| [operator->](./operator-_/)() const | Επιτρέπει την κλήση μεθόδων του [Object](../object/) που δείχνει ο δείκτης αναφοράς. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Συγκρίνει λιγότερο τις τιμές των δεικτών που αναφέρονται από δύο αντικείμενα πληροφοριών. |
| [SmartPtrInfo](./smartptrinfo/)() | Δημιουργεί κενό αντικείμενο [SmartPtrInfo](./). |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Δημιουργεί αντικείμενο [SmartPtrInfo](./) με πληροφορίες για συγκεκριμένο έξυπνο δείκτη. |
## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
