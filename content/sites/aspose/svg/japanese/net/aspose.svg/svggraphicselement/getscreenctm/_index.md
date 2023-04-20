---
title: SVGGraphicsElement.GetScreenCTM
second_title: Aspose.SVG for .NET API リファレンス
description: SVGGraphicsElement 方法. 現在のユーザー単位から つまりもしあれば変換属性の適用後親ユーザー エージェントのピクセル通知までの変換行列を返しますディスプレイ デバイスの場合理想的にはこれは物理的なスクリーン ピクセルを表します物理的なピクセル サイズが不明な他のデバイスまたは環境では代わりに CSS2 定義のピクセルに類似したアルゴリズムを使用できますこの要素がドキュメント ツリーにフックされていない場合はnull が返されることに注意してくださいこのメソッドはgetClientCTM という名前の方が適切ですが歴史的な理由から getScreenCTM という名前が残されています
type: docs
weight: 90
url: /ja/net/aspose.svg/svggraphicselement/getscreenctm/
---
## SVGGraphicsElement.GetScreenCTM method

現在のユーザー単位から (つまり、もしあれば「変換」属性の適用後)、親ユーザー エージェントの「ピクセル」通知までの変換行列を返します。ディスプレイ デバイスの場合、理想的には、これは物理的なスクリーン ピクセルを表します。物理的なピクセル サイズが不明な他のデバイスまたは環境では、代わりに CSS2 定義の「ピクセル」に類似したアルゴリズムを使用できます。この要素がドキュメント ツリーにフックされていない場合は、null が返されることに注意してください。このメソッドは、getClientCTM という名前の方が適切ですが、歴史的な理由から getScreenCTM という名前が残されています。

```csharp
public SVGMatrix GetScreenCTM()
```

### 戻り値

指定された変換行列を定義する SVGMatrix オブジェクト。

### 関連項目

* class [SVGMatrix](../../../aspose.svg.datatypes/svgmatrix/)
* class [SVGGraphicsElement](../)
* 名前空間 [Aspose.Svg](../../svggraphicselement/)
* 組み立て [Aspose.SVG](../../../)


