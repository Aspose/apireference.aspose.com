---
title: VectorLayer.Convert
second_title: Aspose.GIS for .NET API リファレンス
description: VectorLayer 方法. レイヤーを別の形式に変換します
type: docs
weight: 200
url: /ja/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

レイヤーを別の形式に変換します。

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| sourcePath | String | 変換されるレイヤーへのパス。 |
| sourceDriver | FileDriver | ソース レイヤーのフォーマット ドライバー。 |
| destinationPath | String | 変換の結果として作成されるレイヤーへのパス。 |
| destinationDriver | FileDriver | 宛先レイヤーのフォーマット ドライバー。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | どちらのパスも`null`. |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

レイヤーを別の形式に変換します。

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| sourcePath | AbstractPath | 変換されるレイヤーへのパス。 |
| sourceDriver | FileDriver | ソース レイヤーのフォーマット ドライバー。 |
| destinationPath | AbstractPath | 変換の結果として作成されるレイヤーへのパス。 |
| destinationDriver | FileDriver | 宛先レイヤーのフォーマット ドライバー。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | どちらのパスも`null`. |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

レイヤーを別の形式に変換します。

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| sourcePath | String | 変換されるレイヤーへのパス。 |
| sourceDriver | FileDriver | ソース レイヤーのフォーマット ドライバー。 |
| destinationPath | String | 変換の結果として作成されるレイヤーへのパス。 |
| destinationDriver | FileDriver | 宛先レイヤーのフォーマット ドライバー。 |
| options | ConversionOptions | 変換手順のオプション。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | どちらのパスも`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | で指定された空間参照系*options*によってサポートされていません*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | ソース空間参照系からターゲット空間参照系へのフィーチャ ジオメトリの変換に失敗しました。 |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

レイヤーを別の形式に変換します。

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| sourcePath | AbstractPath | 変換されるレイヤーへのパス。 |
| sourceDriver | FileDriver | ソース レイヤーのフォーマット ドライバー。 |
| destinationPath | AbstractPath | 変換の結果として作成されるレイヤーへのパス。 |
| destinationDriver | FileDriver | 宛先レイヤーのフォーマット ドライバー。 |
| options | ConversionOptions | 変換手順のオプション。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | どちらのパスも`null`. |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| NotSupportedException | で指定された空間参照系*options*によってサポートされていません*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | ソース空間参照系からターゲット空間参照系へのフィーチャ ジオメトリの変換に失敗しました。 |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* 名前空間 [Aspose.Gis](../../vectorlayer/)
* 組み立て [Aspose.GIS](../../../)


