---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XPath::XPathNodeType enum. Definieert de XPath-knooppunttypen die kunnen worden geretourneerd door de XPathNavigator-klasse in C++."
type: docs
weight: 1100
url: /nl/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


Definieert de [XPath](../) knooppunttypen die kunnen worden geretourneerd door de [XPathNavigator](../xpathnavigator/) klasse.

```cpp
enum class XPathNodeType
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| Root | 0 | Het rootknooppunt van het XML-document of de knooptboom. |
| Element | 1 | Een element, zoals **<element>**. |
| Attribute | 2 | Een attribuut, zoals **id='123'**. |
| Naamruimte | 3 | Een namespace, zoals **xmlns=\"namespace\"**. |
| Text | 4 | De tekstinhoud van een knooppunt. Equivalent aan het Document [Object](../../system/object/) Model (DOM) [Text](../../system.text/) en CDATA knooppunttypen. Bevat ten minste één teken. |
| SignificantWhitespace | 5 | Een knooppunt met witruimtekarakters en **xml:space** ingesteld op **preserve**. |
| Witruimte | 6 | Een knooppunt met alleen witruimtekarakters en geen significante witruimte. Witruimtekarakters zijn **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Een verwerkingsinstructie, zoals **<?pi test?>**. Dit omvat geen XML-declaraties, die niet zichtbaar zijn voor de [XPathNavigator](../xpathnavigator/) klasse. |
| Comment | 8 | Een commentaar, zoals ****. |
| All | 9 | Elk van de [XPathNodeType](./) knooppunttypen. |

## Zie ook

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
