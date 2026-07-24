---
title: "System::Xml::XmlReader::ReadElementString μέθοδος"
linktitle: "ReadElementString"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::ReadElementString μέθοδος. Διαβάζει ένα στοιχείο μόνο κειμένου. Ωστόσο, συνιστάται η χρήση της μεθόδου XmlReader::ReadElementContentAsString αντί αυτού, επειδή παρέχει έναν πιο απλό τρόπο διαχείρισης αυτής της λειτουργίας σε C++."
type: docs
weight: 6400
url: /el/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


Διαβάζει ένα στοιχείο μόνο κειμένου. Ωστόσο, συνιστάται η χρήση της μεθόδου [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) αντί αυτού, επειδή παρέχει έναν πιο απλό τρόπο διαχείρισης αυτής της λειτουργίας.

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

Το κείμενο που περιέχεται στο στοιχείο που διαβάστηκε. Κενή συμβολοσειρά εάν το στοιχείο είναι κενό.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String, String) method


Ελέγχει ότι οι τιμές [XmlReader::get_LocalName](../get_localname/) και [XmlReader::get_NamespaceURI](../get_namespaceuri/) του εντοπισμένου στοιχείου ταιριάζουν με τις δοσμένες συμβολοσειρές πριν διαβαστεί ένα στοιχείο μόνο κειμένου. Ωστόσο, συνιστάται η χρήση της μεθόδου [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) αντί αυτού, επειδή παρέχει έναν πιο απλό τρόπο διαχείρισης αυτής της λειτουργίας.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localname | String | Το τοπικό όνομα για έλεγχο. |
| ns | String | Το URI του χώρου ονομάτων για έλεγχο. |

### ReturnValue

Το κείμενο που περιέχεται στο στοιχείο που διαβάστηκε. Κενή συμβολοσειρά εάν το στοιχείο είναι κενό.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String) method


Ελέγχει ότι η τιμή [XmlReader::get_Name](../get_name/) του ευρεθέντος στοιχείου ταιριάζει με το δοσμένο κείμενο πριν από την ανάγνωση ενός στοιχείου μόνο κειμένου. Ωστόσο, συνιστάται η χρήση της μεθόδου [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) αντί αυτού, επειδή παρέχει έναν πιο απλό τρόπο διαχείρισης αυτής της λειτουργίας.

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το όνομα για έλεγχο. |

### ReturnValue

Το κείμενο που περιέχεται στο στοιχείο που διαβάστηκε. Κενή συμβολοσειρά εάν το στοιχείο είναι κενό.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
