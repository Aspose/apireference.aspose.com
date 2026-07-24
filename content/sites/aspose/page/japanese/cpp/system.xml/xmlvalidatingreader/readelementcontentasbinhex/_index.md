---
title: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex メソッド"
linktitle: "ReadElementContentAsBinHex"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlValidatingReader::ReadElementContentAsBinHex メソッド。要素を読み取り、BinHex コンテンツをデコードします（C++）。"
type: docs
weight: 4400
url: /ja/cpp/system.xml/xmlvalidatingreader/readelementcontentasbinhex/
---
## XmlValidatingReader::ReadElementContentAsBinHex method


要素を読み取り、BinHex コンテンツをデコードします。

```cpp
int32_t System::Xml::XmlValidatingReader::ReadElementContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
