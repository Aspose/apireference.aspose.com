---
title: Class Icon
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Icon クラス. オブジェクトを表すために使用される小さなビットマップ イメージである Windows アイコンを表します アイコンは透明なビットマップと考えることができますがそのサイズはシステムによって決定されます
type: docs
weight: 570
url: /ja/net/system.drawing/icon/
---
## Icon class

オブジェクトを表すために使用される小さなビットマップ イメージである Windows アイコンを表します。 アイコンは透明なビットマップと考えることができますが、そのサイズはシステムによって決定されます。

```csharp
public sealed class Icon : ICloneable, IDisposable, ISerializable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [Icon](icon/#constructor_2)(Stream) | の新しいインスタンスを初期化します`Icon`指定されたデータストリームからのクラス. |
| [Icon](icon/#constructor_5)(string) | の新しいインスタンスを初期化します`Icon`指定したファイル名からのクラス. |
| [Icon](icon/#constructor_1)(Icon, Size) | の新しいインスタンスを初期化します`Icon`クラスと一致し、要求されたサイズに一致するアイコンのバージョンを見つけようとします. |
| [Icon](icon/#constructor_4)(Stream, Size) | の新しいインスタンスを初期化します`Icon`指定されたストリームから指定されたサイズのクラス. |
| [Icon](icon/#constructor_7)(string, Size) | の新しいインスタンスを初期化します`Icon`指定されたファイルから指定されたサイズのクラス. |
| [Icon](icon/#constructor_8)(Type, string) | の新しいインスタンスを初期化します`Icon`指定されたアセンブリ内のリソースからのクラス. |
| [Icon](icon/#constructor)(Icon, int, int) | の新しいインスタンスを初期化します`Icon`要求されたサイズに一致するアイコンのバージョンを見つけようとします.. |
| [Icon](icon/#constructor_3)(Stream, int, int) | の新しいインスタンスを初期化します`Icon`指定されたデータストリームから、指定された幅と高さを持つクラス. |
| [Icon](icon/#constructor_6)(string, int, int) | の新しいインスタンスを初期化します`Icon`指定されたファイルから指定された幅と高さを持つクラス. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Handle](../../system.drawing/icon/handle/) { get; } | このハンドルを取得しますIcon.これはハンドルのコピーではありません。解放しないでください。 |
| [Height](../../system.drawing/icon/height/) { get; } | この高さを取得しますIcon. |
| [Size](../../system.drawing/icon/size/) { get; } | このサイズを取得しますIcon. |
| [Width](../../system.drawing/icon/width/) { get; } | この幅を取得しますIcon. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [ExtractAssociatedIcon](../../system.drawing/icon/extractassociatedicon/)(string) | 指定されたファイルに含まれる画像のアイコン表現を返します. |
| static [FromHandle](../../system.drawing/icon/fromhandle/)(IntPtr) | GDI+ を作成しますIcon指定された Windows ハンドルからアイコン (HICON). へ |
| [Clone](../../system.drawing/icon/clone/)() | はIcon、複製画像を作成します. |
| [Dispose](../../system.drawing/icon/dispose/)() | アンマネージ リソースの解放、解放、またはリセットに関連するアプリケーション定義のタスクを実行します。 |
| [Save](../../system.drawing/icon/save/)(Stream) | これを保存しますIcon指定された出力へStream. |
| [ToBitmap](../../system.drawing/icon/tobitmap/)() | これを変換Icon GDI+にBitmap. |
| override [ToString](../../system.drawing/icon/tostring/)() | を説明する人間が読める文字列を取得します。Icon. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


