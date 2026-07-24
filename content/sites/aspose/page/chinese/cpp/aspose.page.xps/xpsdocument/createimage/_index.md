---
title: "Aspose::Page::XPS::XpsDocument::CreateImage method"
linktitle: "CreateImage"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreateImage 方法。在 C++ 中从流创建新的图像资源。"
type: docs
weight: 1700
url: /zh/cpp/aspose.page.xps/xpsdocument/createimage/
---
## XpsDocument::CreateImage(System::SharedPtr\<System::IO::Stream\>) method


从 *stream* 创建一个新的图像资源。

```cpp
System::SharedPtr<XpsModel::XpsImage> Aspose::Page::XPS::XpsDocument::CreateImage(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | System::SharedPtr\<System::IO::Stream\> | 包含要作为资源的图像的流。 |

### ReturnValue

新的图像资源。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImage(System::String) method


从位于 *imagePath* 的图像文件创建一个新的图像资源。

```cpp
System::SharedPtr<XpsModel::XpsImage> Aspose::Page::XPS::XpsDocument::CreateImage(System::String imagePath)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| imagePath | System::String | 作为资源的图像路径。 |

### ReturnValue

新的图像资源。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
