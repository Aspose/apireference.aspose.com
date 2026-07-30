---
title: "Aspose::Font::License::SetLicense 方法"
linktitle: "SetLicense"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::License::SetLicense 方法。对组件进行授权（在 C++ 中）。"
type: docs
weight: 400
url: /zh/cpp/aspose.font/license/setlicense/
---
## License::SetLicense(System::SharedPtr\<System::IO::Stream\>) method


为组件授权。

```cpp
void Aspose::Font::License::SetLicense(System::SharedPtr<System::IO::Stream> stream)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | System::SharedPtr\<System::IO::Stream\> | 包含许可证的流。 |
## 备注



使用此方法从流中加载许可证。

<javaName>void setLicense(java.io.InputStream stream)</javaName>
## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## License::SetLicense(System::String) method


为组件授权。

```cpp
void Aspose::Font::License::SetLicense(System::String licenseName)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| licenseName | System::String | 可以是完整或简短的文件名<ms> 或嵌入式资源的名称</ms>。使用空字符串切换到评估模式。 |
## 备注


尝试在以下位置查找许可证：

1. 明确的路径。

<ms>

2. 包含 **Aspose** 组件程序集的文件夹。

3. 包含客户端调用程序集的文件夹。

4. 包含入口（启动）程序集的文件夹。

5. 客户端调用程序集中的嵌入式资源。

**Note:**On the .NET Compact Framework, tries to find the license only in these locations:

1. 明确的路径。

2. 客户端调用程序集中的嵌入式资源。

</ms>

<java>

2. 包含 **Aspose** 组件 JAR 文件的文件夹。

3. 包含客户端调用 JAR 文件的文件夹。

</java>

## 另见

* Class [String](../../../system/string/)
* Class [License](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
