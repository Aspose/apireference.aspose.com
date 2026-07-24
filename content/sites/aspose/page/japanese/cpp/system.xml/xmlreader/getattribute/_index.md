---
title: "System::Xml::XmlReader::GetAttribute メソッド"
linktitle: "GetAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::GetAttribute メソッド。派生クラスでオーバーライドされた場合、指定されたインデックスの属性値を取得します（C++）。"
type: docs
weight: 2800
url: /ja/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


派生クラスでオーバーライドされた場合、指定されたインデックスの属性の値を取得します。

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int32_t | 属性のインデックス。インデックスはゼロベースです。（最初の属性のインデックスは 0 です。） |

### ReturnValue

指定された属性の値です。このメソッドはリーダーを移動しません。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String) method


派生クラスでオーバーライドされた場合、指定された [XmlReader::get_Name](../get_name/) の値を持つ属性の値を取得します。

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性の完全修飾名です。 |

### ReturnValue

指定された属性の値です。属性が見つからないか、値が [String::Empty](../../../system/string/empty/) の場合、**nullptr** が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::GetAttribute(String, String) method


派生クラスでオーバーライドされた場合、指定された [XmlReader::get_LocalName](../get_localname/) と [XmlReader::get_NamespaceURI](../get_namespaceuri/) の値を持つ属性の値を取得します。

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

指定された属性の値です。属性が見つからないか、値が [String::Empty](../../../system/string/empty/) の場合、**nullptr** が返されます。このメソッドはリーダーを移動しません。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
