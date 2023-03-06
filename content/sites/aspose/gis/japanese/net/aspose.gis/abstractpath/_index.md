---
title: Class AbstractPath
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.AbstractPath クラス. アン抽象パスローカルファイルシステムリモートファイルストレージZIPアーカイブなどのファイルシステム に似た環境で一意の場所を指定するクラスの基本クラスです.
type: docs
weight: 10
url: /ja/net/aspose.gis/abstractpath/
---
## AbstractPath class

アン`抽象パス`ローカルファイルシステム、リモートファイルストレージ、ZIPアーカイブなどのファイルシステム に似た環境で一意の場所を指定するクラスの基本クラスです.

```csharp
public abstract class AbstractPath
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | この場所の文字列表現を取得します`抽象パス` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | のディレクトリ レベルを区切るために使用される区切り文字を取得します。[`Location`](./location/)弦。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | を作成します`AbstractPath`ローカルファイルシステム上の場所を表します. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | を作成します`AbstractPath`からStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | これを組み合わせる`AbstractPath`指定されたパス コンポーネントで. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | このパスが指すファイルを削除します。 |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | この拡張子を返します`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | このファイルの名前と拡張子を返します`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | このファイル名を返します`AbstractPath`拡張子なし. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | このパスが読み取り用に開くことができる既存のファイルを指しているかどうかを示す値を取得します。 |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | この中にあるパスを返します`抽象パス`、ディレクトリの場合. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | これを開く`抽象パス`ファイルとして. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | 新しいものを返します`AbstractPath`ファイル拡張子が指定された値に変更された. |

### 備考

アン`抽象パス`ローカル ファイル システム上の場所、リモート ファイルシステム 上の場所、または Azure Blob ストレージなどの外部ストレージなどを指定する場合があります。この場所は、既存または存在しない ファイルのようなオブジェクト、ディレクトリのようなオブジェクトを指している場合や、それが属する環境に適したその他の意味を持っている場合があります。 例として、`抽象パス`ローカル ファイル システム上の場所を表す継承者は、existing ファイル、ディレクトリ、またはまだ作成されていないファイル システム内の場所を指すことができます。 新しいファイルシステムのようなストレージを利用できるようにするため`Aspose.GIS`、この class を継承し、その抽象メソッドを実装する必要があります.

### 関連項目

* 名前空間 [Aspose.Gis](../../aspose.gis/)
* 組み立て [Aspose.GIS](../../)


