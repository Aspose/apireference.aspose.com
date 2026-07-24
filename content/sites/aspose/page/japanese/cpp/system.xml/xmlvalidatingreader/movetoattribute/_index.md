---
title: "System::Xml::XmlValidatingReader::MoveToAttribute メソッド"
linktitle: "MoveToAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlValidatingReader::MoveToAttribute メソッド。C++ で指定されたインデックスの属性に移動します。"
type: docs
weight: 3500
url: /ja/cpp/system.xml/xmlvalidatingreader/movetoattribute/
---
## XmlValidatingReader::MoveToAttribute(int32_t) method


指定されたインデックスの属性へ移動します。

```cpp
void System::Xml::XmlValidatingReader::MoveToAttribute(int32_t i) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int32_t | 属性のインデックスです。 |

## 参照

* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::MoveToAttribute(String, String) method


指定されたローカル名と名前空間 Uniform Resource Identifier (URI) を持つ属性へ移動します。

```cpp
bool System::Xml::XmlValidatingReader::MoveToAttribute(String localName, String namespaceURI) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the position of the reader does not change.

## 参照

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::MoveToAttribute(String) method


指定された名前の属性へ移動します。

```cpp
bool System::Xml::XmlValidatingReader::MoveToAttribute(String name) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性の完全修飾名です。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the position of the reader does not change.

## 参照

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
