---
title: "Метод System::Xml::XmlNode::SelectNodes"
linktitle: "SelectNodes"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlNode::SelectNodes. Выбирает список узлов, соответствующих выражению XPath на C++."
type: docs
weight: 3800
url: /ru/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


Выбирает список узлов, соответствующих выражению [XPath](../../../system.xml.xpath/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | const String\& | Выражение [XPath](../../../system.xml.xpath/). |

### ReturnValue

Объект [XmlNodeList](../../xmlnodelist/), содержащий коллекцию узлов, соответствующих запросу [XPath](../../../system.xml.xpath/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


Выбирает список узлов, соответствующих выражению [XPath](../../../system.xml.xpath/). Любые префиксы, найденные в выражении [XPath](../../../system.xml.xpath/), разрешаются с помощью предоставленного [XmlNamespaceManager](../../xmlnamespacemanager/).

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| xpath | const String\& | Выражение [XPath](../../../system.xml.xpath/). |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | Объект [XmlNamespaceManager](../../xmlnamespacemanager/), используемый для разрешения пространств имён префиксов в выражении [XPath](../../../system.xml.xpath/). |

### ReturnValue

Объект [XmlNodeList](../../xmlnodelist/), содержащий коллекцию узлов, соответствующих запросу [XPath](../../../system.xml.xpath/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
