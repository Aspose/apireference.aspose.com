---
title: "System::Xml::XmlReader::ReadContentAsBase64 メソッド"
linktitle: "ReadContentAsBase64"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadContentAsBase64 メソッド。コンテンツを読み取り、C++ で Base64 デコードされたバイナリ バイトを返します。"
type: docs
weight: 4000
url: /ja/cpp/system.xml/xmlreader/readcontentasbase64/
---
## XmlReader::ReadContentAsBase64 method


内容を読み取り、Base64 デコードされたバイナリバイトを返します。

```cpp
virtual int32_t System::Xml::XmlReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArrayPtr\<uint8_t\> | 結果のテキストをコピーするバッファです。この値は **nullptr** にできません。 |
| インデックス | int32_t | 結果のコピーを開始するバッファ内のオフセットです。 |
| count | int32_t | バッファにコピーする最大バイト数です。実際にコピーされたバイト数はこのメソッドから返されます。 |

### ReturnValue

バッファに書き込まれたバイト数です。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
