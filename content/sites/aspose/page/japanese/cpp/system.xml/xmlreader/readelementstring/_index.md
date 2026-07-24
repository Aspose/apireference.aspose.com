---
title: "System::Xml::XmlReader::ReadElementString メソッド"
linktitle: "ReadElementString"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadElementString メソッド。テキストのみの要素を読み取ります。ただし、この操作をよりシンプルに処理できるため、代わりに XmlReader::ReadElementContentAsString メソッドの使用が推奨されます（C++）。"
type: docs
weight: 6400
url: /ja/cpp/system.xml/xmlreader/readelementstring/
---
## XmlReader::ReadElementString() method


テキストのみの要素を読み取ります。ただし、この操作をよりシンプルに処理できるため、代わりに [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) メソッドの使用が推奨されます。

```cpp
virtual String System::Xml::XmlReader::ReadElementString()
```


### ReturnValue

読み取られた要素に含まれるテキストです。要素が空の場合は空文字列になります。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String, String) method


テキストのみの要素を読み取る前に、見つかった要素の [XmlReader::get_LocalName](../get_localname/) と [XmlReader::get_NamespaceURI](../get_namespaceuri/) の値が指定された文字列と一致するか確認します。ただし、この操作をよりシンプルに処理できるため、代わりに [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) メソッドの使用が推奨されます。

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String localname, String ns)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ローカル名 | String | 確認するローカル名です。 |
| ns | String | チェックする名前空間 URI。 |

### ReturnValue

読み取られた要素に含まれるテキストです。要素が空の場合は空文字列になります。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementString(String) method


テキストのみの要素を読む前に、見つかった要素の [XmlReader::get_Name](../get_name/) の値が指定された文字列と一致するかを確認します。ただし、この操作をより簡単に処理できるため、代わりに [XmlReader::ReadElementContentAsString](../readelementcontentasstring/) メソッドの使用が推奨されます。

```cpp
virtual String System::Xml::XmlReader::ReadElementString(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | チェックする名前。 |

### ReturnValue

読み取られた要素に含まれるテキストです。要素が空の場合は空文字列になります。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
