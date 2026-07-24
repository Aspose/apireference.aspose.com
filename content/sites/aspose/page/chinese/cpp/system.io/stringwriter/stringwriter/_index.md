---
title: "System::IO::StringWriter::StringWriter 构造函数"
linktitle: "StringWriter"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::StringWriter::StringWriter 构造函数。使用当前区域性中的 IFormatProvider 在 C++ 中构造一个新的 StringWriter 实例。"
type: docs
weight: 100
url: /zh/cpp/system.io/stringwriter/stringwriter/
---
## StringWriter::StringWriter() constructor


使用来自当前区域性的 [IFormatProvider](../../../system/iformatprovider/) 构造一个新的 [StringWriter](../) 实例。

```cpp
System::IO::StringWriter::StringWriter()
```

## 另见

* Class [StringWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringWriter::StringWriter(const IFormatProviderPtr\&) constructor


使用指定的[IFormatProvider](../../../system/iformatprovider/)构造一个[StringWriter](../)的新实例。

```cpp
System::IO::StringWriter::StringWriter(const IFormatProviderPtr &formatProvider)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| formatProvider | const IFormatProviderPtr\& | 一个将在被构造的对象中使用的[IFormatProvider](../../../system/iformatprovider/)对象 |

## 另见

* Typedef [IFormatProviderPtr](../../../system/iformatproviderptr/)
* Class [StringWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringWriter::StringWriter(const System::SharedPtr\<Text::StringBuilder\>\&) constructor


使用当前区域设置中的指定StringBuilder和[IFormatProvider](../../../system/iformatprovider/)构造一个[StringWriter](../)的新实例。

```cpp
System::IO::StringWriter::StringWriter(const System::SharedPtr<Text::StringBuilder> &sb)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| sb | const System::SharedPtr\<Text::StringBuilder\>\& | 将在被构造的[StringWriter](../)中使用的StringBuilder对象 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [StringWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringWriter::StringWriter(const System::SharedPtr\<Text::StringBuilder\>\&, const IFormatProviderPtr\&) constructor


使用指定的StringBuilder和[IFormatProvider](../../../system/iformatprovider/)构造一个[StringWriter](../)的新实例。

```cpp
System::IO::StringWriter::StringWriter(const System::SharedPtr<Text::StringBuilder> &sb, const IFormatProviderPtr &formatProvider)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| sb | const System::SharedPtr\<Text::StringBuilder\>\& | 将在被构造的[StringWriter](../)中使用的StringBuilder对象 |
| formatProvider | const IFormatProviderPtr\& | 一个将在被构造的对象中使用的[IFormatProvider](../../../system/iformatprovider/)对象 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Typedef [IFormatProviderPtr](../../../system/iformatproviderptr/)
* Class [StringWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
