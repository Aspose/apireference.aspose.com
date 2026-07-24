---
title: "System::Xml::XmlReader::ReadToFollowing メソッド"
linktitle: "ReadToFollowing"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadToFollowing メソッド。C++ で、指定されたローカル名と名前空間 URI を持つ要素が見つかるまで読み取ります。"
type: docs
weight: 7200
url: /ja/cpp/system.xml/xmlreader/readtofollowing/
---
## XmlReader::ReadToFollowing(String, String) method


指定されたローカル名と名前空間 URI を持つ要素が見つかるまで読み取ります。

```cpp
virtual bool System::Xml::XmlReader::ReadToFollowing(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 要素のローカル名です。 |
| namespaceURI | String | 要素の名前空間 URI。 |

### ReturnValue

**true** if a matching element is found; otherwise **false** and the [XmlReader](../) is in an end of file state.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToFollowing(String) method


指定された修飾名を持つ要素が見つかるまで読み取ります。

```cpp
virtual bool System::Xml::XmlReader::ReadToFollowing(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 要素の修飾名です。 |

### ReturnValue

**true** if a matching element is found; otherwise **false** and the [XmlReader](../) is in an end of file state.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
