---
title: "System::Xml::XmlSecureResolver::ResolveUri method"
linktitle: "ResolveUri"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlSecureResolver::ResolveUri method. Ανιχνεύει το απόλυτο URI από τη βάση και τα σχετικά URIs καλώντας τη μέθοδο ResolveUri στον υποκείμενο XmlResolver σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml/xmlsecureresolver/resolveuri/
---
## XmlSecureResolver::ResolveUri method


Ανιχνεύει το απόλυτο URI από τη βάση και τα σχετικά URIs καλώντας τη **ResolveUri** στον υποκείμενο [XmlResolver](../../xmlresolver/).

```cpp
SharedPtr<Uri> System::Xml::XmlSecureResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | Το βασικό URI που χρησιμοποιείται για την επίλυση του σχετικού URI. |
| relativeUri | String | Το URI προς επίλυση. Το URI μπορεί να είναι απόλυτο ή σχετικό. Εάν είναι απόλυτο, αυτή η τιμή αντικαθιστά αποτελεσματικά την τιμή του **baseUri**. Εάν είναι σχετικό, συνδυάζεται με το **baseUri** για να δημιουργήσει ένα απόλυτο URI. |

### ReturnValue

Το απόλυτο URI ή **nullptr** εάν το σχετικό URI δεν μπορεί να επιλυθεί (επιστρέφεται καλώντας τη **ResolveUri** στον υποκείμενο [XmlResolver](../../xmlresolver/)).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
