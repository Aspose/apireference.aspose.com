---
title: "System::Array::crend メソッド"
linktitle: "crend"
second_title: "C++ 用 Aspose.Page"
description: "System::Array::crend メソッド。逆コンテナの最後の要素の次の要素を指す逆イテレータを返します。これは、非逆コンテナの最初の要素の直前の要素に相当します。この要素はプレースホルダーとして機能し、アクセスしようとすると C++ で未定義の動作になります。"
type: docs
weight: 1200
url: /ja/cpp/system/array/crend/
---
## Array::crend method


逆順コンテナの最後の要素の次の要素への逆イテレータを返します。これは逆順でないコンテナの最初の要素の前の要素に対応します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。

```cpp
const_reverse_iterator System::Array<T>::crend() const noexcept
```


### ReturnValue

コンテナの最初の要素の前にある理論上の const 修飾された要素を指すイテレータ。

## 参照

* Typedef [const_reverse_iterator](../const_reverse_iterator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
