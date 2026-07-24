---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "Aspose.Page für C++"
description: "System::Xml::XPath::XPathNodeType enum. Definiert die XPath-Knotentypen, die von der XPathNavigator-Klasse in C++ zurückgegeben werden können."
type: docs
weight: 1100
url: /de/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


Definiert die [XPath](../)-Knotentypen, die von der [XPathNavigator](../xpathnavigator/)-Klasse zurückgegeben werden können.

```cpp
enum class XPathNodeType
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| Root | 0 | Der Wurzelknoten des XML-Dokuments oder des Knotensbaums. |
| Element | 1 | Ein Element, zum Beispiel **<element>**. |
| Attribute | 2 | Ein Attribut, zum Beispiel **id='123'**. |
| Namensraum | 3 | Ein Namensraum, zum Beispiel **xmlns=\"namespace\"**. |
| Text | 4 | Der Textinhalt eines Knotens. Entspricht dem Document [Object](../../system/object/)-Modell (DOM) [Text](../../system.text/)- und CDATA-Knotentypen. Enthält mindestens ein Zeichen. |
| SignificantWhitespace | 5 | Ein Knoten mit Leerzeichenzeichen und **xml:space** auf **preserve** gesetzt. |
| Leerraum | 6 | Ein Knoten nur mit Leerzeichenzeichen und ohne signifikante Leerzeichen. Leerzeichenzeichen sind **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Eine Verarbeitungsanweisung, zum Beispiel **<?pi test?>**. Dies schließt XML-Deklarationen nicht ein, die für die [XPathNavigator](../xpathnavigator/)-Klasse nicht sichtbar sind. |
| Comment | 8 | Ein Kommentar, zum Beispiel ****. |
| All | 9 | Ein beliebiger der [XPathNodeType](./)-Knotentypen. |

## Siehe auch

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
