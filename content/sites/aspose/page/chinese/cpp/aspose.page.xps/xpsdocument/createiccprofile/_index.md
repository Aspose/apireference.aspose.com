---
title: "Aspose::Page::XPS::XpsDocument::CreateIccProfile 方法"
linktitle: "CreateIccProfile"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::CreateIccProfile 方法。在 C++ 中从流创建新的 ICC 配置文件资源。"
type: docs
weight: 1600
url: /zh/cpp/aspose.page.xps/xpsdocument/createiccprofile/
---
## XpsDocument::CreateIccProfile(System::SharedPtr\<System::IO::Stream\>) method


从 *stream* 创建一个新的 ICC 配置文件资源。

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::SharedPtr<System::IO::Stream> stream)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 流 | System::SharedPtr\<System::IO::Stream\> | 包含 ICC 配置文件以用作资源的流。 |

### ReturnValue

新的 ICC 配置文件资源。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [Stream](../../../system.io/stream/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateIccProfile(System::String) method


从位于 *iccProfilePath* 的 ICC 配置文件创建一个新的 ICC 配置文件资源。

```cpp
System::SharedPtr<XpsModel::XpsIccProfile> Aspose::Page::XPS::XpsDocument::CreateIccProfile(System::String iccProfilePath)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| iccProfilePath | System::String | 用于作为资源的 ICC 配置文件的路径。 |

### ReturnValue

新的 ICC 配置文件资源。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsIccProfile](../../../aspose.page.xps.xpsmodel/xpsiccprofile/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
