---
title: Enum MetafileType
second_title: Aspose.Drawing for .NET API リファレンス
description: System.Drawing.Imaging.MetafileType 列挙. メタファイルの種類を指定します
type: docs
weight: 830
url: /ja/net/system.drawing.imaging/metafiletype/
---
## MetafileType enumeration

メタファイルの種類を指定します。

```csharp
public enum MetafileType
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| Invalid | `0` | GDI+ で認識されないメタファイル形式を指定します。 |
| Wmf | `1` | WMF (Windows メタファイル) ファイルを指定します。このようなファイルには、GDI レコードのみが含まれます。 |
| WmfPlaceable | `2` | 先頭に配置可能なメタファイル ヘッダーを持つ WMF (Windows メタファイル) ファイルを指定します。 |
| Emf | `3` | 拡張メタファイル (EMF) ファイルを指定します。このようなファイルには、GDI レコードのみが含まれます。 |
| EmfPlusOnly | `4` | EMF+ ファイルを指定します。このようなファイルには GDI+ レコードのみが含まれ、GDI+ を使用して表示する必要があります。 GDI を使用してレコードを表示すると、予期しない結果が生じる場合があります。 |
| EmfPlusDual | `5` | EMF+ デュアル ファイルを指定します。このようなファイルには、GDI+ レコードと代替 GDI レコードが含まれており、GDI または GDI+ を使用して表示できます。 GDI を使用してレコードを表示すると、品質が低下する場合があります。 |

### 関連項目

* 名前空間 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 組み立て [Aspose.Drawing](../../)


