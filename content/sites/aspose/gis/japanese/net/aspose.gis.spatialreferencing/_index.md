---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS for .NET API リファレンス
description: Aspose.Gis.SpatialReferencing名前空間は空間参照 座標参照系 を操作するためのクラスを提供します.
type: docs
weight: 370
url: /ja/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.SpatialReferencing`名前空間は、空間参照 (座標参照系) を操作するためのクラスを提供します.

## クラス

| クラス | 説明 |
| --- | --- |
| [Axis](./axis/) | 軸は SRS の 1 つの次元を表します。 |
| [BursaWolfParameters](./bursawolfparameters/) | 別のデータムに変換する Bursa-Wolf 式のパラメーターを含むクラス。 |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | 複合 SRS は、基になる 2 つの SRS を結合しますが、いずれも複合することはできません。 |
| [Ellipsoid](./ellipsoid/) | Ellipsoid は、地球に近似する楕円体を表します。 |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | Geocentric SRS は、地球の中心を原点とする 3 次元デカルト SRS です。 |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | ジオセントリック SRS を作成するためのパラメーター. パラメーターには適切な既定値があるため、それらの一部のみを割り当てる必要があります. 割り当てる場合`null`どのパラメータに対しても、デフォルト値が使用されます. |
| [GeographicDatum](./geographicdatum/) | 地理データムは、経度と緯度を地球上の特定の場所に関連付けます。 |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | 地理的 SRS は、経度と緯度に基づく SRS です。 地理的 SRS は、2 次元または 3 次元です。 地理的 SRS が 3 次元の場合、実際には 2 次元 SRS と垂直 SRS の複合 SRS です。 |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | 地理的 SRS を作成するためのパラメータ. パラメータには適切なデフォルトがあるため、それらの一部のみを割り当てる必要があります. 割り当てる場合`null`どのパラメータに対しても、デフォルト値が使用されます. |
| [IdentifiableObject](./identifiableobject/) | EPSG コードと名前を持つオブジェクトを表します。 |
| [Identifier](./identifier/) | 識別子 (オブジェクトの外部記述への参照) を表します。 WKT から SRS を作成する場合、[`Identifier`](../aspose.gis.spatialreferencing/identifier/) 「AUTHORITY」キーワードに対応。 |
| [LocalDatum](./localdatum/) | ローカル空間参照系での測定に使用される方法を示します. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | 地球ではなく、何らかのオブジェクトに関連するローカル SRS 座標. |
| [PrimeMeridian](./primemeridian/) | PrimeMeridian は、経度が 0. と定義されている子午線を表します。 |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | 射影 SRS は、地理 SRS への射影を適用した結果です。 射影 SRS は、2 次元または 3 次元にすることができます。 射影 SRS が 3 次元の場合、実際には、2 次元の射影 SRS と 1 次元垂直の合成 SRS です。 SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | 投影された SRS を作成するためのパラメーター。一部のパラメータにはデフォルトがあります. 一部のパラメータには適切なデフォルトが設定されているため、それらだけを割り当てる必要はありません. `null`これらのパラメータに対しては、デフォルト値が使用されます. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/)と[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/)デフォルトはありません - 非を割り当てる必要があります`null`このプロパティの値. |
| [Projection](./projection/) | (経度、緯度) を (x, y). に変換するパラメータ付きの投影法を表します。 |
| [SpatialReferenceSystem](./spatialreferencesystem/) | 空間参照系は、座標を地球上の場所にマップします。 SRS にはさまざまな種類があります。[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/) . さらに、SRS のタイプがGeographicor Projected、SRS は複合または単一にすることができます。[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | 空間参照系変換は、ジオメトリをソース空間参照系からターゲット空間参照系に変換します。 |
| [TransformationException](./transformationexception/) | 座標の変換中または変換の作成中にエラーが発生した場合、変換例外がスローされます。 |
| [Unit](./unit/) | 測定単位を表します。 |
| [VerticalDatum](./verticaldatum/) | 垂直測定に使用される方法を示します。 |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | 垂直 SRS は、高さ座標を記述する 1 次元 SRS です。 |
## 列挙

| 列挙 | 説明 |
| --- | --- |
| [AxisDirection](./axisdirection/) | 軸方向は、軸が指している方向を定義します. |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | 地心 SRS の軸の順序を表します。 |
| [GeographicAxisesOrder](./geographicaxisesorder/) | 地理的 SRS の軸の順序を表します。 |
| [ParameterType](./parametertype/) | パラメータのタイプを決定します[`Projection`](../aspose.gis.spatialreferencing/projection/) . |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | 地理的 SRS の軸の順序を表します。 |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | 空間参照系のタイプを表します。 |


