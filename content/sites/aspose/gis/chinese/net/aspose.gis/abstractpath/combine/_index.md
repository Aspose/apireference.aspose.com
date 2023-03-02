---
title: AbstractPath.Combine
second_title: Aspose.GIS for .NET API 参考
description: AbstractPath 方法. 结合这个AbstractPath具有指定路径组件.
type: docs
weight: 50
url: /zh/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

结合这个[`AbstractPath`](../)具有指定路径组件.

```csharp
public virtual AbstractPath Combine(string location)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| location | String | 要附加到此的路径组件[`AbstractPath`](../). |

### 返回值

一个新的[`AbstractPath`](../)指向一个[`Location`](../location/)这是这个位置的组合[`AbstractPath`](../)and 参数.

### 评论

通常这个方法不应该被继承者覆盖。默认的 implementation 连接这个[`Location`](../location/)与参数并调用[`WithLocation`](../withlocation/) 方法，以连接的字符串作为参数。 组合结果定义如下： 如果参数以[`Separator`](../separator/)组合结果等于自变量；否则，如果[`Location`](../location/)以[`Separator`](../separator/), 组合结果等于` +`;否则，结果等于` + +`

### 也可以看看

* class [AbstractPath](../)
* 命名空间 [Aspose.Gis](../../abstractpath/)
* 部件 [Aspose.GIS](../../../)


