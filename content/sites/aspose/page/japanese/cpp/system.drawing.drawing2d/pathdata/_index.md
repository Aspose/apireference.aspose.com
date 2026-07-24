---
title: "System::Drawing::Drawing2D::PathData class"
linktitle: "PathData"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::PathData クラス。パスを表すグラフィカルデータを含みます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 1100
url: /ja/cpp/system.drawing.drawing2d/pathdata/
---
## PathData class


パスを表すグラフィカルデータを含みます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class PathData : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Points](./get_points/)() | パスを構成するポイントを含む配列を返します。 |
| [get_Types](./get_types/)() | 対応する **Points** 配列のポイントの種類を指定する値を含む配列を返します。 |
| [PathData](./pathdata/)() | 空の [PathData](./) オブジェクトを構築します。 |
| [set_Points](./set_points/)(const ArrayPtr\<PointF\>\&) | パスを構成するポイントを含む配列を設定します。 |
| [set_Types](./set_types/)(const ArrayPtr\<uint8_t\>\&) | 対応する **Points** 配列のポイントの種類を指定する値を含む配列を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
