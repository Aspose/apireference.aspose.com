---
title: "System::Xml::XmlTextWriter::WriteProcessingInstruction メソッド"
linktitle: "WriteProcessingInstruction"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextWriter::WriteProcessingInstruction メソッド。名前とテキストの間にスペースを入れて、次のように処理指示を書き出します: <?name text?>（C++）。"
type: docs
weight: 3300
url: /ja/cpp/system.xml/xmltextwriter/writeprocessinginstruction/
---
## XmlTextWriter::WriteProcessingInstruction method


名前とテキストの間にスペースを入れた処理命令を次のように書き出します: **<?name text?>**。

```cpp
void System::Xml::XmlTextWriter::WriteProcessingInstruction(String name, String text) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 処理指示の名前。 |
| text | String | 処理指示に含める [Text](../../../system.text/)。 |
## 備考



[XmlTextWriter::WriteStartDocument](../writestartdocument/) がすでに呼び出された後に XML 宣言を作成するためにこのメソッドが使用されています。
## 参照

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
