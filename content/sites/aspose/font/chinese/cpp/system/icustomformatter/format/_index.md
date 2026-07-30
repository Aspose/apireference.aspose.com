---
title: "System::ICustomFormatter::Format 方法"
linktitle: "格式"
second_title: "Aspose.Font 适用于 C++"
description: "System::ICustomFormatter::Format 方法。返回使用指定格式在 C++ 中对当前对象表示的值的字符串表示形式。"
type: docs
weight: 100
url: /zh/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


返回使用指定格式的当前对象表示的值的字符串表示。

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 格式 | System::String | 字符串格式 |
| arg | System::SharedPtr\<System::Object\> | 待格式化的对象 |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | 提供格式化信息的对象 |

### ReturnValue

根据 **format** 和 **formatProvider** 指定的格式对 **arg** 进行格式化后的字符串表示形式

## 另见

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
