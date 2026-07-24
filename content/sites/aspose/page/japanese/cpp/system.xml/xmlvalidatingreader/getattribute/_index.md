---
title: "System::Xml::XmlValidatingReader::GetAttribute メソッド"
linktitle: "GetAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlValidatingReader::GetAttribute メソッド。指定されたインデックスの属性の値を返します（C++）。"
type: docs
weight: 3200
url: /ja/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


指定されたインデックスの属性の値を返します。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int32_t | 属性のインデックス。インデックスはゼロベースです。（最初の属性のインデックスは 0 です。） |

### ReturnValue

指定された属性の値。

## 参照

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


指定されたローカル名と名前空間 Uniform Resource Identifier (URI) を持つ属性の値を返します。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

指定された属性の値です。属性が見つからない場合は **nullptr** が返されます。このメソッドはリーダーを移動しません。

## 参照

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


指定された名前の属性の値を返します。

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性の完全修飾名です。 |

### ReturnValue

指定された属性の値。属性が見つからない場合、**nullptr** が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
