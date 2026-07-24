---
title: "System::Xml::XmlAttributeCollection::SetNamedItem μέθοδος"
linktitle: "SetNamedItem"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem μέθοδος. Προσθέτει ένα XmlNode χρησιμοποιώντας το αποτέλεσμα του XmlNode::get_Name σε C++."
type: docs
weight: 1000
url: /el/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Προσθέτει ένα [XmlNode](../../xmlnode/) χρησιμοποιώντας το αποτέλεσμα του [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Ένας κόμβος χαρακτηριστικού για αποθήκευση σε αυτή τη συλλογή. Ο κόμβος θα είναι αργότερα προσβάσιμος χρησιμοποιώντας το όνομα του κόμβου. Εάν υπάρχει ήδη ένας κόμβος με αυτό το όνομα στη συλλογή, αντικαθίσταται από το νέο· διαφορετικά, ο κόμβος προσαρτάται στο τέλος της συλλογής. |

### ReturnValue

Εάν το **node** αντικαθιστά έναν υπάρχοντα κόμβο με το ίδιο όνομα, επιστρέφεται ο παλιός κόμβος· διαφορετικά, επιστρέφεται ο προστιθέμενος κόμβος.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
