---
title: "System::Xml::XmlReader::get_IsEmptyElement method"
linktitle: "get_IsEmptyElement"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlReader::get_IsEmptyElement method. При переопределении в производном классе получает значение, указывающее, является ли текущий узел пустым элементом (например, <MyElement/>) в C++."
type: docs
weight: 1300
url: /ru/cpp/system.xml/xmlreader/get_isemptyelement/
---
## XmlReader::get_IsEmptyElement method


При переопределении в производном классе возвращает значение, указывающее, является ли текущий узел пустым элементом (например, **<MyElement/>**).

```cpp
virtual bool System::Xml::XmlReader::get_IsEmptyElement()=0
```


### ReturnValue

**true** if the current node is an element ([XmlReader::get_NodeType](../get_nodetype/) equals [XmlNodeType::Element](../../xmlnodetype/)) that ends with **/>**; otherwise, **false**.

## См. также

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
