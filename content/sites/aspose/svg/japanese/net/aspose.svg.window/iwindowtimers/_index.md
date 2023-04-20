---
title: Interface IWindowTimers
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Window.IWindowTimers インターフェース. 作成者がタイマーベースのコールバックをスケジュールできるようにします.
type: docs
weight: 3840
url: /ja/net/aspose.svg.window/iwindowtimers/
---
## IWindowTimers interface

作成者がタイマーベースのコールバックをスケジュールできるようにします.

```csharp
public interface IWindowTimers
```

## メソッド

| 名前 | 説明 |
| --- | --- |
| [ClearInterval](../../aspose.svg.window/iwindowtimers/clearinterval/)(int) | handle で識別される setInterval() で設定されたタイムアウトをキャンセルします |
| [ClearTimeout](../../aspose.svg.window/iwindowtimers/cleartimeout/)(int) | handle. で識別される setTimeout() で設定されたタイムアウトをキャンセルします。 |
| [SetInterval](../../aspose.svg.window/iwindowtimers/setinterval/)(object, int, params object[]) | タイムアウト ミリ秒ごとにハンドラを実行するためのタイムアウトをスケジュールします。すべての引数は、handler. に直接渡されます。 |
| [SetTimeout](../../aspose.svg.window/iwindowtimers/settimeout/)(object, int, params object[]) | timeout ミリ秒後にハンドラーを実行するタイムアウトをスケジュールします。すべての引数は、handler. に直接渡されます。 |

### 関連項目

* 名前空間 [Aspose.Svg.Window](../../aspose.svg.window/)
* 組み立て [Aspose.SVG](../../)


