---
title: "Κλάση System::ObjectExt"
linktitle: "ObjectExt"
second_title: "Aspose.Page για C++"
description: "Κλάση System::ObjectExt. Παρέχει στατικές μεθόδους που προσομοιώνουν τις μεθόδους Object της C# που καλούνται για μη‑Object τύπους C++ (συμβολοσειρές, αριθμούς κ.λπ.). Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με οποιονδήποτε τρόπο στην C++."
type: docs
weight: 4900
url: /el/cpp/system/objectext/
---
## ObjectExt class


Παρέχει στατικές μεθόδους που προσομοιώνουν τις μεθόδους C# [Object](../object/) που καλούνται για μη‑Object τύπους C++ (συμβολοσειρές, αριθμούς κ.λπ.). Αυτός είναι ένας στατικός τύπος χωρίς υπηρεσίες στιγμιοτύπων. Δεν πρέπει ποτέ να δημιουργείτε στιγμιότυπα του με οποιονδήποτε τρόπο.

```cpp
class ObjectExt : public System::ObjectType
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Μετατρέπει τις βασικές τιμές πίνακα (που η C# κάνει αυτόματα, αλλά η C++ προφανώς όχι). |
| static [Box](./box/)(const T\&) | Κάνει boxing τύπων τιμών για μετατροπή σε [Object](../object/). Υλοποίηση για τύπους enum. |
| static [Box](./box/)(const T\&) | Κάνει boxing τύπων τιμών για μετατροπή σε [Object](../object/). Υλοποίηση για μη‑enum τύπους. |
| static [Box](./box/)(const T\&) | Κάνει boxing τύπων [Nullable](../nullable/) για μετατροπή σε [Object](../object/). |
| static [Box](./box/)(const String\&) | Κάνει boxing τιμών συμβολοσειρών. |
| static [BoxEnum](./boxenum/)(T) | Κάνει boxing τύπων enum ώστε να διαδίδονται ως [Object](../object/). |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Υλοποίηση μετάφρασης του τελεστή '??' για μη‑null τύπους. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Υλοποίηση μετάφρασης του τελεστή '??' για nullable τύπους. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Υλοποίηση μετάφρασης του τελεστή '??' για μη‑null τύπους. Υπερφόρτωση για την περίπτωση που το RT2 μπορεί να μετατραπεί σε RT1. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | Αντικατάσταση κλήσεων C# [Object.Equals](../object/equals/) που λειτουργούν για οποιονδήποτε τύπο στην C++. Υπερφόρτωση για τύπους smart pointer. |
| static [Equals](./equals/)(T, const T2\&) | Αντικατάσταση κλήσεων C# [Object.Equals](../object/equals/) που λειτουργούν για οποιονδήποτε τύπο στην C++. Υπερφόρτωση για τύπους δομών. |
| static [Equals](./equals/)(const T\&, const T2\&) | Αντικατάσταση κλήσεων C# [Object.Equals](../object/equals/) που λειτουργούν για οποιονδήποτε τύπο στην C++. Υπερφόρτωση για σκαλαρικούς τύπους. |
| static [Equals](./equals/)(const char_t(&), String) | Αντικατάσταση κλήσεων C# [Object.Equals](../object/equals/) που λειτουργούν για οποιονδήποτε τύπο στην C++. Υπερφόρτωση για κυριολεκτικό συμβολοσειράς με σύγκριση συμβολοσειρών. |
| static [Equals](./equals/)(const float\&, const float\&) | Εξομοιώνει τη σύγκριση κινητής υποδιαστολής σε στυλ C# όπου δύο NaN θεωρούνται ίσα, παρόλο που σύμφωνα με το IEC 60559:1989 το NaN δεν είναι ίσο με καμία τιμή, συμπεριλαμβανομένου του NaN. |
| static [Equals](./equals/)(const double\&, const double\&) | Εξομοιώνει τη σύγκριση κινητής υποδιαστολής σε στυλ C# όπου δύο NaN θεωρούνται ίσα, παρόλο που σύμφωνα με το IEC 60559:1989 το NaN δεν είναι ίσο με καμία τιμή, συμπεριλαμβανομένου του NaN. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | Υλοποιεί κλήσεις [GetHashCode()](./gethashcode/); λειτουργεί τόσο σε υποκλάσεις του [Object](../object/) όσο και σε μη σχετιζόμενους τύπους. |
| static [Is](./is/)(const T\&) | Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους που μπορούν να υποστούν boxing (τιμές), που είναι ακριβώς αυτό που είναι. |
| static [Is](./is/)(const U\&) | Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους δεικτών βελτιστοποιημένους για κλάσεις 'final'. |
| static [Is](./is/)(const U\&) | Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους δεικτών. |
| static [Is](./is/)(const Object\&) | Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους τιμών. |
| static [Is](./is/)(const Object\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για μη μετατρέψιμους τύπους. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Υλοποιεί μετάφραση του τελεστή 'is'. Εξειδίκευση για τύπους δεικτών. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους περιτύλιξης εξαιρέσεων. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για nullable τύπους. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους που μπορούν να τοποθετηθούν σε κουτί με ορισμένο τελεστή == |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους που μπορούν να τοποθετηθούν σε κουτί χωρίς ορισμένο == |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους τιμών που τοποθετούνται σε κουτί σε διεπαφές. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους enum. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπους enum έναντι αδύναμων δεικτών. |
| static [Is](./is/)(const Nullable\<U\>\&) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για τύπο [Nullable](../nullable/). |
| static [Is](./is/)(const char16_t *) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για κυριολεκτικό συμβολοσειράς. |
| static [Is](./is/)(int32_t) | Υλοποιεί τη μετάφραση του τελεστή 'is'. Ειδίκευση για κυριολεκτικό ακέραιου. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Ελέγχει αν το αντικείμενο είναι μια τιμή σε κουτί. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Μετατρέπει το [Object](../object/) σε άγνωστο τύπο, διαχειριζόμενο τόσο τύπους έξυπνων δεικτών όσο και καταστάσεις bpxed τιμών. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Μετατρέπει το [Object](../object/) σε άγνωστο τύπο, διαχειριζόμενο τόσο τύπους έξυπνων δεικτών όσο και καταστάσεις boxed τιμών. |
| static [ToString](./tostring/)(const char_t *) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(const T\&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(const T\&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(T\&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(T\&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(T\&&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(T\&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(const T\&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [ToString](./tostring/)(T\&&) | Αντικατάσταση για τη μέθοδο C# ToString ώστε να λειτουργεί σε οποιονδήποτε τύπο C++. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Αποσυσκευάζει τύπους τιμών μετά τη μετατροπή σε [Object](../object/). Υλοποίηση για τύπους enum. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Αποσυσκευάζει τύπους τιμών μετά τη μετατροπή σε [Object](../object/). Υλοποίηση για μη-enum και μη-nullable τύπους. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Αποσυσκευάζει τύπους τιμών μετά τη μετατροπή σε [Object](../object/). Υλοποίηση για μη-enum και μη-nullable τύπους. |
| static [Unbox](./unbox/)(E) | Αποσυσκευάζει τύπους enum σε ακέραιο. |
| static [Unbox](./unbox/)(E) | Μετατρέπει τύπους enum. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Αποσυσκευάζει τιμές συμβολοσειράς. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Αποσυσκευάζει συμβολοσειρά από τιμή σε κουτί. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Αποσυσκευάζει αντικείμενο σε nullable τύπο. |
| static [UnknownIsNull](./unknownisnull/)(T) | Ελέγχει αν το αντικείμενο άγνωστου τύπου είναι nullptr. Υπερφόρτωση για μη-σκαλαρικούς τύπους. |
| static [UnknownIsNull](./unknownisnull/)(T) | Ελέγχει αν το αντικείμενο άγνωστου τύπου είναι nullptr. Υπερφόρτωση για σκαλαρικούς τύπους. |
| static [UnknownToObject](./unknowntoobject/)(T) | Μετατρέπει άγνωστο τύπο σε [Object](../object/), διαχειριζόμενο τόσο τύπους έξυπνων δεικτών όσο και καταστάσεις τύπων τιμών. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Μετατρέπει άγνωστο τύπο σε [Object](../object/), διαχειριζόμενο τόσο τύπους έξυπνων δεικτών όσο και καταστάσεις τύπων τιμών. |
## Δείτε επίσης

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
