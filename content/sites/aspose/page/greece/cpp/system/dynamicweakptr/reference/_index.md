---
title: "System::DynamicWeakPtr::Reference κλάση"
linktitle: "Reference"
second_title: "Aspose.Page για C++"
description: "System::DynamicWeakPtr::Reference κλάση. Κλάση αναφοράς που εξασφαλίζει ότι καλείται το DynamicWeakPtr::Apply. Χρησιμοποιείται εάν το DynamicWeakPtr περνιέται ως παράμετρος αναφοράς SmartPtr σε συνάρτηση που μπορεί να το αναθέσει σε C++."
type: docs
weight: 700
url: /el/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | Τελεστής μετατροπής. Επιτρέπει τη χρήση του [Reference](./) σε περιβάλλοντα όπου απαιτείται το [DynamicWeakPtr_](../dynamicweakptr_/). |
| [Reference](./reference/)(DynamicWeakPtr_\&) | Δημιουργεί αναφορά έξυπνου δείκτη. |
| [Reference](./reference/)(Reference\&&) | Δημιουργεί με μετακίνηση την αναφορά έξυπνου δείκτη. |
| [~Reference](./~reference/)() | Καταστρέφει την αναφορά. Εξασφαλίζει κλήση του Apply() στον αναφερόμενο έξυπνο δείκτη. |
## Δείτε επίσης

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
