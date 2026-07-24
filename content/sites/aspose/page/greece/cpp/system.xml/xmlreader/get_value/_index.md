---
title: "System::Xml::XmlReader::get_Value μέθοδος"
linktitle: "get_Value"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::get_Value μέθοδος. Όταν αντικαθίσταται σε μια κληρονομημένη κλάση, λαμβάνει την τιμή κειμένου του τρέχοντος κόμβου σε C++."
type: docs
weight: 2400
url: /el/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου.

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

Η επιστρεφόμενη τιμή εξαρτάται από την τιμή [XmlReader::get_NodeType](../get_nodetype/) του κόμβου.
## Παρατηρήσεις



Ο παρακάτω πίνακας παραθέτει τύπους κόμβων που έχουν μια τιμή για επιστροφή. Όλοι οι άλλοι τύποι κόμβων επιστρέφουν το [String::Empty](../../../system/string/empty/). |||
|-|-|
| Τύπος κόμβου | Τιμή |
| Attribute | Η τιμή του χαρακτηριστικού. |
| CDATA | Το περιεχόμενο της ενότητας CDATA. |
| Comment | Το περιεχόμενο του σχολίου. |
| DocumentType | Το εσωτερικό υποσύνολο. |
| ProcessingInstruction | Ολόκληρο το περιεχόμενο, εξαιρώντας τον προορισμό. |
| SignificantWhitespace | Το λευκό διάστημα μεταξύ σήμανσης σε ένα μοντέλο μεικτού περιεχομένου. |
| Text | Το περιεχόμενο του κόμβου κειμένου. |
| Κενοί χαρακτήρες | Το λευκό διάστημα μεταξύ σήμανσης. |
| XmlDeclaration | Το περιεχόμενο της δήλωσης. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
