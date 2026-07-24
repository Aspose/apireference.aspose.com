---
title: "System::Text::RegularExpressions::Regex クラス"
linktitle: "Regex"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Regex クラス。C# に似た構文に従う正規表現です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 800
url: /ja/cpp/system.text.regularexpressions/regex/
---
## Regex class


C# に似た構文に従う正規表現です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class Regex : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Escape](./escape/)(const String\&) | 文字列をパターンの一部として使用できるように、特殊文字をエスケープします。 |
| [get_MatchTimeout](./get_matchtimeout/)() | マッチングのタイムアウトを取得します。 |
| [get_Options](./get_options/)() | 正規表現オプションを取得します。 |
| [get_RightToLeft](./get_righttoleft/)() | 右から左へのモードでマッチングが行われているか確認します。 |
| [IsMatch](./ismatch/)(const String\&, int) | 文字列に対して正規表現をマッチさせます。 |
| static [IsMatch](./ismatch/)(const String\&, const String\&, RegexOptions, TimeSpan, int) | 文字列がパターンにマッチするか確認します。 |
| [Match](./match/)(const String\&) | 文字列に対して正規表現をマッチさせます。 |
| [Match](./match/)(const String\&, int, int) | 文字列に対して正規表現をマッチさせます。 |
| static [Match](./match/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | 文字列とパターンをマッチさせます。 |
| [Matches](./matches/)(const String\&, int) | 与えられた文字列内で正規表現のすべてのマッチを繰り返しマッチさせて取得します。 |
| static [Matches](./matches/)(const String\&, const String\&, RegexOptions, TimeSpan, int, int) | 文字列とパターン間のすべてのマッチを取得します。 |
| [Regex](./regex/)() | 空の正規表現を構築します。 |
| [Regex](./regex/)(const String\&) | コンストラクタ。 |
| [Regex](./regex/)(const String\&, RegexOptions) | コンストラクタ。 |
| [Regex](./regex/)(const String\&, RegexOptions, TimeSpan) | コンストラクタ。 |
| [Replace](./replace/)(const String\&, const String\&) | 文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。 |
| [Replace](./replace/)(const String\&, const char_t *) | 文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。 |
| static [Replace](./replace/)(const String\&, const char_t *, const char_t *) | 文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。 |
| static [Replace](./replace/)(const String\&, const String\&, const char_t *) | 文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&) | 文字列内のすべての一致をデリゲート生成の置換文字列で置き換えます。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int) | 文字列内のすべての一致をデリゲート生成の置換文字列で置き換えます。 |
| [Replace](./replace/)(const String\&, const MatchEvaluator\&, int, int) | 文字列内のすべての一致をデリゲート生成の置換文字列で置き換えます。 |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) | 文字列内のすべての一致をデリゲート生成の置換文字列で置き換えます（静的関数）。 |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, RegexOptions) | 文字列中の正規表現のすべてのマッチを置換文字列で置き換えます。 |
| [Replace](./replace/)(const String\&, const String\&, int) | 文字列内の部分文字列を置き換えます。未実装です。 |
| [Replace](./replace/)(const String\&, const String\&, int, int) | 文字列内の部分文字列を置き換えます。未実装です。 |
| static [Replace](./replace/)(const String\&, const String\&, const String\&) | 正規表現の一致を置き換えます。 |
| static [Replace](./replace/)(const String\&, const String\&, const MatchEvaluator\&) | 正規表現の一致を置き換えます。 |
| [Split](./split/)(const String\&) | 文字列を正規表現の一致で分割します。 |
| [Split](./split/)(const String\&, int) | 文字列を正規表現の一致で分割します。 |
| [Split](./split/)(const String\&, int, int) | 入力文字列を、[Regex](./) コンストラクタで指定された正規表現で定義された位置で、指定された最大回数だけ部分文字列の配列に分割します。正規表現パターンの検索は、入力文字列の指定された文字位置から開始されます。 |
| static [Split](./split/)(const String\&, const String\&, RegexOptions, TimeSpan) | 文字列を正規表現で分割します。 |
| static [Split](./split/)(const String\&, const String\&, int, RegexOptions, TimeSpan) | 文字列を正規表現で分割します。 |
| [ToString](./tostring/)() const override | 正規表現を文字列に変換します。 |
| static [Unescape](./unescape/)(const String\&) | パターンの一部として使用される文字列内の特殊文字のエスケープを解除します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [InfiniteMatchTimeout](./infinitematchtimeout/) | タイムアウトによるマッチの中断を無効にする特別なタイムアウト値です。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
