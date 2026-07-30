---
title: "MultiLanguageString"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示多语言字符串。"
type: docs
weight: 66
url: /zh/java/com.aspose.font/multilanguagestring/
---
**Inheritance:**
java.lang.Object
```
public class MultiLanguageString
```

表示多语言字符串。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [MultiLanguageString()](#MultiLanguageString--) | 创建空的多语言字符串。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [addLanguageString(String str, int languageId)](#addLanguageString-java.lang.String-int-) | 添加特定语言的字符串 |
| [containsString(String str)](#containsString-java.lang.String-) | 如果该字符串出现在所有语言字符串中，则返回 true。 |
| [equals(Object objToCompare)](#equals-java.lang.Object-) | 如果对象被视为相等，则返回 true。 |
| [getAllLanguageIds()](#getAllLanguageIds--) | 获取所有字符串的语言标识符，如果没有字符串则返回空数组。 |
| [getAllStrings()](#getAllStrings--) | 返回所有语言的所有字符串。 |
| [getClass()](#getClass--) |  |
| [getEnglishString()](#getEnglishString--) | 如果找到，则返回英文字符串。 |
| [getStringForLanguageId(int languageId)](#getStringForLanguageId-int-) | 如果找到，返回与提供的语言标识符对应的字符串。 |
| [hashCode()](#hashCode--) | GetHashCode 实现。 |
| [isEmpty()](#isEmpty--) | 如果 MultiLanguageString 没有任何语言的字符串，则为 true。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(MultiLanguageString obj1, String obj2)](#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-) | 相等运算符实现。 |
| [op_Equality(String obj1, MultiLanguageString obj2)](#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-) | 相等运算符实现。 |
| [op_Inequality(MultiLanguageString obj1, String obj2)](#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-) | 不等运算符实现。 |
| [op_Inequality(String obj1, MultiLanguageString obj2)](#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-) | 不等运算符实现。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MultiLanguageString() {#MultiLanguageString--}
```
public MultiLanguageString()
```


创建空的多语言字符串。

### addLanguageString(String str, int languageId) {#addLanguageString-java.lang.String-int-}
```
public void addLanguageString(String str, int languageId)
```


添加特定语言的字符串

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | java.lang.String | 要添加的字符串 |
| languageId | int | 语言标识符 |

### containsString(String str) {#containsString-java.lang.String-}
```
public boolean containsString(String str)
```


如果该字符串出现在所有语言字符串中，则返回 true。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | java.lang.String | 要检查的字符串。 |

**Returns:**
布尔值 - 如果该字符串出现在所有语言字符串中，则为 True。
### equals(Object objToCompare) {#equals-java.lang.Object-}
```
public boolean equals(Object objToCompare)
```


如果对象被视为相等，则返回 true。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| objToCompare | java.lang.Object | 用于比较的对象 |

**Returns:**
boolean - 比较结果
### getAllLanguageIds() {#getAllLanguageIds--}
```
public int[] getAllLanguageIds()
```


获取所有字符串的语言标识符，如果没有字符串则返回空数组。

**Returns:**
int[] - 包含语言标识符的数组，如果没有字符串则为空数组。
### getAllStrings() {#getAllStrings--}
```
public String[] getAllStrings()
```


返回所有语言的所有字符串。

**Returns:**
java.lang.String[] - 所有语言的所有字符串数组。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEnglishString() {#getEnglishString--}
```
public String getEnglishString()
```


如果找到则返回英文字符串。否则返回第一个非英文字符串。

**Returns:**
java.lang.String - 如果找到则返回英文字符串，否则返回第一个非英文字符串。
### getStringForLanguageId(int languageId) {#getStringForLanguageId-int-}
```
public String getStringForLanguageId(int languageId)
```


如果找到则返回与传入的语言标识符相关的字符串，否则返回空字符串。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| languageId | int | 语言标识符。 |

**Returns:**
java.lang.String - 与传入的语言标识符相关的字符串，如果找到则返回，否则返回空字符串。
### hashCode() {#hashCode--}
```
public int hashCode()
```


GetHashCode 实现。

**Returns:**
int - 对象的哈希码
### isEmpty() {#isEmpty--}
```
public boolean isEmpty()
```


如果 MultiLanguageString 没有任何语言的字符串，则为 true。

**Returns:**
boolean - 如果 MultiLanguageString 没有语言字符串，则为 True。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(MultiLanguageString obj1, String obj2) {#op-Equality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Equality(MultiLanguageString obj1, String obj2)
```


相等运算符实现。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | 第一个要比较的对象 |
| obj2 | java.lang.String | 第二个要比较的对象 |

**Returns:**
boolean - 比较结果
### op_Equality(String obj1, MultiLanguageString obj2) {#op-Equality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Equality(String obj1, MultiLanguageString obj2)
```


相等运算符实现。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj1 | java.lang.String | 要比较的字符串 |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | 要比较的多语言字符串 |

**Returns:**
boolean - 比较结果
### op_Inequality(MultiLanguageString obj1, String obj2) {#op-Inequality-com.aspose.font.MultiLanguageString-java.lang.String-}
```
public static boolean op_Inequality(MultiLanguageString obj1, String obj2)
```


不等运算符实现。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj1 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | 要比较的字符串 |
| obj2 | java.lang.String | 要比较的多语言字符串 |

**Returns:**
boolean - 比较结果
### op_Inequality(String obj1, MultiLanguageString obj2) {#op-Inequality-java.lang.String-com.aspose.font.MultiLanguageString-}
```
public static boolean op_Inequality(String obj1, MultiLanguageString obj2)
```


不等运算符实现。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| obj1 | java.lang.String | 要比较的字符串 |
| obj2 | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | 要比较的多语言字符串 |

**Returns:**
boolean - 比较结果
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

