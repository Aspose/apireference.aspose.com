---
title: GmlOptions.SchemaLocation
second_title: Aspose.GIS for .NET API リファレンス
description: GmlOptions 財産. URI ペアのスペース区切りリストすべてのペアの最初の URI は名前空間の URI で2 番目の URI は名前空間の XML スキーマへのパスです に設定されている場合nullGmlDriverドキュメントのルート要素から schemaLocation の読み取りを試みます デフォルトはnull .
type: docs
weight: 50
url: /ja/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

URI ペアのスペース区切りリスト。すべてのペアの最初の URI は名前空間の URI で、2 番目の URI は名前空間の XML スキーマへのパスです。 に設定されている場合`null`、[`GmlDriver`](../../gmldriver/)ドキュメントのルート要素から schemaLocation の読み取りを試みます。 デフォルトは`null` .

```csharp
public string SchemaLocation { get; set; }
```

### 備考

Aspose.GIS は、GML ファイルの XML スキーマを使用して、[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/).デフォルトでは、スキーマの場所は schemaLocation 属性から抽出された です。そのような属性がないか、無効な場所を指している場合、 Aspose.GIS は GML ファイルの読み取りに失敗します。この場合 - このオプションを設定して、Aspose.GIS が schema. をロードできるようにします。

### 例

"http://site.com/namespace http://site.com/schema.xsd"

### 関連項目

* class [GmlOptions](../)
* 名前空間 [Aspose.Gis.Formats.Gml](../../gmloptions/)
* 組み立て [Aspose.GIS](../../../)


