---
title: "System::Xml::XmlReader::idx_get メソッド"
linktitle: "idx_get"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::idx_get メソッド。派生クラスでオーバーライドされた場合、指定されたインデックスの属性値を C++ で取得します。"
type: docs
weight: 2900
url: /ja/cpp/system.xml/xmlreader/idx_get/
---
## XmlReader::idx_get(int32_t) method


派生クラスでオーバーライドされた場合、指定されたインデックスの属性の値を取得します。

```cpp
virtual String System::Xml::XmlReader::idx_get(int32_t i)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| i | int32_t | 属性のインデックスです。 |

### ReturnValue

指定された属性の値。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::idx_get(String) method


派生クラスでオーバーライドされた場合、指定された [XmlReader::get_Name](../get_name/) の値を持つ属性の値を取得します。

```cpp
virtual String System::Xml::XmlReader::idx_get(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性の完全修飾名です。 |

### ReturnValue

指定された属性の値。属性が見つからない場合、**nullptr** が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::idx_get(String, String) method


派生クラスでオーバーライドされた場合、指定された [XmlReader::get_LocalName](../get_localname/) と [XmlReader::get_NamespaceURI](../get_namespaceuri/) の値を持つ属性の値を取得します。

```cpp
virtual String System::Xml::XmlReader::idx_get(String name, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

指定された属性の値。属性が見つからない場合、**nullptr** が返されます。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
