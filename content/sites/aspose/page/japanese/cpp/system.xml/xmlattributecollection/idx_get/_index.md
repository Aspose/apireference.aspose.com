---
title: "System::Xml::XmlAttributeCollection::idx_get メソッド"
linktitle: "idx_get"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlAttributeCollection::idx_get メソッド。指定されたローカル名と名前空間の Uniform Resource Identifier (URI) を持つ属性を返します（C++）。"
type: docs
weight: 300
url: /ja/cpp/system.xml/xmlattributecollection/idx_get/
---
## XmlAttributeCollection::idx_get(const String\&, const String\&) method


指定されたローカル名と名前空間の Uniform Resource Identifier (URI) を持つ属性を返します。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(const String &localName, const String &namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | const String\& | 属性のローカル名。 |
| namespaceURI | const String\& | 属性の名前空間 URI。 |

### ReturnValue

指定されたローカル名と名前空間 URI を持つ属性です。属性が存在しない場合、このメソッドは **nullptr** を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlAttributeCollection::idx_get(const String\&) method


指定された名前の属性を返します。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(const String &name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | 属性の完全修飾名です。 |

### ReturnValue

指定された名前を持つ属性です。属性が存在しない場合、このメソッドは **nullptr** を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlAttributeCollection::idx_get(int32_t) method


指定されたインデックスの属性を返します。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlAttributeCollection::idx_get(int32_t i)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int32_t | 属性のインデックスです。 |

### ReturnValue

指定されたインデックスにある属性です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
