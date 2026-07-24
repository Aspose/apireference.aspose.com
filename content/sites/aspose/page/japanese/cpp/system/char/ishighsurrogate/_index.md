---
title: "System::Char::IsHighSurrogate メソッド"
linktitle: "IsHighSurrogate"
second_title: "C++ 用 Aspose.Page"
description: "System::Char::IsHighSurrogate メソッド。指定された文字が C++ で上位サロゲートかどうかを判断します。"
type: docs
weight: 800
url: /ja/cpp/system/char/ishighsurrogate/
---
## Char::IsHighSurrogate(char_t) method


指定された文字が上位サロゲートかどうかを判定します。

```cpp
static bool System::Char::IsHighSurrogate(char_t c)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| c | char_t | テスト対象の文字 |

### ReturnValue

指定された文字が上位サロゲートである場合は true、そうでない場合は false

## 参照

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsHighSurrogate(const char_t *, int) method


指定された文字バッファ内の指定インデックスにある文字が上位サロゲートかどうかを判定します。

```cpp
static bool System::Char::IsHighSurrogate(const char_t *str, int idx)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const char_t * | 文字バッファの先頭へのポインタ |
| idx | int | テスト対象の文字がある、指定バッファ内のゼロベースインデックス |

### ReturnValue

指定されたインデックスの文字が上位サロゲートである場合は true、そうでない場合は false

## 参照

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsHighSurrogate(const String\&, int) method


指定された文字列内の指定インデックスにある文字が UTF-16 の上位サロゲートコード単位かどうかを判定します。

```cpp
static bool System::Char::IsHighSurrogate(const String &s, int index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | 文字列 |
| インデックス | int | テスト対象の文字がある、指定された文字列内のインデックス |

### ReturnValue

指定されたインデックスの文字が UTF-16 の上位サロゲートコード単位である場合は true、そうでない場合は false

## 参照

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
