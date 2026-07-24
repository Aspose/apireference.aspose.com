---
title: "System::Xml::XmlResolver::GetEntity μέθοδος"
linktitle: "GetEntity"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlResolver::GetEntity μέθοδος. Όταν αντικαθίσταται σε κληρονομική κλάση, αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο σε C++."
type: docs
weight: 100
url: /el/cpp/system.xml/xmlresolver/getentity/
---
## XmlResolver::GetEntity method


Όταν παρακάμπτεται σε μια παράγωγη κλάση, αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο.

```cpp
virtual SharedPtr<Object> System::Xml::XmlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Το URI που επιστρέφεται από την κλήση [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../resolveuri/). |
| ρόλος | String | Προς το παρόν δεν χρησιμοποιείται. |
| ofObjectToReturn | const TypeInfo\& | Ο τύπος του αντικειμένου που πρέπει να επιστραφεί. Η τρέχουσα έκδοση επιστρέφει μόνο αντικείμενα Stream. |

### ReturnValue

Ένα αντικείμενο ροής ή **nullptr** εάν έχει καθοριστεί τύπος διαφορετικός από ροή.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
