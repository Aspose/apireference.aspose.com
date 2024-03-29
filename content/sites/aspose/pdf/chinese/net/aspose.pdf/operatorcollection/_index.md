---
title: OperatorCollection
second_title: Aspose.PDF for .NET API 参考
description: 类表示运算符的集合
type: docs
weight: 4860
url: /zh/net/aspose.pdf/operatorcollection/
---
## OperatorCollection class

类表示运算符的集合

```csharp
public class OperatorCollection : BaseOperatorCollection
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| override [Count](../../aspose.pdf/operatorcollection/count) { get; } | 获取集合中运算符的计数。 |
| override [IsFastTextExtractionMode](../../aspose.pdf/operatorcollection/isfasttextextractionmode) { get; } | 表示集合仅限于快速文本提取 |
| override [IsReadOnly](../../aspose.pdf/operatorcollection/isreadonly) { get; } | 获取一个值，该值指示该集合是否为只读。 |
| override [Item](../../aspose.pdf/operatorcollection/item) { get; set; } | 通过索引获取运算符。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Accept](../../aspose.pdf/operatorcollection/accept)(IOperatorSelector) | 接受 IOperatorSelector 访问者对象来处理操作员。 |
| [Add](../../aspose.pdf/operatorcollection/add#add_2)(ICollection&lt;Operator&gt;) | 将其他集合中的所有运算符添加到集合中。 |
| override [Add](../../aspose.pdf/operatorcollection/add#add)(Operator) | 将新运算符添加到集合中。 |
| [Add](../../aspose.pdf/operatorcollection/add#add_1)(Operator[]) | 在内容操作符末尾添加操作符。 |
| override [CancelUpdate](../../aspose.pdf/operatorcollection/cancelupdate)() | 取消上次更新。 当更改不应该引发内容更新时，可以调用此方法。 |
| override [Clear](../../aspose.pdf/operatorcollection/clear)() | 从列表中删除所有运算符。 |
| override [Contains](../../aspose.pdf/operatorcollection/contains)(Operator) | 如果集合包含给定的运算符，则返回 true。 |
| override [CopyTo](../../aspose.pdf/operatorcollection/copyto)(Operator[], int) | 将操作符复制到操作符列表中。 |
| [Delete](../../aspose.pdf/operatorcollection/delete#delete_2)(IList&lt;Operator&gt;) | 从集合中删除运算符。 |
| [Delete](../../aspose.pdf/operatorcollection/delete#delete_1)(int) | 从集合中删除运算符。 |
| [Delete](../../aspose.pdf/operatorcollection/delete#delete)(Operator[]) | 从集合中删除运算符。 |
| override [GetEnumerator](../../aspose.pdf/operatorcollection/getenumerator)() | 返回集合的枚举数 |
| [Insert](../../aspose.pdf/operatorcollection/insert#insert_2)(int, IList&lt;Operator&gt;) | 在给定位置插入运算符。 |
| override [Insert](../../aspose.pdf/operatorcollection/insert#insert)(int, Operator) | 将运算符插入集合中。 |
| [Insert](../../aspose.pdf/operatorcollection/insert#insert_1)(int, Operator[]) | 在给定位置插入运算符。 |
| override [Remove](../../aspose.pdf/operatorcollection/remove)(Operator) | 从集合中删除运算符。 |
| [Replace](../../aspose.pdf/operatorcollection/replace)(IList&lt;Operator&gt;) | 将集合中的运算符替换为其他运算符。 |
| override [ResumeUpdate](../../aspose.pdf/operatorcollection/resumeupdate)() | 恢复文档更新。 在有任何未决更改的情况下更新内容流。 |
| override [SuppressUpdate](../../aspose.pdf/operatorcollection/suppressupdate)() | 禁止更新内容数据。 直到调用 ResumeUpdate 才更新内容流。 |
| override [ToString](../../aspose.pdf/operatorcollection/tostring)() | 返回运算符的文本表示形式。 |

### 也可以看看

* class [BaseOperatorCollection](../baseoperatorcollection)
* 命名空间 [Aspose.Pdf](../../aspose.pdf)
* 部件 [Aspose.PDF](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.PDF.dll -->
