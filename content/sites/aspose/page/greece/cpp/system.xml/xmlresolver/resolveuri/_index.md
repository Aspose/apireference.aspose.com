---
title: "System::Xml::XmlResolver::ResolveUri μέθοδος"
linktitle: "ResolveUri"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlResolver::ResolveUri μέθοδος. Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, επιλύει το απόλυτο URI από το βασικό και τα σχετικά URIs σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


Όταν παρακάμπτεται σε μια παράγωγη κλάση, επιλύει το απόλυτο URI από τη βάση και τα σχετικά URIs.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Το βασικό URI που χρησιμοποιείται για την επίλυση του σχετικού URI. |
| relativeUri | String | Το URI προς επίλυση. Το URI μπορεί να είναι απόλυτο ή σχετικό. Εάν είναι απόλυτο, αυτή η τιμή αντικαθιστά αποτελεσματικά την τιμή του **baseUri**. Εάν είναι σχετικό, συνδυάζεται με το **baseUri** για να δημιουργήσει ένα απόλυτο URI. |

### ReturnValue

Το απόλυτο URI ή **nullptr** εάν το σχετικό URI δεν μπορεί να επιλυθεί.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
