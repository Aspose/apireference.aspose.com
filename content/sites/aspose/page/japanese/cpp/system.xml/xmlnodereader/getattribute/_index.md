---
title: "System::Xml::XmlNodeReader::GetAttribute メソッド"
linktitle: "GetAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeReader::GetAttribute メソッド。C++ で指定されたインデックスの属性の値を返します。"
type: docs
weight: 2400
url: /ja/cpp/system.xml/xmlnodereader/getattribute/
---
## XmlNodeReader::GetAttribute(int32_t) method


指定されたインデックスの属性の値を返します。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(int32_t attributeIndex) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| attributeIndex | int32_t | 属性のインデックス。インデックスはゼロベースです。（最初の属性のインデックスは 0 です。） |

### ReturnValue

指定された属性の値。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::GetAttribute(String) method


指定された名前の属性の値を返します。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(String name) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性の完全修飾名です。 |

### ReturnValue

指定された属性の値。属性が見つからない場合、**nullptr** が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::GetAttribute(String, String) method


指定されたローカル名と名前空間 URI を持つ属性の値を返します。

```cpp
String System::Xml::XmlNodeReader::GetAttribute(String name, String namespaceURI) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

指定された属性の値。属性が見つからない場合、**nullptr** が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
