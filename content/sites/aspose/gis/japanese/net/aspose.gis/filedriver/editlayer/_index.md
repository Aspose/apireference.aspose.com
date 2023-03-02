---
title: FileDriver.EditLayer
second_title: Aspose.GIS for .NET API リファレンス
description: FileDriver 方法. レイヤーを編集用に開きます
type: docs
weight: 70
url: /ja/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

レイヤーを編集用に開きます。

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | String | ファイルへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルからのフィーチャの読み取り中にエラーが発生しました。 |
| IOException | I/O エラーが発生しました。 |

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

レイヤーを編集用に開きます。

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| path | AbstractPath | ファイルへのパス。 |
| options | DriverOptions | ドライバー固有のオプション。 |

### 戻り値

のインスタンス[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentException | オプション オブジェクトは、このドライバーに対して正しくない型を持っています。 |
| ArgumentNullException | パスは`null`. |
| [GisException](../../gisexception/) | ファイルからのフィーチャの読み取り中にエラーが発生しました。 |
| NotSupportedException | ドライバーはレイヤーを編集できません。 |
| IOException | I/O エラーが発生しました。 |

### 備考

ドライバーは、すべての機能を含む内部レイヤーを作成します。ただし、RAM の代わりにディスク領域を使用するオプションがあります。 リソースをより最適に使用するためのドライバーがあります (特定のドライバーのドキュメントを参照してください)。 また、レイヤーを作成して開くことができる場合、ドライバーはレイヤーを編集できます。

### 関連項目

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 名前空間 [Aspose.Gis](../../filedriver/)
* 組み立て [Aspose.GIS](../../../)


