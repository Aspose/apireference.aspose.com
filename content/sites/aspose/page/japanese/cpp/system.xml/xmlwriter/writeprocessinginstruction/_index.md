---
title: "System::Xml::XmlWriter::WriteProcessingInstruction メソッド"
linktitle: "WriteProcessingInstruction"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter::WriteProcessingInstruction メソッド。派生クラスでオーバーライドされた場合、名前とテキストの間にスペースを入れた処理指示子を次のように出力します: <?name text?>（C++）。"
type: docs
weight: 2700
url: /ja/cpp/system.xml/xmlwriter/writeprocessinginstruction/
---
## XmlWriter::WriteProcessingInstruction method


派生クラスでオーバーライドされた場合、名前とテキストの間にスペースを入れた処理命令を書き出します。例: **<?name text?>**。

```cpp
virtual void System::Xml::XmlWriter::WriteProcessingInstruction(String name, String text)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 処理命令の名前。 |
| text | String | 処理指示に含めるテキスト。 |
## 備考



このメソッドは、[XmlWriter::WriteStartDocument](../writestartdocument/) がすでに呼び出された後に XML 宣言を作成するために使用されています。
## 参照

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
