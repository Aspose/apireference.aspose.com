---
title: FeaturesSequence.SaveTo
second_title: Aspose.GIS for .NET API リファレンス
description: FeaturesSequence 方法. フィーチャ シーケンスをレイヤーに保存します
type: docs
weight: 50
url: /ja/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

フィーチャ シーケンスをレイヤーに保存します。

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| destinationPath | String | 出力層へのパス。 |
| destinationDriver | FileDriver | 出力レイヤーのフォーマット ドライバー。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | どんな引数も`null`. |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | ソース空間参照系からターゲット空間参照系へのフィーチャ ジオメトリの変換に失敗しました。 |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* 名前空間 [Aspose.Gis](../../featuressequence/)
* 組み立て [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

フィーチャ シーケンスをレイヤーに保存します。

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| destinationPath | AbstractPath | 出力層へのパス。 |
| destinationDriver | FileDriver | 出力レイヤーのフォーマット ドライバー。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | ソース空間参照系からターゲット空間参照系へのフィーチャ ジオメトリの変換に失敗しました。 |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* 名前空間 [Aspose.Gis](../../featuressequence/)
* 組み立て [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

フィーチャ シーケンスをレイヤーに保存します。

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| destinationPath | String | 出力層へのパス。 |
| destinationDriver | FileDriver | 出力レイヤーのフォーマット ドライバー。 |
| options | SavingOptions | 保存手順のオプション。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | ソース空間参照系からターゲット空間参照系へのフィーチャ ジオメトリの変換に失敗しました。 |
| NotSupportedException | で指定された空間参照系*options*によってサポートされていません*destinationDriver* . |

### 関連項目

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* 名前空間 [Aspose.Gis](../../featuressequence/)
* 組み立て [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

フィーチャ シーケンスをレイヤーに保存します。

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| destinationPath | AbstractPath | 出力層へのパス。 |
| destinationDriver | FileDriver | 出力レイヤーのフォーマット ドライバー。 |
| options | SavingOptions | 保存手順のオプション。 |

### 例外

| 例外 | 調子 |
| --- | --- |
| [GisException](../../gisexception/) | ファイルに対するフィーチャの読み取りまたは書き込みでエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | ソース空間参照系からターゲット空間参照系へのフィーチャ ジオメトリの変換に失敗しました。 |
| NotSupportedException | で指定された空間参照系*options*によってサポートされていません*destinationDriver* . |

### 関連項目

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* 名前空間 [Aspose.Gis](../../featuressequence/)
* 組み立て [Aspose.GIS](../../../)


