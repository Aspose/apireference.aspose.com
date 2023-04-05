---
title: Class License
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.License クラス. コンポーネントのライセンスを取得する方法を提供します
type: docs
weight: 270
url: /ja/net/aspose.page/license/
---
## License class

コンポーネントのライセンスを取得する方法を提供します。

```csharp
public class License
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [License](license/)() | このクラスの新しいインスタンスを初期化します。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Embedded](../../aspose.page/license/embedded/) { get; set; } | ライセンス番号が埋め込みリソースとして追加されました. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense)(Stream) | コンポーネントのライセンスを取得します。 |
| [SetLicense](../../aspose.page/license/setlicense/#setlicense_1)(string) | コンポーネントのライセンスを取得します。 |

### 例

この例では、 を含むフォルダーで MyLicense.lic という名前のライセンス ファイルを検索しようとします。 呼び出しアセンブリを含むフォルダー内のコンポーネント、 エントリ アセンブリのフォルダー内、および呼び出しアセンブリの埋め込みリソース内のコンポーネント.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

コンポーネント jar ファイル:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### 関連項目

* 名前空間 [Aspose.Page](../../aspose.page/)
* 組み立て [Aspose.Page](../../)


