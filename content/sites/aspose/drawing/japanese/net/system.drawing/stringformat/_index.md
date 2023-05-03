---
title: Class StringFormat
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.StringFormat クラス. テキスト レイアウト情報 配置向きタブ ストップなど 表示操作 省略記号の挿入や各国の数字の置換など および OpenType 機能をカプセル化しますこのクラスは継承できません.
type: docs
weight: 1130
url: /ja/net/system.drawing/stringformat/
---
## StringFormat class

テキスト レイアウト情報 (配置、向き、タブ ストップなど) 表示操作 (省略記号の挿入や各国の数字の置換など) および OpenType 機能をカプセル化します。このクラスは継承できません.

```csharp
public sealed class StringFormat : IDisposable
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [StringFormat](stringformat/#constructor)() | の新しいインスタンスを初期化します`StringFormat`class. |
| [StringFormat](stringformat/#constructor_1)(StringFormat) | の新しいインスタンスを初期化します`StringFormat`指定された既存の class からStringFormatobject. |
| [StringFormat](stringformat/#constructor_2)(StringFormatFlags) | の新しいインスタンスを初期化します`StringFormat`指定された を持つクラスStringFormatFlags列挙. |
| [StringFormat](stringformat/#constructor_3)(StringFormatFlags, int) | の新しいインスタンスを初期化します`StringFormat`指定されたクラス[`StringFormatFlags`](../stringformatflags/)列挙と言語. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| static [GenericDefault](../../system.drawing/stringformat/genericdefault/) { get; } | 汎用デフォルトを取得しますStringFormatobject. |
| static [GenericTypographic](../../system.drawing/stringformat/generictypographic/) { get; } | 一般的なタイポグラフィを取得しますStringFormatobject. |
| [Alignment](../../system.drawing/stringformat/alignment/) { get; set; } | 垂直面のテキスト配置情報を取得または設定します. |
| [DigitSubstitutionLanguage](../../system.drawing/stringformat/digitsubstitutionlanguage/) { get; } | ローカル数字が西洋数字に置き換えられるときに使用される言語を取得します. |
| [DigitSubstitutionMethod](../../system.drawing/stringformat/digitsubstitutionmethod/) { get; } | 桁置換に使用するメソッドを取得します。 |
| [FormatFlags](../../system.drawing/stringformat/formatflags/) { get; set; } | を取得または設定しますStringFormatFlagsフォーマット情報を含む列挙. |
| [HotkeyPrefix](../../system.drawing/stringformat/hotkeyprefix/) { get; set; } | を取得または設定しますHotkeyPrefixこのオブジェクトStringFormatobject. |
| [LineAlignment](../../system.drawing/stringformat/linealignment/) { get; set; } | 水平面上の行の配置を取得または設定します。 |
| [Trimming](../../system.drawing/stringformat/trimming/) { get; set; } | を取得または設定しますStringTrimmingこの列挙StringFormatobject. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Clone](../../system.drawing/stringformat/clone/)() | これの正確なコピーを作成します`StringFormat`物体。 |
| [Dispose](../../system.drawing/stringformat/dispose/)() | これによって使用されたすべてのリソースを解放しますStringFormatobject. |
| [GetTabStops](../../system.drawing/stringformat/gettabstops/)(out float) | このタブ位置を取得しますStringFormatobject. |
| [SetDigitSubstitution](../../system.drawing/stringformat/setdigitsubstitution/)(int, StringDigitSubstitute) | ローカル数字が西洋数字に置き換えられるときに使用される言語と方法を指定します. |
| [SetMeasurableCharacterRanges](../../system.drawing/stringformat/setmeasurablecharacterranges/)(CharacterRange[]) | の配列を指定しますCharacterRangeへの呼び出しによって測定される文字の範囲を表す構造体MeasureCharacterRanges method. |
| [SetTabStops](../../system.drawing/stringformat/settabstops/)(float, float[]) | これにタブストップを設定しますStringFormatobject. |

### 関連項目

* 名前空間 [System.Drawing](../../system.drawing/)
* 組み立て [Aspose.Drawing](../../)


