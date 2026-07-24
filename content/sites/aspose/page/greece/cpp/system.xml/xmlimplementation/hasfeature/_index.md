---
title: "System::Xml::XmlImplementation::HasFeature μέθοδος"
linktitle: "HasFeature"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlImplementation::HasFeature μέθοδος. Ελέγχει αν η υλοποίηση του Document Object Model (DOM) υλοποιεί μια συγκεκριμένη δυνατότητα σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Ελέγχει αν η υλοποίηση του Document [Object](../../../system/object/) Model (DOM) υλοποιεί μια συγκεκριμένη δυνατότητα.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| strFeature | const String\& | Το όνομα του πακέτου της δυνατότητας προς έλεγχο. Αυτό το όνομα δεν είναι ευαίσθητο σε πεζά/κεφαλαία. |
| strVersion | const String\& | Αυτός είναι ο αριθμός έκδοσης του ονόματος του πακέτου για δοκιμή. Εάν η έκδοση δεν έχει καθοριστεί (**nullptr**), η υποστήριξη οποιασδήποτε έκδοσης της δυνατότητας προκαλεί τη μέθοδο να επιστρέφει **true**. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Παρατηρήσεις



Ο παρακάτω πίνακας εμφανίζει τους συνδυασμούς που κάνουν το **HasFeature** να επιστρέφει **true**. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
