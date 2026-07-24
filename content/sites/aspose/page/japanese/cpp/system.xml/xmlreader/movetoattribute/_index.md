---
title: "System::Xml::XmlReader::MoveToAttribute メソッド"
linktitle: "MoveToAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::MoveToAttribute メソッド。派生クラスでオーバーライドされた場合、指定されたインデックスの属性へ移動します（C++）。"
type: docs
weight: 3200
url: /ja/cpp/system.xml/xmlreader/movetoattribute/
---
## XmlReader::MoveToAttribute(int32_t) method


派生クラスでオーバーライドされた場合、指定されたインデックスの属性へ移動します。

```cpp
virtual void System::Xml::XmlReader::MoveToAttribute(int32_t i)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int32_t | 属性のインデックスです。 |

## 参照

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String) method


派生クラスでオーバーライドされた場合、指定された[XmlReader::get_Name](../get_name/) の値を持つ属性へ移動します。

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性の完全修飾名です。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::MoveToAttribute(String, String) method


派生クラスでオーバーライドされた場合、指定された[XmlReader::get_LocalName](../get_localname/) と[XmlReader::get_NamespaceURI](../get_namespaceuri/) の値を持つ属性へ移動します。

```cpp
virtual bool System::Xml::XmlReader::MoveToAttribute(String name, String ns)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性のローカル名。 |
| ns | String | 属性の名前空間 URI。 |

### ReturnValue

**true** if the attribute is found; otherwise, **false**. If **false**, the reader's position does not change.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
