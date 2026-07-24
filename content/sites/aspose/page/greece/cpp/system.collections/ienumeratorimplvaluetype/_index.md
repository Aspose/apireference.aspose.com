---
title: "System::Collections::IEnumeratorImplValueType κλάση"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Page για C++"
description: "System::Collections::IEnumeratorImplValueType κλάση. Περιτύλιγμα που δημιουργεί μη γενική υλοποίηση του IEnumerator πάνω από τον γενικό Iterator IEnumeratorImplRefType - περιτύλιγμα για τους τύπους τιμών σε C++."
type: docs
weight: 800
url: /el/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Περιτύλιγμα που δημιουργεί μη γενική υλοποίηση του [IEnumerator](../ienumerator/) πάνω από τον γενικό Iterator [IEnumeratorImplRefType](../ienumeratorimplreftype/) - περιτύλιγμα για τους τύπους τιμών.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος στοιχείου. |
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_Current](./get_current/)() const override | Επιστρέφει το τρέχον στοιχείο. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | κατασκευαστής περιτύλιξης |
| [MoveNext](./movenext/)() override | Μετακινεί τον απαριθμητή στο επόμενο στοιχείο. Εάν δεν έχει αναφερθεί προηγουμένως κανένα στοιχείο, ορίζει την αναφορά στο πρώτο διαθέσιμο στοιχείο. Εάν φτάσει στο τέλος του κοντέινερ, δεν κάνει τίποτα. |

## Δείτε επίσης

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
