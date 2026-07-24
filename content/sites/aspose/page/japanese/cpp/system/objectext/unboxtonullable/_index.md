---
title: "System::ObjectExt::UnboxToNullable メソッド"
linktitle: "UnboxToNullable"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::UnboxToNullable メソッド。オブジェクトを C++ の nullable 型にアンボックスします。"
type: docs
weight: 1600
url: /ja/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


オブジェクトを nullable 型にアンボックスします。

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| パラメーター | 説明 |
| --- | --- |
| T | 対象の型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) をアンボックスします。 |
| 安全 | bool | true の場合、失敗時に nullptr を返し、そうでなければ InvalidCastException をスローします。 |

### ReturnValue

アンボックスされた nullable 値（null になる可能性があります）。

## 参照

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
