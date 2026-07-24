---
title: "System::Uri::MakeRelativeUri method"
linktitle: "MakeRelativeUri"
second_title: "C++ 用 Aspose.Page"
description: "System::Uri::MakeRelativeUri メソッド。C++ において、現在のオブジェクトと指定された Uri オブジェクトが表す URI の差異を決定します"
type: docs
weight: 3100
url: /ja/cpp/system/uri/makerelativeuri/
---
## Uri::MakeRelativeUri method


現在のオブジェクトと指定された [Uri](../) オブジェクトが表す URI の差異を決定します

```cpp
SharedPtr<Uri> System::Uri::MakeRelativeUri(const SharedPtr<Uri> &uri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uri | const SharedPtr\<Uri\>\& | 比較対象 |

### ReturnValue

現在のオブジェクトが表す URI と **toUri** のホスト名とスキームが同じ場合、このメソッドは現在の URI インスタンスに追加すると **toUri** になる相対的な [Uri](../) を返します。ホスト名またはスキームが異なる場合、このメソッドは **uri** パラメータを表す [Uri](../) オブジェクトを返します

## 参照

* Typedef [SharedPtr](../../sharedptr/)
* Class [Uri](../)
* Class [Uri](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
