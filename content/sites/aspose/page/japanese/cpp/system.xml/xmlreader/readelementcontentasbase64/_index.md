---
title: "System::Xml::XmlReader::ReadElementContentAsBase64 メソッド"
linktitle: "ReadElementContentAsBase64"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadElementContentAsBase64 メソッド。要素を読み取り、C++ で Base64 コンテンツをデコードします。"
type: docs
weight: 5300
url: /ja/cpp/system.xml/xmlreader/readelementcontentasbase64/
---
## XmlReader::ReadElementContentAsBase64 method


要素を読み取り、**Base64** コンテンツをデコードします。

```cpp
virtual int32_t System::Xml::XmlReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
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
