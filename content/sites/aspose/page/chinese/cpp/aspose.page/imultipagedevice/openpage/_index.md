---
title: "Aspose::Page::IMultiPageDevice::OpenPage 方法"
linktitle: "OpenPage"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage 方法。为每页渲染前在 C++ 中对设备进行必要的准备。"
type: docs
weight: 400
url: /zh/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


在每个页面渲染之前进行设备的必要准备。

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| width | 单精度浮点数 | 页面的宽度。 |
| height | 单精度浮点数 | 页面的高度。 |

### ReturnValue

如果打开的页码落在选定页码范围内则返回 true，否则返回 false。

## 另见

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


在页面渲染之前进行设备的必要准备。

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 标题 | System::String | 页面标题。 |

### ReturnValue

如果页码在请求的范围内则为 true，否则为 false。用于能够渲染指定页码数组的设备。

## 另见

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
