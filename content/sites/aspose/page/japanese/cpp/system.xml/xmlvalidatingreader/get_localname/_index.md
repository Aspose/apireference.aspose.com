---
title: "System::Xml::XmlValidatingReader::get_LocalName メソッド"
linktitle: "get_LocalName"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlValidatingReader::get_LocalName メソッド。C++ で現在のノードのローカル名を返します。"
type: docs
weight: 1600
url: /ja/cpp/system.xml/xmlvalidatingreader/get_localname/
---
## XmlValidatingReader::get_LocalName method


現在のノードのローカル名を返します。

```cpp
String System::Xml::XmlValidatingReader::get_LocalName() override
```


### ReturnValue

プレフィックスが除かれた現在のノードの名前です。例として、要素 **<bk:book>** の **LocalName** は **book** です。名前を持たないノードタイプ（**[Text](../../../system.text/)**、**Comment** など）の場合、このメソッドは [String::Empty](../../../system/string/empty/) を返します。

## 参照

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
