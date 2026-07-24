---
title: "System::Xml::XmlAttribute::get_BaseURI メソッド"
linktitle: "get_BaseURI"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttribute::get_BaseURI メソッド。ノードの基本統一リソース識別子 (URI) を C++ で返します。"
type: docs
weight: 300
url: /ja/cpp/system.xml/xmlattribute/get_baseuri/
---
## XmlAttribute::get_BaseURI method


ノードの基本 Uniform Resource Identifier（URI）を返します。

```cpp
String System::Xml::XmlAttribute::get_BaseURI() override
```


### ReturnValue

ノードが読み込まれた場所、またはノードに基本 URI がない場合は [String::Empty](../../../system/string/empty/) が返されます。 [Attribute](../../../system/attribute/) ノードは所有要素と同じ基本 URI を持ちます。属性ノードに所有要素がない場合、get_BaseURI は [String::Empty](../../../system/string/empty/) を返します。

## 参照

* Class [String](../../../system/string/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
