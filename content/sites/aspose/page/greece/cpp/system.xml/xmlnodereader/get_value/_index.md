---
title: "System::Xml::XmlNodeReader::get_Value μέθοδος"
linktitle: "get_Value"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlNodeReader::get_Value μέθοδος. Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου σε C++."
type: docs
weight: 2100
url: /el/cpp/system.xml/xmlnodereader/get_value/
---
## XmlNodeReader::get_Value method


Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου.

```cpp
String System::Xml::XmlNodeReader::get_Value() override
```


### ReturnValue

Η τιμή που επιστρέφεται εξαρτάται από το [XmlNodeReader::get_NodeType](../get_nodetype/) του κόμβου.
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
