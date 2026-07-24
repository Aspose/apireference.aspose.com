---
title: "System::ICustomFormatter::Format μέθοδος"
linktitle: "Μορφή"
second_title: "Aspose.Page για C++"
description: "System::ICustomFormatter::Format μέθοδος. Επιστρέφει μια αναπαράσταση συμβολοσειράς μιας τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας το καθορισμένο μορφότυπο σε C++."
type: docs
weight: 100
url: /el/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


Επιστρέφει μια συμβολοσειρά αναπαράστασης μιας τιμής που αντιπροσωπεύεται από το τρέχον αντικείμενο χρησιμοποιώντας το καθορισμένο μορφότυπο.

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| μορφή | System::String | Η μορφή συμβολοσειράς |
| arg | System::SharedPtr\<System::Object\> | Το αντικείμενο που θα μορφοποιηθεί |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | Το αντικείμενο που παρέχει τις πληροφορίες μορφοποίησης |

### ReturnValue

Η αναπαράσταση συμβολοσειράς του **arg** μορφοποιημένη σύμφωνα με τη μορφή που καθορίζεται από **format** και **formatProvider**

## Δείτε επίσης

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
