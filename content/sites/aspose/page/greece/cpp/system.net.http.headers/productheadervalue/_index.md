---
title: "System::Net::Http::Headers::ProductHeaderValue class"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Page για C++"
description: "System::Net::Http::Headers::ProductHeaderValue class. Αναπαριστά ένα διακριτικό προϊόν σε μια τιμή της ''User-Agent'' header. Objects of this class should only be allocated using System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1700
url: /el/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


Αναπαριστά ένα διακριτικό προϊόν σε μια τιμή της 'User-Agent' header. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Συγκρίνει αντικείμενα χρησιμοποιώντας τη σημασιολογία του C# [Object.Equals](../../system/object/equals/) semantics. |
| [get_Name](./get_name/)() | Πληροφορίες RTTI. |
| [get_Version](./get_version/)() | Επιστρέφει την έκδοση του διακριτικού προϊόντος. |
| [GetHashCode](./gethashcode/)() const override | Αναλογική μέθοδος του C# [Object.GetHashCode()](../../system/object/gethashcode/). Ενεργοποιεί το hashing προσαρμοσμένων αντικειμένων. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | Μετατρέπει μια δοθείσα συμβολοσειρά από τον καθορισμένο δείκτη σε μια παρουσία της κλάσης [ProductHeaderValue](./) class. |
| static [Parse](./parse/)(String) | Μετατρέπει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [ProductHeaderValue](./) class. |
| [ProductHeaderValue](./productheadervalue/)(String) | Δημιουργεί μια νέα παρουσία. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | Δημιουργεί μια νέα παρουσία. |
| [ToString](./tostring/)() const override | Αναλογικό της C# [Object.ToString()](../../system/object/tostring/) μεθόδου. Ενεργοποιεί τη μετατροπή προσαρμοσμένων αντικειμένων σε συμβολοσειρά. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | Προσπαθεί να μετατρέψει μια δοθείσα συμβολοσειρά σε μια παρουσία της κλάσης [ProductHeaderValue](./) class. |
## Δείτε επίσης

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
