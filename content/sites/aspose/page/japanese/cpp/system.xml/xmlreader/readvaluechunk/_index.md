---
title: "System::Xml::XmlReader::ReadValueChunk メソッド"
linktitle: "ReadValueChunk"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadValueChunk メソッド。C++ で XML ドキュメントに埋め込まれた大きなテキストストリームを読み取ります。"
type: docs
weight: 7400
url: /ja/cpp/system.xml/xmlreader/readvaluechunk/
---
## XmlReader::ReadValueChunk method


XML ドキュメントに埋め込まれた大きなテキストストリームを読み取ります。

```cpp
virtual int32_t System::Xml::XmlReader::ReadValueChunk(ArrayPtr<char16_t> buffer, int32_t index, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArrayPtr\<char16_t\> | テキスト内容が書き込まれるバッファとして機能する文字配列です。この値は **nullptr** にできません。 |
| index | int32_t | バッファ内のオフセットで、[XmlReader](../) が結果のコピーを開始できる位置です。 |
| count | int32_t | バッファにコピーする最大文字数です。実際にコピーされた文字数はこのメソッドから返されます。 |

### ReturnValue

バッファに読み込まれた文字数です。テキスト内容がもうない場合は 0 が返されます。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
