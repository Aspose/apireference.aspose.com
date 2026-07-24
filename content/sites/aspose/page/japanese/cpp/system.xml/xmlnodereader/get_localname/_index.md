---
title: "System::Xml::XmlNodeReader::get_LocalName メソッド"
linktitle: "get_LocalName"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeReader::get_LocalName メソッド。C++ で現在のノードのローカル名を返します。"
type: docs
weight: 1300
url: /ja/cpp/system.xml/xmlnodereader/get_localname/
---
## XmlNodeReader::get_LocalName method


現在のノードのローカル名を返します。

```cpp
String System::Xml::XmlNodeReader::get_LocalName() override
```


### ReturnValue

プレフィックスが除かれた現在のノードの名前です。例として、要素 **<bk:book>** の **LocalName** は **book** です。名前を持たないノードタイプ（**[Text](../../../system.text/)**、**Comment** など）の場合、このメソッドは [String::Empty](../../../system/string/empty/) を返します。

## 参照

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
