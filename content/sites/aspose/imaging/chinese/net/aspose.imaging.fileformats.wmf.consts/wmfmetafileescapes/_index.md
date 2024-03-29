---
title: WmfMetafileEscapes
second_title: Aspose.Imaging for .NET API 参考
description: MetafileEscapes 枚举指定打印机驱动程序功能 可能无法通过 RecordType 枚举第 2.1.1.1 节中定义的 WMF 记录直接访问
type: docs
weight: 8230
url: /zh/net/aspose.imaging.fileformats.wmf.consts/wmfmetafileescapes/
---
## WmfMetafileEscapes enumeration

MetafileEscapes 枚举指定打印机驱动程序功能， 可能无法通过 RecordType 枚举（第 2.1.1.1 节）中定义的 WMF 记录直接访问。

```csharp
public enum WmfMetafileEscapes
```

### 价值观

| 姓名 | 价值 | 描述 |
| --- | --- | --- |
| Newframe | `1` | 通知打印机驱动程序应用程序已完成对页面的写入。 |
| Abortdoc | `2` | 停止处理当前文档。 |
| Nextband | `3` | 通知打印机驱动程序应用程序已完成对波段的写入。 |
| Setcolortable | `4` | 设置色表值。 |
| Getcolortable | `5` | 获取颜色表值。 |
| Flushout | `6` | 使所有挂起的输出刷新到输出设备。 |
| Draftmode | `7` | 表示打印机驱动程序应该只打印文本，不打印图形。 |
| Queryescsupport | `8` | 查询打印机驱动程序以确定其驱动的输出设备是否支持特定的转义函数 。 |
| Setabortproc | `9` | 设置允许在打印期间取消打印作业的应用程序定义函数 。 |
| Startdoc | `10` | 通知打印机驱动程序新的打印作业正在开始。 |
| Enddoc | `11` | 通知打印机驱动程序当前打印作业正在结束。 |
| Getphyspagesize | `12` | 检索当前在输出设备上选择的物理页面大小。 |
| Getprintingoffset | `13` | 检索物理页左上角的偏移量 实际打印或绘图开始的位置。 |
| Getscalingfactor | `14` | 检索打印机 x 轴和 y 轴的比例因子。 |
| MetaEscapeEnhancedMetafile | `15` | 用于在 WMF 元文件中嵌入增强型元文件格式 (EMF) 元文件。 |
| Setpenwidth | `16` | 以像素为单位设置笔的宽度。 |
| Setcopycount | `17` | 设置份数。 |
| Setpapersource | `18` | 设置源，例如打印机上的特定纸盘或纸盒，用于 输出表单。 |
| Passthrough | `19` | 这条记录通过任意数据。 |
| Gettechnology | `20` | 获取有关 a 设备支持的图形技术的信息。 |
| Setlinecap | `21` | 指定在输出到设备时使用的画线模式。 |
| Setlinejoin | `22` | 指定在输出到设备时使用的线连接模式。 |
| Setmiterlimit | `23` | 设置用于输出到设备的斜接连接长度限制。 |
| Bandinfo | `24` | 检索或指定与设备上的波段相关的设置，例如 波段数。 |
| Drawpatternrect | `25` | 用定义的图案绘制一个矩形。 |
| Getvectorpensize | `26` | 检索当前在设备上定义的物理笔大小。 |
| Getvectorbrushsize | `27` | 检索当前在设备上定义的物理画笔大小。 |
| Enableduplex | `28` | 在设备上启用或禁用双面（双面）打印。 |
| Getsetpaperbins | `29` | 检索或指定设备上输出表单的来源。 |
| Getsetprintorient | `30` | 检索或指定设备上的纸张方向。 |
| Enumpaperbins | `31` | 检索有关 an 输出设备上不同表单来源的信息。 |
| Setdibscaling | `32` | 指定与设备无关的位图 (DIB) 的缩放比例。 |
| Epsprinting | `33` | 表示封装 PostScript (EPS) 部分的开始和结束。 |
| Enumpapermetrics | `34` | 查询打印机驱动程序的纸张尺寸和其他表格数据。 |
| Getsetpapermetrics | `35` | 检索或指定 an 输出设备上的纸张尺寸和其他表格数据。 |
| PostscriptData | `37` | 将任意 PostScript 数据发送到输出设备。 |
| PostscriptIgnore | `38` | 通知输出设备忽略 PostScript 数据。 |
| Getdeviceunits | `42` | 获取当前在输出设备上配置的设备单元。 |
| Getextendedtextmetrics | `256` | 获取当前在 output 设备上配置的扩展文本指标。 |
| Getpairkerntable | `258` | 获取当前在输出设备上定义的字体紧缩表。 |
| Exttextout | `512` | 使用当前选择的字体、背景颜色和文本颜色绘制文本。 |
| Getfacename | `513` | 获取设备上当前配置的字体名称。 |
| Downloadface | `514` | 在设备上设置字体名称。 |
| MetafileDriver | `2049` | 查询打印机驱动程序是否支持输出 设备上的元文件。 |
| Querydibsupport | `3073` | 查询打印机驱动程序是否支持输出设备上的 DIB。 |
| BeginPath | `4096` | 打开一个路径。 |
| ClipToPath | `4097` | 定义以路径为边界的剪辑区域。输入必须是一个 16 位的 数量，用于定义要采取的操作。 |
| EndPath | `4098` | 结束路径。 |
| OpenChannel | `4110` | 与指定的 STARTDOC 相同，使用 NULL 文档和 output 文件名、原始模式下的数据和零类型。 |
| Downloadheader | `4111` | 指示打印机驱动程序下载 PostScript 程序集。 |
| CloseChannel | `4112` | 与 ENDDOC 相同。见 OPEN_CHANNEL. |
| PostscriptPassthrough | `4115` | 将任意数据直接发送到打印机驱动程序， 预计仅在 PostScript 模式下处理此数据。PostscriptIdentify . |
| EncapsulatedPostscript | `4116` | 将任意数据直接发送到打印机驱动程序。 |
| PostscriptIdentify | `4117` | 将打印机驱动程序设置为 PostScript 或 GDI 模式。 |
| PostscriptInjection | `4118` | 将原始数据块插入 PostScript 流。 input 必须是一个 32 位的数量，指定要注入的字节数，一个 16 位的数量 指定注入点，一个 16 位的数量，指定页码，后跟 要注入的字节数。 |
| Checkjpegformat | `4119` | 检查打印机是否支持 JPEG 图像。 |
| Checkpngformat | `4120` | 检查打印机是否支持 PNG 图像。 |
| GetPsFeaturesetting | `4121` | 获取有关 PostScript 打印机驱动程序的指定功能设置的信息。 |
| MxdcEscape | `4122` | 使应用程序能够以 XML Paper 规范 (XPS) 格式将文档写入文件或打印机。 |
| Spclpassthrough2 | `4568` | 使应用程序能够在文档中包含私有过程和其他任意 数据。 |

### 也可以看看

* 命名空间 [Aspose.Imaging.FileFormats.Wmf.Consts](../../aspose.imaging.fileformats.wmf.consts)
* 部件 [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
