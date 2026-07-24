---
title: "System::Xml::XmlReader::ReadContentAsBinHex メソッド"
linktitle: "ReadContentAsBinHex"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadContentAsBinHex メソッド。C++ で内容を読み取り、BinHex デコードされたバイナリバイトを返します。"
type: docs
weight: 4100
url: /ja/cpp/system.xml/xmlreader/readcontentasbinhex/
---
## XmlReader::ReadContentAsBinHex method


内容を読み取り、**BinHex** デコードされたバイナリバイトを返します。

```cpp
virtual int32_t System::Xml::XmlReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
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
