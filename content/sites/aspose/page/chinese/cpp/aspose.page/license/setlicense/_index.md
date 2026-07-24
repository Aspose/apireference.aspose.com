---
title: "Aspose::Page::License::SetLicense 方法"
linktitle: "SetLicense"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::License::SetLicense 方法。在 C++ 中为组件授权。"
type: docs
weight: 400
url: /zh/cpp/aspose.page/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


为组件授权。

```cpp
void Aspose::Page::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | System::SharedPtr\<System::IO::Stream\> | 一个包含许可证的流。 |
## 备注



使用此方法从流中加载许可证。

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## License::SetLicense(System::String) method


为组件授权。

```cpp
void Aspose::Page::License::SetLicense(System::String licenseName)
```

## 备注


尝试在以下位置查找许可证：

1. 明确路径。

<ms>

2. 组件程序集的文件夹。

3. 客户端调用程序集的文件夹。

4. 入口程序集的文件夹。

5. 客户端调用程序集中的嵌入资源。

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. 明确路径。

2. 客户端调用程序集中的嵌入资源。

</ms>

<java>

2. 组件 JAR 文件的文件夹。

</java>
## 另见

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
