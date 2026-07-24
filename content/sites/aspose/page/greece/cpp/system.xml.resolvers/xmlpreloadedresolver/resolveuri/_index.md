---
title: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri μέθοδος"
linktitle: "ResolveUri"
second_title: "Aspose.Page για C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri μέθοδος. Επίλυση του απόλυτου URI από το βασικό και τα σχετικά URI σε C++."
type: docs
weight: 600
url: /el/cpp/system.xml.resolvers/xmlpreloadedresolver/resolveuri/
---
## XmlPreloadedResolver::ResolveUri method


Επιλύει το απόλυτο URI από το βασικό και τα σχετικά URIs.

```cpp
SharedPtr<Uri> System::Xml::Resolvers::XmlPreloadedResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Το βασικό URI που χρησιμοποιείται για την επίλυση του σχετικού URI. |
| relativeUri | String | Το URI προς επίλυση. Το URI μπορεί να είναι απόλυτο ή σχετικό. Εάν είναι απόλυτο, αυτή η τιμή αντικαθιστά αποτελεσματικά την τιμή του **baseUri**. Εάν είναι σχετικό, συνδυάζεται με το **baseUri** για να δημιουργήσει ένα απόλυτο URI. |

### ReturnValue

Το [Uri](../../../system/uri/) που αντιπροσωπεύει το απόλυτο URI ή **nullptr** εάν το σχετικό URI δεν μπορεί να επιλυθεί.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
