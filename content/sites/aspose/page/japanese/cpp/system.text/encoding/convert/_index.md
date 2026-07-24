---
title: "System::Text::Encoding::Convert メソッド"
linktitle: "Convert"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::Encoding::Convert メソッド。C++ で 2 つのエンコーディング間のバイトを変換します。"
type: docs
weight: 3000
url: /ja/cpp/system.text/encoding/convert/
---
## Encoding::Convert(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) method


2 つのエンコーディング間でバイトを変換します。

```cpp
static ArrayPtr<uint8_t> System::Text::Encoding::Convert(const EncodingPtr &src_encoding, const EncodingPtr &dst_encoding, const ArrayPtr<uint8_t> &bytes)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src_encoding | const EncodingPtr\& | ソース エンコーディング。 |
| dst_encoding | const EncodingPtr\& | 宛先エンコーディング。 |
| バイト | const ArrayPtr\<uint8_t\>\& | 変換するバイト。 |

### ReturnValue

変換されたバイト。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::Convert(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) method


2 つのエンコーディング間でバイトを変換します。

```cpp
static ArrayPtr<uint8_t> System::Text::Encoding::Convert(const EncodingPtr &src_encoding, const EncodingPtr &dst_encoding, const ArrayPtr<uint8_t> &bytes, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| src_encoding | const EncodingPtr\& | ソース エンコーディング。 |
| dst_encoding | const EncodingPtr\& | 宛先エンコーディング。 |
| バイト | const ArrayPtr\<uint8_t\>\& | 変換するバイト。 |
| インデックス | int | スライス開始。 |
| count | int | スライスのサイズ。 |

### ReturnValue

変換されたバイト。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
