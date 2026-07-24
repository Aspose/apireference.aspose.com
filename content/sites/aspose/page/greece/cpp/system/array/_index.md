---
title: "Κλάση System::Array"
linktitle: "Πίνακας"
second_title: "Aspose.Page για C++"
description: "Κλάση System::Array. Κλάση που αντιπροσωπεύει μια δομή δεδομένων πίνακα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τις συναρτήσεις System::MakeArray() και System::MakeObject(). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη System::SmartPtr και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα σε C++."
type: docs
weight: 200
url: /el/cpp/system/array/
---
## Array class


Κλάση που αντιπροσωπεύει μια δομή δεδομένων πίνακα. Τα αντικείμενα αυτής της κλάσης πρέπει να δημιουργούνται μόνο χρησιμοποιώντας τις συναρτήσεις [System::MakeArray()](../makearray/) και [System::MakeObject()](../makeobject/). Ποτέ μην δημιουργείτε παρουσία αυτού του τύπου στη στοίβα ή χρησιμοποιώντας τον τελεστή new, καθώς θα οδηγήσει σε σφάλματα χρόνου εκτέλεσης και/ή σφάλματα δήλωσης. Πάντα τυλίξτε αυτήν την κλάση σε δείκτη [System::SmartPtr](../smartptr/) και χρησιμοποιήστε αυτόν τον δείκτη για να τη μεταβιβάζετε σε συναρτήσεις ως όρισμα.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος των στοιχείων ενός πίνακα |
## Nested classes

* Class [Enumerator](./enumerator/)
## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Add](./add/)(const T\&) override | Δεν υποστηρίζεται επειδή ο πίνακας που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μόνο για ανάγνωση. |
| [Array](./array/)() | Δημιουργεί έναν κενό πίνακα. |
| [Array](./array/)(int, const T\&) | Κατασκευαστής πλήρωσης. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | Κατασκευαστής πλήρωσης. |
| [Array](./array/)(int, const T) | Κατασκευαστής πλήρωσης. |
| [Array](./array/)(vector_t\&&) | Κατασκευαστής μετακίνησης. |
| [Array](./array/)(const vector_t\&) | Κατασκευαστής αντιγραφής. |
| [Array](./array/)(const std::vector\<Q\>\&) | Δημιουργεί ένα αντικείμενο [Array](./) και το γεμίζει με τιμές αντιγραφόμενες από ένα αντικείμενο std::vector του οποίου ο τύπος των τιμών είναι ο ίδιος με **T** αλλά διαφορετικός από **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::vector\<Q\>\&&) | Δημιουργεί ένα αντικείμενο [Array](./) και το γεμίζει με τιμές μετακινημένες από ένα αντικείμενο std::vector του οποίου ο τύπος των τιμών είναι ο ίδιος με **T** αλλά διαφορετικός από **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | Δημιουργεί ένα αντικείμενο [Array](./) και το γεμίζει με τιμές από τη συγκεκριμένη λίστα αρχικοποίησης που περιέχει στοιχεία τύπου **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | Δημιουργεί ένα αντικείμενο [Array](./) και το γεμίζει με τιμές από τον καθορισμένο πίνακα που περιέχει στοιχεία τύπου **[UnderlyingType](./underlyingtype/)**. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | Δημιουργεί ένα αντικείμενο [Array](./) και το γεμίζει με τιμές από τη συγκεκριμένη λίστα αρχικοποίησης που περιέχει στοιχεία τύπου bool. |
| [begin](./begin/)() | Επιστρέφει έναν iterator προς το πρώτο στοιχείο του container. Εάν το container είναι κενό, ο επιστρεφόμενος iterator θα είναι ίσος με [end()](./end/). |
| [begin](./begin/)() const | Επιστρέφει έναν iterator προς το πρώτο στοιχείο του const‑qualified container. Εάν το container είναι κενό, ο επιστρεφόμενος iterator θα είναι ίσος με [end()](./end/). |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | Εκτελεί δυαδική αναζήτηση στον ταξινομημένο πίνακα. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [cbegin](./cbegin/)() const | Επιστρέφει έναν iterator προς το πρώτο const‑qualified στοιχείο του container. Εάν το container είναι κενό, ο επιστρεφόμενος iterator θα είναι ίσος με [cend()](./cend/). |
| [cend](./cend/)() const | Επιστρέφει έναν iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [Clear](./clear/)() override | Δεν υποστηρίζεται επειδή ο πίνακας που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μόνο για ανάγνωση. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | Αντικαθιστά **count** τιμές που ξεκινούν από το ευρετήριο **startIndex** στον καθορισμένο πίνακα με προεπιλεγμένες τιμές. |
| [Clone](./clone/)() | Κλωνοποιεί τον πίνακα. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Αντιγράφει μια περιοχή στοιχείων από ένα [System.Array](./) ξεκινώντας από την καθορισμένη πηγή. |
| [Contains](./contains/)(const T\&) const override | Καθορίζει αν το καθορισμένο στοιχείο βρίσκεται στον πίνακα. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | Δημιουργεί ένα νέο αντικείμενο [Array](./) και το γεμίζει με στοιχεία του καθορισμένου πίνακα που έχουν μετατραπεί σε τύπο **OutputType** χρησιμοποιώντας τον καθορισμένο converter delegate. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | Δημιουργεί ένα νέο αντικείμενο [Array](./) και το γεμίζει με στοιχεία του καθορισμένου πίνακα που έχουν μετατραπεί σε τύπο **OutputType** χρησιμοποιώντας το καθορισμένο αντικείμενο συνάρτησης μετατροπέα. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στον πίνακα προορισμού. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | Αντιγράφει τον καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα στον πίνακα προορισμού. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στην προβολή του πίνακα προορισμού. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | Αντιγράφει τον καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα στην προβολή του πίνακα προορισμού. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στη στοίβα στον πίνακα προορισμού. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στον πίνακα προορισμού στη στοίβα. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στη στοίβα στον πίνακα προορισμού στη στοίβα. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στην προβολή του πίνακα προορισμού. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στην προβολή του πίνακα προορισμού. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στη στοίβα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού στη στοίβα. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στη στοίβα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού στη στοίβα. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού στη στοίβα. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Αντιγράφει όλα τα στοιχεία του τρέχοντος πίνακα στον καθορισμένο πίνακα προορισμού. Τα στοιχεία εισάγονται στον πίνακα προορισμού ξεκινώντας από το ευρετήριο που καθορίζεται από το όρισμα arrayIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | Αντιγράφει όλα τα στοιχεία του τρέχοντος πίνακα στον καθορισμένο πίνακα προορισμού. Τα στοιχεία εισάγονται στον πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | Αντιγράφει όλα τα στοιχεία του τρέχοντος πίνακα στην καθορισμένη προβολή πίνακα προορισμού. Τα στοιχεία εισάγονται στην προβολή πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα dstIndex. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον τρέχοντα πίνακα ξεκινώντας από τη καθορισμένη θέση στον καθορισμένο πίνακα προορισμού. Τα στοιχεία εισάγονται στον πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα dstIndex. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον τρέχοντα πίνακα ξεκινώντας από τη καθορισμένη θέση στην καθορισμένη προβολή πίνακα προορισμού. Τα στοιχεία εισάγονται στην προβολή πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα dstIndex. |
| [Count](./count/)() const | Επιστρέφει έναν αριθμό που αντιπροσωπεύει το συνολικό πλήθος όλων των στοιχείων σε όλες τις διαστάσεις του πίνακα. |
| [crbegin](./crbegin/)() const | Επιστρέφει έναν reverse iterator προς το πρώτο στοιχείο του reversed container. Αντιστοιχεί στο τελευταίο στοιχείο του non‑reversed container. Εάν το container είναι κενό, ο επιστρεφόμενος iterator είναι ίσος με [crend()](./crend/). |
| [crend](./crend/)() const | Επιστρέφει έναν reverse iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του reversed container. Αντιστοιχεί στο στοιχείο που προηγείται του πρώτου στοιχείου του non‑reversed container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [data](./data/)() | Επιστρέφει μια αναφορά στη εσωτερική δομή δεδομένων που χρησιμοποιείται για την αποθήκευση των στοιχείων του πίνακα. |
| [data](./data/)() const | Επιστρέφει μια σταθερή αναφορά στη εσωτερική δομή δεδομένων που χρησιμοποιείται για την αποθήκευση των στοιχείων του πίνακα. |
| [data_ptr](./data_ptr/)() | Επιστρέφει έναν ακατέργαστο δείκτη στην αρχή του μνήμης buffer όπου αποθηκεύονται τα στοιχεία του πίνακα. |
| [data_ptr](./data_ptr/)() const | Επιστρέφει έναν σταθερό ακατέργαστο δείκτη στην αρχή του μνήμης buffer όπου αποθηκεύονται τα στοιχεία του πίνακα. |
| [end](./end/)() | Επιστρέφει έναν iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [end](./end/)() const | Επιστρέφει έναν iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του const‑qualified container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | Καθορίζει εάν το καθορισμένο [Array](./) αντικείμενο περιέχει ένα στοιχείο που ικανοποιεί τις απαιτήσεις του καθορισμένου προδιαγραφέα. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Αναζητά το πρώτο στοιχείο στον καθορισμένο πίνακα που ικανοποιεί τις συνθήκες του καθορισμένου προδιαγραφέα. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Ανακτά όλα τα στοιχεία που ταιριάζουν με τις συνθήκες που ορίζονται από τον καθορισμένο προδιαγραφέα. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Αναζητά το πρώτο στοιχείο στον καθορισμένο πίνακα που ικανοποιεί τις συνθήκες του καθορισμένου προδιαγραφέα. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | Εκτελεί την καθορισμένη ενέργεια σε κάθε στοιχείο του καθορισμένου πίνακα. |
| [get_Count](./get_count/)() const override | Επιστρέφει το μέγεθος του πίνακα. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Δείχνει εάν ο πίνακας είναι μόνο για ανάγνωση. |
| [get_Length](./get_length/)() const | Επιστρέφει έναν 32-bit ακέραιο που αντιπροσωπεύει το συνολικό πλήθος όλων των στοιχείων σε όλες τις διαστάσεις του πίνακα. |
| [get_LongLength](./get_longlength/)() const | Επιστρέφει έναν 64-bit ακέραιο που αντιπροσωπεύει το συνολικό πλήθος όλων των στοιχείων σε όλες τις διαστάσεις του πίνακα. |
| [get_Rank](./get_rank/)() const | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| [GetEnumerator](./getenumerator/)() override | Επιστρέφει έναν δείκτη στο αντικείμενο [Enumerator](./enumerator/) που παρέχει τη διεπαφή IEnumerator στα στοιχεία του πίνακα που αντιπροσωπεύεται από το τρέχον αντικείμενο. |
| [GetLength](./getlength/)(int) | Επιστρέφει τον αριθμό των στοιχείων στη συγκεκριμένη διάσταση. |
| [GetLongLength](./getlonglength/)(int) | Επιστρέφει τον αριθμό των στοιχείων στη συγκεκριμένη διάσταση ως 64-bit ακέραιο. |
| [GetLowerBound](./getlowerbound/)(int) const | Επιστρέφει το κατώτερο όριο της συγκεκριμένης διάστασης. |
| [GetSizeTLength](./getsizetlength/)() const | Επιστρέφει μια μεταβλητή std::size_t που αντιπροσωπεύει το συνολικό πλήθος όλων των στοιχείων σε όλες τις διαστάσεις του πίνακα. |
| [GetUpperBound](./getupperbound/)(int) | Επιστρέφει το ανώτερο όριο της συγκεκριμένης διάστασης. |
| [idx_get](./idx_get/)(int) const override | Επιστρέφει το στοιχείο στον καθορισμένο δείκτη. |
| [idx_set](./idx_set/)(int, T) override | Ορίζει την καθορισμένη τιμή ως το στοιχείο του πίνακα στον καθορισμένο δείκτη. |
| [IndexOf](./indexof/)(const T\&) const override | Καθορίζει το δείκτη της πρώτης εμφάνισης του καθορισμένου στοιχείου στον πίνακα. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Καθορίζει το δείκτη της πρώτης εμφάνισης του καθορισμένου στοιχείου στον πίνακα. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Καθορίζει το δείκτη της πρώτης εμφάνισης του καθορισμένου στοιχείου στον πίνακα ξεκινώντας από τον καθορισμένο δείκτη. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Καθορίζει το δείκτη της πρώτης εμφάνισης του καθορισμένου στοιχείου σε μια περιοχή στοιχείων του πίνακα που ορίζεται από τον αρχικό δείκτη και τον αριθμό των στοιχείων στην περιοχή. |
| [Init](./init/)(const T) | Γεμίζει τον πίνακα που αντιπροσωπεύεται από το τρέχον αντικείμενο με τις τιμές από τον καθορισμένο πίνακα. |
| [Initialize](./initialize/)() | Γεμίζει τον πίνακα με τα προεπιλεγμένα κατασκευασμένα αντικείμενα τύπου **T**. |
| [Insert](./insert/)(int, const T\&) override | Δεν υποστηρίζεται επειδή ο πίνακας που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μόνο για ανάγνωση. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | Καθορίζει το δείκτη της τελευταίας εμφάνισης του καθορισμένου στοιχείου σε μια περιοχή στοιχείων του πίνακα που ορίζεται από τον αρχικό δείκτη και τον αριθμό των στοιχείων στην περιοχή. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | Καθορίζει το δείκτη της τελευταίας εμφάνισης του καθορισμένου στοιχείου στον πίνακα ξεκινώντας από τον καθορισμένο δείκτη. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | Καθορίζει το δείκτη της τελευταίας εμφάνισης του καθορισμένου στοιχείου στον πίνακα. |
| [Max](./max/)() const | Βρίσκει το μεγαλύτερο στοιχείο στον πίνακα χρησιμοποιώντας το [operator<()](../operator_/) για τη σύγκριση των στοιχείων. |
| [Min](./min/)() const | Βρίσκει το μικρότερο στοιχείο στον πίνακα χρησιμοποιώντας το [operator<()](../operator_/) για τη σύγκριση των στοιχείων. |
| [operator[]](./operator[]/)(int) | Επιστρέφει ένα στοιχείο στον καθορισμένο δείκτη. |
| [operator[]](./operator[]/)(int) const | Επιστρέφει ένα στοιχείο στον καθορισμένο δείκτη. |
| [rbegin](./rbegin/)() | Επιστρέφει έναν αντίστροφο επαναλήπτη στο πρώτο στοιχείο του αντιστραμμένου δοχείου. Αντιστοιχεί στο τελευταίο στοιχείο του μη αντιστραμμένου δοχείου. Εάν το δοχείο είναι κενό, ο επιστρεφόμενος επαναλήπτης είναι ίσος με [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Επιστρέφει έναν αντίστροφο επαναλήπτη στο πρώτο στοιχείο του αντιστραμμένου δοχείου. Αντιστοιχεί στο τελευταίο στοιχείο του μη αντιστραμμένου δοχείου. Εάν το δοχείο είναι κενό, ο επιστρεφόμενος επαναλήπτης είναι ίσος με [rend()](./rend/). |
| [Remove](./remove/)(const T\&) override | Δεν υποστηρίζεται επειδή ο πίνακας που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μόνο για ανάγνωση. |
| [RemoveAt](./removeat/)(int) override | Δεν υποστηρίζεται επειδή ο πίνακας που αντιπροσωπεύεται από το τρέχον αντικείμενο είναι μόνο για ανάγνωση. |
| [rend](./rend/)() | Επιστρέφει έναν reverse iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του reversed container. Αντιστοιχεί στο στοιχείο που προηγείται του πρώτου στοιχείου του non‑reversed container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| [rend](./rend/)() const | Επιστρέφει έναν reverse iterator προς το στοιχείο που ακολουθεί το τελευταίο στοιχείο του reversed container. Αντιστοιχεί στο στοιχείο που προηγείται του πρώτου στοιχείου του non‑reversed container. Αυτό το στοιχείο λειτουργεί ως σύμβολο κράτησης· η προσπάθεια πρόσβασης σε αυτό οδηγεί σε ακαθόριστη συμπεριφορά. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | Αλλάζει το μέγεθος του καθορισμένου πίνακα στην καθορισμένη τιμή ή δημιουργεί νέο πίνακα με το καθορισμένο μέγεθος. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | Αντιστρέφει τα στοιχεία στον καθορισμένο πίνακα. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | Αντιστρέφει μια περιοχή στοιχείων στον καθορισμένο πίνακα. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Κάνει τον πίνακα να αντιμετωπίζει τους αποθηκευμένους δείκτες ως αδύναμους (εάν ισχύει). |
| [SetValue](./setvalue/)(const T\&, int) | Ορίζει την τιμή του στοιχείου στον καθορισμένο δείκτη. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | Ταξινομεί τα στοιχεία στον καθορισμένο πίνακα χρησιμοποιώντας τον προεπιλεγμένο συγκριτή. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | Ταξινομεί μια περιοχή στοιχείων στον καθορισμένο πίνακα χρησιμοποιώντας τον προεπιλεγμένο συγκριτή. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Ταξινομεί τα στοιχεία στον καθορισμένο πίνακα χρησιμοποιώντας τον καθορισμένο συγκριτή. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | Ταξινομεί δύο πίνακες, έναν που περιέχει κλειδιά και τον άλλο - τα αντίστοιχα στοιχεία, βάσει των τιμών του πίνακα που περιέχει κλειδιά, των οποίων τα στοιχεία συγκρίνονται χρησιμοποιώντας το operator<. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | Ταξινομεί δύο πίνακες, έναν που περιέχει κλειδιά και τον άλλο - τα αντίστοιχα στοιχεία, βάσει των τιμών του πίνακα που περιέχει κλειδιά, των οποίων τα στοιχεία συγκρίνονται χρησιμοποιώντας τον προεπιλεγμένο συγκριτή. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | Καθορίζει εάν όλα τα στοιχεία στον καθορισμένο πίνακα ικανοποιούν τις συνθήκες που ορίζονται από το καθορισμένο κατηγόρημα. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Λαμβάνει την υλοποίηση του begin const iterator για το τρέχον κοντέινερ. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Λαμβάνει την υλοποίηση του begin iterator για το τρέχον κοντέινερ. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Λαμβάνει την υλοποίηση του end const iterator για το τρέχον κοντέινερ. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Λαμβάνει την υλοποίηση του end iterator για το τρέχον κοντέινερ. |
## Typedefs

| Typedef | Περιγραφή |
| --- | --- |
| [const_iterator](./const_iterator/) | Τύπος σταθερού επαναλήπτη. |
| [const_reverse_iterator](./const_reverse_iterator/) | Τύπος σταθερού αντίστροφου επαναλήπτη. |
| [EnumerablePtr](./enumerableptr/) | Ένα ψευδώνυμο για τύπο κοινόχρηστου δείκτη που δείχνει σε αντικείμενο IEnumerable που περιέχει στοιχεία τύπου **T**. |
| [EnumeratorPtr](./enumeratorptr/) | Ένα ψευδώνυμο για τύπο shared pointer που δείχνει σε αντικείμενο IEnumerator που περιέχει στοιχεία τύπου **T**. |
| [iterator](./iterator/) | Τύπος επαναλήπτη. |
| [reverse_iterator](./reverse_iterator/) | Τύπος αντίστροφου επαναλήπτη. |
| [UnderlyingType](./underlyingtype/) | Ψευδώνυμο για τον τύπο που χρησιμοποιείται για την αναπαράσταση κάθε στοιχείου του πίνακα. |
| [ValueType](./valuetype/) | Ψευδώνυμο για τον τύπο των στοιχείων του πίνακα. |
## Παρατηρήσεις



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Δημιουργήστε και γεμίστε τον πίνακα.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // Εκτυπώστε τα στοιχεία του πίνακα.
  Print(arrayPtr);

  // Ταξινόμηση των στοιχείων του πίνακα σε αύξουσα σειρά.
  Array<int32_t>::Sort(arrayPtr);

  // Εκτυπώστε τα στοιχεία του πίνακα.
  Print(arrayPtr);

  // Εκτύπωση του πλήθους των στοιχείων του πίνακα.
  std::cout << arrayPtr->get_Length() << std::endl;

  // Εκτύπωση του δείκτη του στοιχείου που ισούται με 4.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // Αλλαγή μεγέθους του πίνακα.
  Array<int32_t>::Resize(arrayPtr, 3);

  // Εκτυπώστε τα στοιχεία του πίνακα.
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## Δείτε επίσης

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
