---
title: "System::Runtime::InteropServices::Marshal 类"
linktitle: "Marshal"
second_title: "Aspose.Font 适用于 C++"
description: "System::Runtime::InteropServices::Marshal 类。提供编组实现。仅用于与已翻译代码的兼容性，因为 C++ 端不支持托管代码。这是一个没有实例服务的静态类型。绝不应在 C++ 中以任何方式创建其实例。"
type: docs
weight: 100
url: /zh/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


提供了封送实现。仅为兼容已翻译的代码而存在，因为 C++ 端不支持托管代码。这是一个没有实例服务的静态类型。任何情况下都不应创建其实例。

```cpp
class Marshal
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | 分配非托管内存。 |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | 分配非托管内存。 |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | 实现 public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) 语义。 |
| static [Copy](./copy/)(const void *, container\&&, int, int) | 实现 public static void Copy(IntPtr source, byte[] destination, int startIndex, int length) 语义。 |
| static [Copy](./copy/)(const container\&, int, void *, int) | 实现 public static void Copy(char[] source, int startIndex, IntPtr destination, int length)。 |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | 实现 public static void Copy(char[] source, int startIndex, IntPtr destination, int length)。 |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | 释放非托管内存。 |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | 从异常获取 HResult。 |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | 从非托管的零终止 UTF8 字符串创建受管的 [String](../../system/string/)。 |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | 从非托管 UTF8 字符串创建受管的 [String](../../system/string/)。 |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | 从非托管的零终止字符串创建受管的 [String](../../system/string/)。 |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | 从非托管字符串创建受管的 [String](../../system/string/)。 |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | 从非托管的零终止 Unicode 字符串创建受管的 [String](../../system/string/)。 |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | 从非托管 Unicode 字符串创建受管的 [String](../../system/string/)。 |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | 从非托管的零终止 UTF8 字符串创建受管的 [String](../../system/string/)。 |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | 从非托管 UTF8 字符串创建受管的 [String](../../system/string/)。 |
| static [ReadByte](./readbyte/)(IntPtr, int) | 从内存读取字节。 |
| static [ReadInt16](./readint16/)(IntPtr, int) | 从内存读取短整数。 |
| static [ReadInt32](./readint32/)(IntPtr, int) | 从内存读取整数。 |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | 将指定的安全字符串内容复制到非托管内存，并转换为 ANSI 格式。 |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | 将指定的安全字符串内容复制到非托管内存。 |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | 将指定字符串的内容复制到非托管内存。 |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | 将指定字符串的内容复制到非托管内存，如有需要则转换为 ANSI 格式。 |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | 将指定字符串的内容复制到非托管内存。 |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | 向内存写入字节。 |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | 向内存写入字节。 |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | 向内存写入短整数。 |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | 向内存写入整数。 |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | 将 long 写入内存。 |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | 释放使用 SecureStringToGlobalAllocAnsi 方法分配的非托管字符串指针。 |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | 释放使用 SecureStringToGlobalAllocUnicode 方法分配的非托管字符串指针。 |
## 另见

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Font for C++](../../)
