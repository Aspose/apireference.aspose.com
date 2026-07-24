---
title: "System::Xml::XmlNodeReader::MoveToAttribute メソッド"
linktitle: "MoveToAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeReader::MoveToAttribute メソッド。C++ で指定されたインデックスの属性へ移動します。"
type: docs
weight: 2600
url: /ja/cpp/system.xml/xmlnodereader/movetoattribute/
---
## XmlNodeReader::MoveToAttribute(int32_t) method


指定されたインデックスの属性へ移動します。

```cpp
void System::Xml::XmlNodeReader::MoveToAttribute(int32_t attributeIndex) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| attributeIndex | int32_t | 属性のインデックスです。 |

## 参照

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::MoveToAttribute(String) method


指定された名前の属性へ移動します。

```cpp
bool System::Xml::XmlNodeReader::MoveToAttribute(String name) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性の完全修飾名です。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNodeReader::MoveToAttribute(String, String) method


指定されたローカル名と名前空間 URI を持つ属性へ移動します。

```cpp
bool System::Xml::XmlNodeReader::MoveToAttribute(String name, String namespaceURI) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
