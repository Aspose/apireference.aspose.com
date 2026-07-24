---
title: "System::Xml::XmlReader::get_LocalName メソッド"
linktitle: "get_LocalName"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::get_LocalName メソッド。派生クラスでオーバーライドされた場合、C++ で現在のノードのローカル名を取得します。"
type: docs
weight: 1400
url: /ja/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


派生クラスでオーバーライドされた場合、現在のノードのローカル名を取得します。

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

プレフィックスが除かれた現在のノードの名前です。例として、要素 **<bk:book>** の **LocalName** は **book** です。名前を持たないノードタイプ（**[Text](../../../system.text/)**、**Comment** など）の場合、このメソッドは [String::Empty](../../../system/string/empty/) を返します。

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
