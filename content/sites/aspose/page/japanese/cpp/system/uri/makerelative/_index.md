---
title: "System::Uri::MakeRelative メソッド"
linktitle: "MakeRelative"
second_title: "C++ 用 Aspose.Page"
description: "System::Uri::MakeRelative メソッド。C++ で 2 つの Uri インスタンス間の差異を決定します。"
type: docs
weight: 3000
url: /ja/cpp/system/uri/makerelative/
---
## Uri::MakeRelative method


[Uri](../) インスタンス 2 つ間の差異を決定します。

```cpp
String System::Uri::MakeRelative(const SharedPtr<Uri> &toUri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| toUri | const SharedPtr\<Uri\>\& | 現在の URI と比較する URI |

### ReturnValue

現在のオブジェクトと **toUri** が表す URI のホスト名とスキームが同じ場合、このメソッドは相対的な [Uri](../) を表す [String](../../string/) を返します。この文字列を現在の URI インスタンスに付加すると **toUri** が得られます。ホスト名またはスキームが異なる場合、このメソッドは **uri** パラメータを表す [String](../../string/) を返します。

## 参照

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
