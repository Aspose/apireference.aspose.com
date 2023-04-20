---
title: Class License
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.License クラス. コンポーネントのライセンスを取得する方法を提供します
type: docs
weight: 2190
url: /ja/net/aspose.svg/license/
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

## メソッド

| 名前 | 説明 |
| --- | --- |
| [SetLicense](../../aspose.svg/license/setlicense/#setlicense)(Stream) | コンポーネントのライセンスを取得します。 |
| [SetLicense](../../aspose.svg/license/setlicense/#setlicense_1)(string) | コンポーネントのライセンスを取得します。 |

### 例

この例では、 を含むフォルダーで MyLicense.lic という名前のライセンス ファイルを検索しようとします。 呼び出しアセンブリを含むフォルダー内のコンポーネント、 エントリ アセンブリのフォルダー内、および呼び出しアセンブリの埋め込みリソース内のコンポーネント.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

コンポーネント jar ファイル:

```csharp
License license = new License();
license.setLicense("MyLicense.lic");
```

### 関連項目

* 名前空間 [Aspose.Svg](../../aspose.svg/)
* 組み立て [Aspose.SVG](../../)


