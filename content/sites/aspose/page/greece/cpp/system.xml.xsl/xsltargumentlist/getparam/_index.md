---
title: "System::Xml::Xsl::XsltArgumentList::GetParam μέθοδος"
linktitle: "GetParam"
second_title: "Aspose.Page για C++"
description: "System::Xml::Xsl::XsltArgumentList::GetParam μέθοδος. Επιστρέφει την παράμετρο που σχετίζεται με το όνομα που έχει προσδιοριστεί με το όνομα χώρου σε C++."
type: docs
weight: 600
url: /el/cpp/system.xml.xsl/xsltargumentlist/getparam/
---
## XsltArgumentList::GetParam method


Επιστρέφει την παράμετρο που συσχετίζεται με το όνομα που είναι προσδιορισμένο από το namespace.

```cpp
SharedPtr<Object> System::Xml::Xsl::XsltArgumentList::GetParam(const String &name, const String &namespaceUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| name | const String\& | Το όνομα της παραμέτρου. [XsltArgumentList](../) δεν ελέγχει για να διασφαλίσει ότι το δοσμένο όνομα είναι έγκυρο τοπικό όνομα· ωστόσο, το όνομα δεν μπορεί να είναι **nullptr**. |
| namespaceUri | const String\& | Το URI του ονοματοχώρου που σχετίζεται με την παράμετρο. |

### ReturnValue

Το αντικείμενο παραμέτρου ή **nullptr** εάν δεν βρέθηκε.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XsltArgumentList](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
