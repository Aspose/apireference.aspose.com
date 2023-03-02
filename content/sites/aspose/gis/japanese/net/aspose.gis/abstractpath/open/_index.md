---
title: AbstractPath.Open
second_title: Aspose.GIS for .NET API リファレンス
description: AbstractPath 方法. これを開く抽象パスファイルとして.
type: docs
weight: 120
url: /ja/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

これを開く`抽象パス`ファイルとして.

```csharp
public abstract Stream Open(FileAccess access)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| access | FileAccess | に対して実行できる操作のサブセットを指定します。Stream. |

### 戻り値

あStream指定で開いたFileAccess.

### 備考

の場合*access*旗を持っているWrite設定されていて、ファイルが存在しない場合、 継承者が作成する必要があります。 アン`抽象パス`によって複数回開くことができます`Aspose.GIS`.これは、file を複数のストリームで個別に読み取るために必要です。結果をキャッシュするのではなく、新しいものを返す必要がありますStreamtime このメソッドが呼び出されるたびに.

### 関連項目

* class [AbstractPath](../)
* 名前空間 [Aspose.Gis](../../abstractpath/)
* 組み立て [Aspose.GIS](../../../)


