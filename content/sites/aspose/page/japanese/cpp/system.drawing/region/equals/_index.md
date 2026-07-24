---
title: "System::Drawing::Region::Equals メソッド"
linktitle: "等しい"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Region::Equals メソッド。指定された領域が、現在のオブジェクトが表す領域と、指定された描画サーフェス上で同一かどうかを C++ で判定します。"
type: docs
weight: 600
url: /ja/cpp/system.drawing/region/equals/
---
## Region::Equals method


指定された描画サーフェス上で、指定された領域が現在のオブジェクトが表す領域と同一かどうかを判定します。

```cpp
bool System::Drawing::Region::Equals(const SharedPtr<Region> &r, const SharedPtr<Graphics> &g)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| r | const SharedPtr\<Region\>\& | この領域と比較する対象の領域 |
| g | const SharedPtr\\<Graphics\\>\\& | 描画サーフェス |

### ReturnValue

変換パラメータ **g** が適用されたとき、指定された領域の内部が現在のオブジェクトが表す領域の内部と同一であれば true、そうでなければ false

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../)
* Class [Graphics](../../graphics/)
* Class [Region](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
