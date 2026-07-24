---
title: "Aspose::Page::EPS::XMP::XmpValue κλάση"
linktitle: "XmpValue"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::XMP::XmpValue κλάση. Αντιπροσωπεύει την τιμή XMP σε C++."
type: docs
weight: 300
url: /el/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


Αντιπροσωπεύει την τιμή [XMP](../).

```cpp
class XmpValue : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [get_IsArray](./get_isarray/)() | Επιστρέφει true εάν το [XmpValue](./) είναι πίνακας. |
| [get_IsDateTime](./get_isdatetime/)() const | Επιστρέφει true εάν η τιμή είναι DateTime. |
| [get_IsDouble](./get_isdouble/)() const | Επιστρέφει true εάν η τιμή είναι αριθμός κινητής υποδιαστολής. |
| [get_IsField](./get_isfield/)() | Επιστρέφει true εάν το [XmpValue](./) είναι πεδίο. |
| [get_IsInteger](./get_isinteger/)() const | Επιστρέφει true εάν η τιμή είναι ακέραιος. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | Επιστρέφει true εάν το [XmpValue](./) είναι ονομασμένη τιμή. |
| [get_IsNamedValues](./get_isnamedvalues/)() | Επιστρέφει true εάν το [XmpValue](./) αντιπροσωπεύει ονομασμένες τιμές. |
| [get_IsRaw](./get_israw/)() | Η τιμή δεν υποστηρίζεται/είναι άγνωστη και παρέχεται ακατέργαστος κώδικας XML. |
| [get_IsString](./get_isstring/)() | Επιστρέφει true εάν η τιμή είναι συμβολοσειρά. |
| [get_IsStructure](./get_isstructure/)() | Επιστρέφει true εάν το [XmpValue](./) αντιπροσωπεύει δομή. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | Μετατρέπει το [XmpValue](./) σε ονομασμένη τιμή. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | Μετατρέπει το XmlValue σε ονομασμένη τιμή συλλογής. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | Μετατρέπει το [XmpValue](./) σε συμβολοσειρά. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Μετατρέπει τη συμβολοσειρά σε [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Μετατρέπει τον ακέραιο σε [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | Μετατρέπει το double σε [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | Μετατρέπει το DateTime σε [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Μετατρέπει τον πίνακα σε [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | Μετατρέπει το [XmpValue](./) σε πίνακα. |
| [ToArray](./toarray/)() | Επιστρέφει πίνακα. |
| [ToDateTime](./todatetime/)() | Μετατρέπει σε ημερομηνία και ώρα. |
| [ToDictionary](./todictionary/)() | Επιστρέφει λεξικό που περιέχει ονομαστικές τιμές. |
| [ToDouble](./todouble/)() | Μετατρέπει σε double. |
| [ToField](./tofield/)() | Επιστρέφει την τιμή [XMP](../) ως πεδίο [XMP](../). |
| [ToInteger](./tointeger/)() | Μετατρέπει σε ακέραιο. |
| [ToNamedValue](./tonamedvalue/)() | Επιστρέφει την τιμή [XMP](../) ως ονομαστική τιμή. |
| [ToNamedValues](./tonamedvalues/)() | Επιστρέφει την τιμή [XMP](../) ως συλλογή ονομαστικών τιμών. |
| [ToRaw](./toraw/)() | Ακατέργαστος κώδικας XML για άγνωστες/μη υποστηριζόμενες τιμές. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Επιστρέφει την αναπαράσταση συμβολοσειράς. |
| [ToString](./tostring/)() const override | Επιστρέφει την αναπαράσταση συμβολοσειράς του [XmpValue](./). |
| [ToStringValue](./tostringvalue/)() | Μετατρέπει σε συμβολοσειρά. |
| [ToStructure](./tostructure/)() | Επιστρέφει την τιμή [XMP](../) ως δομή (σύνολο πεδίων). |
| [XmpValue](./xmpvalue/)(System::String) | Κατασκευαστής για τιμή συμβολοσειράς. |
| [XmpValue](./xmpvalue/)(int32_t) | Κατασκευαστής για τιμή ακέραιου. |
| [XmpValue](./xmpvalue/)(double) | Κατασκευαστής για τιμή κινητής υποδιαστολής. |
| [XmpValue](./xmpvalue/)(System::DateTime) | Κατασκευαστής για τιμή ημερομηνίας και ώρας. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Κατασκευαστής για τιμή πίνακα. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
