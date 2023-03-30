---
title: Class License
second_title: Aspose.OMR for .NET API リファレンス
description: Aspose.OMR.License クラス. コンポーネントのライセンスを取得する方法を提供します
type: docs
weight: 770
url: /ja/net/aspose.omr/license/
---
## License class

コンポーネントのライセンスを取得する方法を提供します。

```csharp
public class License
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [License](license/)() | デフォルトのコンストラクター。 |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Embedded](../../aspose.omr/license/embedded/) { get; set; } | ライセンス番号が埋め込みリソースとして追加されました. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense)(Stream) | コンポーネントのライセンスを取得します。 |
| [SetLicense](../../aspose.omr/license/setlicense/#setlicense_1)(string) | コンポーネントのライセンスを取得します。 |

### 例

この例では、MyLicense.lic という名前のライセンス ファイルを コンポーネントを含むフォルダー、呼び出しアセンブリを含むフォルダー、 エントリ アセンブリのフォルダー、次に埋め込みアセンブリを検索しようとします。呼び出し元アセンブリのリソース.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");


[Visual Basic]

Dim license As license = New license
License.SetLicense("MyLicense.lic")
```

### 関連項目

* 名前空間 [Aspose.OMR](../../aspose.omr/)
* 組み立て [Aspose.OMR](../../)


