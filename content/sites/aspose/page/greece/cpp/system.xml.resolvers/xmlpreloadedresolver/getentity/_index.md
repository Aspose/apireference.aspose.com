---
title: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity μέθοδος"
linktitle: "GetEntity"
second_title: "Aspose.Page για C++"
description: "System::Xml::Resolvers::XmlPreloadedResolver::GetEntity μέθοδος. Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο σε C++."
type: docs
weight: 400
url: /el/cpp/system.xml.resolvers/xmlpreloadedresolver/getentity/
---
## XmlPreloadedResolver::GetEntity method


Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο.

```cpp
SharedPtr<Object> System::Xml::Resolvers::XmlPreloadedResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Το URI που επιστρέφεται από την κλήση [XmlResolver::ResolveUri(SharedPtr<Uri>,String)](../../../system.xml/xmlresolver/resolveuri/). |
| ρόλος | String | Προς το παρόν δεν χρησιμοποιείται. |
| ofObjectToReturn | const TypeInfo\& | Ο τύπος του αντικειμένου που θα επιστραφεί. Η [XmlPreloadedResolver](../) υποστηρίζει αντικείμενα Stream και αντικείμενα TextReader για URIs που προστέθηκαν ως [String](../../../system/string/). Εάν ο ζητούμενος τύπος δεν υποστηρίζεται από τον resolver, θα ριχθεί μια εξαίρεση. Χρησιμοποιήστε τη μέθοδο XmlPreloadedResolver::SupportsType(SharedPtr<Uri>,TypeInfo) για να προσδιορίσετε εάν ένας συγκεκριμένος **Type** υποστηρίζεται από αυτόν τον resolver. |

### ReturnValue

Ένα αντικείμενο Stream ή TextReader που αντιστοιχεί στην πραγματική πηγή.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlPreloadedResolver](../)
* Namespace [System::Xml::Resolvers](../../)
* Library [Aspose.Page for C++](../../../)
