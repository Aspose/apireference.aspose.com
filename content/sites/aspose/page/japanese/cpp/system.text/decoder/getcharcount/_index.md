---
title: "System::Text::Decoder::GetCharCount メソッド"
linktitle: "GetCharCount"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::Decoder::GetCharCount メソッド。C++ でバッファをデコードするために必要な文字数を取得します。"
type: docs
weight: 400
url: /ja/cpp/system.text/decoder/getcharcount/
---
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


バッファをデコードするのに必要な文字数を取得します。

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | ArrayPtr\<uint8_t\> | デコードするバイト。 |
| index | int | [Buffer](../../../system/buffer/) オフセット。 |
| count | int | デコードするバイト数。 |

### ReturnValue

バッファをデコードするために必要な文字数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


バッファをデコードするのに必要な文字数を取得します。

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | ArrayPtr\<uint8_t\> | デコードするバイト。 |
| index | int | [Buffer](../../../system/buffer/) オフセット。 |
| count | int | デコードするバイト数。 |
| flush | bool | true の場合、計算後に内部デコーダーの状態をクリアします。 |

### ReturnValue

バッファをデコードするために必要な文字数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetCharCount(const uint8_t *, int, bool) method


バッファをデコードするのに必要な文字数を取得します。

```cpp
virtual int System::Text::Decoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const uint8_t * | デコードするバイト。 |
| count | int | デコードするバイト数。 |
| flush | bool | true の場合、計算後に内部デコーダーの状態をクリアします。 |

### ReturnValue

バッファをデコードするために必要な文字数。

## 参照

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
