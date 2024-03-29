---
title: EmfCommentMultiFormats
second_title: Aspose.Imaging for .NET API 参考
description: EMR_COMMENT_MULTIFORMATS 记录指定了多种图形格式的图像
type: docs
weight: 3400
url: /zh/net/aspose.imaging.fileformats.emf.emf.records/emfcommentmultiformats/
---
## EmfCommentMultiFormats class

EMR_COMMENT_MULTIFORMATS 记录指定了多种图形格式的图像。

```csharp
public sealed class EmfCommentMultiFormats : EmfCommentPublicRecordType
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [EmfCommentMultiFormats](emfcommentmultiformats)(EmfRecord) | 初始化[`EmfCommentMultiFormats`](../emfcommentmultiformats)类. |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AFormats](../../aspose.imaging.fileformats.emf.emf.records/emfcommentmultiformats/aformats) { get; set; } | 获取或设置图形格式的 CountFormats 长度数组，由 EmrFormat 对象（第 2.2.4 节）指定，按优先顺序排列 |
| override [CommentIdentifier](../../aspose.imaging.fileformats.emf.emf.records/emfcommentpublicrecordtype/commentidentifier) { get; set; } | 获取或设置一个 32 位无符号整数，将这条评论记录 标识为指定公共数据。值 0x43494447，即 ASCII 字符串“CIDG”，将 标识为 EMR_COMMENT_PUBLIC 记录。 |
| [DataSize](../../aspose.imaging.fileformats.emf.emf.records/emfcommentrecordtype/datasize) { get; set; } | 获取或设置一个 32 位无符号整数，它指定 后面的 RecordBuffer 字段中的 CommentIdentifier 和 CommentRecordParm 字段的大小（以字节为单位）。如果 present 它不能包含自身的大小或 AlignmentPadding 字段的大小 |
| [FormatData](../../aspose.imaging.fileformats.emf.emf.records/emfcommentmultiformats/formatdata) { get; set; } | 获取或设置此记录中包含的所有图形格式 的可变长度图像数据字节数组。 每个图像的数据大小由对应的 EmrFormat 对象中的 DataSize 字段提供。因此，该字段的总大小是所有 EmrFormat 对象中 DataSize 值的总和。 每个图像的数据的图形格式由 对应的EmrFormat对象中的Signature字段指定。 |
| [OutputRect](../../aspose.imaging.fileformats.emf.emf.records/emfcommentmultiformats/outputrect) { get; set; } | 获取或设置一个 WMF RectL 对象（[MS-WMF] 第 2.2.2.19 节），它以逻辑坐标指定 输出矩形。 |
| [PublicCommentIdentifier](../../aspose.imaging.fileformats.emf.emf.records/emfcommentpublicrecordtype/publiccommentidentifier) { get; set; } | 获取或设置一个 32 位无符号整数，用于标识 公共评论记录的类型。这应该是上表中列出的值之一，其中 在 EmrComment 枚举（第 2.1.10 节）中指定，除非在打印服务器上实现了额外的公共 评论记录类型。 |
| [Size](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/size) { get; set; } | 获取或设置记录的大小 |
| [Type](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/type) { get; set; } | 获取或设置类型。 |

### 也可以看看

* class [EmfCommentPublicRecordType](../emfcommentpublicrecordtype)
* 命名空间 [Aspose.Imaging.FileFormats.Emf.Emf.Records](../../aspose.imaging.fileformats.emf.emf.records)
* 部件 [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
