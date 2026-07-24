---
title: "System::Globalization::NumberFormatInfo κλάση"
linktitle: "NumberFormatInfo"
second_title: "Aspose.Page για C++"
description: "System::Globalization::NumberFormatInfo κλάση. Περιέχει πληροφορίες σχετικά με το πώς να μορφοποιείτε αριθμούς. Οι λειτουργίες ορισμού είναι ενεργοποιημένες μόνο σε αντικείμενα που δεν είναι μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση System::MakeObject(). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 1900
url: /el/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


Περιέχει πληροφορίες σχετικά με το πώς να μορφοποιείτε αριθμούς. Οι λειτουργίες ορισμού είναι ενεργοποιημένες μόνο σε αντικείμενα που δεν είναι μόνο για ανάγνωση. Τα αντικείμενα αυτής της κλάσης πρέπει να εκχωρούνται μόνο χρησιμοποιώντας τη συνάρτηση [System::MakeObject()](../../system/makeobject/). Ποτέ μην δημιουργείτε στιγμιότυπο αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα επιβεβαίωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../../system/smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να το περάσετε σε συναρτήσεις ως όρισμα.

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Clone](./clone/)() override | Κλωνοποιεί τις πληροφορίες μορφοποίησης. |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | Λαμβάνει τον αριθμό των δεκαδικών ψηφίων του νομίσματος. |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | Λαμβάνει το δεκαδικό διαχωριστικό του νομίσματος. |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | Λαμβάνει το διαχωριστικό ομάδας του νομίσματος. |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | Λαμβάνει τον αριθμό των δεκαδικών ψηφίων του νομίσματος ανά ομάδα. |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | Λαμβάνει το αρνητικό πρότυπο του νομίσματος. |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | Λαμβάνει το θετικό πρότυπο του νομίσματος. |
| [get_CurrencySymbol](./get_currencysymbol/)() const | Λαμβάνει το σύμβολο του νομίσματος. |
| static [get_CurrentInfo](./get_currentinfo/)() | Λαμβάνει τις πληροφορίες μορφοποίησης αριθμών που ορίζονται από τον πολιτισμό του τρέχοντος νήματος. |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | Λαμβάνει μια τιμή που καθορίζει πώς θα εμφανίζεται το σχήμα ενός ψηφίου. |
| static [get_InvariantInfo](./get_invariantinfo/)() | Λαμβάνει τις πληροφορίες μορφοποίησης αριθμών που ορίζονται από τον αμετάβλητο πολιτισμό. |
| [get_IsReadOnly](./get_isreadonly/)() const | Ελέγχει αν η μορφή είναι μόνο για ανάγνωση. |
| [get_NaNSymbol](./get_nansymbol/)() const | Λαμβάνει το σύμβολο Not-a-Number. |
| [get_NativeDigits](./get_nativedigits/)() const | Λαμβάνει τα σύμβολα ψηφίων (0 έως 9). |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | Λαμβάνει το σύμβολο του αρνητικού άπειρου. |
| [get_NegativeSign](./get_negativesign/)() const | Λαμβάνει το αρνητικό πρόσημο. |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | Λαμβάνει τον αριθμό των δεκαδικών ψηφίων. |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | Λαμβάνει το δεκαδικό διαχωριστικό. |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | Λαμβάνει το διαχωριστικό ομάδας αριθμών. |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | Λαμβάνει τον αριθμό των ψηφίων ανά ομάδα. |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | Λαμβάνει το αρνητικό πρότυπο αριθμού. |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | Λαμβάνει τον αριθμό των δεκαδικών θέσεων στις τιμές ποσοστού. |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | Λαμβάνει το δεκαδικό διαχωριστικό στις τιμές ποσοστού. |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | Λαμβάνει το διαχωριστικό ομάδας στις τιμές ποσοστού. |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | Λαμβάνει τον αριθμό των ψηφίων ανά ομάδα τιμής ποσοστού. |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | Λαμβάνει το αρνητικό πρότυπο ποσοστού. |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | Λαμβάνει το θετικό πρότυπο ποσοστού. |
| [get_PercentSymbol](./get_percentsymbol/)() const | Λαμβάνει το σύμβολο ποσοστού. |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | Λαμβάνει το σύμβολο προμιλίου. |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | Λαμβάνει το σύμβολο θετικού άπειρου. |
| [get_PositiveSign](./get_positivesign/)() const | Λαμβάνει το θετικό πρόσημο. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Λαμβάνει μορφοποιητή συγκεκριμένου τύπου. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | Λαμβάνει μορφοποιητή που σχετίζεται με τον πάροχο μορφής. |
| [NumberFormatInfo](./numberformatinfo/)() | Προεπιλεγμένος κατασκευαστής (αμετάβλητος [NumberFormatInfo](./)). |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | Λαμβάνει την έκδοση μόνο για ανάγνωση του μορφοποιητή. |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | Ορίζει τον αριθμό των δεκαδικών ψηφίων του νομίσματος. |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | Ορίζει το δεκαδικό διαχωριστικό του νομίσματος. |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | Ορίζει το διαχωριστικό ομάδας του νομίσματος. |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | Ορίζει τον αριθμό των δεκαδικών ψηφίων του νομίσματος ανά ομάδα. |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | Ορίζει το αρνητικό μοτίβο του νομίσματος. |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | Ορίζει το θετικό μοτίβο του νομίσματος. |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | Ορίζει το σύμβολο νομίσματος. |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | Ορίζει μια τιμή που καθορίζει πώς θα εμφανίζεται το σχήμα ενός ψηφίου. |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | Ορίζει το σύμβολο Not-a-Number. |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | Ορίζει τα σύμβολα ψηφίων (0 έως 9). |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | Ορίζει το σύμβολο του αρνητικού άπειρου. |
| [set_NegativeSign](./set_negativesign/)(const String\&) | Ορίζει το αρνητικό πρόσημο. |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | Ορίζει τον αριθμό των δεκαδικών ψηφίων. |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | Ορίζει το δεκαδικό διαχωριστικό. |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | Ορίζει το διαχωριστικό ομάδας αριθμών. |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | Ορίζει τον αριθμό των ψηφίων ανά ομάδα. |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | Ορίζει το αρνητικό μοτίβο αριθμού. |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | Ορίζει τον αριθμό των δεκαδικών θέσεων στις τιμές ποσοστών. |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | Ορίζει το δεκαδικό διαχωριστικό στις τιμές ποσοστών. |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | Ορίζει το διαχωριστικό ομάδας στις τιμές ποσοστών. |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | Ορίζει τον αριθμό των ψηφίων ανά ομάδα τιμών ποσοστών. |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | Ορίζει το αρνητικό μοτίβο ποσοστού. |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | Ορίζει το θετικό μοτίβο ποσοστού. |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | Ορίζει το σύμβολο ποσοστού. |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | Ορίζει το σύμβολο προμιλίου. |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | Ορίζει το σύμβολο θετικού άπειρου. |
| [set_PositiveSign](./set_positivesign/)(const String\&) | Ορίζει το θετικό πρόσημο. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
