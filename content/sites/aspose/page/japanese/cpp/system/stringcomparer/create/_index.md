---
title: "System::StringComparer::Create メソッド"
linktitle: "作成"
second_title: "C++ 用 Aspose.Page"
description: "System::StringComparer::Create メソッド。C++ でカルチャー固有の比較子を作成します。"
type: docs
weight: 100
url: /ja/cpp/system/stringcomparer/create/
---
## StringComparer::Create method


カルチャ固有の比較子を作成します。

```cpp
static StringComparerPtr System::StringComparer::Create(const System::SharedPtr<System::Globalization::CultureInfo> &culture, bool ignoreCase)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| カルチャ | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 比較子を作成する対象のカルチャー。 |
| ignoreCase | bool | 比較子が大文字小文字を無視すべきかどうか。 |

### ReturnValue

新しく作成された比較子オブジェクトへのポインタ。

## 参照

* Typedef [StringComparerPtr](../../stringcomparerptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [StringComparer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
