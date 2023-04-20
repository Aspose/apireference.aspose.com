---
title: Interface IBrowsingContext
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.Dom.IBrowsingContext 界面. 浏览上下文是一个环境其中Document对象呈现给用户
type: docs
weight: 1020
url: /zh/net/aspose.svg.dom/ibrowsingcontext/
---
## IBrowsingContext interface

浏览上下文是一个环境，其中[`Document`](../document/)对象呈现给用户。

```csharp
public interface IBrowsingContext : IDisposable, IServiceProvider
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [ActiveDocument](../../aspose.svg.dom/ibrowsingcontext/activedocument/) { get; } | 获取当前文档。 |
| [DOMImplementation](../../aspose.svg.dom/ibrowsingcontext/domimplementation/) { get; } | 获取 DOM 实现。 |
| [Network](../../aspose.svg.dom/ibrowsingcontext/network/) { get; } | 获取网络服务。 |
| [Parent](../../aspose.svg.dom/ibrowsingcontext/parent/) { get; } | 获取父上下文（如果有）。 |
| [Security](../../aspose.svg.dom/ibrowsingcontext/security/) { get; } | 获取沙盒标记。 |
| [Window](../../aspose.svg.dom/ibrowsingcontext/window/) { get; } | 获取 WindowProxy 对象。 |

### 也可以看看

* interface [IServiceProvider](../../aspose.svg.services/iserviceprovider/)
* 命名空间 [Aspose.Svg.Dom](../../aspose.svg.dom/)
* 部件 [Aspose.SVG](../../)


