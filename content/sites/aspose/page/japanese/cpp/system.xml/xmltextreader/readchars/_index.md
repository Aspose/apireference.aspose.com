---
title: "System::Xml::XmlTextReader::ReadChars メソッド"
linktitle: "ReadChars"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextReader::ReadChars メソッド。要素のテキスト内容を文字バッファに読み取ります。このメソッドは、C++ で連続して呼び出すことにより、埋め込みテキストの大きなストリームを読み取るように設計されています。"
type: docs
weight: 4600
url: /ja/cpp/system.xml/xmltextreader/readchars/
---
## XmlTextReader::ReadChars method


要素のテキスト内容を文字バッファに読み取ります。このメソッドは、埋め込みテキストの大きなストリームを連続して呼び出すことで読み取るように設計されています。

```cpp
int32_t System::Xml::XmlTextReader::ReadChars(const ArrayPtr<char16_t> &buffer, int32_t index, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<char16_t\>\& | テキスト内容が書き込まれるバッファとして機能する文字配列です。 |
| インデックス | int32_t | メソッドがテキスト内容の書き込みを開始できる **buffer** 内の位置です。 |
| count | int32_t | **buffer** に書き込む文字数です。 |

### ReturnValue

読み取られた文字数です。リーダーが要素上に位置していない場合や、現在のコンテキストで返すテキスト内容がもうない場合は 0 になることがあります。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
