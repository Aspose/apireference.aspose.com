---
title: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap コンストラクタ"
linktitle: "CustomLineCap"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap コンストラクタ。C++ で指定されたプロパティを持つユーザー定義のラインキャップを表す CustomLineCap クラスの新しいインスタンスを作成します。"
type: docs
weight: 100
url: /ja/cpp/system.drawing.drawing2d/customlinecap/customlinecap/
---
## CustomLineCap::CustomLineCap constructor


指定されたプロパティを持つユーザー定義のラインキャップを表す [CustomLineCap](../) クラスの新しいインスタンスを作成します。

```cpp
System::Drawing::Drawing2D::CustomLineCap::CustomLineCap(const SharedPtr<GraphicsPath> &fillPath, const SharedPtr<GraphicsPath> &strokePath, LineCap baseCap=LineCap::Flat, float baseInset=0)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| fillPath | const SharedPtr\<GraphicsPath\>\& | カスタムキャップの塗りを指定します |
| strokePath | const SharedPtr\<GraphicsPath\>\& | カスタムキャップのアウトラインを指定します |
| baseCap | LineCap | カスタムキャップが作成される元となるベースラインキャップ |
| baseInset | 単精度浮動小数点数 | ラインとキャップ間の距離を指定します |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../graphicspath/)
* Enum [LineCap](../../linecap/)
* Class [CustomLineCap](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
