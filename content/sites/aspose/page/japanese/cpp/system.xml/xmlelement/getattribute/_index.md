---
title: "System::Xml::XmlElement::GetAttribute メソッド"
linktitle: "GetAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement::GetAttribute メソッド。指定されたローカル名と名前空間 URI を持つ属性の値を C++ で返します。"
type: docs
weight: 1300
url: /ja/cpp/system.xml/xmlelement/getattribute/
---
## XmlElement::GetAttribute(String, String) method


指定されたローカル名と名前空間 URI の属性の値を返します。

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 取得する属性のローカル名。 |
| namespaceURI | String | 取得する属性の名前空間 URI。 |

### ReturnValue

指定された属性の値。該当する属性が見つからない場合、または属性に指定された値またはデフォルト値がない場合は空文字列が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttribute(String) method


指定された名前の属性の値を返します。

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 取得する属性の名前。これは修飾名です。マッチするノードの **get_Name** 値と照合されます。 |

### ReturnValue

指定された属性の値。該当する属性が見つからない場合、または属性に指定された値またはデフォルト値がない場合は空文字列が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
