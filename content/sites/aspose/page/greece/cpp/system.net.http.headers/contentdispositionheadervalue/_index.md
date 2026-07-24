---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue class"
linktitle: "ContentDispositionHeaderValue"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue class. Αναπαριστά μια τιμή της ''Content-Disposition'' header. Objects of this class should only be allocated using System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 300
url: /el/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


Αναπαριστά μια τιμή της 'Content-Disposition' header. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | Δημιουργεί μια νέα παρουσία. |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | Δημιουργεί μια νέα παρουσία. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_CreationDate](./get_creationdate/)() | Λαμβάνει την ημερομηνία δημιουργίας του αρχείου. |
| [get_DispositionType](./get_dispositiontype/)() | Πληροφορίες RTTI. |
| [get_FileName](./get_filename/)() | Λαμβάνει μια τιμή που καθορίζει πώς να δημιουργηθεί ένα όνομα αρχείου για την αποθήκευση του φορτίου του μηνύματος. Χρησιμοποιείται όταν η οντότητα είναι αποσυνδεδεμένη και αποθηκεύεται σε ξεχωριστό αρχείο. |
| [get_FileNameStar](./get_filenamestar/)() | Λαμβάνει μια τιμή που καθορίζει πώς να δημιουργηθούν ονόματα αρχείων για την αποθήκευση του φορτίου του μηνύματος. Χρησιμοποιείται όταν οι οντότητες είναι αποσυνδεδεμένες και αποθηκεύονται σε ξεχωριστά αρχεία. |
| [get_ModificationDate](./get_modificationdate/)() | Λαμβάνει την ημερομηνία τροποποίησης του αρχείου. |
| [get_Name](./get_name/)() | Λαμβάνει ένα όνομα για ένα μέρος του σώματος του περιεχομένου. |
| [get_Parameters](./get_parameters/)() | Επιστρέφει μια συλλογή παραμέτρων της κεφαλίδας 'Content-Disposition'. |
| [get_ReadDate](./get_readdate/)() | Λαμβάνει την ημερομηνία κατά την οποία το αρχείο διαβάστηκε τελευταία φορά. |
| [get_Size](./get_size/)() | Λαμβάνει ένα προσεγγιστικό μέγεθος αρχείου. |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Μετατρέπει μια δοθείσα συμβολοσειρά από το καθορισμένο δείκτη σε μια παρουσία της κλάσης [ContentDispositionHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [ContentDispositionHeaderValue](./). |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | Ορίζει την ημερομηνία δημιουργίας του αρχείου. |
| [set_DispositionType](./set_dispositiontype/)(String) | Ορίζει έναν τύπο διάθεσης. |
| [set_FileName](./set_filename/)(String) | Ορίζει μια τιμή που καθορίζει πώς να δημιουργηθεί ένα όνομα αρχείου για την αποθήκευση του φορτίου του μηνύματος. Χρησιμοποιείται όταν η οντότητα είναι αποσυνδεδεμένη και αποθηκεύεται σε ξεχωριστό αρχείο. |
| [set_FileNameStar](./set_filenamestar/)(String) | Ορίζει μια τιμή που καθορίζει πώς να δημιουργηθούν ονόματα αρχείων για την αποθήκευση του φορτίου του μηνύματος. Χρησιμοποιείται όταν οι οντότητες είναι αποσυνδεδεμένες και αποθηκεύονται σε ξεχωριστά αρχεία. |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | Ορίζει την ημερομηνία τροποποίησης του αρχείου. |
| [set_Name](./set_name/)(String) | Ορίζει ένα όνομα για ένα μέρος του σώματος του περιεχομένου. |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | Ορίζει την ημερομηνία κατά την οποία το αρχείο διαβάστηκε τελευταία φορά. |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | Ορίζει ένα προσεγγιστικό μέγεθος αρχείου. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | Προσπαθεί να μετατρέψει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [ContentDispositionHeaderValue](./). |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
