---
title: Interface ICSSStyleSheet
second_title: Aspose.SVG for .NET API 参考
description: Aspose.Svg.Dom.Css.ICSSStyleSheet 界面. CSSStyleSheet接口是一个具体的接口用于表示CSS样式表即内容类型为text/css的样式表
type: docs
weight: 660
url: /zh/net/aspose.svg.dom.css/icssstylesheet/
---
## ICSSStyleSheet interface

CSSStyleSheet接口是一个具体的接口，用于表示CSS样式表，即内容类型为“text/css”的样式表。

```csharp
public interface ICSSStyleSheet : IStyleSheet
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icssstylesheet/cssrules/) { get; } | 样式表中包含的所有 CSS 规则的列表。这包括规则集和 at-rules. |
| [OwnerRule](../../aspose.svg.dom.css/icssstylesheet/ownerrule/) { get; } | 如果此样式表来自 @import 规则，则 ownerRule 属性将包含 CSSImportRule。在这种情况下，StyleSheet 接口中的 ownerNode 属性将为空。如果样式表来自元素或处理指令，ownerRule 属性将为 null，ownerNode 属性将包含 Node. |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [DeleteRule](../../aspose.svg.dom.css/icssstylesheet/deleterule/)(int) | 用于从样式表中删除规则。 |
| [InsertRule](../../aspose.svg.dom.css/icssstylesheet/insertrule/)(string, int) | 用于将新规则插入样式表。新规则现在成为级联的一部分。 |

### 也可以看看

* interface [IStyleSheet](../istylesheet/)
* 命名空间 [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* 部件 [Aspose.SVG](../../)


