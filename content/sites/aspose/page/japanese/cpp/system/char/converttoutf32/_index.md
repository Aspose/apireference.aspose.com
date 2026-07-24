---
title: "System::Char::ConvertToUtf32 メソッド"
linktitle: "ConvertToUtf32"
second_title: "C++ 用 Aspose.Page"
description: "System::Char::ConvertToUtf32 method. 指定された UTF-16 サロゲートペアを C++ で UTF-32 コード単位に変換します。"
type: docs
weight: 200
url: /ja/cpp/system/char/converttoutf32/
---
## Char::ConvertToUtf32(char_t, char_t) method


指定された UTF-16 サロゲートペアを UTF-32 コード単位に変換します。

```cpp
static int System::Char::ConvertToUtf32(char_t highSurrogate, char_t lowSurrogate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| highSurrogate | char_t | 変換対象の UTF-16 サロゲートペアの上位サロゲート |
| lowSurrogate | char_t | 変換対象の UTF-16 サロゲートペアの下位サロゲート |

### ReturnValue

変換結果として得られる UTF-32 コード単位

## 参照

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::ConvertToUtf32(const String\&, int) method


文字列内の指定された位置にある UTF-16 エンコードされた文字またはサロゲートペアの値を UTF-32 コード単位に変換します。

```cpp
static int System::Char::ConvertToUtf32(const String &s, int index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 文字またはサロゲートペアを含む文字列 |
| インデックス | int | 指定された文字列内の文字またはサロゲートペアのインデックス位置 |

### ReturnValue

変換結果として得られる UTF-32 コード単位

## 参照

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
