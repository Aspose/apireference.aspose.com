---
title: "Metodo System::Xml::XmlWriter::WriteNode"
linktitle: "WriteNode"
second_title: "Aspose.Font per C++"
description: "Metodo System::Xml::XmlWriter::WriteNode. Quando viene sovrascritto in una classe derivata, copia tutto dal lettore allo scrittore e sposta il lettore all'inizio del fratello successivo in C++."
type: docs
weight: 2600
url: /it/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


Quando sovrascritto in una classe derivata, copia tutto dal lettore allo scrittore e sposta il lettore all'inizio del fratello successivo.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | Il [XmlReader](../../xmlreader/) da cui leggere. |
| defattr | bool | **true** per copiare gli attributi predefiniti dal [XmlReader](../../xmlreader/); altrimenti, **false**. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


Copia tutto dall'oggetto XPathNavigator allo scrittore. La posizione dell'XPathNavigator rimane invariata.

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| navigator | SharedPtr\<XPath::XPathNavigator\> | Il XPathNavigator da cui copiare. |
| defattr | bool | **true** per copiare gli attributi predefiniti; altrimenti, **false**. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
