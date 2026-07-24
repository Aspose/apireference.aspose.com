---
title: "System::Xml::XmlNodeReader::ReadString method"
linktitle: "ReadString"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeReader::ReadString メソッド。C++ で要素またはテキスト ノードの内容を文字列として読み取ります。"
type: docs
weight: 3600
url: /ja/cpp/system.xml/xmlnodereader/readstring/
---
## XmlNodeReader::ReadString method


要素またはテキストノードの内容を文字列として読み取ります。

```cpp
String System::Xml::XmlNodeReader::ReadString() override
```


### ReturnValue

要素またはテキストに類似したノードの内容（CDATA、[Text](../../../system.text/) ノードなどを含むことがあります）。リーダーが要素やテキストノード以外に位置している場合、または現在のコンテキストで返すテキストコンテンツがもうない場合、空文字列になることがあります。注: テキストノードは要素または属性テキストノードのいずれかです。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
