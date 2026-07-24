---
title: "System::Text::ICUEncoder::GetByteCount メソッド"
linktitle: "GetByteCount"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::ICUEncoder::GetByteCount メソッド。C++ でバッファをエンコードするために必要なバイト数を取得します。"
type: docs
weight: 400
url: /ja/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


バッファをエンコードするのに必要なバイト数を取得します。

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | エンコードする文字。 |
| index | int | [Buffer](../../../system/buffer/) オフセット。 |
| count | int | エンコードする文字数。 |
| flush | bool | true の場合、計算後に内部エンコーダの状態をクリアします。 |

### ReturnValue

バッファをエンコードするのに必要なバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


バッファをエンコードするのに必要なバイト数を取得します。

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | const char_t * | エンコードする文字。 |
| count | int | エンコードする文字数。 |
| flush | bool | true の場合、計算後に内部エンコーダの状態をクリアします。 |

### ReturnValue

バッファをエンコードするのに必要なバイト数。

## 参照

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
