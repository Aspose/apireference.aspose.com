---
title: TopoJsonOptions.DefaultObjectName
second_title: Aspose.GIS for .NET API リファレンス
description: TopoJsonOptions 財産. デフォルトで機能が配置されるオブジェクトの名前.
type: docs
weight: 20
url: /ja/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

デフォルトで機能が配置されるオブジェクトの名前.

```csharp
public string DefaultObjectName { get; set; }
```

### 備考

これは書き込みオプションです。読み取りには影響しません。 TopoJSON には、任意の数の名前付きオブジェクトを含めることができます。そのようなオブジェクトはすべて、 複数の機能を含むことができます。機能を配置するオブジェクトを指定するには、 を使用します。[`ObjectNameAttribute`](../objectnameattribute/) property. 名前付きの属性の場合[`ObjectNameAttribute`](../objectnameattribute/)は`null`または for 機能の設定を解除すると、この機能は次の名前のオブジェクトに追加されます`DefaultObjectName`. 名前付きの属性の場合[`ObjectNameAttribute`](../objectnameattribute/)には存在しません[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) コレクション、すべての機能は名前付きのオブジェクトに入れられます[`ObjectNameAttribute`](../objectnameattribute/). デフォルト値は「無名」です.

### 関連項目

* class [TopoJsonOptions](../)
* 名前空間 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 組み立て [Aspose.GIS](../../../)


