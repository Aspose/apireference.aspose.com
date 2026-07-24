---
title: "System::Xml::XmlNodeReader::ReadContentAsBase64 method"
linktitle: "ReadContentAsBase64"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeReader::ReadContentAsBase64 メソッド。C++ でコンテンツを読み取り、Base64 デコードされたバイナリバイトを返します。"
type: docs
weight: 3200
url: /ja/cpp/system.xml/xmlnodereader/readcontentasbase64/
---
## XmlNodeReader::ReadContentAsBase64 method


内容を読み取り、Base64 デコードされたバイナリバイトを返します。

```cpp
int32_t System::Xml::XmlNodeReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
