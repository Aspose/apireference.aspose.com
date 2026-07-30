---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathNodeType enum. Definisce i tipi di nodo XPath che possono essere restituiti dalla classe XPathNavigator in C++."
type: docs
weight: 1100
url: /it/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


Definisce i tipi di nodo [XPath](../) che possono essere restituiti dalla classe [XPathNavigator](../xpathnavigator/).

```cpp
enum class XPathNodeType
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Radice | 0 | Il nodo radice del documento XML o dell'albero dei nodi. |
| Element | 1 | Un elemento, ad esempio **<element>**. |
| Attribute | 2 | Un attributo, ad esempio **id='123'**. |
| Spazio dei nomi | 3 | Uno spazio dei nomi, ad esempio **xmlns=\"namespace\"**. |
| Text | 4 | Il contenuto testuale di un nodo. Equivalente al modello [Object](../../system/object/) del documento (DOM) [Text](../../system.text/) e ai tipi di nodo CDATA. Contiene almeno un carattere. |
| SignificantWhitespace | 5 | Un nodo con caratteri di spazio bianco e **xml:space** impostato su **preserve**. |
| Whitespace | 6 | Un nodo con solo caratteri di spazio bianco e senza spazio bianco significativo. I caratteri di spazio bianco sono **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Un'istruzione di elaborazione, ad esempio **<?pi test?>**. Questo non include le dichiarazioni XML, che non sono visibili alla classe [XPathNavigator](../xpathnavigator/). |
| Comment | 8 | Un commento, ad esempio ****. |
| All | 9 | Qualsiasi dei tipi di nodo [XPathNodeType](./). |

## Vedi anche

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
