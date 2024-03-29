---
title: Graphics.EnumerateMetafileProc
second_title: Aspose.Drawing for .NET API 参考
description: 提供回调方法EnumerateMetafile./graphics/enumeratemetafile方法
type: docs
weight: 550
url: /zh/net/system.drawing/graphics.enumeratemetafileproc/
---
## Graphics.EnumerateMetafileProc delegate

提供回调方法[`EnumerateMetafile`](../graphics/enumeratemetafile)方法。

```csharp
public delegate bool EnumerateMetafileProc(EmfPlusRecordType recordType, int flags, int dataSize, 
    IntPtr data, PlayRecordCallback callbackData);
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| recordType | EmfPlusRecordType | 成员[`EmfPlusRecordType`](../../system.drawing.imaging/emfplusrecordtype)指定元文件记录类型的枚举。 |
| flags | Int32 | 一组指定记录属性的标志。 |
| dataSize | Int32 | 记录数据中的字节数。 |
| data | IntPtr | 指向包含记录数据的缓冲区的指针。 |
| callbackData | PlayRecordCallback | 不使用该参数。 |

### 返回值

如果要继续枚举记录，则返回 true；否则为假。

### 也可以看看

* enum [EmfPlusRecordType](../../system.drawing.imaging/emfplusrecordtype)
* delegate [PlayRecordCallback](../../system.drawing.imaging/playrecordcallback)
* class [Graphics](../graphics)
* 命名空间 [System.Drawing](../../system.drawing)
* 部件 [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
