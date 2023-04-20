---
title: Interface IMediaList
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Dom.Css.IMediaList インターフェース. MediaList インターフェイスはこのコレクションの実装方法を定義または制約することなく順序付けられたメディアのコレクションの抽象化を提供します空のリストはメディアallを含むリストと同じです.
type: docs
weight: 730
url: /ja/net/aspose.svg.dom.css/imedialist/
---
## IMediaList interface

MediaList インターフェイスは、このコレクションの実装方法を定義または制約することなく、順序付けられたメディアのコレクションの抽象化を提供します。空のリストは、メディア「all」を含むリストと同じです.

```csharp
public interface IMediaList : IEnumerable<string>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Item](../../aspose.svg.dom.css/imedialist/item/) { get; } | リストのインデックス番目を返します。 index がリスト内のメディア数以上の場合、null を返します。 メディア インデックス。 |
| [Length](../../aspose.svg.dom.css/imedialist/length/) { get; } | リスト内のメディアの数。有効なメディアの範囲は、0 から長さ 1 までです。 |
| [MediaText](../../aspose.svg.dom.css/imedialist/mediatext/) { get; } | メディア リストの解析可能なテキスト表現。これは、メディアのカンマ区切りリストです。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [AppendMedium](../../aspose.svg.dom.css/imedialist/appendmedium/)(string) | リストの最後にメディア newMedium を追加します。 newMedium が既に使用されている場合は、最初に削除されます。 |
| [DeleteMedium](../../aspose.svg.dom.css/imedialist/deletemedium/)(string) | oldMedium で示されるメディアをリストから削除します。 |

### 関連項目

* 名前空間 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* 組み立て [Aspose.SVG](../../)


