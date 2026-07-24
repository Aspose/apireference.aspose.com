---
title: "System::Collections::IEnumeratorImplRefType κλάση"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Page για C++"
description: "System::Collections::IEnumeratorImplRefType κλάση. Περιτύλιγμα που δημιουργεί μη γενική υλοποίηση του IEnumerator πάνω από τον γενικό Iterator IEnumeratorImplRefType - περιτύλιγμα για τους τύπους αναφοράς σε C++."
type: docs
weight: 700
url: /el/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


Περιτύλιγμα που δημιουργεί μη γενική υλοποίηση του [IEnumerator](../ienumerator/) πάνω από τον γενικό Iterator [IEnumeratorImplRefType](./) - περιτύλιγμα για τους τύπους αναφοράς.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Current](./get_current/)() const override | Επιστρέφει το τρέχον στοιχείο. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | κατασκευαστής περιτύλιξης |
| [MoveNext](./movenext/)() override | Μετακινεί τον απαριθμητή στο επόμενο στοιχείο. Εάν δεν έχει αναφερθεί προηγουμένως κανένα στοιχείο, ορίζει την αναφορά στο πρώτο διαθέσιμο στοιχείο. Εάν φτάσει στο τέλος του κοντέινερ, δεν κάνει τίποτα. |

## Δείτε επίσης

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
