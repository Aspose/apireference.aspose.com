---
title: "System::String::EndsWith メソッド"
linktitle: "EndsWith"
second_title: "C++ 用 Aspose.Page"
description: "System::String::EndsWith メソッド。C++ で文字列が指定されたサブ文字列で終わるかどうかを確認します。"
type: docs
weight: 1000
url: /ja/cpp/system/string/endswith/
---
## String::EndsWith(const String\&) const method


文字列が指定されたサブ文字列で終わるかどうかをチェックします。

```cpp
bool System::String::EndsWith(const String &value) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 文字列を検索します。 |

### ReturnValue

文字列が指定されたサブ文字列で終われば true、そうでなければ false。

## 参照

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::EndsWith(const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) const method


文字列が指定されたサブ文字列で終わるかどうかをチェックします。

```cpp
bool System::String::EndsWith(const String &value, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &culture=nullptr) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 文字列を検索します。 |
| ignoreCase | bool | 比較が大文字小文字を区別しないかどうかを指定します。 |
| カルチャ | const SharedPtr\<System::Globalization::CultureInfo\>\& | 文字列比較を行う際に使用するカルチャー。 |

### ReturnValue

文字列が指定されたサブ文字列で終われば true、そうでなければ false。

## 参照

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::EndsWith(const String\&, System::StringComparison) const method


文字列が指定されたサブ文字列で終わるかどうかをチェックします。

```cpp
bool System::String::EndsWith(const String &value, System::StringComparison comparisonType) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | const String\& | 文字列を検索します。 |
| comparisonType | System::StringComparison | [Comparison](../../comparison/) モード、詳細は [System::StringComparison](../../stringcomparison/) を参照してください。 |

### ReturnValue

文字列が指定されたサブ文字列で終われば true、そうでなければ false。

## 参照

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
