---
title: "System::IConvertible::ToType μέθοδος"
linktitle: "ToType"
second_title: "Aspose.Page για C++"
description: "System::IConvertible::ToType method. Μετατρέπει την τιμή αυτού του αντικειμένου σε ένα System::Object του καθορισμένου System::Type που έχει ισοδύναμη τιμή, χρησιμοποιώντας τις καθορισμένες πολιτισμικά-συγκεκριμένες πληροφορίες μορφοποίησης σε C++."
type: docs
weight: 1400
url: /el/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


Μετατρέπει την τιμή αυτού του αντικειμένου σε ένα [System::Object](../../object/) του καθορισμένου System::Type που έχει ισοδύναμη τιμή, χρησιμοποιώντας τις καθορισμένες πολιτισμικά-συγκεκριμένες πληροφορίες μορφοποίησης.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| conversionType | const TypeInfo\& | Το System::Type στο οποίο μετατρέπεται η τιμή αυτού του αντικειμένου. |
| provider | System::SharedPtr\<System::IFormatProvider\> | Μια υλοποίηση διεπαφής [System::IFormatProvider](../../iformatprovider/) που παρέχει πολιτισμικά-συγκεκριμένες πληροφορίες μορφοποίησης. |

### ReturnValue

Μια παρουσία [System::Object](../../object/) τύπου conversionType της οποίας η τιμή είναι ισοδύναμη με την τιμή αυτού του αντικειμένου.

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
