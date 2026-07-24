---
title: "System::String::StartsWith メソッド"
linktitle: "StartsWith"
second_title: "C++ 用 Aspose.Page"
description: "System::String::StartsWith メソッド。C++ で文字列が指定されたサブ文字列で始まるかどうかを確認します。"
type: docs
weight: 4400
url: /ja/cpp/system/string/startswith/
---
## String::StartsWith(const String\&) const method


文字列が指定された部分文字列で始まるかチェックします。

```cpp
bool System::String::StartsWith(const String &value) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 文字列を検索します。 |

### ReturnValue

文字列が指定されたサブ文字列で始まる場合は true、そうでない場合は false。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::StartsWith(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const method


文字列が指定された部分文字列で始まるかチェックします。

```cpp
bool System::String::StartsWith(const String &value, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &culture=nullptr) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 文字列を検索します。 |
| ignoreCase | bool | 比較が大文字小文字を区別しないかどうかを指定します。 |
| カルチャ | const SharedPtr\<System::Globalization::CultureInfo\>\& | 文字列比較を行う際に使用するカルチャー。 |

### ReturnValue

文字列が指定されたサブ文字列で始まる場合は true、そうでない場合は false。

## 参照

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::StartsWith(const String\&, System::StringComparison) const method


文字列が指定された部分文字列で始まるかチェックします。

```cpp
bool System::String::StartsWith(const String &value, System::StringComparison comparisonType) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 文字列を検索します。 |
| comparisonType | System::StringComparison | [Comparison](../../comparison/) モード、詳細は [System::StringComparison](../../stringcomparison/) を参照してください。 |

### ReturnValue

文字列が指定されたサブ文字列で始まる場合は true、そうでない場合は false。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
