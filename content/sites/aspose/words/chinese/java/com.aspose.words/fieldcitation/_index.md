---
title: FieldCitation
second_title: Aspose.Words for Java API 参考
description: 实现 CITATION 字段。
type: docs
weight: 168
url: /zh/java/com.aspose.words/fieldcitation/
---

**遗产：**
java.lang.Object, [com.aspose.words.Field](../../com.aspose.words/field)
```
public class FieldCitation extends Field
```

实现 CITATION 字段。

要了解更多信息，请访问**Working with Fields**文档文章。

插入的内容**Source**具有指定的元素**Tag**使用书目样式的元素。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAnotherSourceTag()](#getAnotherSourceTag--) | 获取一个计算的值**Tag**要包含在引文中的另一个来源的元素值。 |
| [getClass()](#getClass--) |  |
| [getDisplayResult()](#getDisplayResult--) | 获取表示显示的字段结果的文本。 |
| [getEnd()](#getEnd--) | 获取表示字段结束的节点。 |
| [getFieldCode()](#getFieldCode--) | 返回字段开始和字段分隔符之间的文本（如果没有分隔符，则返回字段结束）。 |
| [getFieldCode(boolean includeChildFieldCodes)](#getFieldCode-boolean-) | 返回字段开始和字段分隔符之间的文本（如果没有分隔符，则返回字段结束）。 |
| [getFormat()](#getFormat--) | 得到一个[FieldFormat](../../com.aspose.words/fieldformat)提供对字段格式的类型化访问的对象。 |
| [getFormatLanguageId()](#getFormatLanguageId--) | 获取与指定的书目样式结合使用以格式化文档中的引文的语言 ID。 |
| [getLocaleId()](#getLocaleId--) | 获取字段的 LCID。 |
| [getPageNumber()](#getPageNumber--) | 获取与引文关联的页码。 |
| [getPrefix()](#getPrefix--) | 获取引用前的前缀。 |
| [getResult()](#getResult--) | 获取字段分隔符和字段结尾之间的文本。 |
| [getSeparator()](#getSeparator--) | 获取表示字段分隔符的节点。 |
| [getSourceTag()](#getSourceTag--) | 获取一个计算的值**Tag**要插入的源元素的值。 |
| [getStart()](#getStart--) | 获取表示字段开始的节点。 |
| [getSuffix()](#getSuffix--) | 获取附加到引文的后缀。 |
| [getSuppressAuthor()](#getSuppressAuthor--) | 获取作者信息是否从引文中隐藏。 |
| [getSuppressTitle()](#getSuppressTitle--) | 获取是否从引文中隐藏标题信息。 |
| [getSuppressYear()](#getSuppressYear--) | 获取是否从引文中抑制年份信息。 |
| [getSwitchType(String switchName)](#getSwitchType-java.lang.String-) |  |
| [getType()](#getType--) | 获取 Microsoft Word 字段类型。 |
| [getVolumeNumber()](#getVolumeNumber--) | 获取与引文关联的卷号。 |
| [hashCode()](#hashCode--) |  |
| [isDirty()](#isDirty--) | 获取字段的当前结果是否由于对文档进行的其他修改而不再正确（陈旧）。 |
| [isDirty(boolean value)](#isDirty-boolean-) | 设置字段的当前结果是否由于对文档进行的其他修改而不再正确（陈旧）。 |
| [isLocked()](#isLocked--) | 获取字段是否已锁定（不应重新计算其结果）。 |
| [isLocked(boolean value)](#isLocked-boolean-) | 设置字段是否被锁定（不应重新计算其结果）。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove()](#remove--) | 从文档中删除字段。 |
| [setAnotherSourceTag(String value)](#setAnotherSourceTag-java.lang.String-) | 设置一个数学值**Tag**要包含在引文中的另一个来源的元素值。 |
| [setFormatLanguageId(String value)](#setFormatLanguageId-java.lang.String-) | 设置与指定书目样式结合使用的语言 ID，以格式化文档中的引文。 |
| [setLocaleId(int value)](#setLocaleId-int-) | 设置字段的 LCID。 |
| [setPageNumber(String value)](#setPageNumber-java.lang.String-) | 设置与引文关联的页码。 |
| [setPrefix(String value)](#setPrefix-java.lang.String-) | 设置附加到引文的前缀。 |
| [setResult(String value)](#setResult-java.lang.String-) | 设置字段分隔符和字段结尾之间的文本。 |
| [setSourceTag(String value)](#setSourceTag-java.lang.String-) | 设置一个数学值**Tag**要插入的源元素的值。 |
| [setSuffix(String value)](#setSuffix-java.lang.String-) | 设置附加到引文的后缀。 |
| [setSuppressAuthor(boolean value)](#setSuppressAuthor-boolean-) | 设置是否从引文中隐藏作者信息。 |
| [setSuppressTitle(boolean value)](#setSuppressTitle-boolean-) | 设置是否从引文中隐藏标题信息。 |
| [setSuppressYear(boolean value)](#setSuppressYear-boolean-) | 设置是否从引文中抑制年份信息。 |
| [setVolumeNumber(String value)](#setVolumeNumber-java.lang.String-) | 设置与引文关联的卷号。 |
| [toString()](#toString--) |  |
| [unlink()](#unlink--) | 执行字段取消链接。 |
| [update()](#update--) | 执行字段更新。 |
| [update(boolean ignoreMergeFormat)](#update-boolean-) | 执行字段更新。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**退货：**
布尔值
### getAnotherSourceTag() {#getAnotherSourceTag--}
```
public String getAnotherSourceTag()
```


获取一个计算的值**Tag**要包含在引文中的另一个来源的元素值。

**退货：**
java.lang.String - 一个计算**Tag**要包含在引文中的另一个来源的元素值。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**退货：**
java.lang.Class<?>
### getDisplayResult() {#getDisplayResult--}
```
public String getDisplayResult()
```


获取表示显示的字段结果的文本。这[Document.updateListLabels()](../../com.aspose.words/document\#updateListLabels--)必须调用方法以获得正确的值[FieldListNum](../../com.aspose.words/fieldlistnum), [FieldAutoNum](../../com.aspose.words/fieldautonum), [FieldAutoNumOut](../../com.aspose.words/fieldautonumout)和[FieldAutoNumLgl](../../com.aspose.words/fieldautonumlgl)字段。

**退货：**
java.lang.String - 表示显示字段结果的文本。
### getEnd() {#getEnd--}
```
public FieldEnd getEnd()
```


获取表示字段结束的节点。

**退货：**
[FieldEnd](../../com.aspose.words/fieldend) - 表示字段结束的节点。
### getFieldCode() {#getFieldCode--}
```
public String getFieldCode()
```


返回字段开始和字段分隔符之间的文本（如果没有分隔符，则返回字段结束）。包括子字段的字段代码和字段结果。

**退货：**
java.lang.字符串
### getFieldCode(boolean includeChildFieldCodes) {#getFieldCode-boolean-}
```
public String getFieldCode(boolean includeChildFieldCodes)
```


返回字段开始和字段分隔符之间的文本（如果没有分隔符，则返回字段结束）。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| includeChildFieldCodes | boolean | \{ 如果应包含子域代码则为真。 |

**退货：**
java.lang.字符串
### getFormat() {#getFormat--}
```
public FieldFormat getFormat()
```


得到一个[FieldFormat](../../com.aspose.words/fieldformat)提供对字段格式的类型化访问的对象。

**退货：**
[FieldFormat](../../com.aspose.words/fieldformat) - 一个[FieldFormat](../../com.aspose.words/fieldformat)提供对字段格式的类型化访问的对象。
### getFormatLanguageId() {#getFormatLanguageId--}
```
public String getFormatLanguageId()
```


获取与指定的书目样式结合使用以格式化文档中的引文的语言 ID。

**退货：**
java.lang.String - 与指定的书目样式结合使用以格式化文档中的引文的语言 ID。
### getLocaleId() {#getLocaleId--}
```
public int getLocaleId()
```


获取字段的 LCID。

**退货：**
int - 字段的 LCID。
### getPageNumber() {#getPageNumber--}
```
public String getPageNumber()
```


获取与引文关联的页码。

**退货：**
java.lang.String - 与引文关联的页码。
### getPrefix() {#getPrefix--}
```
public String getPrefix()
```


获取引用前的前缀。

**退货：**
java.lang.String - 引用前的前缀。
### getResult() {#getResult--}
```
public String getResult()
```


获取字段分隔符和字段结尾之间的文本。

**退货：**
java.lang.String - 字段分隔符和字段结尾之间的文本。
### getSeparator() {#getSeparator--}
```
public FieldSeparator getSeparator()
```


获取表示字段分隔符的节点。可以为空。

**退货：**
[FieldSeparator](../../com.aspose.words/fieldseparator) - 表示字段分隔符的节点。
### getSourceTag() {#getSourceTag--}
```
public String getSourceTag()
```


获取一个计算的值**Tag**要插入的源元素的值。

**退货：**
java.lang.String - 一个计算**Tag**要插入的源元素的值。
### getStart() {#getStart--}
```
public FieldStart getStart()
```


获取表示字段开始的节点。

**退货：**
[FieldStart](../../com.aspose.words/fieldstart) - 表示字段开始的节点。
### getSuffix() {#getSuffix--}
```
public String getSuffix()
```


获取附加到引文的后缀。

**退货：**
java.lang.String - 附加到引文的后缀。
### getSuppressAuthor() {#getSuppressAuthor--}
```
public boolean getSuppressAuthor()
```


获取作者信息是否从引文中隐藏。

**退货：**
boolean - 作者信息是否从引文中隐藏。
### getSuppressTitle() {#getSuppressTitle--}
```
public boolean getSuppressTitle()
```


获取是否从引文中隐藏标题信息。

**退货：**
boolean - 标题信息是否从引文中隐藏。
### getSuppressYear() {#getSuppressYear--}
```
public boolean getSuppressYear()
```


获取是否从引文中抑制年份信息。

**退货：**
boolean - 是否从引文中隐藏年份信息。
### getSwitchType(String switchName) {#getSwitchType-java.lang.String-}
```
public int getSwitchType(String switchName)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| switchName | java.lang.String |  |

**退货：**
整数
### getType() {#getType--}
```
public int getType()
```


获取 Microsoft Word 字段类型。

**退货：**
 int - Microsoft Word 字段类型。返回值是其中之一[FieldType](../../com.aspose.words/fieldtype)常数。
### getVolumeNumber() {#getVolumeNumber--}
```
public String getVolumeNumber()
```


获取与引文关联的卷号。

**退货：**
java.lang.String - 与引文关联的卷号。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**退货：**
整数
### isDirty() {#isDirty--}
```
public boolean isDirty()
```


获取字段的当前结果是否由于对文档进行的其他修改而不再正确（陈旧）。

**退货：**
布尔值 - 由于对文档进行的其他修改，该字段的当前结果是否不再正确（陈旧）。
### isDirty(boolean value) {#isDirty-boolean-}
```
public void isDirty(boolean value)
```


设置字段的当前结果是否由于对文档进行的其他修改而不再正确（陈旧）。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | boolean | 由于对文档进行的其他修改，字段的当前结果是否不再正确（陈旧）。 |

### isLocked() {#isLocked--}
```
public boolean isLocked()
```


获取字段是否已锁定（不应重新计算其结果）。

**退货：**
boolean - 该字段是否已锁定（不应重新计算其结果）。
### isLocked(boolean value) {#isLocked-boolean-}
```
public void isLocked(boolean value)
```


设置字段是否被锁定（不应重新计算其结果）。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | boolean | 该字段是否已锁定（不应重新计算其结果）。 |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove() {#remove--}
```
public Node remove()
```


从文档中删除字段。返回字段之后的节点。如果字段的末尾是其父节点的最后一个子节点，则返回其父段落。如果该字段已被删除，则返回**null**.

**退货：**
[Node](../../com.aspose.words/node)
### setAnotherSourceTag(String value) {#setAnotherSourceTag-java.lang.String-}
```
public void setAnotherSourceTag(String value)
```


设置一个数学值**Tag**要包含在引文中的另一个来源的元素值。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.String | 一个计算的值**Tag**要包含在引文中的另一个来源的元素值。 |

### setFormatLanguageId(String value) {#setFormatLanguageId-java.lang.String-}
```
public void setFormatLanguageId(String value)
```


设置与指定书目样式结合使用的语言 ID，以格式化文档中的引文。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.String | 与指定的书目样式结合使用以格式化文档中的引文的语言 ID。 |

### setLocaleId(int value) {#setLocaleId-int-}
```
public void setLocaleId(int value)
```


设置字段的 LCID。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | int | 字段的 LCID。 |

### setPageNumber(String value) {#setPageNumber-java.lang.String-}
```
public void setPageNumber(String value)
```


设置与引文关联的页码。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.String | 与引文关联的页码。 |

### setPrefix(String value) {#setPrefix-java.lang.String-}
```
public void setPrefix(String value)
```


设置附加到引文的前缀。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.String | 引文前的前缀。 |

### setResult(String value) {#setResult-java.lang.String-}
```
public void setResult(String value)
```


设置字段分隔符和字段结尾之间的文本。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.String | 字段分隔符和字段结尾之间的文本。 |

### setSourceTag(String value) {#setSourceTag-java.lang.String-}
```
public void setSourceTag(String value)
```


设置一个数学值**Tag**要插入的源元素的值。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.String | 一个计算的值**Tag**要插入的源元素的值。 |

### setSuffix(String value) {#setSuffix-java.lang.String-}
```
public void setSuffix(String value)
```


设置附加到引文的后缀。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.String | 附加到引文的后缀。 |

### setSuppressAuthor(boolean value) {#setSuppressAuthor-boolean-}
```
public void setSuppressAuthor(boolean value)
```


设置是否从引文中隐藏作者信息。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | boolean | 作者信息是否从引文中隐藏。 |

### setSuppressTitle(boolean value) {#setSuppressTitle-boolean-}
```
public void setSuppressTitle(boolean value)
```


设置是否从引文中隐藏标题信息。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | boolean | 是否从引文中隐藏标题信息。 |

### setSuppressYear(boolean value) {#setSuppressYear-boolean-}
```
public void setSuppressYear(boolean value)
```


设置是否从引文中抑制年份信息。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | boolean | 年份信息是否从引文中隐藏。 |

### setVolumeNumber(String value) {#setVolumeNumber-java.lang.String-}
```
public void setVolumeNumber(String value)
```


设置与引文关联的卷号。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.String | 与引文相关的卷号。 |

### toString() {#toString--}
```
public String toString()
```




**退货：**
java.lang.字符串
### unlink() {#unlink--}
```
public boolean unlink()
```


执行字段取消链接。

用其最新结果替换该字段。

某些字段，例如 XE（索引条目）字段和 SEQ（序列）字段，无法取消链接。

**退货：**
布尔值 -\{ 如果字段已取消链接，则为真，否则为假。
### update() {#update--}
```
public void update()
```


执行字段更新。如果该字段已被更新，则抛出。

### update(boolean ignoreMergeFormat) {#update-boolean-}
```
public void update(boolean ignoreMergeFormat)
```


执行字段更新。如果该字段已被更新，则抛出。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| ignoreMergeFormat | boolean | 如果为 true，则放弃直接字段结果格式化，无论 MERGEFORMAT 开关如何，否则执行正常更新。 |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |
