---
title: "PdfSaveOptions"
second_title: "Aspose.Page for Java API 参考"
description: "用于 XPS-as-PDF 保存选项的类。"
type: docs
weight: 14
url: /zh/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

用于 XPS-as-PDF 保存选项的类。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | 创建选项的新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | 返回转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [getBatchSize()](#getBatchSize--) | 返回从节点到节点传递的一部分页面的大小。 |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | 返回在 XPS 页面保存之前执行修改的事件处理程序集合。 |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 获取标志，指示是否需要将非 TrueType 字体保存为 TTF。 |
| [getEncryptionDetails()](#getEncryptionDetails--) | 返回加密详细信息。 |
| [getExceptions()](#getExceptions--) | 返回非关键错误的列表。 |
| [getImageCompression()](#getImageCompression--) | 返回文档中所有图像使用的压缩类型。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 返回指定图像压缩级别的值。 |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | 获取在查看器中打开 PDF 文件时文档大纲应展开的层级。1 - 仅显示第一层大纲项，2 - 仅显示第一层和第二层大纲项，依此类推。 |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | 获取要保存的文档大纲树的深度。0 - 大纲树将不被转换，1 - 仅转换第一层大纲项，依此类推。 |
| [getPageNumbers()](#getPageNumbers--) | 获取要渲染的页面编号数组。 |
| [getSize()](#getSize--) | 获取页面或图像的大小。 |
| [getTextCompression()](#getTextCompression--) | 返回除图像外所有内容流使用的压缩类型。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 获取在转换期间允许输出警告和消息的标志。 |
| [isSupressErrors()](#isSupressErrors--) | 返回指示在转换期间是否会抑制错误的值。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | 在 XPS 中，某些文本元素可能包含与字体中任何字符代码不对应的替代字形形式的引用。 |
| [preserveText(boolean value)](#preserveText-boolean-) | 在 XPS 中，某些文本元素可能包含与字体中任何字符代码不对应的替代字形形式的引用。 |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | 指定转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [setBatchSize(int value)](#setBatchSize-int-) | 设置从节点到节点传递的一部分页面的大小。 |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 指定是否将非 TrueType 字体保存为 TTF。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 指定在转换期间允许输出警告和消息的标志。 |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | 设置加密详细信息。 |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | 设置文档中所有图像使用的压缩类型。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 设置指定图像压缩级别的值。 |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | 设置在查看器中打开 PDF 文件时文档大纲应展开的层级。1 - 仅显示第一层大纲项，2 - 仅显示第一层和第二层大纲项，依此类推。 |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | 设置要保存的文档大纲树的深度。0 - 大纲树将不被转换，1 - 仅转换第一层大纲项，依此类推。 |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | 设置要渲染的页面编号数组。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 指定页面或图像的大小。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 指定指示在转换期间是否抑制错误的标志。 |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | 设置除图像外所有内容流使用的压缩类型。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


创建选项的新实例。

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


返回转换器应在其中为输入文档查找字体的附加字体文件夹。默认文件夹是操作系统用于内部需求的标准字体文件夹。

**Returns:**
java.lang.String[] - 字体文件夹数组。
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


返回从节点到节点传递的一部分页面的大小。

**Returns:**
int - 从节点到节点传递的一部分页面的大小。
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


返回在 XPS 页面保存之前执行修改的事件处理程序集合。

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - 在 XPS 页面保存前执行修改的事件处理程序集合。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


获取标志，指示是否需要将非 TrueType 字体保存为 TTF。

**Returns:**
boolean - 标志值。
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


返回加密详细信息。如果未设置，则不会执行加密。

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


返回非关键错误的列表。

**Returns:**
java.util.List<java.lang.Exception> - 异常列表
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


返回文档中所有图像使用的压缩类型。默认是 PdfImageCompression.Auto 。

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


返回指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Returns:**
int - 指定图像压缩级别的值。
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


获取在查看器中打开 PDF 文件时文档大纲应展开的层级。1 - 仅显示第一层大纲项，2 - 仅显示第一层和第二层大纲项，依此类推。

**Returns:**
int - 大纲树展开级别。
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


获取要保存的文档大纲树的高度。0 - 大纲树将不被转换，1 - 仅转换第一层大纲项，依此类推。默认是 10。

**Returns:**
int - 大纲树高度。
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


获取要渲染的页面编号数组。

**Returns:**
int[] - 页面数量。
### getSize() {#getSize--}
```
public Dimension getSize()
```


获取页面或图像的大小。

**Returns:**
java.awt.Dimension - 页面或图像的尺寸。
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


返回除图像外所有内容流使用的压缩类型。默认是 PdfTextCompression.Flate 。

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


获取在转换期间允许输出警告和消息的标志。

**Returns:**
boolean - 调试值。
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


返回指示在转换期间是否会抑制错误的值。

**Returns:**
boolean - 布尔值
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


在 XPS 中，某些文本元素可能包含指向替代字形形式的引用，这些字形在字体中没有对应的字符代码。如果此标志设置为 true，则此类 XPS 元素的文本会被转换为图形形状。然后文本本身会以透明方式显示在上方。这使得这些元素的文本仍然可选中。但副作用是输出文件可能会比原始文件大得多。如果此标志设置为 false，则应显示为替代形式的字符会被替换为其他字符，这些字符会映射到替代字形形式。因此，文本虽然仍可选中，但会被修改，可能变得难以阅读。

**Returns:**
boolean - 标志值。
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


在 XPS 中，某些文本元素可能包含指向替代字形形式的引用，这些字形在字体中没有对应的字符代码。如果此标志设置为 true，则此类 XPS 元素的文本会被转换为图形形状。然后文本本身会以透明方式显示在上方。这使得这些元素的文本仍然可选中。但副作用是输出文件可能会比原始文件大得多。如果此标志设置为 false，则应显示为替代形式的字符会被替换为其他字符，这些字符会映射到替代字形形式。因此，文本虽然仍可选中，但会被修改，可能变得难以阅读。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | boolean | 标志值。 |

### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


指定转换器应在其中为输入文档查找字体的附加字体文件夹。默认文件夹是操作系统用于内部需求的标准字体文件夹。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | 字体文件夹数组。 |

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


设置从节点到节点传递的一部分页面的大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 从节点到节点传递的页面部分的大小。 |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


指定是否将非 TrueType 字体保存为 TTF。这会显著减小 PS 转 PDF 转换后生成的文档体积，并提升将包含大量非 TrueType 字体文本的 PS 文件转换为任何输出格式的速度。然而，在将 PostSctipt 文件转换为图像时会出现轻微的垂直文字位移。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | boolean | 标志值。 |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


指定在转换期间允许输出警告和消息的标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| debug | boolean | 布尔值。 |

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


设置加密细节。如果未设置，则不会执行加密。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | 加密细节。 |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


设置文档中所有图像使用的压缩类型。默认是 PdfImageCompression.Auto 。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | 压缩类型。 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


设置指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 指定图像压缩级别的值。 |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


设置在查看器中打开 PDF 文件时文档大纲应展开的层级。1 - 仅显示第一层大纲项，2 - 仅显示第一层和第二层大纲项，依此类推。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 大纲树展开级别。 |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


设置要保存的文档大纲树的深度。0 - 大纲树将不被转换，1 - 仅转换第一层大纲项，依此类推。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 大纲树高度。 |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


设置要渲染的页面编号数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int[] | 页面数量。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


指定页面或图像的大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 页面或图像的尺寸。 |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


指定指示在转换期间是否抑制错误的标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| supressErrors | boolean | 布尔值。 |

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


设置除图像外所有内容流使用的压缩类型。默认是 PdfTextCompression.Flate 。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | 压缩类型。 |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

