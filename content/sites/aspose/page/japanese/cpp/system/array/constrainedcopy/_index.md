---
title: "System::Array::ConstrainedCopy メソッド"
linktitle: "ConstrainedCopy"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::ConstrainedCopy メソッド。指定されたソースから開始して、System.Array の要素範囲を C++ でコピーします。"
type: docs
weight: 4700
url: /ja/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


指定されたソースから開始して、[System.Array](../) の要素範囲をコピーします。

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| パラメーター | 説明 |
| --- | --- |
| SrcType | ソース配列の要素の型 |
| DstType | 宛先配列の要素の型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | ソース配列 |
| srcIndex | int64_t | コピーする項目範囲の開始位置を示す、ソース配列内のインデックス |
| dstArray | const ArrayPtr\<DstType\>\& | 宛先配列 |
| dstIndex | int64_t | コピーされた項目の挿入を開始する宛先配列内のインデックス |
| count | int64_t | コピーする要素数 |
## 備考


未完成の一時的な生実装！
## 参照

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
