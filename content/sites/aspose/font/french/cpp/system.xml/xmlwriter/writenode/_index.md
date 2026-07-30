---
title: "System::Xml::XmlWriter::WriteNode méthode"
linktitle: "WriteNode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlWriter::WriteNode méthode. Lorsqu'elle est remplacée dans une classe dérivée, copie tout du lecteur vers l'écrivain et déplace le lecteur au début du frère suivant en C++."
type: docs
weight: 2600
url: /fr/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


Lorsqu'il est remplacé dans une classe dérivée, copie tout du lecteur vers l'écrivain et déplace le lecteur au début du prochain frère.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | Le [XmlReader](../../xmlreader/) à lire. |
| defattr | bool | **true** pour copier les attributs par défaut du [XmlReader](../../xmlreader/); sinon, **false**. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


Copie tout de l'objet XPathNavigator vers l'écrivain. La position du XPathNavigator reste inchangée.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| navigateur | SharedPtr\<XPath::XPathNavigator\> | Le XPathNavigator à copier. |
| defattr | bool | **true** pour copier les attributs par défaut ; sinon, **false**. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
