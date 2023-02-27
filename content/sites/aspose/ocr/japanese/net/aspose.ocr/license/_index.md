---
title: Class License
second_title: Aspose.OCR for .NET API リファレンス
description: Aspose.OCR.License クラス. コンポーネントのライセンスを取得する方法を提供します
type: docs
weight: 120
url: /ja/net/aspose.ocr/license/
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
| [IsLicensed](../../aspose.ocr/license/islicensed/) { get; } | 製品がライセンスされているかどうかを示す値を取得します. |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense)(Stream) | コンポーネントのライセンスを取得します。 |
| [SetLicense](../../aspose.ocr/license/setlicense/#setlicense_1)(string) | コンポーネントのライセンスを取得します。 |

### 例

この例では、 コンポーネントを含むフォルダー、呼び出しアセンブリを含むフォルダー、エントリ アセンブリのフォルダー内の 、そして次に呼び出し元アセンブリの埋め込みリソース.

```csharp
[C#]

License license = new License();
license.SetLicense("MyLicense.lic");
```

### 関連項目

* 名前空間 [Aspose.OCR](../../aspose.ocr/)
* 組み立て [Aspose.OCR](../../)


