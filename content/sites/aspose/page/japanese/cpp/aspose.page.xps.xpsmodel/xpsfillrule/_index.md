---
title: "Aspose::Page::XPS::XpsModel::XpsFillRule enum"
linktitle: "XpsFillRule"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsFillRule enum. C++ における PathGeometry 要素の FillRule プロパティの有効な値です。"
type: docs
weight: 4900
url: /ja/cpp/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enum


PathGeometry 要素の FillRule プロパティの有効な値。

```cpp
enum class XpsFillRule
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| EvenOdd | 0 | この規則は、キャンバス上の点から任意の方向に無限遠まで光線を引き、その光線が与えられた形状のセグメントと交差する回数を数えることで、点の“内部性”を決定します。回数が奇数であれば点は内部、偶数であれば外部です。 |
| NonZero | 1 | この規則は、点から任意の方向に無限遠まで光線を描き、形状のセグメントが光線と交差する位置を調べることで、キャンバス上の点の内部性を判定します。カウントをゼロから開始し、セグメントが左から右へ光線を横切るたびに1を加え、右から左へ光線を横切るたびに1を減らします。交差回数を数えた後、結果がゼロであれば点はパスの外部にあり、そうでなければ内部にあります。 |

## 参照

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
