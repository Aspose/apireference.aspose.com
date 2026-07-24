---
title: "System::Runtime::InteropServices::Marshal::PtrToStringAnsi 方法"
linktitle: "PtrToStringAnsi"
second_title: "Aspose.Page 适用于 C++"
description: "System::Runtime::InteropServices::Marshal::PtrToStringAnsi 方法。从 C++ 中的非托管零终止 UTF8 字符串创建托管 String。"
type: docs
weight: 500
url: /zh/cpp/system.runtime.interopservices/marshal/ptrtostringansi/
---
## Marshal::PtrToStringAnsi(IntPtr) method


创建一个受管的 [String](../../../system/string/)，来自未托管的零终止 UTF8 字符串。

```cpp
static String System::Runtime::InteropServices::Marshal::PtrToStringAnsi(IntPtr ptr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ptr | IntPtr | 指向非托管字符串的指针。 |

### ReturnValue

受管的字符串。

## 另见

* Class [String](../../../system/string/)
* Class [Marshal](../)
* Namespace [System::Runtime::InteropServices](../../)
* Library [Aspose.Page for C++](../../../)
## Marshal::PtrToStringAnsi(IntPtr, int) method


创建一个受管的 [String](../../../system/string/)，来自未托管的 UTF8 字符串。

```cpp
static String System::Runtime::InteropServices::Marshal::PtrToStringAnsi(IntPtr ptr, int length)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| ptr | IntPtr | 指向非托管字符串的指针。 |
| length | int | 未受管的字符串的长度。 |

### ReturnValue

受管的字符串。

## 另见

* Class [String](../../../system/string/)
* Class [Marshal](../)
* Namespace [System::Runtime::InteropServices](../../)
* Library [Aspose.Page for C++](../../../)
