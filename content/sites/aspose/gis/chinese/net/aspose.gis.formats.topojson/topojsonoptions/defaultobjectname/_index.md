---
title: TopoJsonOptions.DefaultObjectName
second_title: Aspose.GIS for .NET API 参考
description: TopoJsonOptions 财产. 默认放置特征的对象的名称
type: docs
weight: 20
url: /zh/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

默认放置特征的对象的名称。

```csharp
public string DefaultObjectName { get; set; }
```

### 评论

这是写入选项 - 它不影响读取。 TopoJSON 可能包含任意数量的命名对象。每个这样的对象都可以包含 个特征。为了指定在哪个对象中放置您的功能，请使用 [`ObjectNameAttribute`](../objectnameattribute/) property. 如果具有名称的属性[`ObjectNameAttribute`](../objectnameattribute/)是`null`或取消设置 for 某些功能，此功能将添加到名称为的对象`DefaultObjectName`. 如果具有名称的属性[`ObjectNameAttribute`](../objectnameattribute/)不存在于[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) 集合，所有特征都放入名称对象中[`ObjectNameAttribute`](../objectnameattribute/). 默认值为“未命名”.

### 也可以看看

* class [TopoJsonOptions](../)
* 命名空间 [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* 部件 [Aspose.GIS](../../../)


