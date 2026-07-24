---
title: "System::Xml::XmlTextReader::get_Value μέθοδος"
linktitle: "get_Value"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlTextReader::get_Value μέθοδος. Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου σε C++."
type: docs
weight: 2900
url: /el/cpp/system.xml/xmltextreader/get_value/
---
## XmlTextReader::get_Value method


Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου.

```cpp
String System::Xml::XmlTextReader::get_Value() override
```


### ReturnValue

Η επιστρεφόμενη τιμή εξαρτάται από την τιμή [XmlTextReader::get_NodeType](../get_nodetype/) του κόμβου.
## Παρατηρήσεις



Ο παρακάτω πίνακας παραθέτει τύπους κόμβων που έχουν μια τιμή για επιστροφή. Όλοι οι άλλοι τύποι κόμβων επιστρέφουν το [String::Empty](../../../system/string/empty/). |||
|-|-|
| Τύπος κόμβου | Τιμή |
| Attribute | Η τιμή του χαρακτηριστικού. |
| CDATA | Το περιεχόμενο της ενότητας CDATA. |
| Comment | Το περιεχόμενο του σχολίου. |
| DocumentType | Το εσωτερικό υποσύνολο. |
| ProcessingInstruction | Ολόκληρο το περιεχόμενο, εξαιρώντας τον προορισμό. |
| SignificantWhitespace | Το κενό διάστημα εντός ενός πεδίου xml:space='preserve'. |
| Text | Το περιεχόμενο του κόμβου κειμένου. |
| Κενοί χαρακτήρες | Το λευκό διάστημα μεταξύ σήμανσης. |
| XmlDeclaration | Το περιεχόμενο της δήλωσης. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
