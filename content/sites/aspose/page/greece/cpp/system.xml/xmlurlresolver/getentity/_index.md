---
title: "System::Xml::XmlUrlResolver::GetEntity μέθοδος"
linktitle: "GetEntity"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlUrlResolver::GetEntity μέθοδος. Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο σε C++."
type: docs
weight: 200
url: /el/cpp/system.xml/xmlurlresolver/getentity/
---
## XmlUrlResolver::GetEntity method


Αντιστοιχίζει ένα URI σε ένα αντικείμενο που περιέχει τον πραγματικό πόρο.

```cpp
SharedPtr<Object> System::Xml::XmlUrlResolver::GetEntity(SharedPtr<Uri> absoluteUri, String role, const TypeInfo &ofObjectToReturn) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| absoluteUri | SharedPtr\<Uri\> | Το URI που επιστράφηκε από την κλήση [XmlResolver::ResolveUri(SharedPtr<Uri>, String)](../../xmlresolver/resolveuri/). |
| ρόλος | String | Προς το παρόν δεν χρησιμοποιείται. |
| ofObjectToReturn | const TypeInfo\& | Ο τύπος του αντικειμένου που θα επιστραφεί. Η τρέχουσα υλοποίηση επιστρέφει μόνο αντικείμενα τύπου Stream. |

### ReturnValue

Ένα αντικείμενο ροής ή **nullptr** εάν έχει καθοριστεί τύπος διαφορετικός από ροή.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlUrlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
