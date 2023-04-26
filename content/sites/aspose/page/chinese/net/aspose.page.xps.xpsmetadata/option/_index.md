---
title: Class Option
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.Option 班级. 实现通用 PrintTicket 的类. 所有模式定义选项的基类 Option 元素包含所有Propertyand ScoredProperty与此选项关联的元素 https//docs.microsoft.com/enus/windows/win32/printdocs/option
type: docs
weight: 1660
url: /zh/net/aspose.page.xps.xpsmetadata/option/
---
## Option class

实现通用 PrintTicket 的类. 所有模式定义选项的基类。 Option 元素包含所有[`Property`](../property/)and [`ScoredProperty`](../scoredproperty/)与此选项关联的元素。 https://docs.microsoft.com/en-us/windows/win32/printdocs/option

```csharp
Option
```

```csharp
public class Option : CompositePrintTicketElement, IFeatureItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Option](option/#constructor)(params IOptionItem[]) | 创建一个新的 PrintTicket 选项实例。 |
| [Option](option/#constructor_1)(Option) | 创建一个克隆选项实例。 |
| [Option](option/#constructor_2)(string, params IOptionItem[]) | 创建一个新的 PrintTicket 选项实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | 将项目列表添加到此选项的项目列表的末尾。 每个必须是一个[`ScoredProperty`](../scoredproperty/)或者[`Property`](../property/)实例. |

### 也可以看看

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


