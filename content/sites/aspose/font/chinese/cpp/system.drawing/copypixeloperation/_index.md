---
title: "System::Drawing::CopyPixelOperation 枚举"
linktitle: "CopyPixelOperation"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::CopyPixelOperation 枚举。指定在像素复制操作中，源颜色如何与目标颜色组合以在 C++ 中产生最终颜色。"
type: docs
weight: 3000
url: /zh/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


指定像素复制操作中源颜色如何与目标颜色合并，以产生最终颜色。

```cpp
enum class CopyPixelOperation
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| NoMirrorBitmap | n/a | 该位图未被镜像。 |
| Blackness | 66 | 目标区域使用物理调色板中索引为 0 的颜色填充。 |
| NotSourceErase | 1114278 | 源颜色和目标颜色进行 OR 运算，随后得到的颜色被取反。 |
| NotSourceCopy | 3342344 | 源区域被取反后复制到目标区域。 |
| SourceErase | 4457256 | 目标区域的反转颜色与源区域的颜色进行 AND 运算。 |
| DestinationInvert | 5570569 | 目标区域已被反转。 |
| PatInvert | 5898313 | 在目标设备上下文中当前选中的画笔颜色与目标颜色进行 XOR 运算。 |
| SourceInvert | 6684742 | 源区域和目标区域的颜色进行 XOR 运算。 |
| SourceAnd | 8913094 | 源区域和目标区域的颜色进行 AND 运算。 |
| MergePaint | 12255782 | 反转的源区域颜色与目标区域颜色进行 OR 运算。 |
| MergeCopy | 12583114 | 源区域的颜色与目标设备上下文中选定画笔的颜色进行 AND 运算。 |
| SourceCopy | 13369376 | 源区域直接复制到目标区域。 |
| SourcePaint | 15597702 | 源区域和目标区域的颜色进行 OR 运算。 |
| PatCopy | 15728673 | 当前在目标设备上下文中选中的画笔被复制到目标位图。 |
| PatPaint | 16452105 | 当前在目标设备上下文中选中的画笔的颜色与反转源区域的颜色进行按位或运算。该操作的结果再与目标区域的颜色进行按位或运算。 |
| Whiteness | 16711778 | 目标区域使用物理调色板中索引为 1 的颜色进行填充。 |
| CaptureBlt | 1073741824 | 位于应用程序窗口之上层叠的 [Windows](../../system.windows/) 包含在生成的图像中。 |

## 另见

* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
