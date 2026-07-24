---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "Aspose.Page για C++"
description: "System::Xml::XPath::XPathNodeType enum. Ορίζει τους τύπους κόμβων XPath που μπορούν να επιστραφούν από την κλάση XPathNavigator σε C++."
type: docs
weight: 1100
url: /el/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


Ορίζει τους τύπους κόμβων [XPath](../) που μπορούν να επιστραφούν από την κλάση [XPathNavigator](../xpathnavigator/).

```cpp
enum class XPathNodeType
```

### Τιμές

| Όνομα | Τιμή | Περιγραφή |
| --- | --- | --- |
| Ρίζα | 0 | Ο ριζικός κόμβος του εγγράφου XML ή του δέντρου κόμβων. |
| Element | 1 | Ένα στοιχείο, όπως **<element>**. |
| Attribute | 2 | Ένα χαρακτηριστικό, όπως **id='123'**. |
| Χώρος ονομάτων | 3 | Ένας χώρος ονομάτων, όπως **xmlns=\"namespace\"**. |
| Text | 4 | Το κειμενικό περιεχόμενο ενός κόμβου. Ισοδύναμο με το Μοντέλο Εγγράφου [Object](../../system/object/) (DOM) [Text](../../system.text/) και τους τύπους κόμβων CDATA. Περιέχει τουλάχιστον έναν χαρακτήρα. |
| SignificantWhitespace | 5 | Ένας κόμβος με χαρακτήρες λευκού διαστήματος και **xml:space** ορισμένο σε **preserve**. |
| Κενοί χαρακτήρες | 6 | Ένας κόμβος με μόνο χαρακτήρες λευκού διαστήματος και χωρίς σημαντικό λευκό διάστημα. Οι χαρακτήρες λευκού διαστήματος είναι **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Μία οδηγία επεξεργασίας, όπως **<?pi test?>**. Αυτό δεν περιλαμβάνει δηλώσεις XML, οι οποίες δεν είναι ορατές στην κλάση [XPathNavigator](../xpathnavigator/). |
| Comment | 8 | Ένα σχόλιο, όπως ****. |
| All | 9 | Οποιοδήποτε από τα [XPathNodeType](./) είδη κόμβων. |

## Δείτε επίσης

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
