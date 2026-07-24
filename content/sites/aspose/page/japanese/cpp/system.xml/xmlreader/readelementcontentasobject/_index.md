---
title: "System::Xml::XmlReader::ReadElementContentAsObject メソッド"
linktitle: "ReadElementContentAsObject"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadElementContentAsObject メソッド。C++ で現在の要素を読み取り、その内容を Object として返します。"
type: docs
weight: 6200
url: /ja/cpp/system.xml/xmlreader/readelementcontentasobject/
---
## XmlReader::ReadElementContentAsObject() method


現在の要素を読み取り、その内容を [Object](../../../system/object/) として返します。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject()
```


### ReturnValue

最も適切な型のボックス化されたオブジェクトです。[XmlReader::get_ValueType](../get_valuetype/) の値が適切な型を決定します。コンテンツがリスト型として指定されている場合、このメソッドは適切な型のボックス化されたオブジェクトの配列を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAsObject(String, String) method


指定されたローカル名と名前空間 URI が現在の要素と一致するか確認し、次に現在の要素を読み取って内容を [Object](../../../system/object/) として返します。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAsObject(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 要素のローカル名です。 |
| namespaceURI | String | 要素の名前空間 URI。 |

### ReturnValue

最も適切な型のボックス化されたオブジェクトです。[XmlReader::get_ValueType](../get_valuetype/) の値が適切な型を決定します。コンテンツがリスト型として指定されている場合、このメソッドは適切な型のボックス化されたオブジェクトの配列を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
