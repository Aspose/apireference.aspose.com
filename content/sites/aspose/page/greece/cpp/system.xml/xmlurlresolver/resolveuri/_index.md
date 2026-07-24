---
title: "System::Xml::XmlUrlResolver::ResolveUri μέθοδος"
linktitle: "ResolveUri"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlUrlResolver::ResolveUri μέθοδος. Επιλύει το απόλυτο URI από το base και τα relative URIs σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml/xmlurlresolver/resolveuri/
---
## XmlUrlResolver::ResolveUri method


Επιλύει το απόλυτο URI από το βασικό και τα σχετικά URIs.

```cpp
SharedPtr<Uri> System::Xml::XmlUrlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Το βασικό URI που χρησιμοποιείται για την επίλυση του σχετικού URI. |
| relativeUri | String | Το URI προς επίλυση. Το URI μπορεί να είναι απόλυτο ή σχετικό. Εάν είναι απόλυτο, αυτή η τιμή αντικαθιστά αποτελεσματικά την τιμή του **baseUri**. Εάν είναι σχετικό, συνδυάζεται με το **baseUri** για να δημιουργήσει ένα απόλυτο URI. |

### ReturnValue

Το απόλυτο URI, ή **nullptr** εάν το σχετικό URI δεν μπορεί να επιλυθεί.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
