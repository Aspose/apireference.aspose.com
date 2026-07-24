---
title: "System::Xml::XmlValidatingReader::get_Value method"
linktitle: "get_Value"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlValidatingReader::get_Value method. Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου σε C++."
type: docs
weight: 2900
url: /el/cpp/system.xml/xmlvalidatingreader/get_value/
---
## XmlValidatingReader::get_Value method


Επιστρέφει την τιμή κειμένου του τρέχοντος κόμβου.

```cpp
String System::Xml::XmlValidatingReader::get_Value() override
```


### ReturnValue

Η επιστρεφόμενη τιμή εξαρτάται από το XmlValidatingReader::NodeType του κόμβου.
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
