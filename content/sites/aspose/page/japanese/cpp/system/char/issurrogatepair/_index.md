---
title: "System::Char::IsSurrogatePair メソッド"
linktitle: "IsSurrogatePair"
second_title: "C++ 用 Aspose.Page"
description: "System::Char::IsSurrogatePair メソッド。UTF-16 サロゲートペアの 2 つの指定文字かどうかを C++ で判定します。"
type: docs
weight: 1700
url: /ja/cpp/system/char/issurrogatepair/
---
## Char::IsSurrogatePair(char_t, char_t) method


指定された 2 つの文字が UTF-16 サロゲートペアかどうかを判断します。

```cpp
static bool System::Char::IsSurrogatePair(char_t highSurrogate, char_t lowSurrogate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| highSurrogate | char_t | 高サロゲートかどうかテストされる文字 |
| lowSurrogate | char_t | 低サロゲートかどうかテストされる文字 |

### ReturnValue

指定された文字がサロゲートペアを構成すれば true、そうでなければ false

## 参照

* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Char::IsSurrogatePair(const String\&, int) method


指定された文字バッファ内の連続する 2 文字がサロゲートペアかどうかを判断します。

```cpp
static bool System::Char::IsSurrogatePair(const String &str, int index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | 文字列 |
| インデックス | int | テスト対象の文字シーケンスが開始する、指定バッファ内の 0 基準インデックス |

### ReturnValue

指定された文字がサロゲートペアである場合は True、そうでない場合は false

## 参照

* Class [String](../../string/)
* Class [Char](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
