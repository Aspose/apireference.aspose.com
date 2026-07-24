---
title: "System::Uri::Compare メソッド"
linktitle: "Compare"
second_title: "C++ 用 Aspose.Page"
description: "System::Uri::Compare メソッド。指定された比較ルールを使用して、指定された Uri オブジェクトを比較します（C++）。"
type: docs
weight: 3500
url: /ja/cpp/system/uri/compare/
---
## Uri::Compare method


指定された比較ルールを使用して、指定された [Uri](../) オブジェクトを比較します。

```cpp
static int32_t System::Uri::Compare(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2, UriComponents partsToCompare, UriFormat compareFormat, StringComparison comparisonType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | 最初の比較対象 |
| uri2 | const SharedPtr\<Uri\>\& | 2 番目の比較対象 |
| partsToCompare | UriComponents | 比較する **uri1** と **uri2** の部分を指定します |
| compareFormat | UriFormat | URI のコンポーネントを比較する際に使用される文字エスケープを指定します |
| comparisonType | StringComparison | [StringComparison](../../stringcomparison/) の値のいずれか |

### ReturnValue

**uri1** が **uri2** 未満の場合は負の値、uri1 と uri2 が等しい場合は 0、**uri1** が **uri2** より大きい場合は正の値を返します

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Enum [UriComponents](../../uricomponents/)
* Enum [UriFormat](../../uriformat/)
* Enum [StringComparison](../../stringcomparison/)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
