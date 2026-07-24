---
title: "System::Xml::XmlNode::Supports μέθοδος"
linktitle: "Supports"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNode::Supports μέθοδος. Ελέγχει εάν η υλοποίηση DOM υλοποιεί ένα συγκεκριμένο χαρακτηριστικό σε C++."
type: docs
weight: 4400
url: /el/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


Δοκιμάζει αν η υλοποίηση DOM υλοποιεί μια συγκεκριμένη δυνατότητα.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| χαρακτηριστικό | String | Το όνομα του πακέτου της δυνατότητας προς έλεγχο. Αυτό το όνομα δεν είναι ευαίσθητο σε πεζά/κεφαλαία. |
| έκδοση | String | Ο αριθμός έκδοσης του ονόματος πακέτου που θα δοκιμαστεί. Εάν η έκδοση δεν καθοριστεί (null), η υποστήριξη οποιασδήποτε έκδοσης του χαρακτηριστικού προκαλεί την μέθοδο να επιστρέψει true. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Παρατηρήσεις



Ο παρακάτω πίνακας περιγράφει τους συνδυασμούς που επιστρέφουν **true**. |||
|-|-|
| Χαρακτηριστικό | Έκδοση |
| XML | 1.0 |
| XML | 2.0 |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
