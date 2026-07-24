---
title: "System::Xml::XmlSecureResolver::GetEntity μέθοδος"
linktitle: "GetEntity"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlSecureResolver::GetEntity μέθοδος. Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml/xmlsecureresolver/getentity/
---
## XmlSecureResolver::GetEntity method


Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο.

```cpp
SharedPtr<Object> System::Xml::XmlSecureResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Το URI που επιστρέφεται από την κλήση [XmlSecureResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| ρόλος | String | Προς το παρόν δεν χρησιμοποιείται. |
| ofObjectToReturn | const TypeInfo\& | Ο τύπος του αντικειμένου που πρέπει να επιστραφεί. Η τρέχουσα έκδοση επιστρέφει μόνο αντικείμενα Stream. |

### ReturnValue

Η ροή που επιστρέφεται με την κλήση του **GetEntity** στον υποκείμενο [XmlResolver](../../xmlresolver/). Εάν καθοριστεί τύπος εκτός του Stream, η μέθοδος επιστρέφει **nullptr**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSecureResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
