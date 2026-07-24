---
title: "System::BitConverter::ToBoolean メソッド"
linktitle: "ToBoolean"
second_title: "C++ 用 Aspose.Page"
description: "System::BitConverter::ToBoolean メソッド。指定された配列の指定インデックスから1バイトを取得し、C++ でブール値に変換します。"
type: docs
weight: 500
url: /ja/cpp/system/bitconverter/toboolean/
---
## BitConverter::ToBoolean(const System::ArrayPtr\<uint8_t\>\&, int) method


指定されたインデックスから開始する指定配列の 1 バイトをブール値に変換します。

```cpp
static bool System::BitConverter::ToBoolean(const System::ArrayPtr<uint8_t> &value, int startIndex)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const System::ArrayPtr\<uint8_t\>\& | 変換するバイトを含む [Array](../../array/) |
| startIndex | int | 変換のためにバイトの取得を開始する配列内のインデックス |

### ReturnValue

[Boolean](../../boolean/) value resulting from conversion

## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BitConverter::ToBoolean(const System::Details::ArrayView\<uint8_t\>\&, int) method


指定されたインデックスから開始する指定配列の 1 バイトをブール値に変換します。

```cpp
static bool System::BitConverter::ToBoolean(const System::Details::ArrayView<uint8_t> &value, int startIndex)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const System::Details::ArrayView\<uint8_t\>\& | 変換するバイトを含むArrayView |
| startIndex | int | 変換のためにバイトの取得を開始する配列内のインデックス |

### ReturnValue

[Boolean](../../boolean/) value resulting from conversion

## 参照

* Class [BitConverter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
