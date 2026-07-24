---
title: "System::ObjectExt::ArrayInitializerCast メソッド"
linktitle: "ArrayInitializerCast"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::ArrayInitializerCast メソッド。C++ で配列の基本値を変換します（C# では暗黙的に行われますが、C++ では行われないようです）。"
type: docs
weight: 100
url: /ja/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


配列の基本値を変換します（C# では暗黙的に行われますが、C++ では行われないようです）。

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| パラメーター | 説明 |
| --- | --- |
| へ | 対象型。 |
| From | ソース型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| args | From ... | 変換して対象配列にプッシュする値。 |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
